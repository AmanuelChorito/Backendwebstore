package webstoreproject.restapi.data;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import webstoreproject.restapi.domain.Order;
import webstoreproject.restapi.domain.UserOrder;

import java.util.List;

@Repository
public interface UserOrderRepo extends MongoRepository<UserOrder,String> {
UserOrder save(UserOrder userOrder);
List<UserOrder>findByEmailNotNull();
UserOrder findUserOrderByOrder_OrderNumber(String orderNumber);


}
