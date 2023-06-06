/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Admin
 */
public class LOP {
    private String MaLop;
    private String TenLop;
    private String MaKhoa;
    private String MaKhoaHoc;
    private Boolean Flag;

    public String getMaLop() {
        return MaLop;
    }

    public String getTenLop() {
        return TenLop;
    }

    public String getMaKhoa() {
        return MaKhoa;
    }

    public String getMaKhoaHoc() {
        return MaKhoaHoc;
    }

    public Boolean getFlag() {
        return Flag;
    }

    public void setMaLop(String MaLop) {
        this.MaLop = MaLop;
    }

    public void setTenLop(String TenLop) {
        this.TenLop = TenLop;
    }

    public void setMaKhoa(String MaKhoa) {
        this.MaKhoa = MaKhoa;
    }

    public void setMaKhoaHoc(String MaKhoaHoc) {
        this.MaKhoaHoc = MaKhoaHoc;
    }

    public void setFlag(Boolean Flag) {
        this.Flag = Flag;
    }
    
    public LOP(String MaLop){
        
    }
    public LOP(){
        
    }

    public LOP(String MaLop, String TenLop, String MaKhoa, String MaKhoaHoc, Boolean Flag) {
        this.MaLop = MaLop;
        this.TenLop = TenLop;
        this.MaKhoa = MaKhoa;
        this.MaKhoaHoc = MaKhoaHoc;
        this.Flag = Flag;
    }
    
}
