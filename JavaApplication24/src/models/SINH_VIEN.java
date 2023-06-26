/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Admin
 */

        
public class SINH_VIEN {

    public SINH_VIEN(String MaSV, String MatKhau, String Ho, String Ten, String CCCD, String Email, String SDT, String NgaySinh, Boolean GioiTinh, String NoiSinh, String HoKhauThuongTru, String DanToc, String MaKhoaHoc, String MaLop, String MaNganh, String MaBac, String MaLoaiHinhDaoTao, Boolean Flag) {
        this.MaSV = MaSV;
        this.MatKhau = MatKhau;
        this.Ho = Ho;
        this.Ten = Ten;
        this.CCCD = CCCD;
        this.Email = Email;
        this.SDT = SDT;
        this.NgaySinh = NgaySinh;
        this.GioiTinh = GioiTinh;
        this.NoiSinh = NoiSinh;
        this.HoKhauThuongTru = HoKhauThuongTru;
        this.DanToc = DanToc;
        this.MaKhoaHoc = MaKhoaHoc;
        this.MaLop = MaLop;
        this.MaNganh = MaNganh;
        this.MaBac = MaBac;
        this.MaLoaiHinhDaoTao = MaLoaiHinhDaoTao;
        this.Flag = Flag;
    }
    private String MaSV;
    private String MatKhau;
    private String Ho;
    private String Ten;
    private String CCCD;
    private String Email;
    private String SDT;
    private String NgaySinh;
    private Boolean GioiTinh;
    private String NoiSinh;
    private String HoKhauThuongTru;
    private String  DanToc;
    private String  MaKhoaHoc;
    private String  MaLop;
    private String  MaNganh;
    private String  MaBac;
    private String  MaLoaiHinhDaoTao;
    private Boolean  Flag;

    public String getMaSV() {
        return MaSV;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public String getHo() {
        return Ho;
    }

    public String getTen() {
        return Ten;
    }

    public String getCCCD() {
        return CCCD;
    }

    public String getEmail() {
        return Email;
    }

    public String getSDT() {
        return SDT;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public Boolean getGioiTinh() {
        return GioiTinh;
    }

    public String getNoiSinh() {
        return NoiSinh;
    }

    public String getHoKhauThuongTru() {
        return HoKhauThuongTru;
    }

    public String getDanToc() {
        return DanToc;
    }

    public String getMaKhoaHoc() {
        return MaKhoaHoc;
    }

    public String getMaLop() {
        return MaLop;
    }

    public String getMaNganh() {
        return MaNganh;
    }

    public String getMaBac() {
        return MaBac;
    }

    public String getMaLoaiHinhDaoTao() {
        return MaLoaiHinhDaoTao;
    }

    public Boolean getFlag() {
        return Flag;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public void setHo(String Ho) {
        this.Ho = Ho;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public void setGioiTinh(Boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public void setNoiSinh(String NoiSinh) {
        this.NoiSinh = NoiSinh;
    }

    public void setHoKhauThuongTru(String HoKhauThuongTru) {
        this.HoKhauThuongTru = HoKhauThuongTru;
    }

    public void setDanToc(String DanToc) {
        this.DanToc = DanToc;
    }

    public void setMaKhoaHoc(String MaKhoaHoc) {
        this.MaKhoaHoc = MaKhoaHoc;
    }

    public void setMaLop(String MaLop) {
        this.MaLop = MaLop;
    }

    public void setMaNganh(String MaNganh) {
        this.MaNganh = MaNganh;
    }

    public void setMaBac(String MaBac) {
        this.MaBac = MaBac;
    }

    public void setMaLoaiHinhDaoTao(String MaLoaiHinhDaoTao) {
        this.MaLoaiHinhDaoTao = MaLoaiHinhDaoTao;
    }

    public void setFlag(Boolean Flag) {
        this.Flag = Flag;
    }
    
    public SINH_VIEN(String MaSV, String MatKhau){
        this.MaSV = MaSV;
        this.MatKhau = MatKhau;
        
    }
    public SINH_VIEN(){

    }
    
}
