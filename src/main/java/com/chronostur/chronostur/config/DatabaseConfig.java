package com.chronostur.chronostur.config;
import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConfig {
        public static Connection getConnection() throws Exception {
        String url = "jdbc:postgresql://localhost:5432/chronostur_db";
        String user = "postgres";
        String password = "blowme";
        Class.forName("org.postgresql.Driver");
        return DriverManager.getConnection(url, user, password);
    }
}