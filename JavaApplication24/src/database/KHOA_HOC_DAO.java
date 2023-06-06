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
import models.KHOA_HOC;

/**
 *
 * @author Admin
 */
public class KHOA_HOC_DAO extends BDConnect{
    

    public KHOA_HOC_DAO() {
       
    }
    
    public KHOA_HOC getThongTin(String MaKhoaHoc){
        ArrayList<KHOA_HOC> khoahoc = new ArrayList<KHOA_HOC>();
        String query =" select * from KHOA_HOC where MaKhoaHoc = '"+ MaKhoaHoc + "'" ;
      try{
          PreparedStatement atm = conn.prepareStatement(query);
          ResultSet rs = atm.executeQuery();
          while (rs.next()){
              khoahoc.add(new KHOA_HOC(rs.getString(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getBoolean(5)));
          }
      }
      catch(Exception e){
          e.printStackTrace();
      };
      return khoahoc.get(0);
    };
    
    
}
