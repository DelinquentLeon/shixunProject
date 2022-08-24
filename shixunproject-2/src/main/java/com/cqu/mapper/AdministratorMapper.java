package com.cqu.mapper;

import java.util.ArrayList;

import com.cqu.pojo.administrator;

/**
 * 接口设计 
 * */

public interface AdministratorMapper {
	
	//向数据库中加入新的管理员
	void addAdministrator(administrator admin);
	
	//删除管理员
	void deleteAdministrator(administrator admin);
	
	//更新数据库中的管理员信息
	void updateAdministrator(administrator admin);
	
	//查询所有管理员的信息
	ArrayList<administrator> findAllAdministrator();

	//查询特定账号的管理员
	administrator findAdministratorByAccount(String account);
}
