package com.dell.educy.action;

import com.dell.educy.bean.Admin;
import com.dell.educy.bean.Student;
import com.dell.educy.bean.Teacher;
import com.dell.educy.service.LoginService;
import com.dell.educy.service.StudentService;
import com.dell.educy.service.TeacherService;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @Author 马小姐
 * @Date 2020-10-05 16:32
 * @Version 1.0
 * @Description:
 */
@SuppressWarnings("unused")
public class LoginAction {
    private String userName;
    private String password;
    private String validateCode;
    private LoginService loginService;
    private TeacherService teacherService;
    private StudentService studentService;

    private ScoreAction scoreAction;

    private UpLoadAction upLoadAction;


    public ScoreAction getScoreAction() {
        return scoreAction;
    }

    public void setScoreAction(ScoreAction scoreAction) {
        this.scoreAction = scoreAction;
    }

    public UpLoadAction getUpLoadAction() {
        return upLoadAction;
    }

    public void setUpLoadAction(UpLoadAction upLoadAction) {
        this.upLoadAction = upLoadAction;
    }

    private String oldPassword;
    private String newPassword;
    private String checkPassword;

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getCheckPassword() {
        return checkPassword;
    }

    public void setCheckPassword(String checkPassword) {
        this.checkPassword = checkPassword;
    }

    public StudentService getStudentService() {
        return studentService;
    }

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public TeacherService getTeacherService() {
        return teacherService;
    }

    public void setTeacherService(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    public String login() throws IOException {
        HttpServletRequest request=ServletActionContext.getRequest();
        Admin admin=(Admin) request.getSession().getAttribute("user");
        if(admin!=null&&loginService.isExist(userName, password)&&loginService.isRightCode(request, validateCode)){
            int power=admin.getPower();
            return init(request, admin, power);
        }
        return "error";
    }

    private String init(HttpServletRequest request, Admin admin, int power) {
        String result="";
        if(power==1){
            //admin
            result="admin";
        }else if(power==2){
            //student
            Student student=studentService.getStudentByNo(admin.getUserName());
            request.getSession().setAttribute("student", student);
            result="student";
        }else{
            //teacher
            Teacher teacher=teacherService.getTeacherByNo(admin.getUserName());
            request.getSession().setAttribute("teacher", teacher);
            result="teacher";
        }
        scoreAction.init();
        upLoadAction.init();
        return result;
    }

    public void check() throws IOException {
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpServletResponse response = ServletActionContext.getResponse();
        PrintWriter printWriter = response.getWriter();
        if (!loginService.isRightCode(request, validateCode)) {
            printWriter.write("请输入正确的验证码");
            return;
        }
        if (!loginService.isExist(userName, password)) {
            printWriter.write("用户名或密码错误");
            return;
        }
        Admin admin=loginService.getAdmin(userName, password);
        request.getSession().setAttribute("user",admin);

    }
    public void modifyPassword() throws IOException{
        HttpServletRequest request = ServletActionContext.getRequest();
        HttpServletResponse response = ServletActionContext.getResponse();
        PrintWriter printWriter = response.getWriter();
        Admin admin=(Admin) request.getSession().getAttribute("user");
        if(!newPassword.equals(checkPassword)){
            printWriter.write("请输入两次相同的密码");
            return ;
        }
        if (!loginService.isExist(admin.getUserName(), oldPassword)) {
            printWriter.write("旧密码输入错误");
            return;
        }
        loginService.updatePassword(admin.getUserName(),newPassword);

    }
    public String logout(){
        HttpSession session= ServletActionContext.getRequest().getSession();
        session.setAttribute("user", null);
        session.setAttribute("student", null);
        session.setAttribute("teacher", null);
        return "logout";
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LoginService getLoginService() {
        return loginService;
    }

    public String getValidateCode() {
        return validateCode;
    }

    public void setValidateCode(String validateCode) {
        this.validateCode = validateCode;
    }

    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }

}
