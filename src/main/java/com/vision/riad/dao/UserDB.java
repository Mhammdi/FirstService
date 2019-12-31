package com.vision.riad.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.vision.riad.model.User;
import com.vision.riad.security.UserSummary;

@CrossOrigin(origins = "http://0.0.0.0:8080")
@RepositoryRestResource(excerptProjection = UserSummary.class,collectionResourceRel = "users",path="users")
public interface UserDB extends JpaRepository<User,Integer>{

}
