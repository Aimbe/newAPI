package com.api.service;

import com.api.entity.ChargePointEntity;

import java.util.Optional;

public interface ChargePointService {
    //CP CRUD 구현
    public void createChargePoint();
    public void deleteChargePointById(String id);
    //Iterable , Optional 차이 정리
    public Iterable<ChargePointEntity> getAllChargerPoint();
    public Optional<ChargePointEntity> getChargePointById();
}
