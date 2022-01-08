package com.example.szczurtv.szczurtv.model.eto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationDataEto {
    private String login;
    private String password;
    private String email;
}
