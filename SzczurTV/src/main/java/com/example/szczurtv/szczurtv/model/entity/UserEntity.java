package com.example.szczurtv.szczurtv.model.entity;

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
public class UserEntity {

    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true)
    // Size
    // NotNull
    private String name;
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "accountEntityId", unique = true)
    private AccountEntity account;




    public UserEntity(Long id){this.id = id;}
}
