package com.qphuc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qphuc.entity.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long>{
	CategoryEntity findOneByCode(String code);
}
