package com.example.szczurtv.szczurtv.service.account;

import com.example.szczurtv.szczurtv.model.eto.RegistrationDataEto;
import com.example.szczurtv.szczurtv.model.eto.UserEto;
import com.example.szczurtv.szczurtv.uc.Account.UcMaintainAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.constraints.NotBlank;

@Component
@Transactional
public class AccountRestServiceImpl implements AccountRestService {

    @Autowired
    private UcMaintainAccount ucMaintainAccount;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegistrationDataEto data) {
        return ucMaintainAccount.register(data);
    }

    @PostMapping("/login/{login}/{password}")
    public UserEto login(@PathVariable("login") @NotBlank String login, @PathVariable("password") @NotBlank String password) {
        return ucMaintainAccount.login(login, password);
    }
}
