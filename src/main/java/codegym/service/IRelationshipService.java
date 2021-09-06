package codegym.service;

import codegym.model.Relationship;

import java.util.List;

public interface IRelationshipService extends GeneralCRUD<Relationship>{
    List<Relationship> findAllFriendCommon(String nameMy, String nameFriend);
}
