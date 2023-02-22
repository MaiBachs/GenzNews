package com.Demo.service.impl;

import javax.inject.Inject;

import com.Demo.dao.IUserDao;
import com.Demo.model.UserModel;
import com.Demo.service.IUserService;

public class UserService implements IUserService{
	
	@Inject
	private IUserDao useDao;
	
	@Override
	public UserModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status) {
		// TODO Auto-generated method stub
		return useDao.findByUserNameAndPasswordAndStatus(userName, password, status);
	}

}
