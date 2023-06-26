/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Admin
 */
public class KHOA_HOC {
    private String MaKhoaHoc;
    private int HeSoDCC;
    private int HeSoDGK;
    private int HeSoDKT;
    private Boolean Flag;

    public String getMaKhoaHoc() {
        return MaKhoaHoc;
    }

    public int getHeSoDCC() {
        return HeSoDCC;
    }

    public int getHeSoDGK() {
        return HeSoDGK;
    }

    public int getHeSoDKT() {
        return HeSoDKT;
    }

    public Boolean getFlag() {
        return Flag;
    }
    
    public void setMaKhoaHoc(String MaKhoaHoc) {
        this.MaKhoaHoc = MaKhoaHoc;
    }

    public void setHeSoDCC(int HeSoDCC) {
        this.HeSoDCC = HeSoDCC;
    }

    public void setHeSoDGK(int HeSoDGK) {
        this.HeSoDGK = HeSoDGK;
    }

    public void setHeSoDKT(int HeSoDKT) {
        this.HeSoDKT = HeSoDKT;
    }

    public void setFlag(Boolean Flag) {
        this.Flag = Flag;
    }
    
    public KHOA_HOC(String MaKhoaHoc){
        
    }
    public KHOA_HOC(){
        
    }

    public KHOA_HOC(String MaKhoaHoc, int HeSoDCC, int HeSoDGK, int HeSoDKT, Boolean Flag) {
        this.MaKhoaHoc = MaKhoaHoc;
        this.HeSoDCC = HeSoDCC;
        this.HeSoDGK = HeSoDGK;
        this.HeSoDKT = HeSoDKT;
        this.Flag = Flag;
    }
    
}
