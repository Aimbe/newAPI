package kr.api.repository;

import kr.api.entity.ItemEntity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ItemRepositoryImpl implements ItemRepository {
    @Override
    public Iterable<ItemEntity> findByCustomerId(String customerId) {
        return null;
    }

    @Override
    public void deleteCartItemJoinById(List<UUID> ids, UUID cartId) {

    }

    @Override
    public <S extends ItemEntity> S save(S entity) {
        return null;
    }

    @Override
    public <S extends ItemEntity> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<ItemEntity> findById(UUID uuid) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(UUID uuid) {
        return false;
    }

    @Override
    public Iterable<ItemEntity> findAll() {
        return null;
    }

    @Override
    public Iterable<ItemEntity> findAllById(Iterable<UUID> uuids) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(UUID uuid) {

    }

    @Override
    public void delete(ItemEntity entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends ItemEntity> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
