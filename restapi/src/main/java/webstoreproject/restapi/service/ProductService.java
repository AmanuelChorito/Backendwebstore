package webstoreproject.restapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import webstoreproject.restapi.data.ProductRepo;
import webstoreproject.restapi.domain.Product;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;
    public ProductDTO addProduct(ProductDTO productDTO){
        Product product= ProductAdapter.getProduct(productDTO);
        Product product1=productRepo.save(product);
        return ProductAdapter.getProductDTO(product1);

    }
public ProductDTO updateProduct(ProductDTO productDTO){
    ProductDTO productDTO2= searchProduct(productDTO.getProductNumber());
    if(productDTO2 !=null){
        productDTO2.setProductName(productDTO.getProductName());
        productDTO2.setDescription(productDTO2.getDescription());
        productDTO2.setPrice(productDTO2.getPrice());
        productDTO2.setNumberinStock(productDTO2.getNumberinStock());
    }
       return addProduct(productDTO);
}

public ProductDTO updateProductQuantity(String productNumber, int quantity){
        ProductDTO productDTO=searchProduct(productNumber);
        if(productDTO!=null){
            productDTO.setNumberinStock(productDTO.getNumberinStock()-quantity);
        }
        return addProduct(productDTO);
}
public void deleteProduct(String productNumber){
            productRepo.removeByProductNumber(productNumber);
}
public List<ProductDTO> getAllProduct(){
List<Product> products= productRepo.findAllByNumberinStockIsGreaterThan(0);
return  ProductAdapter.getProductDTOList(products);
}
public ProductDTO searchProduct(String productNumber){
 Product product= productRepo.findByProductNumber(productNumber);
    ProductDTO productDTO= new ProductDTO();
 if(product!=null){
     productDTO= ProductAdapter.getProductDTO(product);
 }
 return productDTO;
}

}
