package kr.api.entity;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;


@Entity
@Table(name = "member")
public class memberEntity {

  @Id
  @GeneratedValue
  @Column(name = "ID", updatable = false, nullable = false)
  private UUID id;

  @OneToOne
  @JoinColumn(name = "USER_ID", referencedColumnName = "ID")
  private UserEntity user;

  @ManyToMany(
      cascade = CascadeType.ALL
  )
  @JoinTable(
      name = "CART_ITEM",
      joinColumns = @JoinColumn(name = "CART_ID"),
      inverseJoinColumns = @JoinColumn(name = "ITEM_ID")
  )
  private List<ItemEntity> items = Collections.emptyList();

  public UUID getId() {
    return id;
  }

  public memberEntity setId(UUID id) {
    this.id = id;
    return this;
  }

  public UserEntity getUser() {
    return user;
  }

  public memberEntity setUser(UserEntity user) {
    this.user = user;
    return this;
  }

  public List<ItemEntity> getItems() {
    return items;
  }

  public memberEntity setItems(List<ItemEntity> items) {
    this.items = items;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    memberEntity that = (memberEntity) o;
    return user.equals(that.user) && Objects.equals(items, that.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, items);
  }
}
