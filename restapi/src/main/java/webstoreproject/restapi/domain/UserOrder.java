package webstoreproject.restapi.domain;

import java.util.List;

public class UserOrder {
    private String userName;
    private String email;
    private String phone;
    private Order order;

    public UserOrder(String userName, String email, String phone, Order order) {
        this.userName = userName;
        this.email = email;
        this.phone = phone;
        this.order = order;

    }



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", order=" + order +
                '}';
    }
}
