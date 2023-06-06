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
import models.DIEM;

/**
 *
 * @author Admin
 */
public class DIEM_DAO extends BDConnect{
    

    public DIEM_DAO() {
       
    }
    
    public ArrayList<DIEM> getDanhSachDiem(String MaSV,String MaHocKy){
        ArrayList<DIEM> diem = new ArrayList<DIEM>();
        String query =" select * from DIEM where MaSV = '"+ MaSV + "' and MaHocKy = '" + MaHocKy +"'" ;
      try{
          PreparedStatement atm = conn.prepareStatement(query);
          ResultSet rs = atm.executeQuery();
          while (rs.next()){
              diem.add(new DIEM(rs.getString(1),rs.getString(2),rs.getString(3),rs.getFloat(4),rs.getFloat(5),rs.getFloat(6),rs.getBoolean(7)));
          }
      }
      catch(Exception e){
          e.printStackTrace();
      };
      return diem;
    };
    
    
}
