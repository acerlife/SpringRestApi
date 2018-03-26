package SpringRestApi.SpringRestApi.controller;

import SpringRestApi.SpringRestApi.model.*;
import SpringRestApi.SpringRestApi.service.impl.SubjectGroupTeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * Gets requests from server and returns subjects in group
 *
 * @author Yaroslav Makhnov
 */
@RestController
@RequestMapping("/subjects-groups-teachers")
public class SubjectGroupTeacherController {
    @Autowired
    private SubjectGroupTeacherServiceImpl subjectGroupTeacherService;

    @GetMapping("/groups/{group}")
    public @ResponseBody List<SubjectGroupTeacher> getSubjectsByGroup(@PathVariable Group group){
        return subjectGroupTeacherService.getSubjectByGroup(group);
    }

    @PostMapping("/")
    public @ResponseBody SubjectGroupTeacher saveSubjectsGroupsTeachers(@PathVariable SubjectGroupTeacher subjectGroupTeacher){
        subjectGroupTeacherService.saveSubjectGroupTeacher(subjectGroupTeacher);
        return subjectGroupTeacher;
    }
}
