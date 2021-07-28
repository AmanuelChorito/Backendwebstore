package webstoreproject.restapi.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product {
@Id
private String productNumber;
private String productName;
private double price;
private String description;
private int numberinStock;

    public Product() {

    }

    public Product(String productNumber, String productName, double price, String description, int numberinStock) {
        this.productNumber = productNumber;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.numberinStock = numberinStock;
    }

    public String getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberinStock() {
        return numberinStock;
    }

    public void setNumberinStock(int numberinStock) {
        this.numberinStock = numberinStock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productNumber='" + productNumber + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", numberinStock=" + numberinStock +
                '}';
    }
}
