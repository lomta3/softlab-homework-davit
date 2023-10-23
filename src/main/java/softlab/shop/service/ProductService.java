package softlab.shop.service;

import softlab.shop.entities.Product;

import java.util.List;

public interface ProductService {
    List<Product>search(String name, String ean, Integer companyId,Integer Id);

    Product getProduct(Integer id);
}
