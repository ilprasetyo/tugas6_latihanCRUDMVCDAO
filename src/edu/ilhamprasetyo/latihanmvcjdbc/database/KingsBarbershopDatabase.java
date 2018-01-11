/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ilhamprasetyo.latihanmvcjdbc.database;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import edu.ilhamprasetyo.latihanmvcjdbc.impl.PelangganDAOImpl;
import edu.ilhamprasetyo.latihanmvcjdbc.service.PelangganDAO;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Alaba
 * NIM : 10116496
 * Nama :Ilham Prasetyo
 * Kelas : PBO-11
 */
public class KingsBarbershopDatabase {
    
    private static Connection connection;
    private static PelangganDAO pelangganDAO;
    
    
    public static  Connection getConnection() throws SQLException {
        if (connection==null){
            MysqlDataSource datasource = new MysqlDataSource();
            datasource.setURL("jdbc:mysql://localhost:3306/kingsbarbershop");
            datasource.setUser("root");
            datasource.setPassword("");
            connection = datasource.getConnection();
           
        }
        return connection;
    }
    
    public static PelangganDAO getPelangganDAO() throws SQLException{
    
        if (pelangganDAO==null){
            pelangganDAO = new PelangganDAOImpl(getConnection()); 
        }
        return pelangganDAO;
    }
}
