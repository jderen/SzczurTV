package com.example.szczurtv.szczurtv.service.account;

import com.example.szczurtv.szczurtv.model.eto.RegistrationDataEto;
import com.example.szczurtv.szczurtv.model.eto.UserEto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotBlank;

@RestController
@RequestMapping("api/account")
public interface AccountRestService {

    @PostMapping("/register")
    ResponseEntity<String> register(@RequestBody RegistrationDataEto data);

    @PostMapping("/login/{login}/{password}")
    UserEto login(@PathVariable("login") @NotBlank String login, @PathVariable("password") @NotBlank String password);
}
