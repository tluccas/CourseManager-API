package com.alvesdev.CourseManager_API.dao;

import com.alvesdev.CourseManager_API.model.entity.Curso;
import org.springframework.data.repository.CrudRepository;

public interface CursoRepository extends CrudRepository<Curso, Long> {
}
