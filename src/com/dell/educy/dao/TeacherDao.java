package com.dell.educy.dao;

import com.dell.educy.bean.Teacher;
import com.dell.educy.bean.TeacherSearchBean;

import java.util.List;

/**
 * @Author 马小姐
 * @Date 2020-10-05 16:47
 * @Version 1.0
 * @Description:
 */
public interface TeacherDao {
    public void addTeacher(Teacher teacher);
    public void setTeacherNo(int teacherId,String teacherNo);
    public List<Teacher> getTeacherList(TeacherSearchBean teacherSearchBean);
    public int getTeacherListSize(TeacherSearchBean teacherSearchBean);
    public void updateTeacher(Teacher teacher);
    public void deleteTeacher(int teacherId);
    public String getTeacherNo(int id);
    public List<Teacher> getTeacherOfDepart(int departmentId);
    public Teacher getTeacherByNo(String teacherNo);
    public Teacher getTeacherById(int teacherId);
    public void updateVoucher(int id,String voucher);
}
