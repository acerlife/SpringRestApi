package SpringRestApi.SpringRestApi.controller;

import SpringRestApi.SpringRestApi.model.Group;
import SpringRestApi.SpringRestApi.service.impl.GroupServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@WebAppConfiguration
@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
public class StudentControllerTest {

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Autowired
    private GroupServiceImpl groupService;

    @Before
    public void setUp() throws Exception {
        groupService.saveGroup(createGroup());
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void addStudent() throws Exception {
        MvcResult mvcResult = mockMvc.perform(get("/add-student/Alex/1"))
                .andReturn();
        Assert.assertEquals(mvcResult.getResponse().getStatus(), 200);
        Assert.assertEquals(mvcResult.getResponse().getContentAsString(), "Student{id=1, firstName='Alex'}");
    }

    @Test
    public void getStudents() throws Exception {
        MvcResult mvcResult = mockMvc.perform(get("/show-students")).andReturn();
        Assert.assertEquals(mvcResult.getResponse().getStatus(), 200);
        Assert.assertFalse(mvcResult.getResponse().getContentAsString().isEmpty());
    }

    @Test
    public void getStudentsByGroup() throws Exception {
        addStudent();
        MvcResult mvcResult = mockMvc.perform(get("/show-students-by-id/1")).andReturn();
        System.out.print(mvcResult.getResponse().getContentAsString());
        Assert.assertEquals(mvcResult.getResponse().getStatus(), 200);
        Assert.assertEquals(mvcResult.getResponse().getContentAsString(), "[Student{id=1, firstName='Alex'}]");
    }

    private Group createGroup(){
        Group group = new Group();
        group.setGroupName("1Se");
        return group;
    }
}