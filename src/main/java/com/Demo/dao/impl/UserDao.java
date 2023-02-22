package com.Demo.dao.impl;

import com.Demo.model.UserModel;

import java.util.List;

import com.Demo.dao.IUserDao;
import com.Demo.mapper.UserMapper;
import com.Demo.model.UserModel;

public class UserDao extends AbtractDAO<UserModel> implements IUserDao{

	@Override
	public UserModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status) {
		// TODO Auto-generated method stub
		StringBuilder sql = new StringBuilder("SELECT * FROM user ");
		sql.append("INNER JOIN role ON user.id = role.id ");
		sql.append("WHERE user.userName = ? AND user.passWord = ? AND user.status = ?");
		List<UserModel> userModel = query(sql.toString(),new UserMapper() , userName, password, status);
		return userModel.isEmpty() ? null: userModel.get(0) ;
	}	
}
