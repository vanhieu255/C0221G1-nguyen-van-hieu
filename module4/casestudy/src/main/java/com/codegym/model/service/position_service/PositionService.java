package com.codegym.model.service.position_service;

import com.codegym.model.entity.division.Division;
import com.codegym.model.entity.position.Position;

public interface PositionService {
    Iterable<Position> findAll();
}
