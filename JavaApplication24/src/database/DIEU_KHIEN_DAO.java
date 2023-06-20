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
import models.DIEU_KHIEN;
import models.HOM_THU;

/**
 *
 * @author Admin
 */
public class DIEU_KHIEN_DAO extends BDConnect{
    

    public DIEU_KHIEN_DAO() {
       
    }
    
    public DIEU_KHIEN getVoHieuHoa(){
        ArrayList <DIEU_KHIEN> dieukhien = new ArrayList<DIEU_KHIEN>();
        String query =" select * from DIEU_KHIEN " ;
      try{
          PreparedStatement atm = conn.prepareStatement(query);
          ResultSet rs = atm.executeQuery();
          while (rs.next()){
              dieukhien.add(new DIEU_KHIEN(rs.getBoolean(1)));
          }
      }
      catch(Exception e){
          e.printStackTrace();
      };
      return dieukhien.get(0);
    };
    
    
    public int VoHieu() {
		
		int kq = 0;
		try {
			
			String sql = "UPDATE DIEU_KHIEN SET VoHieuHoaSinhVien = 0  WHERE VoHieuHoaSinhVien=1";
			PreparedStatement pst = conn.prepareStatement(sql);
			kq = pst.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return kq;
	}
    
    public int KichHoat() {
		
		int kq = 0;
		try {
			
			String sql = "UPDATE DIEU_KHIEN SET VoHieuHoaSinhVien = 1  WHERE VoHieuHoaSinhVien= 0";
			PreparedStatement pst = conn.prepareStatement(sql);
			kq = pst.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return kq;
	}
}
