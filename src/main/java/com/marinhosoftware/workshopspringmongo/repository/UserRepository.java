package com.marinhosoftware.workshopspringmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.marinhosoftware.workshopspringmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
