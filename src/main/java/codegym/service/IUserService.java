package codegym.service;

import codegym.model.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;
import java.util.Optional;

public interface IUserService extends GeneralCRUD<User> {
    Optional<User> findByName(String name);

    List<User> getFriends(String nameRelationship, String nameMy, String nameFriend);
}
