package com.test.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.test.entity.PositionEntity;


public interface PositionService {

	PositionEntity savePosition(PositionEntity userEntity);
	
	List<PositionEntity> getAllPositions();

}
