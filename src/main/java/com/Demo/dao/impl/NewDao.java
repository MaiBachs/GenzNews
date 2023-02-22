package com.Demo.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.Demo.dao.INewDao;
import com.Demo.mapper.NewMapper;
import com.Demo.model.NewModel;

public class NewDao extends AbtractDAO<NewModel> implements INewDao{

	@Override
	public List<NewModel> findByCategoryId(Long categoryId) {
		String sql = "SELECT * FROM news WHERE categoryid = ?";
		return query(sql, new NewMapper(), categoryId);
	}

	@Override
	public Long save(NewModel newModel) {
		String sql = "INSERT INTO news (title, content, categoryid, createddate) VALUE (?, ?, ?, ?)";
		return insert(sql, newModel.getTitle(), newModel.getContent(), newModel.getCategoryid(), newModel.getCreateddate());
	}

	@Override
	public void update(NewModel newModel) {
		// TODO Auto-generated method stub
		String sql = "UPDATE news SET title=?, content=?, categoryid=? WHERE id=?";
		update(sql, newModel.getTitle(), newModel.getContent(), newModel.getCategoryid(), newModel.getId());
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		String sql1 = "DELETE FROM news WHERE id="+id;
		delete(sql1, id);
	}

	@Override
	public List<NewModel> findAll(Integer offset, Integer limit) {
		String sql = "SELECT * FROM news INNER JOIN category ON news.categoryid = category.id LIMIT ?,?";
		return query(sql, new NewMapper(), offset, limit);
	}

	@Override
	public NewModel findOne(long id) {
		String sql = "SELECT * FROM news JOIN category ON news.categoryid = category.id WHERE news.id=?";
		try{
			return query(sql, new NewMapper(),id).get(0);
		}
		catch (Exception e){
			return null;
		}
	}
	@Override
	public int getTotalItem() {
		String sql = "SELECT COUNT(*) FROM news";
		return count(sql);
	}
}
