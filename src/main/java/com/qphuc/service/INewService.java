package com.qphuc.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.qphuc.dto.NewDTO;

public interface INewService {
	List<NewDTO> findAll(Pageable pageable);
	int getTotalItem();
	NewDTO findById(long id);
	NewDTO save(NewDTO dto);
}
