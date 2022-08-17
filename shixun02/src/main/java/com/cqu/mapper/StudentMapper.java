package com.cqu.mapper;

import org.apache.ibatis.annotations.Param;
import com.cqu.pojo.Student;

/**
 * 接口设计 
 * */

public interface StudentMapper {
	
	//向数据库中加入学生
	void addStudent(Student student);
	
	//通过学号向数据库中删除学生
	void deleteStudent(int number);
	
	//更新数据库中的学生信息
	void updateStudent(Student student);
	
//	//查询所有的学生
//	ArrayList<Student> findAllStudent();

	//查询特定学号的学生
	Student findStudentByNumber(int number);
	
	//由性别查看学生数量
	int countSexNumber(String sex);

	//由专业查看学生数量
	int countMajorNumber(String major);
	
	//由年龄查看学生数量，这里设置了两个输入参数，
	//可以查询[age1，age2]年龄段区间的人数，也可以查询某一个年龄的人数（age1=age2）
	int countAgeNumber(@Param("age1") int age1,@Param("age2")int age2);
	
	//由省份查看学生数量
	int countProvinceNumber(String province);
		
	//由兴趣查看学生数量
	int countHobbyNumber(String hobby);

}
