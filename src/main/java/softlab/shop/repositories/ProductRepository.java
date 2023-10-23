package softlab.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import softlab.shop.entities.Product;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    List<Product> findAllByCompanyId(Integer companyId);

    List<Product> findAllByName(String name);
}
