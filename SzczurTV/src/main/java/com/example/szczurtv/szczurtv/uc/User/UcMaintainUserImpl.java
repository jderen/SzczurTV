package com.example.szczurtv.szczurtv.uc.User;

import com.example.szczurtv.szczurtv.model.cto.UserCto;
import com.example.szczurtv.szczurtv.model.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Component
@Validated
public class UcMaintainUserImpl implements UcMaintainUser {
    @Autowired
    private UserDao userDao;

    @Override
    public List<UserCto> getAllUsers() {
        return null;
    }

    @Override
    public UserCto getUserById(Long id) {
        return null;
    }
}
