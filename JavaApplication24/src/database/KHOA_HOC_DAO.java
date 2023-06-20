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
import models.KHOA_HOC;

/**
 *
 * @author Admin
 */
public class KHOA_HOC_DAO extends BDConnect{
    

    public KHOA_HOC_DAO() {
       
    }
    
    public KHOA_HOC getThongTin(String MaKhoaHoc){
        ArrayList<KHOA_HOC> khoahoc = new ArrayList<KHOA_HOC>();
        String query =" select * from KHOA_HOC where MaKhoaHoc = '"+ MaKhoaHoc + "'" ;
      try{
          PreparedStatement atm = conn.prepareStatement(query);
          ResultSet rs = atm.executeQuery();
          while (rs.next()){
              khoahoc.add(new KHOA_HOC(rs.getString(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getBoolean(5)));
          }
      }
      catch(Exception e){
          e.printStackTrace();
      };
      return khoahoc.get(0);
    };
    
    public ArrayList<KHOA_HOC> selectAll() {
		ArrayList<KHOA_HOC> kq = new ArrayList<KHOA_HOC>();
		try {
			
			String sql = "SELECT * from khoa_hoc";
			PreparedStatement pst = conn.prepareStatement(sql);
			
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String maKHOA_HOC = rs.getString("MaKhoaHoc");
				int heSoCC = rs.getInt("HeSoDCC");
				int heSoGK = rs.getInt("HeSoDGK");
				int heSoKT = rs.getInt("HeSoDKT");
				boolean flag = rs.getBoolean("Flag");
				
				KHOA_HOC khoahoc = new KHOA_HOC(maKHOA_HOC, heSoCC, heSoGK, heSoKT, flag);
				kq.add(khoahoc);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return kq;
	}
    
     public int insert(KHOA_HOC t) {
		int kq = 0;
		try {
			
			String sql = "INSERT INTO khoa_hoc(MaKhoaHoc, HeSoDCC, HeSoDGK, HeSoDKT, Flag) VALUES(?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, t.getMaKhoaHoc());
			pst.setInt(2, t.getHeSoDCC());
			pst.setInt(3, t.getHeSoDGK());
			pst.setInt(4, t.getHeSoDKT());
			pst.setBoolean(5, t.getFlag());
			
			kq = pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return kq;
	}
    
     public int update(String MaKhoaHoc,KHOA_HOC t) {
		int kq = 0;
		try {
			
			String sql = "UPDATE khoa_hoc SET HeSoDCC=?, HeSoDGK=?, HeSoDKT=?, Flag=? WHERE MaKhoaHoc=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			
			pst.setInt(1, t.getHeSoDCC());
			pst.setInt(2, t.getHeSoDGK());
			pst.setInt(3, t.getHeSoDKT());
			pst.setBoolean(4, t.getFlag());
			pst.setString(5, MaKhoaHoc);
			
			kq = pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return kq;
	}
     
      public int XoaDong(String MaKhoaHoc) {
		
		int kq = 0;
		try {
			
			String sql = "UPDATE KHOA_HOC SET Flag = 0 WHERE MaKhoaHoc = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			
			pst.setString(1, MaKhoaHoc);
			kq = pst.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return kq;
	}
}
