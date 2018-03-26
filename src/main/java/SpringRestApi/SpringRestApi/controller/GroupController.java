package SpringRestApi.SpringRestApi.controller;

import SpringRestApi.SpringRestApi.model.Group;
import SpringRestApi.SpringRestApi.service.impl.GroupServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/groups")
public class GroupController {
    @Autowired
    private GroupServiceImpl groupService;

    @PostMapping("/")
    public @ResponseBody Group saveGroup(@PathVariable Group group){
        groupService.saveGroup(group);
        return group;
    }

    @GetMapping("/")
    public List<Group> getGroups(){
        return groupService.findAll();
    }
}

