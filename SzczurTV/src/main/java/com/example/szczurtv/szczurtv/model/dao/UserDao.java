package com.example.szczurtv.szczurtv.model.dao;

import com.example.szczurtv.szczurtv.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserDao extends JpaRepository<UserEntity, Long> {
    @Query("SELECT user " +
    "FROM UserEntity user " +
    "JOIN user.account account " +
    "WHERE account.login = :login")
    UserEntity getUserEntityByAccountLogin(@Param("login") String login);
}
