package com.qphuc.api.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qphuc.dto.NewDTO;
import com.qphuc.service.INewService;
import com.qphuc.service.impl.NewService;

@RestController(value = "newAPIOfAdmin")
public class NewAPI {

	@Autowired
	private INewService newService;
	
	@PostMapping("/api/new")
	public NewDTO createNew(@RequestBody NewDTO newDTO) {
		return newService.save(newDTO);
	}
		
	@PutMapping("/api/new")
	public NewDTO updateNew(@RequestBody NewDTO updateNew) {
		return newService.save(updateNew);
	}
		
	@DeleteMapping("/api/new")
	public void deleteNew(@RequestBody long[] ids) {
		
	}
}

