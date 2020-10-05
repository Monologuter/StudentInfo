package com.dell.educy.service;

import com.dell.educy.bean.Admin;
import com.dell.educy.dao.LoginDao;
import com.dell.educy.utils.ValidateCodeUtil;

import javax.servlet.http.HttpServletRequest;

public class LoginServiceImpl implements LoginService{
	private LoginDao loginDao;
	private ValidateCodeUtil validateCodeUtil;
	
	public boolean isExist(String userName, String password) {
		String checkPassword = loginDao.getPassword(userName);
		if (checkPassword != null && password.equals(checkPassword)) {
			return true;
		}
		return false;
	}

	public boolean isRightCode(HttpServletRequest request, String validateCode) {

		return validateCodeUtil.checkValidateCode(request, validateCode);
	}
	
	public void updatePassword(String userName,String password){
		loginDao.updatePassword(userName, password);
	}
	public Admin getAdmin(String userName, String password){
		return loginDao.getAdmin(userName, password);
	}
	public LoginDao getLoginDao() {
		return loginDao;
	}

	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}

	public ValidateCodeUtil getValidateCodeUtil() {
		return validateCodeUtil;
	}

	public void setValidateCodeUtil(ValidateCodeUtil validateCodeUtil) {
		this.validateCodeUtil = validateCodeUtil;
	}
}
