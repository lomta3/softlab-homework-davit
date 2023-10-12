package softlab.shop.service;

import softlab.shop.entities.Company;

import java.util.List;

public interface CompanyService {
    List<Company> search(String name, String name_geo);
}
