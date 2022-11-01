package com.api.repository;

import com.api.entity.ChargePointEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface ChargePointRepository extends CrudRepository<ChargePointEntity,UUID> {

    @Query(value ="select count(*) from chargePoint",nativeQuery = true)
     Integer getChargePointCount();


}
