/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication24;

/**
 *
 * @author Admin
 */
class KHOA_HOC{
    private String MaKhoaHoc;
    private String HeSoDCC;
    private String HeSoDGK;
    private String HeSoDKT;
    private Boolean Flag;

    public String getMaKhoaHoc() {
        return MaKhoaHoc;
    }

    public String getHeSoDCC() {
        return HeSoDCC;
    }

    public String getHeSoDGK() {
        return HeSoDGK;
    }

    public String getHeSoDKT() {
        return HeSoDKT;
    }

    public Boolean getFlag() {
        return Flag;
    }
    
    public void setMaKhoaHoc(String MaKhoaHoc) {
        this.MaKhoaHoc = MaKhoaHoc;
    }

    public void setHeSoDCC(String HeSoDCC) {
        this.HeSoDCC = HeSoDCC;
    }

    public void setHeSoDGK(String HeSoDGK) {
        this.HeSoDGK = HeSoDGK;
    }

    public void setHeSoDKT(String HeSoDKT) {
        this.HeSoDKT = HeSoDKT;
    }

    public void setFlag(Boolean Flag) {
        this.Flag = Flag;
    }
    
    KHOA_HOC(String MaKhoaHoc){
        
    }

}

class LOP{
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
    
    LOP(String MaLop){
        
    }
}


class NGANH{
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
    
    NGANH(String MaNganh){
        
    }
};

class KHOA{
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
    
    KHOA(String MaKhoa){
        
    }
}; 
       
class BAC_DAO_TAO{
    private String MaBac;
    private String TenBac;
    private Boolean Flag;

    public String getMaBac() {
        return MaBac;
    }

    public String getTenBac() {
        return TenBac;
    }

    public Boolean getFlag() {
        return Flag;
    }

    public void setMaBac(String MaBac) {
        this.MaBac = MaBac;
    }

    public void setTenBac(String TenBac) {
        this.TenBac = TenBac;
    }

    public void setFlag(Boolean Flag) {
        this.Flag = Flag;
    }
    
};

class LOAI_HINH_DAO_TAO{
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
    LOAI_HINH_DAO_TAO(String MaLoaiHinhDaoTao){
    }
};
        
public class SINH_VIEN {
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

    SINH_VIEN(String MaSV, String MatKhau){

    }

    public SINH_VIEN(String MaSV, String MatKhau, String Ho, String Ten, String CCCD, String Email, String SDT, String NgaySinh, Boolean GioiTinh, String NoiSinh, String HoKhauThuongTru, String DanToc, String MaKhoaHoc, String MaLop, String MaNganh, String MaBac, String MaLoaiHinhDaoTao) {
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
    }
    
}