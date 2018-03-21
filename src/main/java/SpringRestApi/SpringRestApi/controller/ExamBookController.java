package SpringRestApi.SpringRestApi.controller;

import SpringRestApi.SpringRestApi.model.ExamBook;
import SpringRestApi.SpringRestApi.model.Student;
import SpringRestApi.SpringRestApi.model.SubjectGroupTeacher;
import SpringRestApi.SpringRestApi.service.impl.ExamBookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class ExamBookController {
    @Autowired
    private ExamBookServiceImpl examBookService;

    @RequestMapping(value = "/show-exam-book-by-student/{studentId}", method = RequestMethod.GET)
    public String getExamsByStudent(@PathVariable Long studentId){
        Student student = new Student();
        student.setId(studentId);
        return examBookService.findAllByStudent(student).toString();
    }

    @RequestMapping(value = "/add-exam-book/{studentId}/{subjectGroupTeacherId}/{mark}", method = RequestMethod.GET)
    public ExamBook addExamBook(@PathVariable Long studentId, @PathVariable Long subjectGroupTeacherId, @PathVariable int mark) {
        ExamBook examBook = new ExamBook();
        Student student = new Student();
        SubjectGroupTeacher subjectGroupTeacher = new SubjectGroupTeacher();
        student.setId(studentId);
        subjectGroupTeacher.setId(subjectGroupTeacherId);
        examBook.setStudent(student);
        examBook.setSubjectsGroup(subjectGroupTeacher);
        examBook.setMark(mark);
        examBookService.saveExamBook(examBook);
        return examBook;
    }
}

