package db;

import db.interfaces.IDB;

import javax.ws.rs.ServerErrorException;
import java.sql.Connection;
import java.sql.DriverManager;

public class PostgresDB implements IDB {
    @Override
    public Connection getConnection() {
        String connectionUrl = "jdbc:postgresql://localhost:5432/simpledb";
        try {
            // Establish the connection

            return DriverManager.getConnection(connectionUrl, "postgres", "0000");
        } catch (Exception e) {
            System.out.println(e);
            throw new ServerErrorException("Cannot connect to DB", 500);
        }
    }
}
