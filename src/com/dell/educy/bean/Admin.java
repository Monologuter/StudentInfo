package com.dell.educy.bean;

/**
 * @Author 马小姐
 * @Date 2020-10-05 16:40
 * @Version 1.0
 * @Description:
 */
public class Admin {
    private String userName;
    private String password;
    private int power;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getUserName() {

        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Admin [userName=" + userName + ", password=" + password + ", power=" + power + "]";
    }



}
