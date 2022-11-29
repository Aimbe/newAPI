package kr.api.service;

import kr.api.entity.AddressEntity;
import kr.api.entity.CardEntity;
import kr.api.entity.UserEntity;
import kr.api.model.RefreshToken;
import kr.api.model.SignedInUser;
import kr.api.model.User;
import java.util.Optional;

/*
* swagger 경로 => generated
* */
public interface UserService {

  void deleteCustomerById(String id);

  Optional<Iterable<AddressEntity>> getAddressesByCustomerId(String id);

  Iterable<UserEntity> getAllCustomers();

  Optional<CardEntity> getCardByCustomerId(String id);

  Optional<UserEntity> getCustomerById(String id);

  Optional<SignedInUser> createUser(User user);

  UserEntity findUserByUsername(String username);

  SignedInUser getSignedInUser(UserEntity userEntity);

  Optional<SignedInUser> getAccessToken(RefreshToken refreshToken);

  void removeRefreshToken(RefreshToken refreshToken);
}
