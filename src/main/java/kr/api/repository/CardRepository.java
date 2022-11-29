package kr.api.repository;

import kr.api.entity.CardEntity;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

/*
* swagger 경로 => generated
* */
public interface CardRepository extends CrudRepository<CardEntity, UUID> {
}

