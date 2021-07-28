package webstoreproject.restapi.service;

import webstoreproject.restapi.domain.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductAdapter {
    public static Product getProduct(ProductDTO productDTO){
        Product product= new Product();
        if(productDTO!=null){
    product= new Product(productDTO.getProductNumber(),productDTO.getProductName(),productDTO.getPrice(), productDTO.getDescription(),productDTO.getNumberinStock());

        }
        return  product;

    }
    public  static  ProductDTO getProductDTO(Product product){
        ProductDTO productDTO= new ProductDTO();
        if(product!=null){
            productDTO= new ProductDTO(product.getProductNumber(),product.getProductName(),product.getPrice(),product.getDescription(),product.getNumberinStock());

        }
return  productDTO;
    }
    public static  List<ProductDTO>getProductDTOList(List<Product> productList){
        List<ProductDTO>productDTOList= new ArrayList<ProductDTO>();
        if(productList!=null){
            for (Product product:productList){
                productDTOList.add(getProductDTO(product));
            }
        }
        return productDTOList;
    }
}
