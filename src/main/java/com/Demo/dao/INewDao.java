package com.Demo.dao;

import java.util.List;

import com.Demo.model.CategoryModel;
import com.Demo.model.NewModel;

public interface INewDao extends GenericDAO<NewModel>{
	List<NewModel> findByCategoryId(Long categoryId);
	Long save(NewModel newModel);
	void update(NewModel newModel);
	void delete(long id);
	List<NewModel> findAll(Integer offset, Integer limit);
	NewModel findOne(long id);
	int getTotalItem();
}
