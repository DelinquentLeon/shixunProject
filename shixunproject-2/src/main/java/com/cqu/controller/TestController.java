package com.cqu.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cqu.service.StudentService;
import com.cqu.pojo.Student;

@Controller
public class TestController {
	
	@Autowired
	StudentService service;
	
	@RequestMapping("hello")
	@ResponseBody
	public String hello() {
		return "hello";
	}
	
	
	//获取男女生人数list(顺序为:男 女)
//	@RequestMapping("getSexNum")
//	@ResponseBody
//	public ArrayList<Integer> getSexNum() {
//		int men = service.countSexNumber("男");
//		int women = service.countSexNumber("女");
//		ArrayList<Integer> list = new ArrayList<>();
//		list.add(men);
//		list.add(women);
//		return list;
//	}
	
	
	//输入学号判断该学号是否已在数据库里
	//返回类型：int   0不存在 1存在
//	@RequestMapping("numberExist")
//	@ResponseBody
//	public int numberExist() {
//		//从数据库中通过学号number获取学生对象，若无，则result_student=null
//		String account = "20204322";
//		int flagExist; //0不存在 1存在
//		Student result_student = service.findStudentByAccount(account);
//		if (result_student!=null) {
//			//数据库中已有该学号
//			System.out.println("已存在该学生");
//			System.out.println(result_student);
////			service.deleteStudent("4");
////			Student stu = new Student("4","rzc12345","ruizhichoa","12","男","信息安全","安徽省","00001010","132114124","1414124","rzc","dwad2d2","0101","dawdwadwadawdwa");
////			service.insertStudent(stu);
////			service.updateStudent(stu);
//			ArrayList<Student> students = service.findAllStudent();
//			for(Student student : students) {
//				System.out.println(student);
//			}
//			flagExist = 1;
//		}else {
//			flagExist = 0;
//		}
//		return flagExist;
//	}
}
