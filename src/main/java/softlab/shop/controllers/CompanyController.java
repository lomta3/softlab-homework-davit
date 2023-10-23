package softlab.shop.controllers;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import softlab.shop.entities.Company;
import softlab.shop.entities.Product;
import softlab.shop.models.CreateCompany;
import softlab.shop.models.ProductCreateModel;
import softlab.shop.repositories.ProductRepository;
import softlab.shop.service.CompanyService;

import java.util.List;


@RestController
@RequiredArgsConstructor

public class CompanyController {

    private final CompanyService companyService;
    private final ProductRepository productRepository;
    @GetMapping("companies")
    List<Company>serach(String name, String countryId,Integer id) {return companyService.search(name,countryId,id);}
    @GetMapping("companies/{id}")
    public Company company(@PathVariable Integer id){return companyService.getCompany(id);}

    @GetMapping("companies/{id}/products")
    public List<Product>companyProduct(@PathVariable Integer id){return companyService.getCompanyProduct(id);}

    @PostMapping("companies/{id}/products")
    public Product companyCreateProduct(@PathVariable Integer id, @RequestBody ProductCreateModel productCreateModel)
    {return  companyService.companyCreateProduct(id,productCreateModel );}

    @PostMapping("companies")
  public Company createNewCompany(@PathVariable Integer id, @RequestBody CreateCompany createCompany)
    {return companyService.createNewCompany(id,createCompany);}
}