package com.dell.educy.service;

import com.dell.educy.bean.Student;
import com.dell.educy.bean.StudentSearchBean;

import java.util.List;


@SuppressWarnings("unused")
public interface StudentService {
	
	
	

	

	
	public void addStudent(Student student);
	@SuppressWarnings("rawtypes")
	public List getStudentList(int page,int rows);
	@SuppressWarnings("rawtypes")
	public List getStudentList(StudentSearchBean studentSearchBean);
	public void updateStudent(Student student);
	public void deleteStudents(List<Integer> ids);
	public int  getStudentListSize(StudentSearchBean studentSearchBean);
	public Student getStudentByNo(String studentNo);
	public Student getStudentById(int studentId);
	public void updateVoucher(Student student);
	
	
}
