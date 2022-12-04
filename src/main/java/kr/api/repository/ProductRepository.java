package kr.api.repository;

import kr.api.entity.ProductEntity;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;


public interface ProductRepository extends CrudRepository<ProductEntity, UUID> {
}

