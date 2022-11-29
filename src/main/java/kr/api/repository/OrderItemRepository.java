package kr.api.repository;

import kr.api.entity.OrderItemEntity;

import java.util.UUID;
import org.springframework.data.repository.CrudRepository;


/*
* swagger 경로 => generated
* */
public interface OrderItemRepository extends CrudRepository<OrderItemEntity, UUID> {
}
