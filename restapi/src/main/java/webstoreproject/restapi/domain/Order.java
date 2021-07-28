package webstoreproject.restapi.domain;


import java.util.List;

public class Order {
    private List<OrderLine> orderLineList;
    private double totalOrderPrice;
    private String orderNumber;
    private OrderStatus orderStatus;

    public Order() {
    }

    public Order(List<OrderLine> orderLineList, double totalOrderPrice, String orderNumber, OrderStatus orderStatus) {
        this.orderLineList = orderLineList;
        this.totalOrderPrice = totalOrderPrice;
        this.orderNumber = orderNumber;
        this.orderStatus = orderStatus;
    }

    public List<OrderLine> getOrderLineList() {
        return orderLineList;
    }

    public void setOrderLineList(List<OrderLine> orderLineList) {
        this.orderLineList = orderLineList;
    }



    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderLineList=" + orderLineList +
                ", totalOrderPrice=" + totalOrderPrice +
                ", orderNumber='" + orderNumber + '\'' +
                ", orderStatus=" + orderStatus +
                '}';
    }

    public double getTotalOrderPrice() {
        return totalOrderPrice;
    }

    public void setTotalOrderPrice(double totalOrderPrice) {
        this.totalOrderPrice = totalOrderPrice;
    }
}
