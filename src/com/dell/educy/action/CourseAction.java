package com.dell.educy.action;

import com.alibaba.fastjson.JSON;
import com.dell.educy.bean.Course;
import com.dell.educy.bean.CourseSearchBean;
import com.dell.educy.bean.DatagridBean;
import com.dell.educy.service.CourseService;
import com.dell.educy.utils.JsonUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author 马小姐
 * @Date 2020-10-05 16:31
 * @Version 1.0
 * @Description:
 */
public class CourseAction {
    private Course course;
    private CourseService courseService;

    private String idString;

    private JsonUtil jsonUtil;

    private int courseId;

    private int page;
    private int rows;

    private CourseSearchBean courseSearchBean;

    public CourseSearchBean getCourseSearchBean() {
        return courseSearchBean;
    }

    public void setCourseSearchBean(CourseSearchBean courseSearchBean) {
        this.courseSearchBean = courseSearchBean;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public JsonUtil getJsonUtil() {
        return jsonUtil;
    }

    public void setJsonUtil(JsonUtil jsonUtil) {
        this.jsonUtil = jsonUtil;
    }

    public String getIdString() {
        return idString;
    }

    public void setIdString(String idString) {
        this.idString = idString;
    }

    public CourseService getCourseService() {
        return courseService;
    }

    public void setCourseService(CourseService courseService) {
        this.courseService = courseService;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
    public void list(){
        if(courseSearchBean==null){
            courseSearchBean=new CourseSearchBean();
        }
        courseSearchBean.setPage(page);
        courseSearchBean.setRows(rows);
        List<Course> list=courseService.getCourseList(courseSearchBean);
        int total=courseService.getCourseListSize(courseSearchBean);
        DatagridBean<Course> datagridBean=new DatagridBean<Course>();
        datagridBean.setRows(list);
        datagridBean.setTotal(total);
        String result= JSON.toJSONString(datagridBean);
        jsonUtil.writeJson(result);
        System.out.println(result);

    }
    public void add(){
        courseService.addCourse(course);
    }
    public void update(){
        courseService.updateCourse(course);
    }
    public void delete(){
        List<Integer> list=new ArrayList<Integer>();
        String[] ids=idString.split(",");
        for(int i=0;i<ids.length;i++){
            list.add(Integer.parseInt(ids[i]));
        }
        courseService.deleteCourse(list);
    }
    public void getCourseList(){
        String result=JSON.toJSONString(courseService.getCourseList());
        jsonUtil.writeJson(result);
    }
}

