package kr.api.repository;

import kr.api.entity.OrderItemEntity;

import java.util.UUID;
import org.springframework.data.repository.CrudRepository;



public interface OrderItemRepository extends CrudRepository<OrderItemEntity, UUID> {
}
