package com.dell.educy.bean;

/**
 * @Author 马小姐
 * @Date 2020-10-05 16:42
 * @Version 1.0
 * @Description:
 */
public class ScoreSearchBean  extends PageBean{
    private int semesterId;
    private String className;
    private String courseName;
    private int flag;
    private int teacherId;
    private int studentId;
    private String teacherName;
    private int order;

    public int getOrder() {
        return order;
    }
    public void setOrder(int order) {
        this.order = order;
    }
    public String getTeacherName() {
        return teacherName;
    }
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public int getTeacherId() {
        return teacherId;
    }
    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
    public int getFlag() {
        return flag;
    }
    public void setFlag(int flag) {
        this.flag = flag;
    }
    public int getSemesterId() {
        return semesterId;
    }
    public void setSemesterId(int semesterId) {
        this.semesterId = semesterId;
    }
    public String getClassName() {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    @Override
    public String toString() {
        return super.toString()+"ScoreSearchBean [semesterId=" + semesterId + ", className=" + className + ", courseName=" + courseName
                + ", flag=" + flag + ", teacherId=" + teacherId + ", studentId=" + studentId + ", teacherName="
                + teacherName + ", order=" + order + "]";
    }



}
