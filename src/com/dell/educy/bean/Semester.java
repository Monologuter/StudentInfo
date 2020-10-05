package com.dell.educy.bean;

/**
 * @Author 马小姐
 * @Date 2020-10-05 16:43
 * @Version 1.0
 * @Description:
 */
public class Semester {
    private int id;
    private String semesterName;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getSemesterName() {
        return semesterName;
    }
    public void setSemesterName(String semesterName) {
        this.semesterName = semesterName;
    }
    @Override
    public String toString() {
        return "Semester [id=" + id + ", semesterName=" + semesterName + "]";
    }

}
