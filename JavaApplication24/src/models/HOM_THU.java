/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Admin
 */
public class HOM_THU {
    private String MaThu;
    private String TieuDe;
    private String NoiDung;
    private String MaSV;
    private boolean Flag;

    public String getMaThu() {
        return MaThu;
    }

    public void setMaThu(String MaThu) {
        this.MaThu = MaThu;
    }

    public String getTieuDe() {
        return TieuDe;
    }

    public void setTieuDe(String TieuDe) {
        this.TieuDe = TieuDe;
    }

    public String getNoiDung() {
        return NoiDung;
    }

    public void setNoiDung(String NoiDung) {
        this.NoiDung = NoiDung;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public boolean isFlag() {
        return Flag;
    }

    public void setFlag(boolean Flag) {
        this.Flag = Flag;
    }

    public HOM_THU() {
    }

    public HOM_THU(String MaThu, String TieuDe, String NoiDung, String MaSV, boolean Flag) {
        this.MaThu = MaThu;
        this.TieuDe = TieuDe;
        this.NoiDung = NoiDung;
        this.MaSV = MaSV;
        this.Flag = Flag;
    }
    
}
