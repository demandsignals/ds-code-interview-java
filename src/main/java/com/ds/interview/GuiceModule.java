package com.ds.interview;

import com.ds.interview.controller.HelloController;
import com.ds.interview.controller.UserController;
import com.ds.interview.dao.UserDAO;
import com.ds.interview.dao.UserDAOImplementation;
import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Provides;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by zachncst on 8/31/16.
 */
public class GuiceModule implements Module {
    @Override
    public void configure(Binder binder) {
        binder.bind(UserDAO.class).to(UserDAOImplementation.class);
        binder.bind(HelloController.class);
        binder.bind(UserController.class);
    }

    @Provides
    public SqlLiteDatabase provideSqlLiteDatabase() throws ClassNotFoundException, SQLException {
        DriverManager.registerDriver(new org.sqlite.JDBC());

        SqlLiteDatabase database = new SqlLiteDatabase();
        database.setup();
        return database;
    }
}
