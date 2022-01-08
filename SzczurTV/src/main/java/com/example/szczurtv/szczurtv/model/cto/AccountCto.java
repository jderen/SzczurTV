package com.example.szczurtv.szczurtv.model.cto;

import com.example.szczurtv.szczurtv.model.eto.AccountEto;
import com.example.szczurtv.szczurtv.model.eto.UserEto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountCto {
    private AccountEto account;
    private UserEto user;
}
