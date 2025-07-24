package com.alvesdev.CourseManager_API.dao;

import com.alvesdev.CourseManager_API.model.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
