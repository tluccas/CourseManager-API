package com.alvesdev.CourseManager_API.controller;


import com.alvesdev.CourseManager_API.model.entity.Curso;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/curso")
public class CursoController {


    @PostMapping("/cursos")
    public ResponseEntity<Curso> getCurso() {
        return null;
    }

    @PostMapping("/registro-curso")
    public void registrarCurso(Curso curso) {

    }
}
