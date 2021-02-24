package com.qphuc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qphuc.entity.NewEntity;

public interface NewRepository extends JpaRepository<NewEntity, Long> {
	
}
