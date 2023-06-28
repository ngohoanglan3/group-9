/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.util.ArrayList;
import models.SINH_VIEN;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;

/**
 *
 * @author Admin
 */
public class SINH_VIEN_DAO extends BDConnect{
    

    public SINH_VIEN_DAO() {
       
    }
    
    public ArrayList<String> getDanhSachHocKy(String MaSV){
        ArrayList<String> hocky = new ArrayList<String>();
        String query ="select MaHocKy  from DIEM where MaSV='"+ MaSV +"' group by MaHocKy";
        try{
          PreparedStatement atm = conn.prepareStatement(query);
          ResultSet rs = atm.executeQuery();
          while (rs.next()){
              hocky.add(rs.getString(1));}
      }
      catch(Exception e){
          e.printStackTrace();
      };
      return hocky;
    }
    
    public SINH_VIEN getThongTin(String MaSV,String MatKhau){
        ArrayList<SINH_VIEN> sinhvien = new ArrayList<SINH_VIEN>();
        String query =" select * from SINH_VIEN where MaSV = '"+ MaSV + "' and MatKhau = '" + MatKhau +"'" ;
      try{
          PreparedStatement atm = conn.prepareStatement(query);
          ResultSet rs = atm.executeQuery();
          while (rs.next()){
              sinhvien.add(new SINH_VIEN(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getBoolean(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15),rs.getString(16),rs.getString(17),rs.getBoolean(18)));
          }
      }
      catch(Exception e){
          e.printStackTrace();
      };
      return sinhvien.get(0);
    };
    
    
    
    
    
    public ArrayList<SINH_VIEN> getDataList() {
        ArrayList<SINH_VIEN> dataList = new ArrayList<>();
        
        String sql = "select * from SINH_VIEN";
        try {
            PreparedStatement atm = conn.prepareStatement(sql);
            ResultSet resultSet = atm.executeQuery();

            
            while(resultSet.next()) {
                SINH_VIEN std = new SINH_VIEN(
                        resultSet.getString("MaSV"), 
                        resultSet.getString("MatKhau"), 
                        resultSet.getString("Ho"), 
                        resultSet.getString("Ten"), 
                        resultSet.getString("CCCD"), 
                        resultSet.getString("Email"),
                        resultSet.getString("SDT"),
                        resultSet.getString("NgaySinh"),
                        resultSet.getBoolean("GioiTinh"),
                        resultSet.getString("NoiSinh"),
                        resultSet.getString("HoKhauThuongTru"),
                        resultSet.getString("DanToc"),
                        resultSet.getString("MaKhoaHoc"),
                        resultSet.getString("MaLop"),
                        resultSet.getString("MaNganh"),
                        resultSet.getString("MaBac"),
                        resultSet.getString("MaLoaiHinhDaoTao"),
                        resultSet.getBoolean("flag")
                );
                dataList.add(std);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        
        return dataList;
    }
        
    public void passwordChange(String name, String MSSV, String password) {
        ArrayList<SINH_VIEN> dataList = new ArrayList<>();
        
        String sql = "update SINH_VIEN set MatKhau = "+password+" where Ten = ? and MaSV = ?";
        try {
            PreparedStatement atm = conn.prepareStatement(sql);
            atm.setString(1, name);
            atm.setString(2, MSSV);
            atm.executeQuery();
        } catch (Exception ex) {
        }
        
        
    }
 
    
    
    public SINH_VIEN getThongTin2(String Ten,String MaSV){
        ArrayList<SINH_VIEN> sinhvien = new ArrayList<SINH_VIEN>();
        String query =" select * from SINH_VIEN where MaSV = '"+ MaSV + "' and Ten = '" + Ten +"'" ;
      try{
          PreparedStatement atm = conn.prepareStatement(query);
          ResultSet rs = atm.executeQuery();
          while (rs.next()){
              sinhvien.add(new SINH_VIEN(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getBoolean(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15),rs.getString(16),rs.getString(17),rs.getBoolean(18)));
          }
      }
      catch(Exception e){
          e.printStackTrace();
      };
      return sinhvien.get(0);
    };
    
    public SINH_VIEN getThongTin3(String MaSV){
        ArrayList<SINH_VIEN> sinhvien = new ArrayList<SINH_VIEN>();
        String query =" select * from SINH_VIEN where MaSV = '"+ MaSV + "'" ;
      try{
          PreparedStatement atm = conn.prepareStatement(query);
          ResultSet rs = atm.executeQuery();
          while (rs.next()){
              sinhvien.add(new SINH_VIEN(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getBoolean(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15),rs.getString(16),rs.getString(17),rs.getBoolean(18)));
          }
      }
      catch(Exception e){
          e.printStackTrace();
      };
      return sinhvien.get(0);
    };
    
    public int insert(SINH_VIEN t) {
		int kq = 0;
		try {
			
			String sql = "INSERT SINH_VIEN (MaSV , Ho , Ten, Email, MaLop, MaNganh , GioiTinh, NoiSinh, HoKhauThuongTru, MaBac, MaLoaiHinhDaoTao, CCCD, MatKhau, NgaySinh , DanToc, MaKhoaHoc, Flag, SDT) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, t.getMaSV());
			pst.setString(2, t.getHo());
			pst.setString(3, t.getTen());
			pst.setString(4, t.getEmail());
			pst.setString(5, t.getMaLop());
			pst.setString(6, t.getMaNganh());
			pst.setNull(7, Types.NULL);
			pst.setString(8, t.getNoiSinh());
			pst.setString(9, t.getHoKhauThuongTru());
			pst.setString(10, t.getMaBac());
			pst.setString(11, t.getMaLoaiHinhDaoTao());
			pst.setString(12, t.getCCCD());
			pst.setString(13, t.getMatKhau());
			pst.setString(14, t.getNgaySinh());
			pst.setString(15, t.getDanToc());
			pst.setString(16, t.getMaKhoaHoc());
			pst.setBoolean(17, false);
			pst.setString(18, t.getSDT());
			kq = pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return kq;
	}
    
    public int update(String MaSV,SINH_VIEN t) {
		
		int kq = 0;
		try {
			
			String sql = "UPDATE SINH_VIEN SET Ho=? , Ten=?, Email=?, MaLop=?, MaNganh=? , GioiTinh=?, NoiSinh=?, HoKhauThuongTru=?, MaBac=?, MaLoaiHinhDaoTao=?, CCCD=?, MatKhau=?, NgaySinh=? , DanToc=?, MaKhoaHoc=?, Flag=?, SDT=? WHERE MaSV=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			
			pst.setString(1, t.getHo());
			pst.setString(2, t.getTen());
			pst.setString(3, t.getEmail());
			pst.setString(4, t.getMaLop());
			pst.setString(5, t.getMaNganh());
			pst.setBoolean(6, t.getGioiTinh());
			pst.setString(7, t.getNoiSinh());
			pst.setString(8, t.getHoKhauThuongTru());
			pst.setString(9, t.getMaBac());
			pst.setString(10, t.getMaLoaiHinhDaoTao());
			pst.setString(11, t.getCCCD());
			pst.setString(12, t.getMatKhau());
			pst.setString(13, t.getNgaySinh());
			pst.setString(14, t.getDanToc());
			pst.setString(15, t.getMaKhoaHoc());
			pst.setBoolean(16, t.getFlag());
			pst.setString(17, t.getSDT());
			pst.setString(18, MaSV);
			kq = pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return kq;
	}
    
    
    public int XoaDong(String MaSV) {
		
		int kq = 0;
		try {
			
			String sql = "UPDATE SINH_VIEN SET Flag = NULL, MatKhau='' WHERE MaSV = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			
			pst.setString(1, MaSV);
			kq = pst.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return kq;
	}
    
    public int VoHieu(String MaSV) {
		
		int kq = 0;
		try {
			
			String sql = "UPDATE SINH_VIEN SET Flag = 0  WHERE MaSV = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			
			pst.setString(1, MaSV);
			kq = pst.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return kq;
	}
    
    public int KichHoat(String MaSV) {
		
		int kq = 0;
		try {
			
			String sql = "UPDATE SINH_VIEN SET Flag = 1 WHERE MaSV = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			
			pst.setString(1, MaSV);
			kq = pst.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return kq;
	}
    
    public ArrayList<SINH_VIEN> seclectMaLop(String MaLop) {
		ArrayList<SINH_VIEN> kq = new ArrayList<SINH_VIEN>();
		try {
			
			String sql = "SELECT * from SINH_VIEN where MaLop = '"+MaLop+"' ";
			PreparedStatement pst = conn.prepareStatement(sql);
			
			ResultSet resultSet = pst.executeQuery();
			while(resultSet.next()) {
                SINH_VIEN std = new SINH_VIEN(
                        resultSet.getString("MaSV"), 
                        resultSet.getString("MatKhau"), 
                        resultSet.getString("Ho"), 
                        resultSet.getString("Ten"), 
                        resultSet.getString("CCCD"), 
                        resultSet.getString("Email"),
                        resultSet.getString("SDT"),
                        resultSet.getString("NgaySinh"),
                        resultSet.getBoolean("GioiTinh"),
                        resultSet.getString("NoiSinh"),
                        resultSet.getString("HoKhauThuongTru"),
                        resultSet.getString("DanToc"),
                        resultSet.getString("MaKhoaHoc"),
                        resultSet.getString("MaLop"),
                        resultSet.getString("MaNganh"),
                        resultSet.getString("MaBac"),
                        resultSet.getString("MaLoaiHinhDaoTao"),
                        resultSet.getBoolean("flag")
                );
                kq.add(std);
            }
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return kq;
	}

    public int update1(String MaSV,String MaLop) {
        int kq = 0;
		try {
			
			String sql = "UPDATE SINH_VIEN SET MaLop=? WHERE MaSV=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			
			pst.setString(1, MaLop);
			pst.setString(2, MaSV);
			
			kq = pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return kq;
    }
    
    public int update2(String MaSV) {
		int kq = 0;
		try {
			
			String sql = "UPDATE SINH_VIEN SET MaLop= NULL WHERE MaSV=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, MaSV);
			
			kq = pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return kq;
	}
}
