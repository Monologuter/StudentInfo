package com.dell.educy.service;

import com.dell.educy.bean.Admin;

import javax.servlet.http.HttpServletRequest;


@SuppressWarnings("unused")
public interface LoginService {
	
	public boolean isExist(String userName, String password);

	public boolean isRightCode(HttpServletRequest request, String validateCode);
	
	public void updatePassword(String userName,String password);
	public Admin getAdmin(String userName, String password);


	

}
