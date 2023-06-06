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
import models.KHOA;

/**
 *
 * @author Admin
 */
public class KHOA_DAO extends BDConnect{
    

    public KHOA_DAO() {
       
    }
    
    public KHOA getThongTin(String MaKhoa){
        ArrayList<KHOA> khoa = new ArrayList<KHOA>();
        String query =" select * from KHOA where MaKhoa = '"+ MaKhoa+"'" ;
      try{
          PreparedStatement atm = conn.prepareStatement(query);
          ResultSet rs = atm.executeQuery();
          while (rs.next()){
              khoa.add(new KHOA(rs.getString(1),rs.getString(2),rs.getBoolean(3)));
          }
      }
      catch(Exception e){
          e.printStackTrace();
      };
      return khoa.get(0);
    };
    
    
}
