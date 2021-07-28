package webstoreproject.restapi.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import webstoreproject.restapi.service.ProductAdapter;
import webstoreproject.restapi.service.ProductDTO;
import webstoreproject.restapi.service.ProductService;

import java.util.List;

@RestController
@CrossOrigin
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping("/products")
    public ResponseEntity<?>getProducts(){
        List<ProductDTO> productDTOList= productService.getAllProduct();
        return new ResponseEntity<List<ProductDTO>>(productDTOList, HttpStatus.OK);
    }
    @PostMapping("/products")
    public  ResponseEntity<?>addProduct(@RequestBody ProductDTO productDTO){

        ProductDTO productDTO1= productService.addProduct(productDTO);
        return new ResponseEntity<>(productDTO1, HttpStatus.OK);
    }
    @PutMapping("/products/{productNumber}")
    public ResponseEntity<?>updateProduct(@PathVariable String productNumber, @RequestBody ProductDTO productDTO){

      ProductDTO productDTO1=  productService.updateProduct(productDTO);
        return  new ResponseEntity<>(productDTO1, HttpStatus.OK);
    }
    @DeleteMapping("/products/{productNumber}")
    public ResponseEntity<?> deleteProduct(@PathVariable String productNumber){
        ProductDTO productDTO= productService.searchProduct(productNumber);
        if(productDTO==null){
         return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        productService.deleteProduct(productNumber);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
