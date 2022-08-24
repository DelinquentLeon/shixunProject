package com.cqu.serviceImpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cqu.mapper.AdministratorMapper;
import com.cqu.pojo.administrator;
import com.cqu.service.AdministratorService;

@Service
public class AdministratorServiceImpl implements AdministratorService{
	
	@Autowired
	AdministratorMapper mapper;
	
	@Override
	//向数据库中加入新的管理员
	public void insertAdministrator(administrator admin) {
		mapper.addAdministrator(admin);
	}
	
	//删除管理员
	public void deleteAdministrator(administrator admin) {
		mapper.deleteAdministrator(admin);
	}
	
	//更新数据库中的管理员信息
	public void updateAdministrator(administrator admin) {
		mapper.updateAdministrator(admin);
	}
	
	//查询所有管理员的信息
	public ArrayList<administrator> findAllAdministrator() {
		ArrayList<administrator> admins= mapper.findAllAdministrator();
		return admins;
	}

	//查询特定账号的管理员
	public administrator findAdministratorByAccount(String account) {
		administrator admin = mapper.findAdministratorByAccount(account);
		return admin;
	}
	
}
