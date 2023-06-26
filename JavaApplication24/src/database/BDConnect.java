/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
/**
 *
 * @author Admin
 */
public class BDConnect {
    Connection conn;
    public BDConnect(){
        try{
            String user ="sa";
            String password = "12345678";
            String url ="jdbc:sqlserver://ADMIN\\SQLEXPRESS:1433;databaseName=CoSoDuLieu;encrypt=true;trustServerCertificate=true;";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn= DriverManager.getConnection(url, user, password);
        }
        catch(Exception e){
            
        }
    };
}
