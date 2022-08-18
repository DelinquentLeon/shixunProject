package com.cqu.service;

import com.cqu.pojo.Student;

/**
 * 接口设计
 * 
 * */

public interface StudentService {
	
	//由性别查看学生数量
	int countSexNumber(String sex);
	
	//由专业查看学生数量
	int countMajorNumber(String major);
	
	//由年龄查看学生数量
	int countAgeNumber(int age1, int age2);
	
	//由省份查看学生数量
	int countProvinceNumber(String province);

	//由兴趣查看学生数量
	int countHobbyNumber(String hobby);

	//查询特定学号的学生
	Student findStudentByNumber(int number);
	
	//向数据库加入学生
	void insertStudent(Student student);
}
