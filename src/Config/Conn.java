/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Lovanto
 */
public class Conn {
    //init var
    private Connection connection;

    public Connection getConnection() {
        return this.connection;
    }

    public void setConnection(Config config) {
       String connString;
       try {
           connString = "jdbc:mysql://" + config.getHost() + "/" + config.getDatabase();
           this.connection = DriverManager.getConnection(connString, config.getUsername(), config.getPassword());
       } catch (SQLException e) {
           System.out.println("Terjadi kesalahan dalam koneksi database: " + e.toString());
       }
    }
}