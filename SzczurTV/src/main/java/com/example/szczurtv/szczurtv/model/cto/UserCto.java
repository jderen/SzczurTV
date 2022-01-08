package com.example.szczurtv.szczurtv.model.cto;

import com.example.szczurtv.szczurtv.model.entity.UserChannelEntity;
import com.example.szczurtv.szczurtv.model.eto.AccountEto;
import com.example.szczurtv.szczurtv.model.eto.UserEto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserCto {
    private UserEto user;
    private AccountEto account;
    // here should be UserChannelEto
    private List<UserChannelEntity> userChannels;
}
