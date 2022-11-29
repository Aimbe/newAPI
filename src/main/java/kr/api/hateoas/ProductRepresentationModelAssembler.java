package kr.api.hateoas;

import static java.util.stream.Collectors.toList;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import kr.api.controller.ProductController;
import kr.api.entity.ProductEntity;
import kr.api.model.Product;
import kr.api.model.Tag;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.StreamSupport;
import org.springframework.beans.BeanUtils;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.stereotype.Component;

/*
* swagger 경로 => generated
* */
@Component
public class ProductRepresentationModelAssembler extends
    RepresentationModelAssemblerSupport<ProductEntity, Product> {

  /**
   * Creates a new {@link RepresentationModelAssemblerSupport} using the given controller class and
   * resource type.
   */
  public ProductRepresentationModelAssembler() {
    super(ProductController.class, Product.class);
  }

  /**
   * Coverts the Product entity to resource
   *
   * @param entity
   */
  @Override
  public Product toModel(ProductEntity entity) {
    Product resource = createModelWithId(entity.getId(), entity);
    BeanUtils.copyProperties(entity, resource);
    resource.setId(entity.getId().toString());
    resource.setTag(
        entity.getTags().stream().map(t -> new Tag().id(t.getId().toString()).name(t.getName()))
            .collect(toList()));
    // Self link generated by createModelWithId has missing api path. Therefore generating additionally.
    // can be removed once fixed.
    resource.add(linkTo(methodOn(ProductController.class).getProduct(entity.getId().toString()))
        .withSelfRel());
    resource.add(linkTo(methodOn(ProductController.class).queryProducts(null, null, 1, 10))
        .withRel("products"));
    return resource;
  }

  /**
   * Coverts the collection of Product entities to list of resources.
   *
   * @param entities
   */
  public List<Product> toListModel(Iterable<ProductEntity> entities) {
    if (Objects.isNull(entities)) {
      return Collections.emptyList();
    }
    return StreamSupport.stream(entities.spliterator(), false).map(p -> toModel(p))
        .collect(toList());
  }
}
