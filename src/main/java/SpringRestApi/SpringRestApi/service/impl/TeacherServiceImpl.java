package SpringRestApi.SpringRestApi.service.impl;

import SpringRestApi.SpringRestApi.dao.TeacherDao;
import SpringRestApi.SpringRestApi.model.Teacher;
import SpringRestApi.SpringRestApi.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Works with teachers from DataBase using xml configuration
 *
 * @author Yaroslav Makhnov
 */
@Repository
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherDao teacherDao;

    @Override
    public void saveTeacher(Teacher teacher){
        teacherDao.saveAndFlush(teacher);
    }
}
