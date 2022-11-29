package kr.api.repository;

import kr.api.entity.CardEntity;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

/**
 * @author : github.com/sharmasourabh
 * @project : Chapter08 - Modern API Development with Spring and Spring Boot
 **/
public interface CardRepository extends CrudRepository<CardEntity, UUID> {
}

