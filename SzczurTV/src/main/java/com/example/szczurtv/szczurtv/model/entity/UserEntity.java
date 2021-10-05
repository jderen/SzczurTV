package com.example.szczurtv.szczurtv.model.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table
public class UserEntity {

    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true)
    private String name;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "ACCOUNT_ENTITY_ID", unique = true)
    private AccountEntity account;




    public UserEntity(Long id){this.id = id;}
}
