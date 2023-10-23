package softlab.shop.security;

import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import softlab.shop.entities.Users;
import softlab.shop.repositories.UsersRepository;

import java.util.Optional;

@RequiredArgsConstructor
    public class UserManager implements UserDetailsService {

        private final UsersRepository usersRepository;

        @Override
        public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
            Optional<Users> users = usersRepository.findAllByEmail(username);
            if (users.isEmpty()) {
                throw new RuntimeException("User not found".formatted(username));
            }
            return users.get();
        }
}
