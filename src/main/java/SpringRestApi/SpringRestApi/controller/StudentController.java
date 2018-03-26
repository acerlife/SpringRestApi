package SpringRestApi.SpringRestApi.controller;

import SpringRestApi.SpringRestApi.model.Group;
import SpringRestApi.SpringRestApi.model.Student;
import SpringRestApi.SpringRestApi.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * Gets requests from server and returns students
 *
 * @author Yaroslav Makhnov
 */
@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentServiceImpl studentService;

    @PostMapping("/")
    public @ResponseBody Student saveStudent(@PathVariable Student student){
        studentService.saveStudent(student);
        return student;
    }

    @GetMapping("/")
    public @ResponseBody List<Student> getStudents(){
        return studentService.getStudents();
    }

    @GetMapping("/groups/{group}")
    public @ResponseBody List<Student> getStudentsByGroup(@PathVariable Group group){
        return studentService.getStudentsByGroup(group);
    }
}
