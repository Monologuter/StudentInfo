package com.dell.educy.bean;

/**
 * @Author 马小姐
 * @Date 2020-10-05 16:41
 * @Version 1.0
 * @Description:
 */
public class Department {
    private  int id;
    private String name;
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
    @Override
    public String toString() {
        return "Department [id=" + id + ", name=" + name + "]";
    }

}
