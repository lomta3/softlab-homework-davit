package softlab.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import softlab.shop.entities.Company;

import java.util.List;

public interface CompanyRepository extends JpaRepository<Company,Integer>{
    List<Company>findAllByName(String name);

    List<Company> findAllById(Integer id);
}
