package com.example.szczurtv.szczurtv.model.eto;

import com.example.szczurtv.szczurtv.model.entity.UserChannelEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEto {
    private Long id;
    private String name;
    private AccountEto account;
    // here should be UserChannelEto
    private List<UserChannelEntity> userChannels;
}
