package com.Demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.Demo.model.CategoryModel;
import com.Demo.model.NewModel;
public class NewMapper implements RowMapper<NewModel>{

	@Override
	public NewModel mapRow(ResultSet resultset) {
		NewModel news = new NewModel();
		try {
			news.setId(resultset.getLong("id"));
			news.setTitle(resultset.getString("title"));
			news.setContent(resultset.getString("content"));
			news.setCategoryid(resultset.getLong("categoryid"));
			news.setThumbnail(resultset.getString("thumbnail"));
			news.setShortdescription(resultset.getString("shortdescription"));
			news.setCreateddate(resultset.getString("createddate"));
			news.setCreatedby(resultset.getString("createdby"));
			CategoryModel category = new CategoryModel();
			category.setName(resultset.getString("name"));
			news.setCategory(category);
			if(resultset.getString("modifieddate") != null) {
				news.setModifieddate(resultset.getString("modifieddate"));
			};
			if(resultset.getString("modifiedby") != null) {
				news.setModifiedby(resultset.getString("modifiedby"));
			};
			return news;
		} catch (SQLException e) {
			System.out.println(e);
			return null;
		}
	}

}
