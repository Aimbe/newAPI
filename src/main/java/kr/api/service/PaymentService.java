package kr.api.service;

import kr.api.entity.AuthorizationEntity;
import kr.api.model.PaymentReq;
import java.util.Optional;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;


public interface PaymentService {

  public Optional<AuthorizationEntity> authorize(@Valid PaymentReq paymentReq);
  public Optional<AuthorizationEntity> getOrdersPaymentAuthorization(@NotNull String orderId);
}
