//package kr.api.repository;
//
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
//
//import java.util.Optional;
//import java.util.UUID;
//
//public interface ChargePointRepository extends CrudRepository<ChargePointEntity,UUID> {
//
//    //insert
//    Optional<ChargePointEntity> insert(ChargePointEntity cp);
//
//    @Query(value ="select count(*) from chargePoint",nativeQuery = true)
//     Integer getChargePointCount();
//
//
//}
