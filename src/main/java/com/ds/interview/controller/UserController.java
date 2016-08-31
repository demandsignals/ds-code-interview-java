package com.ds.interview.controller;

import com.ds.interview.model.User;
import com.ds.interview.dao.UserDAO;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

/**
 * Created by zachncst on 8/31/16.
 */

@Path("/users")
public class UserController {

    private UserDAO userDAO;

    @Inject
    public UserController(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @GET
    @Produces("application/json")
    public List<User> getUsers() {
        return this.userDAO.getUsers();
    }
}
