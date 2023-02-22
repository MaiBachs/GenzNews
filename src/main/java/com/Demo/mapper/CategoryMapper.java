package com.Demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.Demo.model.CategoryModel;

public class CategoryMapper implements RowMapper<CategoryModel>{

	@Override
	public CategoryModel mapRow(ResultSet resultSet) {
		CategoryModel categoryModel = new CategoryModel();
		try {
			categoryModel.setId(resultSet.getLong("id"));
			categoryModel.setCode(resultSet.getString("code"));
			categoryModel.setName(resultSet.getString("name"));	
			return categoryModel;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return null;
		}
		
	}

}
