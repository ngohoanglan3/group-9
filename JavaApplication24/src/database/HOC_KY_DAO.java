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
import models.HOC_KY;

/**
 *
 * @author Admin
 */
public class HOC_KY_DAO extends BDConnect{
    

    public HOC_KY_DAO() {
       
    }
    
    public HOC_KY getThongTin(String MaHocKy){
        ArrayList<HOC_KY> hocky = new ArrayList<HOC_KY>();
        String query =" select * from HOC_KY where MaHocKy = '"+ MaHocKy + "'" ;
      try{
          PreparedStatement atm = conn.prepareStatement(query);
          ResultSet rs = atm.executeQuery();
          while (rs.next()){
              hocky.add(new HOC_KY(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getBoolean(4)));
          }
      }
      catch(Exception e){
          e.printStackTrace();
      };
      return hocky.get(0);
    };
    
    public ArrayList<HOC_KY> getDataList(){
        ArrayList<HOC_KY> hocky = new ArrayList<HOC_KY>();
        String query =" select * from HOC_KY" ;
      try{
          PreparedStatement atm = conn.prepareStatement(query);
          ResultSet rs = atm.executeQuery();
          while (rs.next()){
              hocky.add(new HOC_KY(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getBoolean(4)));
          }
      }
      catch(Exception e){
          e.printStackTrace();
      };
      return hocky;
    };
    
    public int insert(HOC_KY t) {
		
		int kq = 0;
		try {
			String sql = "INSERT INTO hoc_ky(MaHocKy, Nam, SoThuTu, Flag) VALUES(?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, t.getMaHocKy());
			pst.setString(2, t.getNam());
			pst.setInt(3, t.getSoThuTu());
			pst.setBoolean(4, t.isFlag());
			kq = pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return kq;
	}
    
    public int update(String MaHocKy,HOC_KY t) {
		int kq = 0;
		try {
			String sql = "UPDATE hoc_ky SET Nam=?, SoThuTu=?, Flag=? WHERE MaHocKy=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, t.getNam());
			pst.setInt(2, t.getSoThuTu());
			pst.setBoolean(3, t.isFlag());
			pst.setString(4, MaHocKy);
			kq = pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return kq;
	}
    
    public int XoaDong(String MaHocKy) {
		
		int kq = 0;
		try {
			
			String sql = "UPDATE HOC_KY SET Flag = 0 WHERE MaHocKy = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			
			pst.setString(1, MaHocKy);
			kq = pst.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return kq;
	}
    
}
