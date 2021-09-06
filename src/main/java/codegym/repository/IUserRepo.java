package codegym.repository;

import codegym.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IUserRepo extends CrudRepository<User, Long> {
    Optional<User> findAllByUserNameContaining(String name);
}
