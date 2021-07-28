package webstoreproject.restapi.web;

import webstoreproject.restapi.service.ProductDTO;

import java.util.Collection;

public class Products {
    private Collection<ProductDTO> products;

    public Products(Collection<ProductDTO> products) {
        this.products = products;
    }

    public Collection<ProductDTO> getProducts() {
        return products;
    }

    public void setProducts(Collection<ProductDTO> products) {
        this.products = products;
    }
}
