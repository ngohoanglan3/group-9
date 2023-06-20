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
import models.KHOA;
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
    public ArrayList<NGANH> seclectAll() {
		ArrayList<NGANH> kq = new ArrayList<NGANH>();
		try {
			
			String sql = "SELECT * from nganh";
			PreparedStatement pst = conn.prepareStatement(sql);
			
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String maNGANH = rs.getString("MaNganh");
				String tenNGANH = rs.getString("TenNganh");
				String maKhoa = rs.getString("MaKhoa");
				boolean flag = rs.getBoolean("Flag");
				
				NGANH nganh = new NGANH(maNGANH, tenNGANH, maKhoa, flag);
				kq.add(nganh);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return kq;
	}
    
    public ArrayList<NGANH> seclectMaKhoa(String MaKhoa) {
		ArrayList<NGANH> kq = new ArrayList<NGANH>();
		try {
			
			String sql = "SELECT * from nganh where MaKhoa = '"+MaKhoa+"' ";
			PreparedStatement pst = conn.prepareStatement(sql);
			
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String maNGANH = rs.getString("MaNganh");
				String tenNGANH = rs.getString("TenNganh");
				String maKhoa = rs.getString("MaKhoa");
				boolean flag = rs.getBoolean("Flag");
				
				NGANH nganh = new NGANH(maNGANH, tenNGANH, maKhoa, flag);
				kq.add(nganh);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return kq;
	}
    
    public int update1(String MaNganh,String MaKhoa) {
		int kq = 0;
		try {
			
			String sql = "UPDATE nganh SET MaKhoa=? WHERE MaNganh=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			
			pst.setString(1, MaKhoa);
			pst.setString(2, MaNganh);
			
			kq = pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return kq;
	}
    
    public int update2(String MaNganh) {
		int kq = 0;
		try {
			
			String sql = "UPDATE nganh SET MaKhoa= NULL WHERE MaNganh=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, MaNganh);
			
			kq = pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return kq;
	}
    
    public int update(NGANH t) {
		int kq = 0;
		try {
			
			String sql = "UPDATE nganh SET TenNganh=?, MaKhoa=?, Flag=? WHERE MaNganh=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			
			pst.setString(1, t.getTenNganh());
			pst.setString(2, t.getMaKhoa());
			pst.setBoolean(3, t.getFlag());
			pst.setString(4, t.getMaNganh());
			
			kq = pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return kq;
	}
    
    public int insert(NGANH t) {
		int kq = 0;
		try {
			
			String sql = "INSERT INTO NGANH(MaNganh, TenNganh, Flag) VALUES(?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, t.getMaNganh());
			pst.setString(2, t.getTenNganh());
			pst.setBoolean(3, t.getFlag());
			
			kq = pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return kq;
	}
    public int XoaDong(String MaNganh) {
		
		int kq = 0;
		try {
			
			String sql = "UPDATE NGANH SET Flag = 0 WHERE MaNganh = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			
			pst.setString(1, MaNganh);
			kq = pst.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return kq;
	}
    
    public int update(String MaNganh,NGANH t) {
		int kq = 0;
		try {
			
			String sql = "UPDATE NGANH SET TenNganh=? WHERE MaNganh=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			
			pst.setString(1, t.getTenNganh());
			pst.setString(2, MaNganh);
			
			kq = pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return kq;
	}
}
