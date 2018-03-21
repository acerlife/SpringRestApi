package SpringRestApi.SpringRestApi.service.impl;

import SpringRestApi.SpringRestApi.dao.StudentDao;
import SpringRestApi.SpringRestApi.model.Group;
import SpringRestApi.SpringRestApi.model.Student;
import SpringRestApi.SpringRestApi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Works with students from DataBase using xml configuration
 *
 * @author Yaroslav Makhnov
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    public void saveStudent(Student student){
        studentDao.saveAndFlush(student);
    }

    @Override
    public List<Student> getStudents(){
        List<Student> students = studentDao.findAll();
        return students;
    }

    @Override
    public List<Student> getStudentsByGroup(Group group){
        List<Student> students = studentDao.findByGroup(group);
        return students;
    }
}
