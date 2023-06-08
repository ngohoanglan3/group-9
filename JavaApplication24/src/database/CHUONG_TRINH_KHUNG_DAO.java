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
import models.CHUONG_TRINH_KHUNG;
import models.MON_HOC;

/**
 *
 * @author Admin
 */
public class CHUONG_TRINH_KHUNG_DAO extends BDConnect{
    

    public CHUONG_TRINH_KHUNG_DAO() {
       
    }
    public ArrayList<Integer> getDanhSachHocKy(String MaNganh){

        String query ="select HocKy from CHUONG_TRINH_KHUNG where MaNganh ='"+ MaNganh + "' group by HocKy" ;
        ArrayList<Integer> danhsach = new ArrayList<Integer>();
        try{
          PreparedStatement atm = conn.prepareStatement(query);
          ResultSet rs = atm.executeQuery();
          while (rs.next()){
              danhsach.add(rs.getInt(1));}
      }
        catch(Exception e){
            e.printStackTrace();
        }
        return danhsach;
    
    }

    
    
    public ArrayList<MON_HOC> getDanhSachChuongTrinhKhung(String MaNganh,int hocky){
        ArrayList<MON_HOC> chuongtrinhkhung = new ArrayList<MON_HOC>();
        String query ="select M.MaMon,M.TenMon,M.SoTinChi,M.SoTiet,M.BatBuoc,M.TuChon,M.TienQuyet,M.SongHanh,M.Flag from CHUONG_TRINH_KHUNG as C join MON_HOC as M on C.MaMon = M.MaMon where MaNganh ='"+ MaNganh + "'" +" and HocKy = "+ hocky ;
      try{
          PreparedStatement atm = conn.prepareStatement(query);
          ResultSet rs = atm.executeQuery();
          while (rs.next()){
              chuongtrinhkhung.add(new MON_HOC(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getBoolean(5),rs.getBoolean(6),rs.getString(7),rs.getString(8),rs.getBoolean(9)));
          }
      }
      catch(Exception e){
          e.printStackTrace();
      };
      return chuongtrinhkhung;
    };
    
    public int getSoTinChiCuaChuongTrinhKhung(String MaNganh){
        ArrayList<Integer> tinchi = new ArrayList<Integer>();
        String query ="select count(M.SoTinChi) from CHUONG_TRINH_KHUNG as C join MON_HOC as M on C.MaMon = M.MaMon where C.MaNganh ='"+MaNganh+"'";
        try{
          PreparedStatement atm = conn.prepareStatement(query);
          ResultSet rs = atm.executeQuery();
          while (rs.next()){
              tinchi.add(rs.getInt(1));
          }
      }
      catch(Exception e){
          e.printStackTrace();
      };
      return tinchi.get(0);
    };
   
    
}
