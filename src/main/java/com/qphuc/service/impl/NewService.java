package com.qphuc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qphuc.entity.NewEntity;
import com.qphuc.model.NewModel;
import com.qphuc.repository.NewRepository;
import com.qphuc.service.INewService;

@Service
public class NewService implements INewService {
	
	@Autowired
	private NewRepository newRepository;
	
	@Override
	public List<NewModel> findAll() {
		List<NewModel> models = new ArrayList<>();
		List<NewEntity> entities = newRepository.findAll();
		for(NewEntity item :entities) {
			NewModel newModel = new NewModel();
			newModel.setTitle(item.getTitle());
			newModel.setShortDescription(item.getShortDescription());
			models.add(newModel);
		}
		return models;
	}
}
