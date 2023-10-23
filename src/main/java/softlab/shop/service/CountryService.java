package softlab.shop.service;

import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;
import softlab.shop.entities.Company;
import softlab.shop.entities.Country;
import softlab.shop.models.CreateCompany;

import java.util.List;

public interface CountryService {
  List<Country> search(String name, String isocode2,Integer id);

  Country getCountry(Integer id);

  List<Company> getCountryCompany(Integer id);
  Company createdNewCompany(Integer id, CreateCompany createcompany);
}

