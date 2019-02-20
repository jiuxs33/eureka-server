package com.eureka.server.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eureka.server.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
