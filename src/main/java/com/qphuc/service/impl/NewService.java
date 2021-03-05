package com.qphuc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.qphuc.converter.NewConverter;
import com.qphuc.dto.NewDTO;
import com.qphuc.entity.NewEntity;
import com.qphuc.repository.NewRepository;
import com.qphuc.service.INewService;

@Service
public class NewService implements INewService {
	
	@Autowired
	private NewRepository newRepository;
	
	@Autowired
	private NewConverter newConverter;
	
	@Override
	public List<NewDTO> findAll(Pageable pageable) {
		List<NewDTO> models = new ArrayList<>();
		List<NewEntity> entities = newRepository.findAll(pageable).getContent();
		for(NewEntity item :entities) {
			/*
			 * NewDTO newDTO = new NewDTO(); newDTO.setTitle(item.getTitle());
			 * newDTO.setShortDescription(item.getShortDescription()); models.add(newDTO);
			 */
			NewDTO newDTO = newConverter.toDto(item);
			models.add(newDTO);
		}
		return models;
	}

	@Override
	public int getTotalItem() {
		
		return (int) newRepository.count();
	}

	@Override
	public NewDTO findById(long id) {
		NewEntity entity = newRepository.findOne(id);
		return newConverter.toDto(entity);
	}

}
