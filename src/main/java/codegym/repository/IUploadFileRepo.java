package codegym.repository;

import codegym.model.FileUpload;
import codegym.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUploadFileRepo extends CrudRepository<FileUpload, Long> {
    Optional<User> findByIdOwner(Long id);
}
