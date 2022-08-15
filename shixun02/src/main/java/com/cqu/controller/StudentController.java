package com.cqu.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cqu.pojo.Student;
import com.cqu.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	StudentService service;
	
	//提交，如果数据库里已有该学号则提交失败
	@RequestMapping("login")
	
	public String login(String number,String name,String sex,String age,
			String major,String province,String hobby, Model model) {
		Student student = new Student();
		student.setNumber(number);
		student.setName(name);
		student.setSex(sex);
		student.setMajor(major);
		student.setAge(age);
		student.setProvince(province);
		student.setHobby(hobby);
		System.out.println(student);
		Student result_student = service.insertStudent(student);
		String text;
		if (result_student!=null) {
			//查到了改人,无效提交
			System.out.println("已存在该学生");
			text = "该学号已存在,提交失败";
		}else {
			//提交成功
			System.out.println("成功插入数据库");
			text = "提交成功";
		}
		model.addAttribute("message",text);
		return "login3.jsp";
	}
	
	//获取男女生人数list(顺序为:男 女)
	@RequestMapping("getSexNum")
	@ResponseBody
	public ArrayList<Integer> getSexNum(Model model) {
		int men = service.countSexNumber("男");
		int women = service.countSexNumber("女");
		ArrayList<Integer> list = new ArrayList<>();
		list.add(men);
		list.add(women);
		return list;
	}
	
	//获取不同专业人数list(顺序为:计算机科学与技术 信息安全 物联网工程 软件工程)
	@RequestMapping("getMajorNum")
	@ResponseBody
	public ArrayList<Integer> getMajorNum(Model model) {
		int jike = service.countMajorNumber("计算机科学与技术");
		int xinan = service.countMajorNumber("信息安全");
		int wulianwang = service.countMajorNumber("物联网工程");
		int ruangong = service.countMajorNumber("软件工程");
		ArrayList<Integer> list = new ArrayList<>();
		list.add(jike);
		list.add(xinan);
		list.add(wulianwang);
		list.add(ruangong);
		return list;
	}
	
	//获取不同年龄段人数list(顺序为:15及以下 16-18 19-21 22-24 25及以上)
	@RequestMapping("getAgeNum")
	@ResponseBody
	public ArrayList<Integer> getAgeNum(Model model) {
		int age1 = service.countAgeNumber(0, 15);
		int age2 = service.countAgeNumber(16, 18);
		int age3 = service.countAgeNumber(19, 21);
		int age4 = service.countAgeNumber(22, 24);
		int age5 = service.countAgeNumber(25, 100);
		ArrayList<Integer> list = new ArrayList<>();
		list.add(age1);
		list.add(age2);
		list.add(age3);
		list.add(age4);
		list.add(age5);
		return list;
	}
	
	//获取不同省份的学生人数list(顺序为:如下)
	@RequestMapping("getProvinceNum")
	@ResponseBody
	public ArrayList<Integer> getProvinceNum(Model model){
	    ArrayList<Integer> list = new ArrayList<>();
	    String[] arr=new String[]{"北京","天津","河北省","山西省","内蒙古自治区","辽宁省","吉林省","黑龙江省","上海","江苏省",
	    "浙江省","安徽省","福建省","江西省","山东省","河南省","湖北省","湖南省","广东省","广西壮族自治区","海南省",
	    "重庆","四川省","贵州省","云南省","西藏自治区","陕西省","甘肃省","青海省","宁夏回族自治区",
	    "新疆维吾尔自治区","台湾省","香港特别行政区","澳门特别行政区"};
	    for (String s:arr){
	        list.add(service.countProvinceNumber(s));
	    }
	    return list;
	}
	
	//获取不同兴趣的学生人数list(顺序为:运动类 娱乐类 社交类 智力类 收藏类 乐器类 文艺类 其他类)
	@RequestMapping("getHobbyNum")
	@ResponseBody
	public ArrayList<Integer> getHobbyNum(Model model) {
		int h1 = service.countHobbyNumber("运动类");
		int h2 = service.countHobbyNumber("娱乐类");
		int h3 = service.countHobbyNumber("社交类");
		int h4 = service.countHobbyNumber("智力类");
		int h5 = service.countHobbyNumber("收藏类");
		int h6 = service.countHobbyNumber("乐器类");
		int h7 = service.countHobbyNumber("文艺类");
		int h8 = service.countHobbyNumber("其他类");
		ArrayList<Integer> list = new ArrayList<>();
		list.add(h1);
		list.add(h2);
		list.add(h3);
		list.add(h4);
		list.add(h5);
		list.add(h6);
		list.add(h7);
		list.add(h8);
		return list;
	}

}
