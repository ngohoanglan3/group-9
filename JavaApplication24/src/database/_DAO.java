/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Admin
 */
public class _DAO extends BDConnect{
    

    public _DAO() {
       
    }
    
    public SINH_VIEN getThongTin(String MaSV,String MatKhau){
        ArrayList<SINH_VIEN> sinhvien = new ArrayList<SINH_VIEN>();
        String query =" select * from SINH_VIEN where MaSV = '"+ MaSV + "' and MatKhau = '" + MatKhau +"'" ;
      try{
          PreparedStatement atm = conn.prepareStatement(query);
          ResultSet rs = atm.executeQuery();
          while (rs.next()){
              sinhvien.add(new SINH_VIEN(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getBoolean(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15),rs.getString(16),rs.getString(17),rs.getBoolean(18)));
          }
      }
      catch(Exception e){
          e.printStackTrace();
      };
      return sinhvien.get(0);
    };
    
    
}
