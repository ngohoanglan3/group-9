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
    
    	public int insert(SINH_VIEN t) {
		int kq = 0;
		try {
			String sql = "INSERT INTO SINH_VIEN(MaSV, MatKhau,Ho, Ten, CCCD, Email, SDT,NgaySinh,GioiTinh,NoiSinh,HoKhauThuongTru,DanToc,MaKhoaHoc,MaLop,MaNganh,MaBac,MaLoaiHinhDaoTao, Flag) "+"VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, t.getMaSV());
			pst.setString(2, t.getMatKhau());
                        pst.setString(3, t.getHo());
                        pst.setString(4, t.getTen());
                        pst.setString(5, t.getCCCD());
                        pst.setString(6, t.getEmail());
                        pst.setString(7, t.getSDT());
                        pst.setString(8, t.getNgaySinh());
                        pst.setBoolean(9, t.getGioiTinh());
                        pst.setString(10, t.getNoiSinh());
                        pst.setString(11, t.getHoKhauThuongTru());
                        pst.setString(12, t.getDanToc());
                        pst.setString(13, t.getMaKhoaHoc());
                        pst.setString(14, t.getMaLop());
                        pst.setString(15, t.getMaNganh());
                        pst.setString(16, t.getMaBac());
                        pst.setString(17, t.getMaLoaiHinhDaoTao());
                        pst.setBoolean(18, t.getFlag());
			kq = pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return kq;
	}
    
}
