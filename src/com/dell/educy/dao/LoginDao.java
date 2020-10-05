package com.dell.educy.dao;

import com.dell.educy.bean.Admin;

/**
 * @Author 马小姐
 * @Date 2020-10-05 16:46
 * @Version 1.0
 * @Description:
 */
public interface LoginDao {
    public String getPassword(String userName);
    public void addAdmin(Admin admin);
    public Admin getAdmin(String userName,String password);
    public void deleteAdmin(String userName);
    public void updatePassword(String userName,String password);
}
