package softlab.shop.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import softlab.shop.entities.Company;
import softlab.shop.entities.Country;
import softlab.shop.service.CountryService;
import softlab.shop.service.ProductService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CountryController{
    private final CountryService countryService;
    private final ProductService productsService;
    @GetMapping("countries")
    public List<Country>search(String name, String isocode2,Integer id){return countryService.search(name, isocode2,id );}

  @GetMapping("countries/{id}")
    public Country country(@PathVariable Integer id){return countryService.getCountry(id);}

    @GetMapping("countries/{id}/companies")
    public List<Company>countryCompany(@PathVariable Integer id){return countryService.getCountryCompany(id);}
}
