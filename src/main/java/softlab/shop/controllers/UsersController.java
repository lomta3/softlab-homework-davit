package softlab.shop.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import softlab.shop.entities.Users;
import softlab.shop.service.UsersService;

import java.util.List;

@RestController
@RequiredArgsConstructor

public class UsersController {
    private final UsersService usersService;
    @GetMapping("users")
    public List<Users>search(String email,String first_name, String last_name)
    {
        return usersService.search(email,first_name,last_name);
    }
}
