package softlab.shop.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import softlab.shop.entities.Product;
import softlab.shop.repositories.ProductRepository;

import java.util.List;

    @Service
    @RequiredArgsConstructor
    public class ProductServiceImpl implements ProductService {

        private final ProductRepository productRepository;

        @Override
        public List<Product> search(String name, String ean, Integer companyId, Integer id) {
            return productRepository.findAll();
        }

        @Override
        public Product getProduct(Integer id) {
            return productRepository.findById(id).orElseThrow();
        }
    }
