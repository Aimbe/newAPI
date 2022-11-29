package kr.api.repository;

import kr.api.entity.OrderEntity;
import com.packt.modern.api.model.NewOrder;
import java.util.Optional;

/**
 * @author : github.com/sharmasourabh
 * @project : Chapter08 - Modern API Development with Spring and Spring Boot
 **/
public interface OrderRepositoryExt {
  Optional<OrderEntity> insert(NewOrder m);
}

