<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>课程成绩</title>
<link rel="stylesheet" type="text/css" href="/sms1/dist/css/easyui.css" />
<link rel="stylesheet" type="text/css" href="/sms1/dist/css/icon.css" />
<script type="text/javascript" src="/sms1/dist/js/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="/sms1/dist/js/jquery.easyui.min.js"></script>
<script type="text/javascript" src="/sms1/dist/js/loading.js"></script>
</head>
<script type="text/javascript">
	$(function(){
			initSemester();
		});


	function initSemester(){
		$.post("/sms1/semester_list.action",null,function(data){
					for(var i=0;i<data.length;i++){
							var option="<option value='"+data[i].id+"'>"+data[i].semesterName+"</option>";
							$("#searchSemesterId").append(option);
						}
			},"json");
	}

	function changeSemester(){
		var semesterId=$("#searchSemesterId").val();
		$("#scoreDatagrid").datagrid("load",{
				"scoreSearchBean.semesterId":semesterId
			});
	}
	function getSemesterName(value,row,index){
			return row.teaching.semester.semesterName;
		}
	function getStudentNo(value,row,index){
			return row.student.studentNo;
		}
	function getStudentName(value,row,index){
			return row.student.studentName;
		}
	function getClassName(value,row,index){
			return row.student.class1.className;
		}
	function getCourseName(value,row,index){
			return row.teaching.course.courseName;
		}
	function getCourseTime(value,row,index){
			return row.teaching.course.courseTime;
		}
	function getCourseType(value,row,index){
			return row.teaching.course.type;
		}
	function getCredit(value,row,index){
			return row.teaching.course.credit;
		}
	
</script>
<body>
<div id='loading' style="position:absolute;z-index:1000;top:0px;left:0px;width:100%;height:100%;background:#DDDDDB;text-align:center;padding-top: 20%;">   
</div> 
	<table class="easyui-datagrid" id="scoreDatagrid" url="/sms1/score_list.action"
			toolbar="#tb" pagination="true" fit="true" singleSelect="true"
	>
		<thead>
			<tr>
				<th field="semesterName" formatter="getSemesterName">学年学期</th>
				<th field="studentNo" formatter="getStudentNo">学号</th>
				<th field="studentName" formatter="getStudentName">姓名</th>
				<th field="className" formatter="getClassName">所在班级</th>
				<th field="courseName" formatter="getCourseName">课程名称</th>
				<th field="courseType" formatter="getCourseType">课程类型</th>
				<th field="courseTime" formatter="getCourseTime">总课时</th>
				<th field="credit" formatter="getCredit">学分</th>
				<th field="score">成绩</th>
			</tr>
		</thead>
	</table>
	<div id="tb" >
			<span>学期学年:</span>
			<select id="searchSemesterId"  onchange="changeSemester()">
				<option value=0>全部</option>
			</select>
	</div>
	
</body>
</html>