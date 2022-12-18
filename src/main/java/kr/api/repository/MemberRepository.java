package kr.api.repository;

import kr.api.entity.CardEntity;
import kr.api.entity.CartEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;
import java.util.UUID;


public interface MemberRepository extends CrudRepository<CardEntity, UUID> {

    Optional<CartEntity> findByCustomerId(@Param("customerId") UUID customerId);

}

