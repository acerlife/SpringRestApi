package SpringRestApi.SpringRestApi.service.impl;

import SpringRestApi.SpringRestApi.dao.ExamBookDao;
import SpringRestApi.SpringRestApi.model.ExamBook;
import SpringRestApi.SpringRestApi.model.Student;
import SpringRestApi.SpringRestApi.service.ExamBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Works with exam books from DataBase using xml configuration
 *
 * @author Yaroslav Makhnov
 */
@Service
public class ExamBookServiceImpl implements ExamBookService {
    @Autowired
    private ExamBookDao examBookDao;

    @Override
    public List<ExamBook> findAllByStudent(Student student) {
        List<ExamBook> examBookList = examBookDao.findAllByStudent(student);
        return examBookList;
    }

    @Override
    public void saveExamBook(ExamBook examBook) {
        examBookDao.save(examBook);
    }
}
