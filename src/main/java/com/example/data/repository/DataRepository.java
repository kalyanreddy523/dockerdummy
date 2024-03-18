package com.example.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.data.entity.DataEntity;

public interface DataRepository extends JpaRepository<DataEntity, Long> {
	
}
