package com.dell.educy.dao;

import com.dell.educy.bean.Course;
import com.dell.educy.bean.CourseSearchBean;

import java.util.List;

/**
 * @Author 马小姐
 * @Date 2020-10-05 16:45
 * @Version 1.0
 * @Description:
 */
@SuppressWarnings("unused")
public interface CourseDao {
    public void addCourse(Course course);

    public void updateCourse(Course course);

    public void deleteCourse(int id);

    public List<Course> getCourseList(CourseSearchBean courseSearchBean);

    public int getCourseListSize(CourseSearchBean courseSearchBean);
    public List<Course> getCourseList1();
}
