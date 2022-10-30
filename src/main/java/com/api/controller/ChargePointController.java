package com.api.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChargePointController {

    public ChargePointController(ChargePointService chargePointService){
        this.service = chargePointService;
    }

}
