package kr.api.repository;

import kr.api.entity.ShipmentEntity;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

/*
* swagger 경로 => generated
* */
public interface ShipmentRepository extends CrudRepository<ShipmentEntity, UUID> {
}

