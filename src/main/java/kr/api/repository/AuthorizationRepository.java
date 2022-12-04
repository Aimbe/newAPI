package kr.api.repository;

import kr.api.entity.AuthorizationEntity;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;


public interface AuthorizationRepository extends CrudRepository<AuthorizationEntity, UUID> {
}

