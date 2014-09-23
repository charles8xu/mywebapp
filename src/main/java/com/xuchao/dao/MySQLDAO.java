package com.xuchao.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by xuchao on 14-8-31.
 */
public class MySQLDAO {

    private static String URL;
    private static String username;
    private static String password;
    private static String host;
    private static String dbName;
    private static String driverClass;
    private static Connection connection;

    private MySQLDAO() {

    }

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        if (connection == null){
            username = "root";
            password = "charles";
            driverClass = "com.mysql.jdbc.Driver";
            host = "localhost";
            dbName = "xuchao";
            URL = "jdbc:mysql://"+host+":3306/"+dbName;
            Class.forName(driverClass);
            connection = DriverManager.getConnection(URL,username,password);
        }
        return connection;
    }



}
