package com.Demo.dao;

import com.Demo.model.UserModel;

public interface IUserDao extends GenericDAO<UserModel>{
	UserModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status);
}
