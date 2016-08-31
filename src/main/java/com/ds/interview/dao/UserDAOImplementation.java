package com.ds.interview.dao;

import com.ds.interview.SqlLiteDatabase;
import com.ds.interview.model.User;
import com.google.common.collect.Lists;
import com.google.inject.Inject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 * Created by zachncst on 8/31/16.
 */
public class UserDAOImplementation implements UserDAO {

    private SqlLiteDatabase db;

    @Inject
    public UserDAOImplementation(SqlLiteDatabase db) {
        this.db = db;
    }

    @Override
    public List<User> getUsers() {
        try(Connection conn = this.db.getConnection();
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("select * from users")) {

            List<User> users = Lists.newArrayList();

            while(rs.next()) {
                users.add(new User(rs.getLong("id"), rs.getString("first_name"), rs.getString("last_name")));
            }

            return users;
        } catch (SQLException e) {
            //log exception
            System.out.println(e.getMessage());
            return Lists.newArrayList();
        }
    }
}
