package codegym.repository;

import codegym.model.Relationship;
import codegym.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRelationshipRepo extends CrudRepository<Relationship, Long> {
    @Query(value = "from Relationship where name like :name" + " and (myUser.name = :name or friend.name = :name)")

    List<Relationship> findAllByFriendCommon(@Param("name") String nameMy,
                                         @Param("name") String nameFriend);
}
