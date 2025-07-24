package com.alvesdev.CourseManager_API.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor @NoArgsConstructor
@Table(name="users")
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

    @Column(name="email")
    private String email;
    @Column(name="password")
    private String password;
    @Column(name="role")
    private String role; // COORDENADOR / ALUNO
}
