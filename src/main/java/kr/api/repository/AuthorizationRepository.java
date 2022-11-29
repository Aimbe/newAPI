package kr.api.repository;

import kr.api.entity.AuthorizationEntity;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;

/*
* swagger 경로 => generated
* */
public interface AuthorizationRepository extends CrudRepository<AuthorizationEntity, UUID> {
}

