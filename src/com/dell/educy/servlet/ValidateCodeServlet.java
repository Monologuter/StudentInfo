package com.dell.educy.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dell.educy.utils.ValidateCodeUtil;

@SuppressWarnings("serial")
public class ValidateCodeServlet  extends HttpServlet{
	private ValidateCodeUtil validateCodeUtil=new ValidateCodeUtil();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action=req.getParameter("action");
		if("generate".equals(action)){
			String validateCode=validateCodeUtil.generateValidateCode();
			HttpSession session=req.getSession();
			session.setAttribute("validateCode", validateCode);
			validateCodeUtil.generateValidateImage(resp,validateCode);
		}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
}
