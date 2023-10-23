package softlab.shop.service;

import softlab.shop.entities.Company;
import softlab.shop.entities.Product;
import softlab.shop.models.CreateCompany;
import softlab.shop.models.CreateProduct;
import softlab.shop.models.ProductCreateModel;

import java.util.List;

public interface CompanyService {
    List<Company> search(String name, String countryId, Integer id);
    Company getCompany(Integer id);

    List<Product> getCompanyProduct(Integer Id);

    Product companyCreateProduct(Integer id, ProductCreateModel productCreateModel);

    Company createNewCompany(Integer id, CreateCompany createCompany);

}


