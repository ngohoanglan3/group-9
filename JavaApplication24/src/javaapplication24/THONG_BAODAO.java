/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class THONG_BAODAO {
    
    static Connection connection;
    static PreparedStatement statement;
    private static String USER_NAME = "sa";
    private static String PASSWORD = "";
    static void openConnection() {
        try {
            connection = DriverManager.
                    getConnection("jdbc:sqlserver://127.0.0.1;" + 
                            "databaseName=temp2;integratedSecurity=true",
                            USER_NAME, PASSWORD);
        } catch (SQLException ex) {
            Logger.getLogger(THONG_BAODAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    static void closeConnection() {
        if(statement != null) {
            try {
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(THONG_BAODAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(connection != null) {
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(THONG_BAODAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static List<THONG_BAO> getDataList() {
        List<THONG_BAO> dataList = new ArrayList<>();
        
        openConnection();
        
        String sql = "select * from THONG_BAO";
        try {
            statement = connection.prepareStatement(sql);
            
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()) {
                THONG_BAO th = new THONG_BAO(
                        resultSet.getString("MaThongBao"), 
                        resultSet.getString("TieuDe"), 
                        resultSet.getString("LinkNoiDung"), 
                        resultSet.getBoolean("Flag")
                );
                dataList.add(th);
            }
        } catch (SQLException ex) {
            Logger.getLogger(THONG_BAODAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        closeConnection();
        
        return dataList;
    }
    
}
