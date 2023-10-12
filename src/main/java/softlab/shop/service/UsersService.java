package softlab.shop.service;

import softlab.shop.entities.Users;

import java.util.List;

public interface UsersService {
    List<Users> search(String email, String firstname, String lastname);
}