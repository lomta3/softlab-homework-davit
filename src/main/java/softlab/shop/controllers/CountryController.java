package softlab.shop.controllers;

import lombok.RequiredArgsConstructor;
import org.hibernate.type.descriptor.jdbc.VarcharJdbcType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import softlab.shop.entities.Country;
import softlab.shop.service.CountryService;

import java.util.List;

@RestController
@RequiredArgsConstructor


public class CountryController{
    private final CountryService countryService;
    @GetMapping("country")
    public List<Country>search(String name,String name_geo, VarcharJdbcType iso_code_2)
    {
        return countryService.search(name, name_geo, iso_code_2);
    }
}
