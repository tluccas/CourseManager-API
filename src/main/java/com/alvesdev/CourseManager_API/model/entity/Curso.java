package com.alvesdev.CourseManager_API.model.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor @NoArgsConstructor
@Entity
@Table (name="cursos")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "curso_id")
    private Long curso_id;

    @Column(name="cursoName")
    private String cursoName;
    @Column(name="cursoDescription")
    private String cursoDescription;

}
