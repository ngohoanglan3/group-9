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
import models.NGANH;

/**
 *
 * @author Admin
 */
public class NGANH_DAO extends BDConnect{
    

    public NGANH_DAO() {
       
    }
    
    public NGANH getThongTin(String MaNganh){
        ArrayList<NGANH> nganh = new ArrayList<NGANH>();
        String query =" select * from NGANH where MaNganh = '"+ MaNganh+"'" ;
      try{
          PreparedStatement atm = conn.prepareStatement(query);
          ResultSet rs = atm.executeQuery();
          while (rs.next()){
              nganh.add(new NGANH(rs.getString(1),rs.getString(2),rs.getString(3),rs.getBoolean(4)));
          }
      }
      catch(Exception e){
          e.printStackTrace();
      };
      return nganh.get(0);
    };
    
    
}
