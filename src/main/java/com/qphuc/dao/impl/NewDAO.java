package com.qphuc.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.qphuc.dao.INewDAO;
import com.qphuc.mapper.NewMapper;
import com.qphuc.model.NewModel;

@Repository
public class NewDAO extends AbstractDAO<NewModel> implements INewDAO {
	
	@Override
	public List<NewModel> findAll() {
		StringBuilder sql = new StringBuilder("SELECT * FROM news");
		return query(sql.toString(), new NewMapper());
	}
}
