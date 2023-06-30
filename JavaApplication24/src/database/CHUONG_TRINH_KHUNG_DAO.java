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
import models.KHOA;
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
    
    public CHUONG_TRINH_KHUNG getChuongTrinhKhung(String MaMon, String MaNganh){
        ArrayList<CHUONG_TRINH_KHUNG> chuongtrinhkhung = new ArrayList<CHUONG_TRINH_KHUNG>();
        String query ="select * from CHUONG_TRINH_KHUNG where MaMon = '"+MaMon+"' and MaNganh='"+ MaNganh+"'" ;
      try{
          PreparedStatement atm = conn.prepareStatement(query);
          ResultSet rs = atm.executeQuery();
          while (rs.next()){
              chuongtrinhkhung.add(new CHUONG_TRINH_KHUNG(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getBoolean(4)));
          }
      }
      catch(Exception e){
          e.printStackTrace();
      };
      return chuongtrinhkhung.get(0);
    };

    
    public ArrayList<MON_HOC> getDanhSachChuongTrinhKhung(String MaNganh){
        ArrayList<MON_HOC> chuongtrinhkhung = new ArrayList<MON_HOC>();
        String query ="select M.MaMon,M.TenMon,M.SoTinChi,M.SoTiet,M.BatBuoc,M.TienQuyet,M.SongHanh,M.Flag from CHUONG_TRINH_KHUNG as C join MON_HOC as M on C.MaMon = M.MaMon where MaNganh ='"+ MaNganh + "'" ;
      try{
          PreparedStatement atm = conn.prepareStatement(query);
          ResultSet rs = atm.executeQuery();
          while (rs.next()){
              chuongtrinhkhung.add(new MON_HOC(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getBoolean(5),/*rs.getBoolean(6),*/rs.getString(6),rs.getString(7),rs.getBoolean(8)));
          }
      }
      catch(Exception e){
          e.printStackTrace();
      };
      return chuongtrinhkhung;
    };
    
    public ArrayList<MON_HOC> getDanhSachChuongTrinhKhung(String MaNganh,int hocky){
        ArrayList<MON_HOC> chuongtrinhkhung = new ArrayList<MON_HOC>();
        String query ="select M.MaMon,M.TenMon,M.SoTinChi,M.SoTiet,M.BatBuoc,M.TienQuyet,M.SongHanh,M.Flag from CHUONG_TRINH_KHUNG as C join MON_HOC as M on C.MaMon = M.MaMon where MaNganh ='"+ MaNganh + "'" +" and HocKy = "+ hocky ;
      try{
          PreparedStatement atm = conn.prepareStatement(query);
          ResultSet rs = atm.executeQuery();
          while (rs.next()){
              chuongtrinhkhung.add(new MON_HOC(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getBoolean(5),/*rs.getBoolean(6),*/rs.getString(6),rs.getString(7),rs.getBoolean(8)));
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
   
    public int getHocKy(String MaMon, String MaNganh){
        ArrayList<Integer> hocky = new ArrayList<Integer>();
        String query ="select * from CHUONG_TRINH_KHUNG as C where C.MaNganh ='"+MaNganh+"' and C.MaMon='"+MaMon+"'";
        try{
          PreparedStatement atm = conn.prepareStatement(query);
          ResultSet rs = atm.executeQuery();
          while (rs.next()){
              hocky.add(rs.getInt(3));
          }
      }
      catch(Exception e){
          e.printStackTrace();
      };
      return hocky.get(0);
    };
    
    public int XoaToanBoChuongTrinhKhung(String MaNganh) {
		int kq = 0;
		try {
			
			String sql = "DELETE from CHUONG_TRINH_KHUNG WHERE MaNganh=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			
			pst.setString(1, MaNganh);
			
			kq = pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return kq;
	}
	
    public int insert(CHUONG_TRINH_KHUNG t) {
		int kq = 0;
		try {
			
			String sql = "INSERT INTO CHUONG_TRINH_KHUNG(MaMon, MaNganh, HocKy, Flag) VALUES(?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, t.getMaMon());
			pst.setString(2, t.getMaNganh());
                        pst.setInt(3, t.getHocKy());
			pst.setBoolean(4, t.isFlag());
			
			kq = pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return kq;
                
               
	}
    
     public int delete(String MaMon,String MaNganh) {
		int kq = 0;
		try {
			
			String sql = "DELETE from CHUONG_TRINH_KHUNG WHERE MaNganh= ? and MaMon =? ";
			PreparedStatement pst = conn.prepareStatement(sql);
                        pst.setString(1, MaNganh);
                        pst.setString(2, MaMon);
			kq = pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return kq;
	}
     
     public int delete(String MaMon) {
		int kq = 0;
		try {
			
			String sql = "DELETE from CHUONG_TRINH_KHUNG WHERE MaMon =? ";
			PreparedStatement pst = conn.prepareStatement(sql);
                        pst.setString(1, MaMon);
			kq = pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return kq;
	}
}
