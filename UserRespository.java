package com.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.model.User;

public interface UserRespository extends JpaRepository<User, Integer> {

}
