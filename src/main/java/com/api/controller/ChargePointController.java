package com.api.controller;

import com.api.entity.ChargePointEntity;
import com.api.service.ChargePointService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.status;

@RestController
public class ChargePointController {

    public ChargePointController(ChargePointService chargePointService){
        this.service = chargePointService;
    }
    //ResponseEntity param 값 정의.
    public ResponseEntity<ChargePointEntity> createChargePoint(){

        return status(HttpStatus.CREATED).body(service.createChargePoint().map(assembler::toModel).get());

    }
    public ResponseEntity<ChargePointEntity> updateChargePoint(){
        return status(HttpStatus.CREATED).body(service.updateChargePoint().map());
    }

    public ResponseEntity<ChargePointEntity> getChargePointById(){
        return status(HttpStatus.CREATED).body();

    }

}
