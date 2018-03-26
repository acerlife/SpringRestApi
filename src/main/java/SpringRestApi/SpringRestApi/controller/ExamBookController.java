package SpringRestApi.SpringRestApi.controller;

import SpringRestApi.SpringRestApi.model.ExamBook;
import SpringRestApi.SpringRestApi.model.Student;
import SpringRestApi.SpringRestApi.service.impl.ExamBookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/exam-books")
public class ExamBookController {
    @Autowired
    private ExamBookServiceImpl examBookService;


    @GetMapping("/students/{student}")
    public @ResponseBody List<ExamBook> getExamBooks(@PathVariable Student student){
        return examBookService.findAllByStudent(student);
    }

    @PostMapping("/")
    public @ResponseBody ExamBook saveExamBook(@PathVariable ExamBook examBook){
        examBookService.saveExamBook(examBook);
        return examBook;
    }
}

