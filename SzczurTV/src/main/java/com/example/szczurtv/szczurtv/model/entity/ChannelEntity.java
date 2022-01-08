package com.example.szczurtv.szczurtv.model.entity;

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
@Table(name = "Channel")
@AllArgsConstructor
@Getter
@Setter
public class ChannelEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private long numberOfFollowers;

    @NotBlank
    @Size(max = 255)
    private String description;

    private boolean promoted;

    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @JoinColumn(name = "categoryId")
    private CategoryEntity category;

    @OneToMany(mappedBy="channel", fetch=FetchType.EAGER, cascade = CascadeType.ALL)
    private List<UserChannelEntity> userChannels = new ArrayList<>();
}
