package com.dell.educy.service;

import com.dell.educy.bean.Admin;
import com.dell.educy.bean.Teacher;
import com.dell.educy.bean.TeacherSearchBean;
import com.dell.educy.dao.LoginDao;
import com.dell.educy.dao.TeacherDao;
import com.dell.educy.utils.DateUtil;
import com.dell.educy.utils.StringUtil;

import java.util.List;

public class TeacherServiceImpl implements TeacherService{
	private TeacherDao teacherDao;
	private DateUtil dateUtil;
	private StringUtil stringUtil;
	private LoginDao loginDao;

	public LoginDao getLoginDao() {
		return loginDao;
	}

	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}

	public DateUtil getDateUtil() {
		return dateUtil;
	}

	public void setDateUtil(DateUtil dateUtil) {
		this.dateUtil = dateUtil;
	}

	public StringUtil getStringUtil() {
		return stringUtil;
	}

	public void setStringUtil(StringUtil stringUtil) {
		this.stringUtil = stringUtil;
	}

	public TeacherDao getTeacherDao() {
		return teacherDao;
	}

	public void setTeacherDao(TeacherDao teacherDao) {
		this.teacherDao = teacherDao;
	}

	public void addTeacher(Teacher teacher){
		teacher.setVoucher(teacher.getIdCard());
		teacherDao.addTeacher(teacher);
		int teacherId=teacher.getId();	
		String teacherNo=dateUtil.getYear()+stringUtil.num2String(teacher.getDepartment().getId())+stringUtil.num2String(teacherId);
		teacherDao.setTeacherNo(teacherId, teacherNo);
		
		Admin admin=new Admin();
		admin.setUserName(teacherNo);
		admin.setPassword(teacherNo);
		admin.setPower(3);
		System.out.println(1/0);
		loginDao.addAdmin(admin);
		
		
	}



	public List<Teacher> getTeacherList(TeacherSearchBean teacherSearchBean){
		return teacherDao.getTeacherList(teacherSearchBean);
	}
	public int getTeacherListSize(TeacherSearchBean teacherSearchBean){
		return teacherDao.getTeacherListSize(teacherSearchBean);
	}
	public void updateTeacher(Teacher teacher){
		teacherDao.updateTeacher(teacher);
	}



	public void deleteTeacher(List<Integer> ids){
		for(int i=0;i<ids.size();i++){
			int id=ids.get(i);
			
			String teacherNo=teacherDao.getTeacherNo(id);
			loginDao.deleteAdmin(teacherNo);
			
			teacherDao.deleteTeacher(id);
			
			
		}
	}
	public List<Teacher> getTeacherOfDepart(int departmentId){
		return teacherDao.getTeacherOfDepart(departmentId);
	}
	public Teacher getTeacher(int teacherId){
		return teacherDao.getTeacherById(teacherId);
	}
	public void updateVoucher(int id,String voucher){
		teacherDao.updateVoucher(id, voucher);
	}
	public Teacher getTeacherByNo(String teacherNo){
		return teacherDao.getTeacherByNo(teacherNo);
	}
}
