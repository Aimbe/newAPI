package com.api.repository;

import com.packt.modern.api.entity.AddressEntity;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;


public interface AddressRepository extends CrudRepository<AddressEntity, UUID> {
}

