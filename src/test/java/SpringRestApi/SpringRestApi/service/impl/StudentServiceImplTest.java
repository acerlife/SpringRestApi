package SpringRestApi.SpringRestApi.service.impl;

import SpringRestApi.SpringRestApi.dao.StudentDao;
import SpringRestApi.SpringRestApi.model.Group;
import SpringRestApi.SpringRestApi.model.Student;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class StudentServiceImplTest {
    @Mock
    private StudentDao mockStudentDao;

    @Test
    public void testSaveStudent() throws Exception {
        Student student = createStudent();
        mockStudentDao.save(student);
        verify(mockStudentDao, times(1)).save(student);
    }

    @Test
    public void testGetStudents() throws Exception {
        List<Student> students = new ArrayList<>();
        Student student = createStudent();
        students.add(student);
        when(mockStudentDao.findAll()).thenReturn(students);
        List<Student> studentsExpected = mockStudentDao.findAll();
        Assert.assertEquals(students, studentsExpected);
    }

    @Test
    public void testGetStudentsByGroup() throws Exception {
        List<Student> students = new ArrayList<>();
        Student student = createStudent();
        students.add(student);
        when(mockStudentDao.findByGroup(createGroup())).thenReturn(students);
        List<Student> studentsExpected = mockStudentDao.findByGroup(createGroup());
        Assert.assertEquals(students, studentsExpected);
    }

    private Group createGroup(){
        Group group = new Group();
        group.setId(3L);
        group.setGroupName("1Se");
        return group;
    }

    private Student createStudent(){
        Student student = new Student();
        student.setId(1L);
        student.setFirstName("Sam");
        student.setGroup(createGroup());
        return student;
    }
}