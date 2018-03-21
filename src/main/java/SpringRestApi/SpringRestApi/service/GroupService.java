package SpringRestApi.SpringRestApi.service;


import SpringRestApi.SpringRestApi.model.Group;

import java.util.List;

public interface GroupService {
    void saveGroup(Group group);
    List<Group> findAll();
}
