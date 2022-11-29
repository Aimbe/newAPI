package kr.api.service;

import kr.api.entity.AuthorizationEntity;
import com.packt.modern.api.model.PaymentReq;
import java.util.Optional;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * @author : github.com/sharmasourabh
 * @project : Chapter08 - Modern API Development with Spring and Spring Boot
 **/
public interface PaymentService {

  public Optional<AuthorizationEntity> authorize(@Valid PaymentReq paymentReq);
  public Optional<AuthorizationEntity> getOrdersPaymentAuthorization(@NotNull String orderId);
}
