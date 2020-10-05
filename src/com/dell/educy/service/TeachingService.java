package com.dell.educy.service;

import com.dell.educy.bean.Teaching;
import com.dell.educy.bean.TeachingSearchBean;

import java.util.List;


@SuppressWarnings("unused")
public interface TeachingService {

	public List<Teaching> getTeachingList(TeachingSearchBean teachingSearchBean);
	
	public int getTeachingListSize(TeachingSearchBean teachingSearchBean);
	public void addTeaching(Teaching teaching);
	public void updateTeaching(Teaching teaching);

	public void addScore(Teaching teaching);
	public void deleteTeaching(List<Integer> ids);
	public List<Teaching> getTeachingByTeacherId(TeachingSearchBean teachingSearchBean);
	public int getTeachingByTeacherIdSize(TeachingSearchBean teachingSearchBean);
}
