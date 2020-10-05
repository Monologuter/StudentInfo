package com.dell.educy.dao;

import com.dell.educy.bean.Student;
import com.dell.educy.bean.StudentSearchBean;

import java.util.List;

/**
 * @Author 马小姐
 * @Date 2020-10-05 16:47
 * @Version 1.0
 * @Description:
 */
@SuppressWarnings("unused")
public interface StudentDao {
    public void add(Student student);
    public void setStudentNo(int id,String studentNo);
    @SuppressWarnings("rawtypes")
    public List getStudentList(int start, int rows);
    @SuppressWarnings("rawtypes")
    public List getStudentList1(StudentSearchBean studentSearchBean);
    public int getStudentListSize(StudentSearchBean studentSearchBean);
    public void updateStudent(Student student);
    public int getClassId(int id);
    public void deleteStudent(int studentId);
    public String getStudentNo(int id);
    public Student getStudentByNo(String studentNo);
    public List<Integer> getListOfStudentIdByClassId(int classId);
    public Student getStudentById(int studentId);
    public void updateVoucher(Student student);

}
