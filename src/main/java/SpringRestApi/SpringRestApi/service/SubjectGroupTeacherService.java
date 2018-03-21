package SpringRestApi.SpringRestApi.service;

import SpringRestApi.SpringRestApi.model.Group;
import SpringRestApi.SpringRestApi.model.SubjectGroupTeacher;

import java.util.List;


public interface SubjectGroupTeacherService {
    void saveSubjectGroupTeacher(SubjectGroupTeacher subjectsGroupTeacher);
    List<SubjectGroupTeacher> getSubjectByGroup(Group group);
}
