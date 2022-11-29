package kr.api.repository;

import kr.api.entity.ProductEntity;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

/*
* swagger 경로 => generated
* */
public interface ProductRepository extends CrudRepository<ProductEntity, UUID> {
}

