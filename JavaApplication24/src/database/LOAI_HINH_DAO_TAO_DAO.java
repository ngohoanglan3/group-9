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
import models.LOAI_HINH_DAO_TAO;

/**
 *
 * @author Admin
 */
public class LOAI_HINH_DAO_TAO_DAO extends BDConnect{
    

    public LOAI_HINH_DAO_TAO_DAO() {
       
    }
    
    public LOAI_HINH_DAO_TAO getThongTin(String MaLoaiHinhDaoTao){
        ArrayList<LOAI_HINH_DAO_TAO> loaihinh = new ArrayList<LOAI_HINH_DAO_TAO>();
        String query =" select * from LOAI_HINH_DAO_TAO where MaLoaiHinhDaoTao = '"+ MaLoaiHinhDaoTao +"'" ;
      try{
          PreparedStatement atm = conn.prepareStatement(query);
          ResultSet rs = atm.executeQuery();
          while (rs.next()){
              loaihinh.add(new LOAI_HINH_DAO_TAO(rs.getString(1),rs.getString(2),rs.getBoolean(3)));
          }
      }
      catch(Exception e){
          e.printStackTrace();
      };
      return loaihinh.get(0);
    };
    
    
}
