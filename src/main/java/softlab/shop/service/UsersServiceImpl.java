package softlab.shop.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import softlab.shop.entities.Users;
import softlab.shop.repositories.UsersRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsersServiceImpl implements UsersService{
    private final UsersRepository usersRepositorye;
    @Override
    public List<Users>search(String email, String first_name, String last_name){
        return null;

    }

}
