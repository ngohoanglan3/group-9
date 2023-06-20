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
<<<<<<<< HEAD:JavaApplication24/src/database/_DAO.java
import models.SINH_VIEN;
========
import models.THONG_BAO;
>>>>>>>> origin/Brand-mới-của-Hoàng:JavaApplication24/src/database/THONG_BAO_DAO.java

/**
 *
 * @author Admin
 */
public class THONG_BAO_DAO extends BDConnect{
    

    public THONG_BAO_DAO() {
       
    }
    
    public ArrayList<THONG_BAO> getThongTin(int number){
        ArrayList<THONG_BAO> thongbao = new ArrayList<THONG_BAO>();
        String query ="select TOP "+ number+ " * from THONG_BAO order by MaThongBao DESC" ;
      try{
          PreparedStatement atm = conn.prepareStatement(query);
          ResultSet rs = atm.executeQuery();
          while (rs.next()){
              thongbao.add(new THONG_BAO(rs.getInt(1),rs.getString(2),rs.getBoolean(3)));
          }
      }
      catch(Exception e){
          e.printStackTrace();
      };
      return thongbao;
    };
    
    
}
