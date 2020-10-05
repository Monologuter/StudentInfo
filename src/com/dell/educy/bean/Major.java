package com.dell.educy.bean;

/**
 * @Author 马小姐
 * @Date 2020-10-05 16:41
 * @Version 1.0
 * @Description:
 */
public class Major {
    private int id;
    private String name;
    private Department department;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Department getDepartment() {
        return department;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }
    @Override
    public String toString() {
        return "Major [id=" + id + ", name=" + name + ", department=" + department + "]";
    }

}