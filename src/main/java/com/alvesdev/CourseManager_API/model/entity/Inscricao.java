package com.alvesdev.CourseManager_API.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "inscricao")
public class Inscricao {

    @ManyToOne
    @JoinColumn(name= "aluno_id")
    private User aluno_id;

    @ManyToOne
    @JoinColumn(name= "curso_id")
    private Curso curso_id;

    @Column(name= "inscricao")
    private LocalDate inscricao;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long insc_id;
}
