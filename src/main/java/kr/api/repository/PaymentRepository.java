package kr.api.repository;

import kr.api.entity.PaymentEntity;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

/*
* swagger 경로 => generated
* */
public interface PaymentRepository extends CrudRepository<PaymentEntity, UUID> {
}

