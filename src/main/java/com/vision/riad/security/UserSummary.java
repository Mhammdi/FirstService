package com.vision.riad.security;

import org.springframework.data.rest.core.config.Projection;

import com.vision.riad.model.User;



@Projection(name="userSummary", types={User.class})
public interface UserSummary {
    int getId();
    String getNom();
    String getLogin();
    String getPassword();
}