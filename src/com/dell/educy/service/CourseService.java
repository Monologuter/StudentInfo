package com.dell.educy.service;

import com.dell.educy.bean.Course;
import com.dell.educy.bean.CourseSearchBean;

import java.util.List;


@SuppressWarnings("unused")
public interface CourseService {
	void addCourse(Course course);

	void updateCourse(Course course);

	void deleteCourse(List<Integer> list);

	List<Course> getCourseList(CourseSearchBean courseSearchBean);

	int getCourseListSize(CourseSearchBean courseSearchBean);

	List<Course> getCourseList();
}
