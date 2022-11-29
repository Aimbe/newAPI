package kr.api.service;

import kr.api.entity.ShipmentEntity;
import javax.validation.constraints.Min;

/**
 * @author : github.com/sharmasourabh
 * @project : Chapter08 - Modern API Development with Spring and Spring Boot
 **/
public interface ShipmentService {
  public Iterable<ShipmentEntity> getShipmentByOrderId(@Min(value = 1L, message = "Invalid product ID.")  String id);
}
