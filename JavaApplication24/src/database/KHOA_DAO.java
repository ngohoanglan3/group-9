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
public class KHOA_DAO extends BDConnect{
    

    public KHOA_DAO() {
       
    }
    
    public ArrayList<KHOA> seclectAll() {
		ArrayList<KHOA> kq = new ArrayList<KHOA>();
		try {
			
			String sql = "SELECT * from khoa";
			PreparedStatement pst = conn.prepareStatement(sql);
			
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String maKHOA = rs.getString("MaKhoa");
				String tenKHOA = rs.getString("TenKhoa");
				boolean flag = rs.getBoolean("Flag");
				
				KHOA khoa = new KHOA(maKHOA, tenKHOA, flag);
				kq.add(khoa);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return kq;
	}
    
    public int insert(KHOA t) {
		int kq = 0;
		try {
			
			String sql = "INSERT INTO khoa(MaKhoa, TenKhoa, Flag) VALUES(?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, t.getMaKhoa());
			pst.setString(2, t.getTenKhoa());
			pst.setBoolean(3, t.getFlag());
			
			kq = pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return kq;
	}
    
    public KHOA getThongTin(String MaKhoa){
        ArrayList<KHOA> khoa = new ArrayList<KHOA>();
        String query =" select * from KHOA where MaKhoa = '"+ MaKhoa+"'" ;
      try{
          PreparedStatement atm = conn.prepareStatement(query);
          ResultSet rs = atm.executeQuery();
          while (rs.next()){
              khoa.add(new KHOA(rs.getString(1),rs.getString(2),rs.getBoolean(3)));
          }
      }
      catch(Exception e){
          e.printStackTrace();
      };
      return khoa.get(0);
    };
    
        
    public int XoaDong(String MaKhoa) {
		
		int kq = 0;
		try {
			
			String sql = "UPDATE KHOA SET Flag = 0 WHERE MaKhoa = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			
			pst.setString(1, MaKhoa);
			kq = pst.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return kq;
	}
    
    public int XoaToanBoNganh(String MaKhoa) {
		
		int kq = 0;
		try {
			
			String sql = "UPDATE NGANH SET MaKhoa = NULL WHERE MaKhoa = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			
			pst.setString(1, MaKhoa);
			kq = pst.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return kq;
	}
    
    public int update(String MaKhoa,KHOA t) {
		int kq = 0;
		try {
			
			String sql = "UPDATE KHOA SET TenKhoa=? WHERE MaKhoa=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			
			pst.setString(1, t.getTenKhoa());
			pst.setString(2, MaKhoa);
			
			kq = pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return kq;
	}
    
}
