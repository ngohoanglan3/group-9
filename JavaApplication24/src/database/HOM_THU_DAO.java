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
import models.HOM_THU;

/**
 *
 * @author Admin
 */
public class HOM_THU_DAO extends BDConnect{
    

    public HOM_THU_DAO() {
       
    }
    
//    public SINH_VIEN getThongTin(String MaSV,String MatKhau){
//        ArrayList<SINH_VIEN> sinhvien = new ArrayList<SINH_VIEN>();
//        String query =" select * from SINH_VIEN where MaSV = '"+ MaSV + "' and MatKhau = '" + MatKhau +"'" ;
//      try{
//          PreparedStatement atm = conn.prepareStatement(query);
//          ResultSet rs = atm.executeQuery();
//          while (rs.next()){
//              sinhvien.add(new SINH_VIEN(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getBoolean(9),rs.getString(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14),rs.getString(15),rs.getString(16),rs.getString(17),rs.getBoolean(18)));
//          }
//      }
//      catch(Exception e){
//          e.printStackTrace();
//      };
//      return sinhvien.get(0);
//    };
    public int getSoThu(){
        ArrayList<Integer> sothu = new ArrayList<Integer>();
        String sql = "select count(MaThu) from HOM_THU";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
          while (rs.next()){
           sothu.add(rs.getInt(1));
          }
            } 
        catch (Exception e) {
		}
		return sothu.get(0);
    }
    
    public int insert(HOM_THU homthu) {
		int kq = 0;
		try {
			
			String sql = "INSERT INTO HOM_THU(MaThu, TieuDe, NoiDung, MaSV, Flag) VALUES(?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, homthu.getMaThu());
			pst.setString(2, homthu.getTieuDe());
			pst.setString(3, homthu.getNoiDung());
			pst.setString(4, homthu.getMaSV());
			pst.setBoolean(5, homthu.getFlag());
			
			kq = pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return kq;
	}
    
}
