package kr.api.repository;

import kr.api.entity.TagEntity;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;


/*
* swagger 경로 => generated
* */
public interface TagRepository extends CrudRepository<TagEntity, UUID> {
}
