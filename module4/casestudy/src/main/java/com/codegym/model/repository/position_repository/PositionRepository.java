package com.codegym.model.repository.position_repository;

import com.codegym.model.entity.position.Position;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRepository extends PagingAndSortingRepository<Position,Integer>{
}
