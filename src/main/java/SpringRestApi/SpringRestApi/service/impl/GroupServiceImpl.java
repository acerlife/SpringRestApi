package SpringRestApi.SpringRestApi.service.impl;

import SpringRestApi.SpringRestApi.dao.GroupDao;
import SpringRestApi.SpringRestApi.model.Group;
import SpringRestApi.SpringRestApi.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Works with groups from DataBase using xml configuration
 *
 * @author Yaroslav Makhnov
 */
@Service
public class GroupServiceImpl implements GroupService {
    @Autowired
    private GroupDao groupDao;

    @Override
    public void saveGroup(Group group){
        groupDao.saveAndFlush(group);
    }

    @Override
    public List<Group> findAll() {
        return groupDao.findAll();
    }
}
