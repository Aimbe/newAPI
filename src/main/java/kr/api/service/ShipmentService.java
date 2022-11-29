package kr.api.service;

import kr.api.entity.ShipmentEntity;
import javax.validation.constraints.Min;

/*
* swagger 경로 => generated
* */
public interface ShipmentService {
  public Iterable<ShipmentEntity> getShipmentByOrderId(@Min(value = 1L, message = "Invalid product ID.")  String id);
}
