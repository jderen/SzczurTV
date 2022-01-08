package com.example.szczurtv.szczurtv.model.dao;

import com.example.szczurtv.szczurtv.model.entity.AccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AccountDao extends JpaRepository<AccountEntity, Long> {
    @Query("SELECT CASE WHEN COUNT(account) > 0 " +
            "THEN true ELSE false END " +
            "FROM AccountEntity account " +
            "WHERE account.login = :login OR account.email = :email")
    boolean isLoginOrEmailBusy(@Param("login") String login, @Param("email")  String email);
}
