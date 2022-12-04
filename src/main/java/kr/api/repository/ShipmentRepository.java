package kr.api.repository;

import kr.api.entity.ShipmentEntity;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;


public interface ShipmentRepository extends CrudRepository<ShipmentEntity, UUID> {
}

