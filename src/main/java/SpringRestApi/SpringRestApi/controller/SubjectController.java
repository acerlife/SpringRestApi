package SpringRestApi.SpringRestApi.controller;

import SpringRestApi.SpringRestApi.model.Subject;
import SpringRestApi.SpringRestApi.service.impl.SubjectServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Ярослав on 12.10.2017.
 */
@RestController
public class SubjectController {
    @Autowired
    private SubjectServiceImpl subjectService;

    @RequestMapping(value = "/add-subject/{subjectName}", method = RequestMethod.GET)
    public Subject addSubject(@PathVariable String subjectName) {
        Subject subject = new Subject();
        subject.setSubjectName(subjectName);
        subjectService.saveSubject(subject);
        return subject;
    }
}
