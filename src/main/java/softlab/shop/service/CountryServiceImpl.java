package softlab.shop.service;

import lombok.RequiredArgsConstructor;
import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;
import org.springframework.stereotype.Service;
import softlab.shop.entities.Country;
import softlab.shop.repositories.CountryRepositories;

import java.util.List;

@Service
@RequiredArgsConstructor


public class CountryServiceImpl implements CountryService {
    private  final CountryRepositories countryRepositories;
    @Override
    public List<Country>search(String name, String name_ge, VarcharJdbcType isocode2)
    {
        return countryRepositories.findAll();
    }
}
