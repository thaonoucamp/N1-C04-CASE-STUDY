package codegym.service;

import codegym.model.Relationship;
import codegym.repository.IRelationshipRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RelationshipService implements IRelationshipService{

    @Autowired
    private IRelationshipRepo relationshipRepo;

    @Override
    public List<Relationship> findAll() {
        return null;
    }

    @Override
    public Relationship findById(Long id) {
        return null;
    }

    @Override
    public Relationship save(Relationship relationship) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Relationship> findAllFriendCommon(String nameMy, String nameFriend) {
        return relationshipRepo.findAllByFriendCommon(nameMy, nameFriend);
    }
}
