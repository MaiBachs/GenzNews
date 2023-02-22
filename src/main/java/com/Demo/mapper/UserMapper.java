package com.Demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.Demo.model.RoleModel;
import com.Demo.model.UserModel;

public class UserMapper implements RowMapper<UserModel>{

	@Override
	public UserModel mapRow(ResultSet resultSet) {
		UserModel userModel = new UserModel();
		try {
			userModel.setId(resultSet.getLong("id"));
			userModel.setUserName(resultSet.getString("userName"));
			userModel.setFullName(resultSet.getString("fullName"));
			userModel.setPassWord(resultSet.getString("passWord"));
			userModel.setStatus(resultSet.getInt("status"));
			RoleModel roleModel = new RoleModel();
			roleModel.setCode(resultSet.getString("code"));
			roleModel.setName(resultSet.getString("name"));
			userModel.setRole(roleModel);
			return userModel;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
}
