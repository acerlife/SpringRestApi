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
public class SubjectGroupTeacherController {
    @Autowired
    private SubjectGroupTeacherServiceImpl subjectGroupTeacherService;

    @GetMapping("/subjects/groups/{groupId}")
    public List<SubjectGroupTeacher> getSubjectsByGroup(@PathVariable Group group) {
        return subjectGroupTeacherService.getSubjectByGroup(group);
    }

    @PostMapping(value = "/subjects-groups-teachers/{groupId}/")
    public @ResponseBody SubjectGroupTeacher createSubjcetsGroupsTeachers(@RequestBody SubjectGroupTeacher subjectGroupTeacher) {
        subjectGroupTeacherService.saveSubjectGroupTeacher(subjectGroupTeacher);
        return subjectGroupTeacher;
    }
}
