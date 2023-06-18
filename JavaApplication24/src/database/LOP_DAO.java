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
import models.LOP;

/**
 *
 * @author Admin
 */
public class LOP_DAO extends BDConnect{
    

    public LOP_DAO() {
       
    }
    
    public LOP getThongTin(String MaLop){
        ArrayList<LOP> lop = new ArrayList<LOP>();
        String query =" select * from LOP where MaLop = '"+ MaLop + "'" ;
      try{
          PreparedStatement atm = conn.prepareStatement(query);
          ResultSet rs = atm.executeQuery();
          while (rs.next()){
              lop.add(new LOP(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getBoolean(5)));
          }
      }
      catch(Exception e){
          e.printStackTrace();
      };
      return lop.get(0);
    };

    public ArrayList<LOP> seclectAll() {
        ArrayList<LOP> kq = new ArrayList<LOP>();
		try {
			
			String sql = "SELECT * from LOP";
			PreparedStatement pst = conn.prepareStatement(sql);
			
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String maKHOA = rs.getString("MaLop");
				String tenKHOA = rs.getString("TenLop");
                                String MaKhoa = rs.getString("MaKhoa");
                                String MaKhoaHoc = rs.getString("MaKhoaHoc");
				boolean flag = rs.getBoolean("Flag");
				
				LOP lop = new LOP(maKHOA, tenKHOA,MaKhoa,MaKhoaHoc, flag);
				kq.add(lop);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return kq;
    }
    
    public int update(String MaLop,LOP t) {
		int kq = 0;
		try {
			
			String sql = "UPDATE LOP SET TenLop=?, MaKhoa=?, MaKhoaHoc=? WHERE MaLop=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			
			pst.setString(1, t.getTenLop());
			pst.setString(2, t.getMaKhoa());
			pst.setString(3, t.getMaKhoaHoc());
                        pst.setString(4, MaLop);
			kq = pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return kq;
	}
    
    public int XoaDong(String MaLop) {
		
		int kq = 0;
		try {
			
			String sql = "UPDATE LOP SET Flag = 0 WHERE MaLop = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			
			pst.setString(1, MaLop);
			kq = pst.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return kq;
	}
    
    public int XoaToanBoSinhVien(String MaLop) {
		
		int kq = 0;
		try {
			
			String sql = "UPDATE SINH_VIEN SET MaLop = NULL WHERE MaLop = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			
			pst.setString(1, MaLop);
			kq = pst.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return kq;
	}
    
    public int insert(LOP t) {
		int kq = 0;
		try {
			
			String sql = "INSERT INTO lop(MaLop, TenLop, MaKhoa, MaKhoaHoc, Flag) VALUES(?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, t.getMaLop());
			pst.setString(2, t.getTenLop());
			pst.setString(3, t.getMaKhoa());
			pst.setString(4, t.getMaKhoaHoc());
			pst.setBoolean(5, t.getFlag());
			
			kq = pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return kq;
	}
}
