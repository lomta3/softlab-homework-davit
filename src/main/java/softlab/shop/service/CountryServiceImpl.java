package softlab.shop.service;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.RequiredArgsConstructor;
import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import softlab.shop.entities.Company;
import softlab.shop.entities.Country;
import softlab.shop.models.CreateCompany;
import softlab.shop.repositories.CompanyRepository;
import softlab.shop.repositories.CountryRepository;

import java.util.List;

@Service
@RequiredArgsConstructor

public class CountryServiceImpl implements CountryService {
    private final CountryRepository countryRepository;
    private final CompanyRepository companyRepository;

    @Override
    public List<Country> search(String name, String isocode2, Integer id) {
        return countryRepository.findAll();
    }

    @Override
    public Country getCountry(Integer id) {
        return countryRepository.findById(id).orElseThrow();
    }

    @Override
    public Company createdNewCompany(Integer id, CreateCompany createcompany) {
        return null;
    }

    @Override
    public List<Company> getCountryCompany(Integer id) {
        return companyRepository.findAllById(id);
    }

    }

