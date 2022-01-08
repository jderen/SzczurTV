package com.example.szczurtv.szczurtv.uc.User;

import com.example.szczurtv.szczurtv.model.cto.UserCto;

import java.util.List;

public interface UcMaintainUser {
    List<UserCto> getAllUsers();
    UserCto getUserById(Long id);
}
