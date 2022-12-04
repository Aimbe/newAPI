package kr.api.repository;

import kr.api.entity.PaymentEntity;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;


public interface PaymentRepository extends CrudRepository<PaymentEntity, UUID> {
}

