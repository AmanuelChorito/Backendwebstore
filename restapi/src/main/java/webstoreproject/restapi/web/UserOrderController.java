package webstoreproject.restapi.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import webstoreproject.restapi.domain.OrderStatus;
import webstoreproject.restapi.domain.UserOrder;
import webstoreproject.restapi.service.ProductDTO;
import webstoreproject.restapi.service.UserOrderDTO;
import webstoreproject.restapi.service.UserOrderService;

import java.util.List;

@RestController
@CrossOrigin
public class UserOrderController {
@Autowired
    UserOrderService userOrderService;
@GetMapping("/orders")
    public ResponseEntity<?>getOrders(){
    List<UserOrder> orderDTOList=userOrderService.getAllOrder();
    return new ResponseEntity<List<UserOrder>>(orderDTOList, HttpStatus.OK);
}

    @PostMapping("/orders")
    public  ResponseEntity<?>addOrder(@RequestBody UserOrder userOrder){
//        System.out.println(userOrder.getOrder().getOrderLineList().toString());
//        System.out.println("orderNumber"+userOrder.getOrder().getOrderNumber());
//        System.out.println("price"+userOrder.getOrder().getTotalOrderPrice());
       UserOrder userOrder1= userOrderService.createOrder(userOrder);
        return new ResponseEntity<>(userOrder1, HttpStatus.OK);
    }
    @PutMapping ("/orders/{orderNumber}")
    public ResponseEntity<?>updateProduct(@PathVariable String orderNumber, @RequestParam(required = false) OrderStatus orderStatus){
    System.out.println(orderNumber);
        System.out.println(orderStatus);
         UserOrder userOrder= userOrderService.updateUserOrder(orderNumber,orderStatus);

        return  new ResponseEntity<>(userOrder, HttpStatus.OK);
    }
}
