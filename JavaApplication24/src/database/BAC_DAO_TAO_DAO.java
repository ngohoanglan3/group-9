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
import models.BAC_DAO_TAO;

/**
 *
 * @author Admin
 */
public class BAC_DAO_TAO_DAO extends BDConnect{
    

    public BAC_DAO_TAO_DAO() {
       
    }
    
    public BAC_DAO_TAO getThongTin(String MaBac){
        ArrayList<BAC_DAO_TAO> bacdaotao = new ArrayList<BAC_DAO_TAO>();
        String query =" select * from BAC_DAO_TAO where MaBac = '"+ MaBac + "'" ;
      try{
          PreparedStatement atm = conn.prepareStatement(query);
          ResultSet rs = atm.executeQuery();
          while (rs.next()){
              bacdaotao.add(new BAC_DAO_TAO(rs.getString(1),rs.getString(2),rs.getBoolean(3)));
          }
      }
      catch(Exception e){
          e.printStackTrace();
      };
      return bacdaotao.get(0);
    };
    
    
}
