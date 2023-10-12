package softlab.shop.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import softlab.shop.entities.Company;
import softlab.shop.repositories.CompanyRepositories;

import java.util.List;

@Service
@RequiredArgsConstructor

public class CompanyServiceImpl implements CompanyService{
    private final CompanyRepositories companyRepositories;
    @Override
    public List<Company>search(String name, String name_geo)
    {
        return companyRepositories.findAll();
    }
}
