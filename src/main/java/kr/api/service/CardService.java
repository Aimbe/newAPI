package kr.api.service;

import kr.api.entity.CardEntity;
import kr.api.model.AddCardReq;
import java.util.Optional;
import javax.validation.Valid;

/*
* swagger 경로 => generated
* */
public interface CardService {
  public void deleteCardById(String id);
  public Iterable<CardEntity> getAllCards();
  public Optional<CardEntity> getCardById(String id);
  public Optional<CardEntity> registerCard(@Valid AddCardReq addCardReq);
}
