package softlab.shop.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import softlab.shop.entities.Users;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Integer> {Optional<Users> findAllByEmail(String email);}
