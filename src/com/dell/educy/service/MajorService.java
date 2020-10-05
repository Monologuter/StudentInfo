package com.dell.educy.service;

import java.util.List;


@SuppressWarnings("unused")
public interface MajorService {
	
	

	@SuppressWarnings("rawtypes")
	public List getDepartmentList();
	@SuppressWarnings("rawtypes")
	public List getMajorList(int id);
	public void addClass(int majorId,String className);
	@SuppressWarnings("rawtypes")
	public List getClazz(int majorId);
	
}
