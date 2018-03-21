package SpringRestApi.SpringRestApi.controller;

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
public class GroupControllerTest {

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void testAddGroup() throws Exception{
        MvcResult mvcResult = mockMvc.perform(get("/add-group/1SE"))
                .andReturn();
        Assert.assertEquals(mvcResult.getResponse().getStatus(), 200);
        Assert.assertFalse(mvcResult.getResponse().getContentAsString().isEmpty());
    }

    @Test
    public void testGetGroups() throws Exception {
        MvcResult mvcResult = mockMvc.perform(get("/show-groups")).andReturn();
        Assert.assertEquals(mvcResult.getResponse().getStatus(), 200);
        Assert.assertFalse(mvcResult.getResponse().getContentAsString().isEmpty());
    }
}