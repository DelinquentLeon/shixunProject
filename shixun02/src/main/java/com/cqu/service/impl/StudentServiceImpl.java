package com.cqu.service.impl;

import com.cqu.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cqu.mapper.StudentMapper;
import com.cqu.service.StudentService;
/**
 * 服务层的实现类
 *
 */
@Service
public class StudentServiceImpl implements StudentService {
	
	//把这个mapper对象自动注入spring容器
	@Autowired
	StudentMapper mapper;
	
	@Override
	//由性别查看学生数量
	public int countSexNumber(String sex) {
		int countSexNumber = mapper.countSexNumber(sex);
		return countSexNumber;
	}
	
	@Override
	//由专业查看学生数量
	public int countMajorNumber(String major) {
		int countMajorNumber = mapper.countMajorNumber(major);
		return countMajorNumber;
	}
	
	@Override
	//由年龄查看学生数量(两个参数)
	public int countAgeNumber(int age1, int age2) {
		int countAgeNumber = mapper.countAgeNumber(age1,age2);
		return countAgeNumber;
	}
	
	@Override
	//由省份查看学生数量
	public int countProvinceNumber(String province) {
		int countProvinceNumber = mapper.countProvinceNumber(province);
		return countProvinceNumber;
	}
		
	@Override
	//由兴趣查看学生数量
	public int countHobbyNumber(String hobby) {
		int countHobbyNumber = mapper.countHobbyNumber(hobby);
		return countHobbyNumber;
	}

	
	//向数据库加入学生
	@Override
	public Student insertStudent(Student student) {
		Student student2 = mapper.findStudentByNumber(student.getNumber());
		if(student2 == null) {
			mapper.addStudentWithMapper(student);
			return null;
		}else {
			return student;
		}
	}
}


