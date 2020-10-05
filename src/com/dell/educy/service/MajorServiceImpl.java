package com.dell.educy.service;

import java.util.List;

import com.dell.educy.bean.Class;
import com.dell.educy.bean.Major;
import com.dell.educy.dao.MajorDao;
import com.dell.educy.utils.DateUtil;
import com.dell.educy.utils.StringUtil;

public class MajorServiceImpl  implements MajorService{
	private MajorDao majorDao;
	private DateUtil dateUtil;
	private StringUtil stringUtil;
	
	public StringUtil getStringUtil() {
		return stringUtil;
	}

	public void setStringUtil(StringUtil stringUtil) {
		this.stringUtil = stringUtil;
	}

	public DateUtil getDateUtil() {
		return dateUtil;
	}

	public void setDateUtil(DateUtil dateUtil) {
		this.dateUtil = dateUtil;
	}

	public MajorDao getMajorDao() {
		return majorDao;
	}

	public void setMajorDao(MajorDao majorDao) {
		this.majorDao = majorDao;
	}

	@SuppressWarnings("rawtypes")
	public List getDepartmentList(){
		return majorDao.getDepartmentList();
	}
	@SuppressWarnings("rawtypes")
	public List getMajorList(int id){
		return majorDao.getMajorListById(id);
	}
	public void addClass(int majorId,String className){
		Class class1=new Class();
		class1.setClassName(className);
		class1.setJoinTime(dateUtil.getYear());
		Major major=new Major();
		major.setId(majorId);
		class1.setMajor(major);
		class1.setStatus("在学");
		class1.setStudentNum(0);
		majorDao.addClass(class1);
		int departmentId=majorDao.getDepartIdByMajorId(majorId);
		int id=class1.getId();
		String classNo=class1.getJoinTime()+stringUtil.num2String(departmentId)+stringUtil.num2String(majorId)+stringUtil.num2String(id);
		majorDao.setClassNo(classNo,id);
	}
	@SuppressWarnings("rawtypes")
	public List getClazz(int majorId){
		return majorDao.getClazzList(majorId);
	}
}
