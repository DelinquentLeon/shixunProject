package com.cqu.mapper;





import org.apache.ibatis.annotations.Param;

import com.cqu.pojo.Student;

/**
 * 接口设计
 * 
 * */

public interface StudentMapper {
	//添加学生
	//需要实现的抽象方法，现在由mybatid的mapper的对象帮我们去实现 
	
	//向数据库中加入学生
	void addStudentWithMapper(Student student);
	
	//通过学号向数据库中删除学生
	void deleteStudentMapper(int number);
	
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
	
	//由年龄查看学生数量
	int countAgeNumber(@Param("age1") int age1,@Param("age2")int age2);
	
	//由省份查看学生数量
	int countProvinceNumber(String province);
		
	//由兴趣查看学生数量
	int countHobbyNumber(String hobby);

}
