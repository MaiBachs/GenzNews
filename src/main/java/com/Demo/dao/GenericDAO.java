package com.Demo.dao;

import java.util.List;
import com.Demo.mapper.RowMapper;

public interface GenericDAO<T> {
	<T> List<T> query(String sql, RowMapper<T> rowMapper ,Object... paragram);	
	void update (String sql, Object... parameters);
	Long insert (String sql, Object... parameters);
	void delete (String sql, Object... parameters);
	int count(String sql, Object... parameters);
}
