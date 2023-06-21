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
import models.THONG_BAO;

/**
 *
 * @author Admin
 */
public class THONG_BAO_DAO extends BDConnect{
    

    public THONG_BAO_DAO() {
       
    }
    
    public ArrayList<THONG_BAO> getThongTin(int number){
        ArrayList<THONG_BAO> thongbao = new ArrayList<THONG_BAO>();
        String query ="select TOP "+ number+ " * from THONG_BAO order by MaThongBao DESC" ;
      try{
          PreparedStatement atm = conn.prepareStatement(query);
          ResultSet rs = atm.executeQuery();
          while (rs.next()){
              thongbao.add(new THONG_BAO(rs.getInt(1),rs.getString(2),rs.getBoolean(3)));
          }
      }
      catch(Exception e){
          e.printStackTrace();
      };
      return thongbao;
    };
     public ArrayList<THONG_BAO> selectAll() {
        ArrayList<THONG_BAO> tb = new ArrayList<THONG_BAO>();
        try {

                String sql = "SELECT * from thong_bao";
                PreparedStatement pst = conn.prepareStatement(sql);

                ResultSet rs = pst.executeQuery();
                while(rs.next()) {
                        int MaTB = rs.getInt("MaThongBao");
                        String TD = rs.getString("TieuDe");
                        boolean flag = rs.getBoolean("Flag");

                        THONG_BAO khoahoc = new THONG_BAO(MaTB, TD, flag);
                        tb.add(khoahoc);
                }


        } catch (Exception e) {
                // TODO: handle exception
        }
        return tb;
    }
    
    public int insert(THONG_BAO tb) {
		int kq = 0;
		try {
			
			String sql = "INSERT INTO thong_bao(MaThongBao, TieuDe, Flag) VALUES(?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, tb.getMaThongBao());
			pst.setString(2, tb.getTieuDe());
			pst.setBoolean(3, tb.isFlag());
			
			kq = pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return kq;
	}
}
