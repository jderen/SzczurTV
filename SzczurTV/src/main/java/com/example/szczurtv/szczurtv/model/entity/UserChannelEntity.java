package com.example.szczurtv.szczurtv.model.entity;

import com.example.szczurtv.szczurtv.model.enums.Permission;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name="User_Channel")
@Entity
@Builder
@AllArgsConstructor
@Getter
@Setter
public class UserChannelEntity {
    @Id
    @GeneratedValue
    private Long id;

    @ElementCollection(fetch = FetchType.EAGER)
    private List<Permission> permissions = new ArrayList<>();

    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="userId")
    private UserEntity user;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="channelId")
    private ChannelEntity channel;
}
