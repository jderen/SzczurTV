package com.example.szczurtv.szczurtv.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "User")
@Builder
@AllArgsConstructor
@Getter
@Setter
public class UserEntity {
    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    @Column(unique = true)
    private String name;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private AccountEntity account;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<UserChannelEntity> userChannels = new ArrayList<>();
}
