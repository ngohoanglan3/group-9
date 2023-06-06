/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Admin
 */
public class NGANH {
    private String MaNganh;
    private String TenNganh;
    private String MaKhoa;
    private Boolean Flag;

    public String getMaNganh() {
        return MaNganh;
    }

    public String getTenNganh() {
        return TenNganh;
    }

    public String getMaKhoa() {
        return MaKhoa;
    }

    public Boolean getFlag() {
        return Flag;
    }

    public void setMaNganh(String MaNganh) {
        this.MaNganh = MaNganh;
    }

    public void setTenNganh(String TenNganh) {
        this.TenNganh = TenNganh;
    }

    public void setMaKhoa(String MaKhoa) {
        this.MaKhoa = MaKhoa;
    }

    public void setFlag(Boolean Flag) {
        this.Flag = Flag;
    }
    
    public NGANH(String MaNganh){
        
    }
    public NGANH(){
        
    }

    public NGANH(String MaNganh, String TenNganh, String MaKhoa, Boolean Flag) {
        this.MaNganh = MaNganh;
        this.TenNganh = TenNganh;
        this.MaKhoa = MaKhoa;
        this.Flag = Flag;
    }
    
}
