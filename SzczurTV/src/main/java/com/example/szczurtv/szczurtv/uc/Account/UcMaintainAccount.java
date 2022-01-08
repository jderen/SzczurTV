package com.example.szczurtv.szczurtv.uc.Account;

import com.example.szczurtv.szczurtv.model.eto.RegistrationDataEto;
import com.example.szczurtv.szczurtv.model.eto.UserEto;
import org.springframework.http.ResponseEntity;

import javax.validation.constraints.NotBlank;

public interface UcMaintainAccount {
    ResponseEntity<String> register(RegistrationDataEto data);
    UserEto login(@NotBlank String login, @NotBlank String password);
}
