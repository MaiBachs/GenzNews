package com.Demo.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Demo.dao.ICategoryDao;
import com.Demo.mapper.CategoryMapper;
import com.Demo.model.CategoryModel;
import com.mysql.jdbc.Driver;

public class CategoryDAO extends AbtractDAO<CategoryModel> implements ICategoryDao{
	
	@Override
	public List<CategoryModel> findAll() {
		String sql = "SELECT * FROM category";
		return query(sql, new CategoryMapper());
	}
}