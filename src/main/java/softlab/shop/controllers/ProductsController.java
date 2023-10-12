package softlab.shop.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import softlab.shop.entities.Products;
import softlab.shop.service.ProductsService;

import java.util.List;

@RestController
@RequiredArgsConstructor

public class ProductsController {
    private final ProductsService productsService;
    @GetMapping("products")
    public List<Products>search(String name,String ean)
    {
        return productsService.search(name,ean);
    }


}