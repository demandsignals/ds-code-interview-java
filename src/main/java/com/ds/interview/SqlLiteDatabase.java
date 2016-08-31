package com.ds.interview;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by zachncst on 8/31/16.
 */
public class SqlLiteDatabase {

    public SqlLiteDatabase() {

    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:sqlite:ds-interview-database.db");
    }

    public void setup() throws SQLException {
        System.out.println("Executing setup of database");
        try (Connection conn = getConnection();
             Statement statement = conn.createStatement()) {
            statement.executeUpdate("create table if not exists users (id integer, first_name string, last_name string, email string)");
            statement.executeUpdate("create table if not exists companies (id integer, name string)");
        }
    }

    public void drop() throws SQLException {
        try (Connection conn = getConnection();
             Statement statement = conn.createStatement()) {
            statement.executeUpdate("drop table if exists users");
            statement.executeUpdate("drop table if exists companies");
        }
    }

    public void addTestData() throws SQLException {
        try (Connection conn = getConnection();
             Statement statement = conn.createStatement()) {
            statement.executeUpdate("insert into users values(1, 'leo', 'lion', 'leo@helloworld.com')");
            statement.executeUpdate("insert into users values(2, 'yui', 'bird', 'yiu@newworld.com')");
            statement.executeUpdate("insert into users values(3, 'jim', 'brown', 'jim@fancyemail.com')");
            statement.executeUpdate("insert into users values(4, 'kim', 'awesome', 'kimmy@awesome.com')");
            statement.executeUpdate("insert into companies values(1, 'Fun Co')");
            statement.executeUpdate("insert into companies values(2, 'Awesome Co')");
        }
    }

    public static void main(String[] args) throws SQLException {
        SqlLiteDatabase sqlLiteDatabase = new SqlLiteDatabase();
        sqlLiteDatabase.drop();
        sqlLiteDatabase.setup();
        sqlLiteDatabase.addTestData();
    }

}
