package com.example.szczurtv.szczurtv.model.entity;

import com.example.szczurtv.szczurtv.model.enums.Tag;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@Table(name="Category")
@AllArgsConstructor
@Getter
@Setter
public class CategoryEntity {
    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    private String name;

    @NotBlank
    @Size(max = 255)
    private String description;

    @Enumerated(EnumType.STRING)
    private Tag tag;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "category")
    private List<ChannelEntity> channels = new ArrayList<>();
}
