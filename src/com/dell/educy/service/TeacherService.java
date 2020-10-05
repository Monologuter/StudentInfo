package com.dell.educy.service;

import com.dell.educy.bean.Teacher;
import com.dell.educy.bean.TeacherSearchBean;

import java.util.List;


@SuppressWarnings("unused")
public interface TeacherService {


	public void addTeacher(Teacher teacher);
	public List<Teacher> getTeacherList(TeacherSearchBean teacherSearchBean);
	public int getTeacherListSize(TeacherSearchBean teacherSearchBean);
	public void updateTeacher(Teacher teacher);
	public void deleteTeacher(List<Integer> ids);
	public List<Teacher> getTeacherOfDepart(int departmentId);
	public Teacher getTeacher(int teacherId);
	public void updateVoucher(int id,String voucher);
	public Teacher getTeacherByNo(String teacherNo);
}
