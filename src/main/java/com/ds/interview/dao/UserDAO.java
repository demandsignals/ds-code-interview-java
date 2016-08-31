package com.ds.interview.dao;

import com.ds.interview.model.User;

import java.util.List;

/**
 * Created by zachncst on 8/31/16.
 */
public interface UserDAO {
    List<User> getUsers();
}
