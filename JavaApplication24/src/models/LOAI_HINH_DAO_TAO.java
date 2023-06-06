/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Admin
 */
public class LOAI_HINH_DAO_TAO {
    private String MaLoaiHinhDaoTao;
    private String TenLoaiHinhDaoTao;
    private Boolean Flag;

    public String getMaLoaiHinhDaoTao() {
        return MaLoaiHinhDaoTao;
    }

    public String getTenLoaiHinhDaoTao() {
        return TenLoaiHinhDaoTao;
    }

    public Boolean getFlag() {
        return Flag;
    }

    public void setMaLoaiHinhDaoTao(String MaLoaiHinhDaoTao) {
        this.MaLoaiHinhDaoTao = MaLoaiHinhDaoTao;
    }

    public void setTenLoaiHinhDaoTao(String TenLoaiHinhDaoTao) {
        this.TenLoaiHinhDaoTao = TenLoaiHinhDaoTao;
    }

    public void setFlag(Boolean Flag) {
        this.Flag = Flag;
    }
    public LOAI_HINH_DAO_TAO(String MaLoaiHinhDaoTao){
    }
    public LOAI_HINH_DAO_TAO(){
    }

    public LOAI_HINH_DAO_TAO(String MaLoaiHinhDaoTao, String TenLoaiHinhDaoTao, Boolean Flag) {
        this.MaLoaiHinhDaoTao = MaLoaiHinhDaoTao;
        this.TenLoaiHinhDaoTao = TenLoaiHinhDaoTao;
        this.Flag = Flag;
    }
    
}
