package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entity.PositionEntity;

public interface PositionRepository extends JpaRepository<PositionEntity, Integer>{

}
