package com.dell.educy.bean;

/**
 * @Author 马小姐
 * @Date 2020-10-05 16:40
 * @Version 1.0
 * @Description:
 */
public class Course {
    private int id;
    private String courseName;
    private int credit;
    private int courseTime;
    private String type;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public int getCredit() {
        return credit;
    }
    public void setCredit(int credit) {
        this.credit = credit;
    }
    public int getCourseTime() {
        return courseTime;
    }
    public void setCourseTime(int courseTime) {
        this.courseTime = courseTime;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return "Course [id=" + id + ", courseName=" + courseName + ", credit=" + credit + ", courseTime=" + courseTime
                + ", type=" + type + "]";
    }

}
