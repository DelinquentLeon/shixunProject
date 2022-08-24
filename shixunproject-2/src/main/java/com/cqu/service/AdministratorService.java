package com.cqu.service;

import java.util.ArrayList;


import org.springframework.stereotype.Service;

import com.cqu.pojo.administrator;



/**
 * 接口设计
 * 
 * */

public interface AdministratorService {
	//向数据库中加入新的管理员
	void insertAdministrator(administrator admin);
	
	//删除管理员
	void deleteAdministrator(administrator admin);
	
	//更新数据库中的管理员信息
	void updateAdministrator(administrator admin);
	
	//查询所有管理员的信息
	ArrayList<administrator> findAllAdministrator();

	//查询特定账号的管理员
	administrator findAdministratorByAccount(String account);
}
