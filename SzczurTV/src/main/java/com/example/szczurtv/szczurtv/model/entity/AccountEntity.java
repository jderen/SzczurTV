package com.example.szczurtv.szczurtv.model.entity;

import com.example.szczurtv.szczurtv.model.enums.Role;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
// delete NoArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table
public class AccountEntity {

    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true)
    // @NotNull
    // Size(max=20)
    private String login;
    // @NotNull
    // format / Regexp
    private String password;
    // @Column(unique = true)
    // @NotNull
    private String email;
    @Enumerated(EnumType.STRING)
    private Role role;
    @OneToOne(fetch = FetchType.EAGER, mappedBy = "account", cascade = CascadeType.ALL)
    private UserEntity user;


    public AccountEntity(Long id) {this.id = id;}
}
