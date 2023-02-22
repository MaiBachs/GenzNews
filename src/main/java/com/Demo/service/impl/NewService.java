package com.Demo.service.impl;
import java.util.List;

import javax.inject.Inject;

import com.Demo.dao.INewDao;
import com.Demo.model.NewModel;
import com.Demo.service.INewService;

public class NewService implements INewService{
	
	@Inject
	private INewDao newDao;

	@Override
	public List<NewModel> findByCategoryId(Long categoryId) {
		// TODO Auto-generated method stub
		return newDao.findByCategoryId(categoryId);
	}

	@Override
	public NewModel save(NewModel newModel) {
		Long id = newDao.save(newModel);
		return newDao.findOne(id);
	}

	@Override
	public List<NewModel> findAll(Integer offset, Integer limit) {
		return newDao.findAll(offset, limit);
	}

	@Override
	public void update(NewModel updateNew) {
		newDao.update(updateNew);
	}

	@Override
	public void delete(Long[] ids) {
		for (long id: ids) {
			//1.delete comment (khoa ngoai new_id)
			//2.delete news
			newDao.delete(id);
		}
	}

	@Override
	public NewModel findOne(long id) {
		// TODO Auto-generated method stub
		return newDao.findOne(id);
	}

	@Override
	public int getTotalItem() {
		// TODO Auto-generated method stub
		return newDao.getTotalItem();
	}

}
