package com.microservice.course.service;

import com.microservice.course.entities.Course;
import com.microservice.course.http.response.StudentByCourseResponse;

import java.util.List;

public interface ICourseService {

    List<Course> findAll();
    Course findById(Long id);
    void save(Course course);

    //Método que llama al microservicios de estudiante
    StudentByCourseResponse findStudentsByIdCourse(Long idCourse);

}
