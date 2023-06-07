/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Admin
 */
public class MON_HOC {
    private String MaMon ;
    private String TenMon;
    private int SoTinChi;
    private int SoTiet;
    private boolean BatBuoc ;
    private boolean TuChon ;
    private String TienQuyet;
    private String SongHanh;
    private boolean Flag;

    public MON_HOC() {
    }

    public MON_HOC(String MaMon, String TenMon, int SoTinChi, int SoTiet, boolean BatBuoc, boolean TuChon, String TienQuyet, String SongHanh, boolean Flag) {
        this.MaMon = MaMon;
        this.TenMon = TenMon;
        this.SoTinChi = SoTinChi;
        this.SoTiet = SoTiet;
        this.BatBuoc = BatBuoc;
        this.TuChon = TuChon;
        this.TienQuyet = TienQuyet;
        this.SongHanh = SongHanh;
        this.Flag = Flag;
    }

    public String getMaMon() {
        return MaMon;
    }

    public void setMaMon(String MaMon) {
        this.MaMon = MaMon;
    }

    public String getTenMon() {
        return TenMon;
    }

    public void setTenMon(String TenMon) {
        this.TenMon = TenMon;
    }

    public int getSoTinChi() {
        return SoTinChi;
    }

    public void setSoTinChi(int SoTinChi) {
        this.SoTinChi = SoTinChi;
    }

    public int getSoTiet() {
        return SoTiet;
    }

    public void setSoTiet(int SoTiet) {
        this.SoTiet = SoTiet;
    }

    public boolean isBatBuoc() {
        return BatBuoc;
    }

    public void setBatBuoc(boolean BatBuoc) {
        this.BatBuoc = BatBuoc;
    }

    public boolean isTuChon() {
        return TuChon;
    }

    public void setTuChon(boolean TuChon) {
        this.TuChon = TuChon;
    }

    public String getTienQuyet() {
        return TienQuyet;
    }

    public void setTienQuyet(String TienQuyet) {
        this.TienQuyet = TienQuyet;
    }

    public String getSongHanh() {
        return SongHanh;
    }

    public void setSongHanh(String SongHanh) {
        this.SongHanh = SongHanh;
    }

    public boolean isFlag() {
        return Flag;
    }

    public void setFlag(boolean Flag) {
        this.Flag = Flag;
    }
    
}
