package softlab.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import softlab.shop.entities.Company;

public interface CompanyRepositories extends JpaRepository<Company,Integer>{
}
