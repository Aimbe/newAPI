package kr.api.repository;

import kr.api.entity.TagEntity;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;



public interface TagRepository extends CrudRepository<TagEntity, UUID> {
}
