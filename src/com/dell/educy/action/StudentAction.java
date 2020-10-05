package com.dell.educy.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.alibaba.fastjson.JSON;
import com.dell.educy.bean.DatagridBean;
import com.dell.educy.bean.PageBean;
import com.dell.educy.bean.Student;
import com.dell.educy.bean.StudentSearchBean;
import com.dell.educy.service.StudentService;
import com.dell.educy.utils.JsonUtil;


/**
 * @Author 马小姐
 * @Date 2020-10-05 16:35
 * @Version 1.0
 * @Description:
 */

@SuppressWarnings("unused")
public class StudentAction {

    private Student student;

    private StudentService studentService;

    private JsonUtil jsonUtil;

    private String idString;
    private int page;
    private int rows;

    private StudentSearchBean studentSearchBean;

    public StudentSearchBean getStudentSearchBean() {
        return studentSearchBean;
    }

    public void setStudentSearchBean(StudentSearchBean studentSearchBean) {
        this.studentSearchBean = studentSearchBean;
    }

    public String getIdString() {
        return idString;
    }

    public void setIdString(String idString) {
        this.idString = idString;
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

    public JsonUtil getJsonUtil() {
        return jsonUtil;
    }

    public void setJsonUtil(JsonUtil jsonUtil) {
        this.jsonUtil = jsonUtil;
    }

    public StudentService getStudentService() {
        return studentService;
    }

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void add(){
        studentService.addStudent(student);
    }
    public void list(){

        if(studentSearchBean==null){
            studentSearchBean=new StudentSearchBean();
        }
        studentSearchBean.setPage(page);
        studentSearchBean.setRows(rows);
        System.out.println(studentSearchBean);
        @SuppressWarnings("rawtypes")
        List list=studentService.getStudentList(studentSearchBean);
        int total=studentService.getStudentListSize(studentSearchBean);
        DatagridBean<Student> datagridBean=new DatagridBean<Student>();
        datagridBean.setRows(list);
        datagridBean.setTotal(total);
        String result= JSON.toJSONString(datagridBean);
        System.out.println(result);
        jsonUtil.writeJson(result);
    }
    public void update(){
        System.out.println(student.getId());

        studentService.updateStudent(student);
    }
    public void delete(){
        String[] ids=idString.split(",");
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<ids.length;i++){
            list.add(Integer.parseInt(ids[i]));
        }

        studentService.deleteStudents(list);
    }
    public void getStudentMessage(){
        int studentId=((Student) ServletActionContext.getRequest().getSession().getAttribute("student")).getId();
        Student student=studentService.getStudentById(studentId);
        String result=JSON.toJSONString(student);
        System.out.println(result);
        jsonUtil.writeJson(result);
    }
    public void updateVoucher(){
        studentService.updateVoucher(student);

    }
}
