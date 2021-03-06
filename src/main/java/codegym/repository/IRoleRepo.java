package codegym.repository;

import codegym.model.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IRoleRepo extends CrudRepository<Role, Long> {
    Optional<Role> findAllByAuthorityContaining();
}