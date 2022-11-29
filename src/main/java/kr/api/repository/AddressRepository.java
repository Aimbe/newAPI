package kr.api.repository;

import kr.api.entity.AddressEntity;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;


public interface AddressRepository extends CrudRepository<AddressEntity, UUID> {
}

