package com.cloud.rocker.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.cloud.rocker.model.Users;

@Component
public interface UsersRepository extends JpaRepository<Users, Long> {

    List<Users> findByName(String name);
}