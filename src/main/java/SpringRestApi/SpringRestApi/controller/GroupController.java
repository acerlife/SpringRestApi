package SpringRestApi.SpringRestApi.controller;

import SpringRestApi.SpringRestApi.model.Group;
import SpringRestApi.SpringRestApi.service.impl.GroupServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class GroupController {
    @Autowired
    private GroupServiceImpl groupService;

    @RequestMapping(value = "/add-group/{groupName}", method = RequestMethod.GET)
    public Group addGroup(@PathVariable String groupName){
        Group group = new Group();
        group.setGroupName(groupName);
        groupService.saveGroup(group);
        return group;
    }

    @RequestMapping(value = "/show-groups")
    public String getGroups(){
        return groupService.findAll().toString();
    }

}
