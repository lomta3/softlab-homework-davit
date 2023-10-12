package softlab.shop.service;

import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;
import softlab.shop.entities.Country;

import java.util.List;

public interface CountryService {
  List<Country> search(String name, String namegeo, VarcharJdbcType isocode2);
}
