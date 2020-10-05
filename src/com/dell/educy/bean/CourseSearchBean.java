package com.dell.educy.bean;

/**
 * @Author 马小姐
 * @Date 2020-10-05 16:41
 * @Version 1.0
 * @Description:
 */
public class CourseSearchBean extends PageBean{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString()+"CourseSearchBean [name=" + name + "]";
    }

}
