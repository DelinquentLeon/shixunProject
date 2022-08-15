package com.cqu.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

@SuppressWarnings("serial")
public class Student implements Serializable{
	
	//封装实体类
	private int    number;
	private String name;
	private String sex;
	private String major;
	private int    age;
	private String province;
	private String hobby;

	
	//alt shift s 导出自动生成的代码选择
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void setNumber(String number) {
		int number_int = Integer.parseInt(number);
		this.number = number_int;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setAge(String age) {
		int age_int = Integer.parseInt(age);
		this.age = age_int;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public Student(int number, String name, String sex, String major, int age, String province, String hobby) {
		super();
		this.number = number;
		this.name = name;
		this.sex = sex;
		this.major = major;
		this.age = age;
		this.province = province;
		this.hobby = hobby;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + ", sex=" + sex + ", major=" + major + ", age=" + age
				+ ", province=" + province + ", hobby=" + hobby + "]";
	}
}