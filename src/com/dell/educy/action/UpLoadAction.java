package com.dell.educy.action;
import com.dell.educy.bean.Class;
import com.dell.educy.bean.*;
import com.dell.educy.service.ScoreService;
import com.dell.educy.service.StudentService;
import com.dell.educy.service.TeacherService;
import com.dell.educy.utils.ExcelUtil;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.List;


/**
 * @Author 马小姐
 * @Date 2020-10-05 16:36
 * @Version 1.0
 * @Description:
 */
@SuppressWarnings("unused")
public class UpLoadAction {
    private File upload;
    private String uploadFileName;
    private String uploadContentType;
    private ExcelUtil excelUtil;
    private int classId;
    private int departmentId;
    private StudentService studentService;
    private TeacherService teacherService;
    private ScoreSearchBean scoreSearchBean;
    private ScoreService scoreService;
    private InputStream exportFile;

    public InputStream getExportFile() {
        return exportFile;
    }

    public void setExportFile(InputStream exportFile) {
        this.exportFile = exportFile;
    }

    public ScoreService getScoreService() {
        return scoreService;
    }

    public void setScoreService(ScoreService scoreService) {
        this.scoreService = scoreService;
    }

    public ScoreSearchBean getScoreSearchBean() {
        return scoreSearchBean;
    }

    public void setScoreSearchBean(ScoreSearchBean scoreSearchBean) {
        this.scoreSearchBean = scoreSearchBean;
    }

    public TeacherService getTeacherService() {
        return teacherService;
    }

    public void setTeacherService(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public StudentService getStudentService() {
        return studentService;
    }

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public ExcelUtil getExcelUtil() {
        return excelUtil;
    }

    public void setExcelUtil(ExcelUtil excelUtil) {
        this.excelUtil = excelUtil;
    }

    public File getUpload() {
        return upload;
    }

    public void setUpload(File upload) {
        this.upload = upload;
    }

    public String getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(String uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    public String getUploadContentType() {
        return uploadContentType;
    }

    public void setUploadContentType(String uploadContentType) {
        this.uploadContentType = uploadContentType;
    }

    public void importStudent() {

        try {
            List<Student> list = excelUtil.readStudentExcel(new FileInputStream(upload));
            Class class1 = new Class();
            class1.setId(classId);
            for (int i = 0; i < list.size(); i++) {
                Student student = list.get(i);
                student.setClass1(class1);
                studentService.addStudent(student);
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void importTeacher() {
        try {
            Department department = new Department();
            department.setId(departmentId);
            List<Teacher> list = excelUtil.readTeacherExcel(new FileInputStream(upload));
            System.out.println(departmentId);
            System.out.println(list.toString());
            for (int i = 0; i < list.size(); i++) {
                Teacher teacher = list.get(i);
                teacher.setDepartment(department);
                teacherService.addTeacher(teacher);
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public String exportScore() {

        List<Score> list = scoreService.getScoreList(scoreSearchBean);

        try {
            setExportFile(excelUtil.getExcelInputStream(list));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "excel";
        // try {
        // excelUtil.exportExcel(list);
        // } catch (IOException e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }
    }

    public void init() {
        HttpSession session = ServletActionContext.getRequest().getSession();
        Admin admin = (Admin) session.getAttribute("user");
        int power = admin.getPower();

        scoreSearchBean = new ScoreSearchBean();

        if (power == 3) {
            // ��ʦ
            Teacher teacher = (Teacher) session.getAttribute("teacher");
            scoreSearchBean.setTeacherId(teacher.getId());
            scoreSearchBean.setStudentId(0);
            scoreSearchBean.setFlag(0);
        } else {
            scoreSearchBean.setFlag(1);
            scoreSearchBean.setTeacherId(0);
            if (power == 1) {
                // admin
                scoreSearchBean.setStudentId(0);
            }
            if (power == 2) {
                // ѧ��
                Student student = (Student) session.getAttribute("student");
                scoreSearchBean.setStudentId(student.getId());
            }
        }
    }
}

