package kr.api.service;

import kr.api.entity.ItemEntity;
import kr.api.model.Item;
import java.util.List;


public interface ItemService {

  ItemEntity toEntity(Item m);

  List<ItemEntity> toEntityList(List<Item> items);

  Item toModel(ItemEntity e);

  List<Item> toModelList(List<ItemEntity> items);
}
