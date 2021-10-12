package com.example.szczurtv.szczurtv.model.entity;

import com.example.szczurtv.szczurtv.model.enums.Tag;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Builder
@Table
@AllArgsConstructor
@Getter
@Setter
public class CategoryEntity {
    @Id
    @GeneratedValue
    private long id;

    @NotNull
    private String name;

    @NotNull
    @Size(max = 255)
    private String description;

    @Enumerated(EnumType.STRING)
    private Tag tag;
}
