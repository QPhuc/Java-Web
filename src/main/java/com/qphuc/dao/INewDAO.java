package com.qphuc.dao;

import java.util.List;

import com.qphuc.model.NewModel;

public interface INewDAO extends GenericDAO<NewModel> {
	List<NewModel> findAll();
}
