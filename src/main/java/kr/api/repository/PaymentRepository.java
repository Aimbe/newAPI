package kr.api.repository;

import kr.api.entity.PaymentEntity;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

/**
 * @author : github.com/sharmasourabh
 * @project : Chapter08 - Modern API Development with Spring and Spring Boot
 **/
public interface PaymentRepository extends CrudRepository<PaymentEntity, UUID> {
}
