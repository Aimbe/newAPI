package kr.api.service;

import kr.api.entity.AddressEntity;
import kr.api.model.AddAddressReq;
import java.util.Optional;


public interface AddressService {
  public Optional<AddressEntity> createAddress(AddAddressReq addAddressReq);
  public void deleteAddressesById(String id);
  public Optional<AddressEntity> getAddressesById(String id);
  public Iterable<AddressEntity> getAllAddresses();
}
