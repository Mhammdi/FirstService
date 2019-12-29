package com.vision.riad.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.vision.riad.model.User;

@RepositoryRestResource(collectionResourceRel = "users",path="users")
public interface UserDB extends JpaRepository<User,Integer>{

}
