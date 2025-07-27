package com.test.service;

import java.util.List;


import com.test.entity.PositionEntity;

public interface PositionService {

	PositionEntity savePosition(PositionEntity userEntity);
	
	List<PositionEntity> getAllPositions();
	
	List<PositionEntity> getPosition();

}
