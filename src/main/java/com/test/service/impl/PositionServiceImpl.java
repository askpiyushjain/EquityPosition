package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.entity.PositionEntity;
import com.test.repository.PositionRepository;
import com.test.service.PositionService;

public class PositionServiceImpl implements PositionService{

	@Autowired
	private PositionRepository positionRepository;
	
	@Override
	public PositionEntity savePosition(PositionEntity positionEntity) {
		
		return positionRepository.save(positionEntity);
	}

	@Override
	
	public List<PositionEntity> getAllPositions() {
		
		return positionRepository.findAll();
	}

	

	

}
