package SpringRestApi.SpringRestApi.service.impl;

import SpringRestApi.SpringRestApi.dao.SubjectDao;
import SpringRestApi.SpringRestApi.model.Subject;
import SpringRestApi.SpringRestApi.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Works with subjects from DataBase using xml configuration
 *
 * @author Yaroslav Makhnov
 */
@Service
public class SubjectServiceImpl implements SubjectService {
    @Autowired
    private SubjectDao subjectDao;

    @Override
    public void saveSubject(Subject subject){
        subjectDao.saveAndFlush(subject);
    }
}

