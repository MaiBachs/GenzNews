package com.Demo.dao;

import com.Demo.model.CategoryModel;
import java.util.List;

public interface ICategoryDao extends GenericDAO<CategoryModel> {
	List<CategoryModel> findAll();
}
