package com.ds.interview;

import com.ds.interview.dao.UserDAO;
import com.ds.interview.model.User;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * Created by zachncst on 8/31/16.
 */
public class UserDaoTest {

    Injector injector;
    UserDAO userDAO;

    public UserDaoTest() {
        injector = Guice.createInjector(new GuiceModule());
        injector.injectMembers(this);
    }

    public UserDAO getUserDAO() {
        return userDAO;
    }

    @Inject
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Test
    public void testGetAll() {
        List<User> users = userDAO.getUsers();
        Assert.assertNotNull(users);
        Assert.assertFalse(users.isEmpty());
    }
}
