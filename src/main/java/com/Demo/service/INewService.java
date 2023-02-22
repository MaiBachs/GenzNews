package com.Demo.service;

import java.util.List;

import javax.enterprise.inject.Model;

import com.Demo.model.NewModel;

public interface INewService {
	List<NewModel> findByCategoryId(Long categoryId);
	NewModel save(NewModel newModel);
	List<NewModel> findAll(Integer offset, Integer limit);
	void update(NewModel updateNew);
	void delete(Long[] ids);
	NewModel findOne(long id);
	int getTotalItem();
}
