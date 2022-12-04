package kr.api.controller;

import static org.springframework.http.ResponseEntity.accepted;
import static org.springframework.http.ResponseEntity.ok;

import kr.api.CartApi;
import kr.api.hateoas.CartRepresentationModelAssembler;
import kr.api.model.Cart;
import kr.api.model.Item;
import kr.api.service.CartService;
import java.util.List;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CartsController implements CartApi {

  private static final Logger log = LoggerFactory.getLogger(CartsController.class);
  private CartService service;
  private final CartRepresentationModelAssembler assembler;

  public CartsController(CartService service, CartRepresentationModelAssembler assembler) {
    this.service = service;
    this.assembler = assembler;
  }


  //오버라이드 객체 찾기
  @Override
  public ResponseEntity<List<Item>> addCartItemsByCustomerId(String customerId, @Valid Item item) {
    log.info("Request for customer ID: {}\nItem: {}", customerId, item);
    return ok(service.addCartItemsByCustomerId(customerId, item));
  }

  @Override
  public ResponseEntity<List<Item>> addOrReplaceItemsByCustomerId(String customerId,
      @Valid Item item) {
    return ok(service.addOrReplaceItemsByCustomerId(customerId, item));
  }

  @Override
  public ResponseEntity<Void> deleteCart(String customerId) {
    service.deleteCart(customerId);
    return accepted().build();
  }

  @Override
  public ResponseEntity<Void> deleteItemFromCart(String customerId, String itemId) {
    service.deleteItemFromCart(customerId, itemId);
    return accepted().build();
  }

  @Override
  public ResponseEntity<Cart> getCartByCustomerId(String customerId) {
    return ok(assembler.toModel(service.getCartByCustomerId(customerId)));
  }

  @Override
  public ResponseEntity<List<Item>> getCartItemsByCustomerId(String customerId) {
    return ok(service.getCartItemsByCustomerId(customerId));
  }

  @Override
  public ResponseEntity<Item> getCartItemsByItemId(String customerId, String itemId) {
    return ok(service.getCartItemsByItemId(customerId, itemId));
  }
}
