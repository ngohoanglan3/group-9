/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Admin
 */
public class HOC_KY {
    private String MaHocKy;
    private String Nam;
    private int SoThuTu;
    private boolean Flag;

    public HOC_KY() {
    }

    public HOC_KY(String MaHocKy, String Nam, int SoThuTu, boolean Flag) {
        this.MaHocKy = MaHocKy;
        this.Nam = Nam;
        this.SoThuTu = SoThuTu;
        this.Flag = Flag;
    }

    public String getMaHocKy() {
        return MaHocKy;
    }

    public void setMaHocKy(String MaHocKy) {
        this.MaHocKy = MaHocKy;
    }

    public String getNam() {
        return Nam;
    }

    public void setNam(String Nam) {
        this.Nam = Nam;
    }

    public int getSoThuTu() {
        return SoThuTu;
    }

    public void setSoThuTu(int SoThuTu) {
        this.SoThuTu = SoThuTu;
    }

    public boolean isFlag() {
        return Flag;
    }

    public void setFlag(boolean Flag) {
        this.Flag = Flag;
    }
    
}
