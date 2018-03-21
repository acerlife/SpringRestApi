package SpringRestApi.SpringRestApi.controller;

import SpringRestApi.SpringRestApi.model.Group;
import SpringRestApi.SpringRestApi.model.Student;
import SpringRestApi.SpringRestApi.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * Gets requests from server and returns students
 *
 * @author Yaroslav Makhnov
 */
@RestController
public class StudentController {
    @Autowired
    private StudentServiceImpl studentService;

    @RequestMapping(value = "/add-student/{studentName}/{groupId}", method = RequestMethod.GET)
    public String addStudent(@PathVariable String studentName, @PathVariable Long groupId) {
        Student student = new Student();
        Group group = new Group();
        System.out.print(studentName);
        group.setId(groupId);
        student.setFirstName(studentName);
        student.setGroup(group);
        studentService.saveStudent(student);
        return student.toString();
    }

    @RequestMapping(value = "/show-students", produces = "application/json")
    public String getStudents(){
       return studentService.getStudents().toString();
    }

    @RequestMapping("/show-students-by-id/{groupId}")
    public String getStudentsByGroup(@PathVariable Long groupId){
        Group group = new Group();
        group.setId(groupId);
        return studentService.getStudentsByGroup(group).toString();
    }
}
