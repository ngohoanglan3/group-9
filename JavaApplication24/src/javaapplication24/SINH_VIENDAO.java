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
public class SINH_VIENDAO {
    static Connection connection;
    static PreparedStatement statement;
    private static String USER_NAME = "sa";
    private static String PASSWORD = "";
    static void openConnection() {
        try {
            connection = DriverManager.
                    getConnection("jdbc:sqlserver://localhost;" + 
                            "databaseName=temp2;integratedSecurity=true;Encrypt=False;",
                            USER_NAME, PASSWORD);
        } catch (SQLException ex) {
            Logger.getLogger(SINH_VIENDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    static void closeConnection() {
        if(statement != null) {
            try {
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(SINH_VIENDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(connection != null) {
            try {
                connection.close();
            } catch (SQLException ex) {
                Logger.getLogger(SINH_VIENDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static List<SINH_VIEN> getDataList() {
        List<SINH_VIEN> dataList = new ArrayList<>();
        
        openConnection();
        
        String sql = "select * from SINH_VIEN";
        try {
            statement = connection.prepareStatement(sql);
            
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()) {
                SINH_VIEN std = new SINH_VIEN(
                        resultSet.getString("MaSV"), 
                        resultSet.getString("MatKhau"), 
                        resultSet.getString("Ho"), 
                        resultSet.getString("Ten"), 
                        resultSet.getString("CCCD"), 
                        resultSet.getString("Email"),
                        resultSet.getString("SDT"),
                        resultSet.getString("NgaySinh"),
                        resultSet.getBoolean("GioiTinh"),
                        resultSet.getString("NoiSinh"),
                        resultSet.getString("HoKhauThuongTru"),
                        resultSet.getString("DanToc"),
                        resultSet.getString("MaKhoaHoc"),
                        resultSet.getString("MaLop"),
                        resultSet.getString("MaNganh"),
                        resultSet.getString("MaBac"),
                        resultSet.getString("MaLoaiHinhDaoTao")
                );
                dataList.add(std);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SINH_VIENDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        closeConnection();
        
        return dataList;
    }
    
    public static SINH_VIEN findByEmail(String Email) {
        SINH_VIEN std = null;
        
        openConnection();
        
        String sql = "select * from SINH_VIEN where Email = ?";
        try {
            statement = connection.prepareStatement(sql);
            statement.setString(1, Email);
            
            ResultSet resultSet = statement.executeQuery();
            
            if(resultSet.next()) {
                std = new SINH_VIEN(
                        resultSet.getString("MaSV"), 
                        resultSet.getString("MatKhau"), 
                        resultSet.getString("Ho"), 
                        resultSet.getString("Ten"), 
                        resultSet.getString("CCCD"), 
                        resultSet.getString("Email"),
                        resultSet.getString("SDT"),
                        resultSet.getString("NgaySinh"),
                        resultSet.getBoolean("GioiTinh"),
                        resultSet.getString("NoiSinh"),
                        resultSet.getString("HoKhauThuongTru"),
                        resultSet.getString("DanToc"),
                        resultSet.getString("MaKhoaHoc"),
                        resultSet.getString("MaLop"),
                        resultSet.getString("MaNganh"),
                        resultSet.getString("MaBac"),
                        resultSet.getString("MaLoaiHinhDaoTao")
                );
            }
        } catch (SQLException ex) {
            Logger.getLogger(SINH_VIENDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        closeConnection();
        
        return std;
    }
    
    public static void passwordChange(SINH_VIEN std){
        openConnection();
        
        String sql = "update students set MatKhau = 1111 where Ten = ? and MaSV = ?";
        try {
            statement = connection.prepareStatement(sql);
            statement.setString(1, std.getTen());
            statement.setString(1, std.getMaSV());
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(SINH_VIENDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        closeConnection();
        
    }
}
