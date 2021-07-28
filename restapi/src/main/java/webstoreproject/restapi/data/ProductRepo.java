package webstoreproject.restapi.data;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import webstoreproject.restapi.domain.Product;

import java.util.Collection;
import java.util.List;

@Repository
public interface ProductRepo extends MongoRepository<Product,String> {
 Product save(Product product);

Product findByProductNumber(String productNumber);
Product removeByProductNumber(String productNumber);
List<Product> findAllByNumberinStockIsGreaterThan(int quant);

}
