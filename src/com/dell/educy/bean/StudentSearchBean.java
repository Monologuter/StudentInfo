package com.dell.educy.bean;

/**
 * @Author 马小姐
 * @Date 2020-10-05 16:43
 * @Version 1.0
 * @Description:
 */
public class StudentSearchBean  extends PageBean{
    private String studentNo;
    private String studentName;
    private String sex;
    public String getStudentNo() {
        return studentNo;
    }
    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    @Override
    public String toString() {
        return super.toString()+"StudentSearchBean [studentNo=" + studentNo + ", studentName=" + studentName + ", sex=" + sex + "]";
    }


}
