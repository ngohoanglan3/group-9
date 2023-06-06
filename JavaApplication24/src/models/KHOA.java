/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Admin
 */
public class KHOA {
    private String MaKhoa;
    private String TenKhoa;
    private Boolean Flag;

    public String getMaKhoa() {
        return MaKhoa;
    }

    public String getTenKhoa() {
        return TenKhoa;
    }

    public Boolean getFlag() {
        return Flag;
    }

    public void setMaKhoa(String MaKhoa) {
        this.MaKhoa = MaKhoa;
    }

    public void setTenKhoa(String TenKhoa) {
        this.TenKhoa = TenKhoa;
    }

    public void setFlag(Boolean Flag) {
        this.Flag = Flag;
    }
    
    public KHOA(String MaKhoa){
        
    }
    public KHOA(){
        
    }

    public KHOA(String MaKhoa, String TenKhoa, Boolean Flag) {
        this.MaKhoa = MaKhoa;
        this.TenKhoa = TenKhoa;
        this.Flag = Flag;
    }
    
}
