package SpringRestApi.SpringRestApi.controller;

import SpringRestApi.SpringRestApi.model.Teacher;
import SpringRestApi.SpringRestApi.service.impl.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Ярослав on 12.10.2017.
 */
@RestController
@RequestMapping("/teachers")
public class TeacherController {
    @Autowired
    private TeacherServiceImpl teacherService;

    @PostMapping("/")
    public @ResponseBody Teacher saveTeacher(@PathVariable Teacher teacher){
        teacherService.saveTeacher(teacher);
        return teacher;
    }
}
