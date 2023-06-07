/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Admin
 */
public class CHUONG_TRINH_KHUNG {
    private String MaMon;
    private String MaNganh;
    private int HocKy;
    private boolean Flag;

    public String getMaMon() {
        return MaMon;
    }

    public void setMaMon(String MaMon) {
        this.MaMon = MaMon;
    }

    public String getMaNganh() {
        return MaNganh;
    }

    public void setMaNganh(String MaNganh) {
        this.MaNganh = MaNganh;
    }

    public int getHocKy() {
        return HocKy;
    }

    public void setHocKy(int HocKy) {
        this.HocKy = HocKy;
    }

    public boolean isFlag() {
        return Flag;
    }

    public void setFlag(boolean Flag) {
        this.Flag = Flag;
    }

    public CHUONG_TRINH_KHUNG() {
    }

    public CHUONG_TRINH_KHUNG(String MaMon, String MaNganh, int HocKy, boolean Flag) {
        this.MaMon = MaMon;
        this.MaNganh = MaNganh;
        this.HocKy = HocKy;
        this.Flag = Flag;
    }
    
}
