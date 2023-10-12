package softlab.shop.service;

import softlab.shop.entities.Products;

import java.util.List;

public interface ProductsService {
    List<Products>search(String name, String ean);
}
