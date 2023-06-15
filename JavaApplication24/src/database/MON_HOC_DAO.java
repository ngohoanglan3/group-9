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
              monhoc.add(new MON_HOC(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getBoolean(5),/*rs.getBoolean(6),*/rs.getString(6),rs.getString(7),rs.getBoolean(8)));
          }
      }
      catch(Exception e){
          e.printStackTrace();
      };
      return monhoc.get(0);
    };
    
    public ArrayList<MON_HOC> seclectAll() {
		ArrayList<MON_HOC> kq = new ArrayList<MON_HOC>();
		try {
			
			String sql = "SELECT * from mon_hoc";
			PreparedStatement pst = conn.prepareStatement(sql);
			
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String maMon = rs.getString("MaMon");
				String tenMon = rs.getString("TenMon");
				int soTinChi = rs.getInt("SoTinChi");
				int soTiet = rs.getInt("SoTiet");
				boolean batBuoc = rs.getBoolean("BatBuoc");
				//boolean tuChon = rs.getBoolean("TuChon");
				String tienQuyet = rs.getString("TienQuyet");
				String songHanh = rs.getString("SongHanh");
				boolean flag = rs.getBoolean("Flag");
				
				MON_HOC monHoc = new MON_HOC(maMon, tenMon, soTinChi, soTiet, batBuoc,/* tuChon,*/ tienQuyet, songHanh, flag);
				kq.add(monHoc);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return kq;
	}
    
    public int update(String MaMon, MON_HOC t) {
		int kq = 0;
		try {
			
			String sql = "UPDATE mon_hoc SET TenMon=?, SoTinChi=?, SoTiet=?, BatBuoc=?, TienQuyet=?, SongHanh=?, Flag=? WHERE MaMon=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			
			pst.setString(1, t.getTenMon());
			pst.setInt(2, t.getSoTinChi());
			pst.setInt(3, t.getSoTiet());
			pst.setBoolean(4, t.isBatBuoc());
			pst.setString(5, t.getTienQuyet());
			pst.setString(6, t.getSongHanh());
			pst.setBoolean(7, t.isFlag());
			pst.setString(8, MaMon);
                        kq = pst.executeUpdate();
//			if(t.getTienQuyet().equals("0")){
//                        sql = "UPDATE mon_hoc SET TienQuyet= NULL WHERE MaMon=?";
//                        pst.setString(1, MaMon);    
//			kq = pst.executeUpdate();}
//                        if(t.getSongHanh().equals("0")){
//                        sql = "UPDATE mon_hoc SET SongHanh= NULL WHERE MaMon=?";
//                        pst.setString(1, MaMon);    
//			kq = pst.executeUpdate();}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return kq;
	}
    
       public int update2(String MaMon) {
		int kq = 0;
		try {
			
			String sql = "UPDATE MON_HOC SET TienQuyet= NULL WHERE MaMon=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, MaMon);
                        kq = pst.executeUpdate();
		} catch (Exception e) {
		}
		return kq;
	}
       
       public int update3(String MaMon) {
		int kq = 0;
		try {
			
			String sql = "UPDATE MON_HOC SET SongHanh= NULL WHERE MaMon=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, MaMon);
                        kq = pst.executeUpdate();
		} catch (Exception e) {
		}
		return kq;
	}
    
    public int XoaDong(String MaMon) {
		
		int kq = 0;
		try {
			
			String sql = "UPDATE MON_HOC SET Flag = 0 WHERE MaMon = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			
			pst.setString(1, MaMon);
			kq = pst.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return kq;
	}
    
    public int insert(MON_HOC t) {
		int kq = 0;
		try {
			
			String sql = "INSERT INTO mon_hoc(MaMon, TenMon, SoTinChi, SoTiet, BatBuoc,TienQuyet, SongHanh, Flag) VALUES(?,?,?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, t.getMaMon());
			pst.setString(2, t.getTenMon());
			pst.setInt(3, t.getSoTinChi());
			pst.setInt(4, t.getSoTiet());
			pst.setBoolean(5, t.isBatBuoc());
			pst.setString(6, t.getTienQuyet());
			pst.setString(7, t.getSongHanh());
			pst.setBoolean(8, t.isFlag());
			
			kq = pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return kq;
	}
    
}
