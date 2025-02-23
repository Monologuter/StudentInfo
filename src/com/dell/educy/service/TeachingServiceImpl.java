package com.dell.educy.service;

import com.dell.educy.bean.Score;
import com.dell.educy.bean.Student;
import com.dell.educy.bean.Teaching;
import com.dell.educy.bean.TeachingSearchBean;
import com.dell.educy.dao.ScoreDao;
import com.dell.educy.dao.StudentDao;
import com.dell.educy.dao.TeachingDao;

import java.util.List;

public class TeachingServiceImpl implements TeachingService{
	private TeachingDao teachingDao;
	private StudentDao studentDao;
	private ScoreDao scoreDao;
	public ScoreDao getScoreDao() {
		return scoreDao;
	}

	public void setScoreDao(ScoreDao scoreDao) {
		this.scoreDao = scoreDao;
	}

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public TeachingDao getTeachingDao() {
		return teachingDao;
	}

	public void setTeachingDao(TeachingDao teachingDao) {
		this.teachingDao = teachingDao;
	}

	public List<Teaching> getTeachingList(TeachingSearchBean teachingSearchBean){
		return teachingDao.getTeachingList(teachingSearchBean); 
	}
	
	public int getTeachingListSize(TeachingSearchBean teachingSearchBean){
		return teachingDao.getTeachingListSize(teachingSearchBean);
	}
	public void addTeaching(Teaching teaching){
		teachingDao.addTeaching(teaching);
		addScore(teaching);
		
	}
	public void updateTeaching(Teaching teaching){
		teachingDao.updateTeaching(teaching);
		scoreDao.deleteScoreByTeachingId(teaching.getId());
		addScore(teaching);
	}

	public void addScore(Teaching teaching) {
		List<Integer> list=studentDao.getListOfStudentIdByClassId(teaching.getClass1().getId());
		for(int i=0;i<list.size();i++){
			Score score=new Score();
			Student student=new Student();
			student.setId(list.get(i));
			score.setStudent(student);
			score.setTeaching(teaching);
			score.setScore(0);
			score.setFlag(2);
			System.out.println(score);
			scoreDao.addScore(score);
		}
	}


	public void deleteTeaching(List<Integer> ids){
		for(int i=0;i<ids.size();i++){
			int teachingId=ids.get(i);
			teachingDao.deleteTeaching(teachingId);
			System.out.println(teachingId);
			scoreDao.deleteScoreByTeachingId(teachingId);
		}
	}
	public List<Teaching> getTeachingByTeacherId(TeachingSearchBean teachingSearchBean){
		return teachingDao.getTeachingByTeacherId(teachingSearchBean);
	}
	public int getTeachingByTeacherIdSize(TeachingSearchBean teachingSearchBean){
		return teachingDao.getTeachingByTeacherIdSize(teachingSearchBean);
	}
}
