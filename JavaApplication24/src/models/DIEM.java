/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Admin
 */
public class DIEM {
    private String MaSV;
    private String MaHocKy;
    private String MaMon;
    private float DiemChuyenCan;
    private float DiemGiuaKy ;
    private float DiemKetThuc ;
    private boolean Flag;

    public DIEM() {
    }

    public DIEM(String MaSV, String MaHocKy, String MaMon, float DiemChuyenCan, float DiemGiuaKy, float DiemKetThuc, boolean Flag) {
        this.MaSV = MaSV;
        this.MaHocKy = MaHocKy;
        this.MaMon = MaMon;
        this.DiemChuyenCan = DiemChuyenCan;
        this.DiemGiuaKy = DiemGiuaKy;
        this.DiemKetThuc = DiemKetThuc;
        this.Flag = Flag;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getMaHocKy() {
        return MaHocKy;
    }

    public void setMaHocKy(String MaHocKy) {
        this.MaHocKy = MaHocKy;
    }

    public String getMaMon() {
        return MaMon;
    }

    public void setMaMon(String MaMon) {
        this.MaMon = MaMon;
    }

    public float getDiemChuyenCan() {
        return DiemChuyenCan;
    }

    public void setDiemChuyenCan(float DiemChuyenCan) {
        this.DiemChuyenCan = DiemChuyenCan;
    }

    public float getDiemGiuaKy() {
        return DiemGiuaKy;
    }

    public void setDiemGiuaKy(float DiemGiuaKy) {
        this.DiemGiuaKy = DiemGiuaKy;
    }

    public float getDiemKetThuc() {
        return DiemKetThuc;
    }

    public void setDiemKetThuc(float DiemKetThuc) {
        this.DiemKetThuc = DiemKetThuc;
    }

    public boolean isFlag() {
        return Flag;
    }

    public void setFlag(boolean Flag) {
        this.Flag = Flag;
    }
    
}
