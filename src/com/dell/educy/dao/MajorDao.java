package com.dell.educy.dao;

import com.dell.educy.bean.Class;

import java.util.List;

/**
 * @Author 马小姐
 * @Date 2020-10-05 16:46
 * @Version 1.0
 * @Description:
 */
@SuppressWarnings("rawtypes")

public interface MajorDao {

    public List getDepartmentList();
    public List getMajorListById(int id);
    public void addClass(Class class1);
    public int getDepartIdByMajorId(int majorId);
    public void setClassNo(String classNo,int id);
    public List getClazzList(int majorId);
    public void addStudentNum(int classId);
    public Class getClazz(int classId);
    public void reduceStudentNum(int classId);
}
