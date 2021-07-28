package webstoreproject.restapi.service;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webstoreproject.restapi.data.UserOrderRepo;
import webstoreproject.restapi.domain.Order;
import webstoreproject.restapi.domain.OrderLine;
import webstoreproject.restapi.domain.OrderStatus;
import webstoreproject.restapi.domain.UserOrder;

import java.util.List;

@Service
public class UserOrderService {
    @Autowired
    UserOrderRepo userOrderRepo;
    @Autowired
    ProductService productService;
  public UserOrder createOrder(UserOrder userOrder){
     UserOrder userOrder1=userOrderRepo.save(userOrder);
     List<OrderLine> orderLineList=userOrder.getOrder().getOrderLineList();
     System.out.println(orderLineList.toString());
     for(OrderLine o:orderLineList){
         productService.updateProductQuantity(o.getProductNumber(),o.getQuantity());
     }

     return userOrder1;

}
public List<UserOrder> getAllOrder(){
      List<UserOrder> userOrderList=userOrderRepo.findByEmailNotNull();
      return userOrderList;
}
public UserOrder updateUserOrder(String orderNumber, OrderStatus orderStatus){
      UserOrder userOrder= userOrderRepo.findUserOrderByOrder_OrderNumber(orderNumber);
        if(userOrder!=null){
            Order order=userOrder.getOrder();
            order.setOrderStatus(orderStatus);
            userOrderRepo.save(userOrder);
        }
      return userOrder;
}

}
