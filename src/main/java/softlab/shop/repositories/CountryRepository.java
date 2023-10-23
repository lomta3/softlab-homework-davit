package softlab.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import softlab.shop.entities.Country;

public interface CountryRepository extends JpaRepository<Country,Integer>{
}
