package SpringRestApi.SpringRestApi.controller;

import SpringRestApi.SpringRestApi.model.Teacher;
import SpringRestApi.SpringRestApi.service.impl.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ярослав on 12.10.2017.
 */
@RestController
public class TeacherController {
    @Autowired
    private TeacherServiceImpl teacherService;

    @RequestMapping(value = "add-teacher/{teacherName}", method = RequestMethod.GET)
    public Teacher addTeacher(@PathVariable String teacherName) {
        Teacher teacher = new Teacher();
        teacher.setFirstName(teacherName);
        teacherService.saveTeacher(teacher);
        return teacher;
    }
}
