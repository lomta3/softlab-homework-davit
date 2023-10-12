package softlab.shop.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import softlab.shop.entities.Products;
import softlab.shop.repositories.ProductsRepositories;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ProductsServiceImpl implements ProductsService {
    private final ProductsRepositories productsRepositories;
    @Override

    public List<Products>search(String name, String ean)
    {
        return productsRepositories.findAll();
    }
}
