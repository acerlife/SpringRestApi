package SpringRestApi.SpringRestApi.service.impl;

import SpringRestApi.SpringRestApi.dao.GroupDao;
import SpringRestApi.SpringRestApi.model.Group;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class GroupServiceImplTest {
    @Mock
    private GroupDao mockGroupDao;

    @Test
    public void testSaveGroup() throws Exception {
        Group createdGroup = createGroup();
        mockGroupDao.save(createdGroup);
        verify(mockGroupDao, times(1)).save(createdGroup);
    }

    private Group createGroup(){
        Group group = new Group( "1SE");
        return group;
    }

}