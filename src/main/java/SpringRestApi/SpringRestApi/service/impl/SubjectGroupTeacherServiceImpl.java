package SpringRestApi.SpringRestApi.service.impl;

import SpringRestApi.SpringRestApi.dao.SubjectGroupTeacherDao;
import SpringRestApi.SpringRestApi.model.Group;
import SpringRestApi.SpringRestApi.model.SubjectGroupTeacher;
import SpringRestApi.SpringRestApi.service.SubjectGroupTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Works with relations of subjects, groups and teachers from DataBase using xml configuration
 *
 * @author Yaroslav Makhnov
 */
@Service
public class SubjectGroupTeacherServiceImpl implements SubjectGroupTeacherService {
    @Autowired
    private SubjectGroupTeacherDao subjectGroupTeacherDao;

    @Override
    public List<SubjectGroupTeacher> getSubjectByGroup(Group group){
        List<SubjectGroupTeacher> subjectGroupTeachers = subjectGroupTeacherDao.findByGroup(group);
        return subjectGroupTeachers;
    }

    @Override
    public void saveSubjectGroupTeacher(SubjectGroupTeacher subjectsGroupTeacher){
        subjectGroupTeacherDao.saveAndFlush(subjectsGroupTeacher);
    }
}
