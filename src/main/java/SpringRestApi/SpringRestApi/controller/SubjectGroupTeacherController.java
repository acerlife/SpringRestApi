package SpringRestApi.SpringRestApi.controller;

import SpringRestApi.SpringRestApi.model.*;
import SpringRestApi.SpringRestApi.service.impl.SubjectGroupTeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * Gets requests from server and returns subjects in group
 *
 * @author Yaroslav Makhnov
 */
@RestController
public class SubjectGroupTeacherController {
    @Autowired
    private SubjectGroupTeacherServiceImpl subjectGroupTeacherService;

    @RequestMapping(value = "find-subjects-by-group/{groupId}", method = RequestMethod.GET)
    public String getSubjectsByGroup(@PathVariable Long groupId) {
        Group group = new Group();
        group.setId(groupId);
        return subjectGroupTeacherService.getSubjectByGroup(group).toString();
    }

    @RequestMapping(value = "add-subject-group-teacher/{groupId}/{subjectId}/{teacherId}", method = RequestMethod.GET)
    public SubjectGroupTeacher addSubject(@PathVariable Long groupId, @PathVariable Long subjectId, @PathVariable Long teacherId) {
        SubjectGroupTeacher subjectGroupTeacher = new SubjectGroupTeacher();
        Group group = new Group();
        Subject subject = new Subject();
        Teacher teacher = new Teacher();
        group.setId(groupId);
        subject.setId(subjectId);
        teacher.setId(teacherId);
        subjectGroupTeacher.setGroup(group);
        subjectGroupTeacher.setSubject(subject);
        subjectGroupTeacher.setTeacher(teacher);
        subjectGroupTeacherService.saveSubjectGroupTeacher(subjectGroupTeacher);
        return subjectGroupTeacher;
    }
}
