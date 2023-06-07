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
import models.LOP;

/**
 *
 * @author Admin
 */
public class LOP_DAO extends BDConnect{
    

    public LOP_DAO() {
       
    }
    
    public LOP getThongTin(String MaLop){
        ArrayList<LOP> lop = new ArrayList<LOP>();
        String query =" select * from LOP where MaLop = '"+ MaLop + "'" ;
      try{
          PreparedStatement atm = conn.prepareStatement(query);
          ResultSet rs = atm.executeQuery();
          while (rs.next()){
              lop.add(new LOP(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getBoolean(5)));
          }
      }
      catch(Exception e){
          e.printStackTrace();
      };
      return lop.get(0);
    };
    
    
}
