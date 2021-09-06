package codegym.repository;

import codegym.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPostRepo extends CrudRepository<Post, Long> {
}
