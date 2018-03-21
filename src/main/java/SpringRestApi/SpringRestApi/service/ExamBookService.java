package SpringRestApi.SpringRestApi.service;


import SpringRestApi.SpringRestApi.model.ExamBook;
import SpringRestApi.SpringRestApi.model.Student;

import java.util.List;


public interface ExamBookService {
    List<ExamBook> findAllByStudent(Student student);
    void saveExamBook(ExamBook examBook);
}
