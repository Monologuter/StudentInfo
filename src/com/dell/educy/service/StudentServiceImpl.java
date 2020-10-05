package com.dell.educy.service;

import com.dell.educy.bean.Admin;
import com.dell.educy.bean.Student;
import com.dell.educy.bean.StudentSearchBean;
import com.dell.educy.dao.LoginDao;
import com.dell.educy.dao.MajorDao;
import com.dell.educy.dao.StudentDao;
import com.dell.educy.utils.StringUtil;

import java.util.List;

public class StudentServiceImpl implements StudentService {
	private StudentDao studentDao;
	private MajorDao majorDao;
	private StringUtil stringUtil;
	private LoginDao loginDao;
	
	public LoginDao getLoginDao() {
		return loginDao;
	}

	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}

	public StringUtil getStringUtil() {
		return stringUtil;
	}

	public void setStringUtil(StringUtil stringUtil) {
		this.stringUtil = stringUtil;
	}

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public MajorDao getMajorDao() {
		return majorDao;
	}

	public void setMajorDao(MajorDao majorDao) {
		this.majorDao = majorDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	public void addStudent(Student student){
		int classId=student.getClass1().getId();
		majorDao.addStudentNum(classId);

		com.dell.educy.bean.Class class1=majorDao.getClazz(classId);
		String studentNo=class1.getClassNo()+stringUtil.num2String(class1.getStudentNum());
		student.setStatus("在学");
		student.setVoucher(student.getIdCard());
		student.setStudentNo(studentNo);
		studentDao.add(student);
		
		Admin admin=new Admin();
		admin.setUserName(studentNo);
		admin.setPassword(studentNo);
		admin.setPower(2);
		loginDao.addAdmin(admin);

	}
	@SuppressWarnings("rawtypes")
	public List getStudentList(int page,int rows){
		int start=(page-1)*rows;
		return studentDao.getStudentList(start,rows);
	}
	@SuppressWarnings("rawtypes")
	public List getStudentList(StudentSearchBean studentSearchBean){
		return studentDao.getStudentList1(studentSearchBean);
	}
	public void updateStudent(Student student){
		int beforeClassId=studentDao.getClassId(student.getId());
		majorDao.reduceStudentNum(beforeClassId);
		
		studentDao.updateStudent(student);
		
		int afterClassId=student.getClass1().getId();
		majorDao.addStudentNum(afterClassId);
		
	}
	public void deleteStudents(List<Integer> ids){
			for(int i=0;i<ids.size();i++){				
				//ɾ��ѧ����Ҫ����
				int id=ids.get(i);
				//1.�༶��������1
				int classId=studentDao.getClassId(id);
				majorDao.reduceStudentNum(classId);
				
				//2.ɾ����¼�˺�
				String studentNo=studentDao.getStudentNo(id);
				loginDao.deleteAdmin(studentNo);
				
				//3.ɾ��ѧ��
				studentDao.deleteStudent(ids.get(i));
				
			}
			
	}
	public int  getStudentListSize(StudentSearchBean studentSearchBean){
		return studentDao.getStudentListSize(studentSearchBean);
	}
	public Student getStudentByNo(String studentNo){
		return studentDao.getStudentByNo(studentNo);
	}
	public Student getStudentById(int studentId){
		return studentDao.getStudentById(studentId);
	}
	public void updateVoucher(Student student){
		studentDao.updateVoucher(student);
	}
}
