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
import models.HOC_KY;

/**
 *
 * @author Admin
 */
public class HOC_KY_DAO extends BDConnect{
    

    public HOC_KY_DAO() {
       
    }
    
    public HOC_KY getThongTin(String MaHocKy){
        ArrayList<HOC_KY> hocky = new ArrayList<HOC_KY>();
        String query =" select * from HOC_KY where MaHocKy = '"+ MaHocKy + "'" ;
      try{
          PreparedStatement atm = conn.prepareStatement(query);
          ResultSet rs = atm.executeQuery();
          while (rs.next()){
              hocky.add(new HOC_KY(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getBoolean(4)));
          }
      }
      catch(Exception e){
          e.printStackTrace();
      };
      return hocky.get(0);
    };
    
    
}
