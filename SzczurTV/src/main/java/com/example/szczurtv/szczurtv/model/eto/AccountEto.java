package com.example.szczurtv.szczurtv.model.eto;

import com.example.szczurtv.szczurtv.model.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountEto {
    private Long id;
    private String login;
    private Role role;
    private String email;
    private Long userId;
}
