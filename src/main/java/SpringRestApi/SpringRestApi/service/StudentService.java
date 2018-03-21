package SpringRestApi.SpringRestApi.service;

import SpringRestApi.SpringRestApi.model.Group;
import SpringRestApi.SpringRestApi.model.Student;

import java.util.List;


public interface StudentService {
    void saveStudent(Student student);
    List<Student> getStudents();
    List<Student> getStudentsByGroup(Group group);
}
