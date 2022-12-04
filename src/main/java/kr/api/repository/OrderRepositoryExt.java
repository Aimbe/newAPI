package kr.api.repository;

import kr.api.entity.OrderEntity;
import kr.api.model.NewOrder;
import java.util.Optional;


public interface OrderRepositoryExt {
  Optional<OrderEntity> insert(NewOrder m);
}

