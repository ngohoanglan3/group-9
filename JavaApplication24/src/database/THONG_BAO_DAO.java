/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import models.SINH_VIEN;
import models.THONG_BAO;

/**
 *
 * @author Dell
 */
public class THONG_BAO_DAO extends BDConnect{
    public ArrayList<THONG_BAO> getDataList() {
        ArrayList<THONG_BAO> dataList = new ArrayList<>();
        
        
        String sql = "select * from THONG_BAO";
        try {
            PreparedStatement atm = conn.prepareStatement(sql);
            
            ResultSet resultSet = atm.executeQuery();
            
            while(resultSet.next()) {
                THONG_BAO th = new THONG_BAO(
                        resultSet.getString("MaThongBao"), 
                        resultSet.getString("TieuDe"), 
                        resultSet.getString("LinkNoiDung")
//                        resultSet.getBoolean("Flag")
                );
                dataList.add(th);
            }
        } catch (Exception ex) {
        }
        
        
        return dataList;
    }
    
    public int insert(THONG_BAO d) {
        int kq = 0;
        try {
			String sql = "INSERT INTO THONG_BAO(MaThongBao, TieuDe,LinkNoiDung, Flag) VALUES(?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, d.getMaThongBao());
			pst.setString(2, d.getTieuDe());
                        pst.setString(3, d.getLinkNoiDung());
                        pst.setBoolean(4, d.isFlag());
			kq = pst.executeUpdate();
			
        } catch (Exception e) {
                // TODO: handle exception
        }
        return kq;
    }
}
