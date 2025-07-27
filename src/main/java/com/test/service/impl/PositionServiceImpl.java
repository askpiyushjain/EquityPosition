package com.test.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entity.PositionEntity;
import com.test.repository.PositionRepository;
import com.test.service.PositionService;

@Service
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

	@Override
	public List<PositionEntity> getPosition() {
		List<PositionEntity> response = new ArrayList<PositionEntity>();
		
		List<PositionEntity> list = positionRepository.findAll();
		
		Map<String, List<PositionEntity>> listByCodes = list.stream().collect(Collectors.groupingBy(PositionEntity::getCode));
		
		
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		listByCodes.entrySet().stream().forEach(entry -> {
			
			entry.getValue().stream().forEach(item -> {
				if("INSERT".equalsIgnoreCase(item.getOperation())){
					if("Buy".equalsIgnoreCase(item.getType())){
				        Integer quantity = map.get(item.getCode()) == null ? 0 : map.get(item.getCode());
						map.put(item.getCode(), quantity + item.getQuantity());
				    } else if("Sell".equalsIgnoreCase(item.getType())){
						Integer quantity = map.get(item.getCode()) == null ? 0 : map.get(item.getCode());
						map.put(item.getCode(), quantity - item.getQuantity());
				    }
				} else if("UPDATE".equalsIgnoreCase(item.getOperation())){
					if("Buy".equalsIgnoreCase(item.getType())){
						//Integer quantity = map.get(item.getCode()) == null ? 0 : map.get(item.getCode());
						map.put(item.getCode(), item.getQuantity());
					}
				} else if("CANCEL".equalsIgnoreCase(item.getOperation())){
					map.put(item.getCode(), 0);
				}
			});
			
		});
		
		map.entrySet().stream().forEach(entry -> {
			PositionEntity positionEntity = new PositionEntity();
			positionEntity.setCode(entry.getKey());
			positionEntity.setQuantity(entry.getValue());
			response.add(positionEntity);
		});
		
		return response;
	}

	

}
