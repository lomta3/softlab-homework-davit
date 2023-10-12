package softlab.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import softlab.shop.entities.Country;

public interface CountryRepositories extends JpaRepository<Country,Integer>{
}
