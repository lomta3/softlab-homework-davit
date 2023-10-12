package softlab.shop.controllers;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import softlab.shop.entities.Company;
import softlab.shop.service.CompanyService;

import java.util.List;


@RestController
@RequiredArgsConstructor

public class CompanyController {
    private final CompanyService companyService;
    @GetMapping("Company")
    List<Company>serach(String name, String name_geo)
    {
        return companyService.search(name,name_geo);
    }
}