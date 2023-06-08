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
import models.DIEM;

/**
 *
 * @author Admin
 */
public class DIEM_DAO extends BDConnect{
    

    public DIEM_DAO() {
       
    }
    public Float getDiemTrungBinhHocKy10(String MaSV, String MaHocKy){
        ArrayList<Float> dtb = new ArrayList<Float>();
        String query="select ROUND(SUM(ROUND((((HeSoDCC* DiemChuyenCan + HeSoDGK* DiemGiuaKy)/100*(100- HeSoDKT))+HeSoDKT*DiemKetThuc)/100,2)*M.SoTinChi)/SUM(M.SoTinChi),2)  from  KHOA_HOC as K join SINH_VIEN as S on K.MaKhoaHoc=S.MaKhoaHoc join DIEM as D on S.MaSV = D.MaSV join MON_HOC as M on D.MaMon = M.MaMon  where D.MaSV ='"+ MaSV+"' and D.MaHocKy='"+MaHocKy+"'";// and (ROUND((((HeSoDCC* DiemChuyenCan + HeSoDGK* DiemGiuaKy)/100*(100- HeSoDKT))+HeSoDKT*DiemKetThuc)/100,2))>= 4.0";
        try{
          PreparedStatement atm = conn.prepareStatement(query);
          ResultSet rs = atm.executeQuery();
          while (rs.next()){
              dtb.add(rs.getFloat(1));
          }
      }
      catch(Exception e){
          e.printStackTrace();
      };
      return dtb.get(0);
    };
    
    public Float getDiemTrungBinh10(String MaSV, String MaHocKy,String MaMon){
        ArrayList<Float> dtb = new ArrayList<Float>();
        String query="select ROUND((((HeSoDCC* DiemChuyenCan + HeSoDGK* DiemGiuaKy)/100*(100- HeSoDKT))+HeSoDKT*DiemKetThuc)/100,2)  from  KHOA_HOC as K join SINH_VIEN as S on K.MaKhoaHoc=S.MaKhoaHoc join DIEM as D on S.MaSV = D.MaSV join MON_HOC as M on D.MaMon = M.MaMon  where D.MaSV ='"+ MaSV+"' and D.MaHocKy='"+MaHocKy+"' and D.MaMon='"+MaMon+"'";
        try{
          PreparedStatement atm = conn.prepareStatement(query);
          ResultSet rs = atm.executeQuery();
          while (rs.next()){
              dtb.add(rs.getFloat(1));
          }
      }
      catch(Exception e){
          e.printStackTrace();
      };
      return dtb.get(0);
    };
    
    public double getDiemTrungBinhHocKy4(String MaSV, String MaHocKy){
        ArrayList<Float> dtb = new ArrayList<Float>();
        String query="select SUM(4*M.SoTinChi)  from  KHOA_HOC as K join SINH_VIEN as S on K.MaKhoaHoc=S.MaKhoaHoc join DIEM as D on S.MaSV = D.MaSV join MON_HOC as M on D.MaMon = M.MaMon  where D.MaSV ='"+MaSV+"' and D.MaHocKy="+MaHocKy+" and ROUND(((((HeSoDCC* DiemChuyenCan + HeSoDGK* DiemGiuaKy)/100*(100- HeSoDKT))+HeSoDKT*DiemKetThuc)/100),2)>=8.6";
        try{
          PreparedStatement atm = conn.prepareStatement(query);
          ResultSet rs = atm.executeQuery();
          while (rs.next()){
              dtb.add(rs.getFloat(1));
          }
          
          query="select SUM(3.5*M.SoTinChi)  from  KHOA_HOC as K join SINH_VIEN as S on K.MaKhoaHoc=S.MaKhoaHoc join DIEM as D on S.MaSV = D.MaSV join MON_HOC as M on D.MaMon = M.MaMon  where D.MaSV ='"+MaSV+"' and D.MaHocKy="+MaHocKy+" and ROUND(((((HeSoDCC* DiemChuyenCan + HeSoDGK* DiemGiuaKy)/100*(100- HeSoDKT))+HeSoDKT*DiemKetThuc)/100),2)>=8.0 and ROUND(((((HeSoDCC* DiemChuyenCan + HeSoDGK* DiemGiuaKy)/100*(100- HeSoDKT))+HeSoDKT*DiemKetThuc)/100),2) <8.6";
          atm=conn.prepareStatement(query);
          rs = atm.executeQuery();
          while (rs.next()){
              dtb.add(rs.getFloat(1));
          }
          
          query="select SUM(3.0*M.SoTinChi)  from  KHOA_HOC as K join SINH_VIEN as S on K.MaKhoaHoc=S.MaKhoaHoc join DIEM as D on S.MaSV = D.MaSV join MON_HOC as M on D.MaMon = M.MaMon  where D.MaSV ='"+MaSV+"' and D.MaHocKy="+MaHocKy+" and ROUND(((((HeSoDCC* DiemChuyenCan + HeSoDGK* DiemGiuaKy)/100*(100- HeSoDKT))+HeSoDKT*DiemKetThuc)/100),2)>=7.0 and ROUND(((((HeSoDCC* DiemChuyenCan + HeSoDGK* DiemGiuaKy)/100*(100- HeSoDKT))+HeSoDKT*DiemKetThuc)/100),2) <8.0";
          atm=conn.prepareStatement(query);
          rs = atm.executeQuery();
          while (rs.next()){
              dtb.add(rs.getFloat(1));
          }
          
          query="select SUM(2.5*M.SoTinChi)  from  KHOA_HOC as K join SINH_VIEN as S on K.MaKhoaHoc=S.MaKhoaHoc join DIEM as D on S.MaSV = D.MaSV join MON_HOC as M on D.MaMon = M.MaMon  where D.MaSV ='"+MaSV+"' and D.MaHocKy="+MaHocKy+" and ROUND(((((HeSoDCC* DiemChuyenCan + HeSoDGK* DiemGiuaKy)/100*(100- HeSoDKT))+HeSoDKT*DiemKetThuc)/100),2)>=6.0 and ROUND(((((HeSoDCC* DiemChuyenCan + HeSoDGK* DiemGiuaKy)/100*(100- HeSoDKT))+HeSoDKT*DiemKetThuc)/100),2) <7.0";
          atm=conn.prepareStatement(query);
          rs = atm.executeQuery();
          while (rs.next()){
              dtb.add(rs.getFloat(1));
          }
          
          query="select SUM(2.0*M.SoTinChi)  from  KHOA_HOC as K join SINH_VIEN as S on K.MaKhoaHoc=S.MaKhoaHoc join DIEM as D on S.MaSV = D.MaSV join MON_HOC as M on D.MaMon = M.MaMon  where D.MaSV ='"+MaSV+"' and D.MaHocKy="+MaHocKy+" and ROUND(((((HeSoDCC* DiemChuyenCan + HeSoDGK* DiemGiuaKy)/100*(100- HeSoDKT))+HeSoDKT*DiemKetThuc)/100),2)>=5.0 and ROUND(((((HeSoDCC* DiemChuyenCan + HeSoDGK* DiemGiuaKy)/100*(100- HeSoDKT))+HeSoDKT*DiemKetThuc)/100),2) <6.0";
          atm=conn.prepareStatement(query);
          rs = atm.executeQuery();
          while (rs.next()){
              dtb.add(rs.getFloat(1));
          }
          
          query="select SUM(1.5*M.SoTinChi)  from  KHOA_HOC as K join SINH_VIEN as S on K.MaKhoaHoc=S.MaKhoaHoc join DIEM as D on S.MaSV = D.MaSV join MON_HOC as M on D.MaMon = M.MaMon  where D.MaSV ='"+MaSV+"' and D.MaHocKy="+MaHocKy+" and ROUND(((((HeSoDCC* DiemChuyenCan + HeSoDGK* DiemGiuaKy)/100*(100- HeSoDKT))+HeSoDKT*DiemKetThuc)/100),2)>=4.0 and ROUND(((((HeSoDCC* DiemChuyenCan + HeSoDGK* DiemGiuaKy)/100*(100- HeSoDKT))+HeSoDKT*DiemKetThuc)/100),2) <5.0";
          atm=conn.prepareStatement(query);
          rs = atm.executeQuery();
          while (rs.next()){
              dtb.add(rs.getFloat(1));
          }
          
          query="select SUM(1*M.SoTinChi)  from  KHOA_HOC as K join SINH_VIEN as S on K.MaKhoaHoc=S.MaKhoaHoc join DIEM as D on S.MaSV = D.MaSV join MON_HOC as M on D.MaMon = M.MaMon  where D.MaSV ='"+MaSV+"' and D.MaHocKy="+MaHocKy+" and ROUND(((((HeSoDCC* DiemChuyenCan + HeSoDGK* DiemGiuaKy)/100*(100- HeSoDKT))+HeSoDKT*DiemKetThuc)/100),2)<4.0";
          atm=conn.prepareStatement(query);
          rs = atm.executeQuery();
          while (rs.next()){
              dtb.add(rs.getFloat(1));
          }
      }
      catch(Exception e){
          e.printStackTrace();
      };
      float kq = 0;
      for(int i =0;i< dtb.size();i++){
          kq+=dtb.get(i);
      }
      kq = kq/this.getSoTinChiTrongHocKy(MaSV, MaHocKy);
      return Math.floor(kq*100)/100 ;
    };
    
    
    
    public ArrayList<DIEM> getDanhSachDiem(String MaSV,String MaHocKy){
        ArrayList<DIEM> diem = new ArrayList<DIEM>();
        String query =" select * from DIEM where MaSV = '"+ MaSV + "' and MaHocKy = '" + MaHocKy +"'" ;
      try{
          PreparedStatement atm = conn.prepareStatement(query);
          ResultSet rs = atm.executeQuery();
          while (rs.next()){
              diem.add(new DIEM(rs.getString(1),rs.getString(2),rs.getString(3),rs.getFloat(4),rs.getFloat(5),rs.getFloat(6),rs.getBoolean(7)));
          }
      }
      catch(Exception e){
          e.printStackTrace();
      };
      return diem;
    };
    
    public int getSoTinChiTrongHocKy(String MaSV,String MaHocKy){
        ArrayList<Integer> sotinchi = new ArrayList<Integer>();
        String query="select SUM(SoTinChi) from DIEM as D join MON_HOC as M on D.MaMon= M.MaMon where D.MaSV = '"+MaSV+"' and D.MaHocKy='"+ MaHocKy+"'";
        try{
              PreparedStatement atm = conn.prepareStatement(query);
              ResultSet rs = atm.executeQuery();
              while (rs.next()){
                  sotinchi.add(rs.getInt(1));
              }
          }
          catch(Exception e){
              e.printStackTrace();
          };
          return sotinchi.get(0);
    }
    
    public int getSoTinChiTichLuu(String MaSV){
        ArrayList<Integer> sotinchi = new ArrayList<Integer>();
        String query="select SUM(SoTinChi) from  KHOA_HOC as K join SINH_VIEN as S on K.MaKhoaHoc=S.MaKhoaHoc join DIEM as D on S.MaSV = D.MaSV join MON_HOC as M on D.MaMon = M.MaMon  where D.MaSV ='"+MaSV+"'";// and ROUND(((((HeSoDCC* DiemChuyenCan + HeSoDGK* DiemGiuaKy)/100*(100- HeSoDKT))+HeSoDKT*DiemKetThuc)/100),2)>=4.0";
          try{
              PreparedStatement atm = conn.prepareStatement(query);
              ResultSet rs = atm.executeQuery();
              while (rs.next()){
                  sotinchi.add(rs.getInt(1));
              }
          }
          catch(Exception e){
              e.printStackTrace();
          };
          return sotinchi.get(0);
    }
    
    public int getSoTinChiConLai(String MaSV,String MaNganh){
        return new CHUONG_TRINH_KHUNG_DAO().getSoTinChiCuaChuongTrinhKhung(MaNganh)-this.getSoTinChiTichLuu(MaSV);
    }
    
    public ArrayList<DIEM> getMonHocLai(String MaSV){
        ArrayList<DIEM> monhoclai= new ArrayList<DIEM>();
        String query="select D.MaSV,'0',D.MaMon,0,0,0,0 from  KHOA_HOC as K join SINH_VIEN as S on K.MaKhoaHoc=S.MaKhoaHoc join DIEM as D on S.MaSV = D.MaSV join MON_HOC as M on D.MaMon = M.MaMon where D.MaSV='"+MaSV+"' and ROUND((((HeSoDCC* DiemChuyenCan + HeSoDGK* DiemGiuaKy)/100*(100- HeSoDKT))+HeSoDKT*DiemKetThuc)/100,2) < 4.0 group by D.MaSV,D.MaMon";
        try{
          PreparedStatement atm = conn.prepareStatement(query);
          ResultSet rs = atm.executeQuery();
          while (rs.next()){
              monhoclai.add(new DIEM(rs.getString(1),rs.getString(2),rs.getString(3),rs.getFloat(4),rs.getFloat(5),rs.getFloat(6),rs.getBoolean(7)));
          }
      }
      catch(Exception e){
          e.printStackTrace();
      };
      return monhoclai;
    }
    
    public DIEM getKiemTraDiemCaoNhat(String MaSV,String MaMon){
        ArrayList<DIEM> monhoclai = new ArrayList<DIEM>();
        String query=" select D.MaSV,D.MaHocKy,D.MaMon,D.DiemChuyenCan,D.DiemGiuaKy,D.DiemKetThuc,D.Flag from  KHOA_HOC as K join SINH_VIEN as S on K.MaKhoaHoc=S.MaKhoaHoc join DIEM as D on S.MaSV = D.MaSV join MON_HOC as M on D.MaMon = M.MaMon where D.MaMon ='"+MaMon+"' and D.MaSV = '"+MaSV+"' ORDER BY  ROUND((((HeSoDCC* DiemChuyenCan + HeSoDGK* DiemGiuaKy)/100*(100- HeSoDKT))+HeSoDKT*DiemKetThuc)/100,2) DESC ";
        
        try{
          PreparedStatement atm = conn.prepareStatement(query);
          ResultSet rs = atm.executeQuery();
          while (rs.next()){
              monhoclai.add(new DIEM(rs.getString(1),rs.getString(2),rs.getString(3),rs.getFloat(4),rs.getFloat(5),rs.getFloat(6),rs.getBoolean(7)));
          }
      }
      catch(Exception e){
          e.printStackTrace();
      };
      return monhoclai.get(0);
    } 
    
    public ArrayList<DIEM> getMonHocNangDiem(String MaSV){
        ArrayList<DIEM> monhoclai= new ArrayList<DIEM>();
        String query="select D.MaSV,'0',D.MaMon,0,0,0,0 from  KHOA_HOC as K join SINH_VIEN as S on K.MaKhoaHoc=S.MaKhoaHoc join DIEM as D on S.MaSV = D.MaSV join MON_HOC as M on D.MaMon = M.MaMon where D.MaSV='"+MaSV+"' and ROUND((((HeSoDCC* DiemChuyenCan + HeSoDGK* DiemGiuaKy)/100*(100- HeSoDKT))+HeSoDKT*DiemKetThuc)/100,2) < 5.0 and ROUND((((HeSoDCC* DiemChuyenCan + HeSoDGK* DiemGiuaKy)/100*(100- HeSoDKT))+HeSoDKT*DiemKetThuc)/100,2) >= 4.0 group by D.MaSV,D.MaMon";
        try{
          PreparedStatement atm = conn.prepareStatement(query);
          ResultSet rs = atm.executeQuery();
          while (rs.next()){
              monhoclai.add(new DIEM(rs.getString(1),rs.getString(2),rs.getString(3),rs.getFloat(4),rs.getFloat(5),rs.getFloat(6),rs.getBoolean(7)));
          }
      }
      catch(Exception e){
          e.printStackTrace();
      };
      return monhoclai;
    }
}

  