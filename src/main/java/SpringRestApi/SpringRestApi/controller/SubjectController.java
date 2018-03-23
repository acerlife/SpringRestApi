package SpringRestApi.SpringRestApi.controller;

import SpringRestApi.SpringRestApi.model.Subject;
import SpringRestApi.SpringRestApi.service.impl.SubjectServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Ярослав on 12.10.2017.
 */
@RestController
@RequestMapping("/subjects")
public class SubjectController {
    @Autowired
    private SubjectServiceImpl subjectService;

    @PostMapping("/")
    public @ResponseBody Subject createSubject(@RequestBody Subject subject) {
        subjectService.saveSubject(subject);
        return subject;
    }
}
