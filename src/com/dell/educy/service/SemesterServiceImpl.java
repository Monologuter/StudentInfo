package com.dell.educy.service;

import com.dell.educy.bean.Semester;
import com.dell.educy.dao.SemesterDao;

import java.util.List;

public class SemesterServiceImpl implements SemesterService {
	private SemesterDao semesterDao;

	public SemesterDao getSemesterDao() {
		return semesterDao;
	}

	public void setSemesterDao(SemesterDao semesterDao) {
		this.semesterDao = semesterDao;
	}

	public List<Semester> getSemesterList() {
		return semesterDao.getSemesterList();
	}
}
