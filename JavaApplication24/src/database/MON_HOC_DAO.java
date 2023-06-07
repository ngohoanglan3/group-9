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
import models.MON_HOC;

/**
 *
 * @author Admin
 */
public class MON_HOC_DAO extends BDConnect{
    

    public MON_HOC_DAO() {
       
    }
    
    public MON_HOC getThongTin(String MaMon){
        ArrayList<MON_HOC> monhoc = new ArrayList<MON_HOC>();
        String query =" select * from MON_HOC where MaMon = '"+ MaMon +"'" ;
      try{
          PreparedStatement atm = conn.prepareStatement(query);
          ResultSet rs = atm.executeQuery();
          while (rs.next()){
              monhoc.add(new MON_HOC(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getBoolean(5),rs.getBoolean(6),rs.getString(7),rs.getString(8),rs.getBoolean(9)));
          }
      }
      catch(Exception e){
          e.printStackTrace();
      };
      return monhoc.get(0);
    };
    
    
}
