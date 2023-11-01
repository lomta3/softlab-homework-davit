package softlab.shop.service;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import softlab.shop.entities.Company;
import softlab.shop.entities.Product;
import softlab.shop.models.CreateCompany;
import softlab.shop.models.ProductCreateModel;
import softlab.shop.repositories.CompanyRepository;
import softlab.shop.repositories.ProductRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
 public class CompanyServiceImpl implements CompanyService {

 private final CompanyRepository companyRepository;
 private final ProductRepository productRepository;

 @Override
 public List<Company> search(String name, String countryId, Integer parentId) {
  return companyRepository.findAll();
 }

 @Override
 public Company getCompany(Integer parentId) {
  return companyRepository.findById(parentId).orElseThrow();
 }

 @Override
 public List<Product> getCompanyProduct(Integer companyId) {
  return productRepository.findAllByCompanyId(companyId);
 }

 public Company CreateNewCompany(Integer id, CreateCompany createCompany){
 Company company = new Company();
 company.setId(id);
 company.setName(createCompany.name());
 company.setCountryid(createCompany.id());
 company.setParentid(createCompany.parentId());
 companyRepository.save(company);
 return company;
 }
 @Override
 public Product companyCreateProduct(Integer id, ProductCreateModel productCreateModel){
 Product product  = new Product();
 product.setCountryid(productCreateModel.countryId());
 product.setEan(productCreateModel.ean());
 product.setId(productCreateModel.companyId());
 product.setName(productCreateModel.name());
 productRepository.save(product);
 return product;
 }

 @Override
 public Company createNewCompany(Integer id, CreateCompany createCompany) {
  return null;
 }
}