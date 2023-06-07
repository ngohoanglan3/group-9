/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Admin
 */
public class THONG_BAO {
    private String MaThongBao;
    private String TieuDe;
    private String LinkNoiDung;
    private boolean Flag;

    public String getMaThongBao() {
        return MaThongBao;
    }

    public void setMaThongBao(String MaThongBao) {
        this.MaThongBao = MaThongBao;
    }

    public String getTieuDe() {
        return TieuDe;
    }

    public void setTieuDe(String TieuDe) {
        this.TieuDe = TieuDe;
    }

    public String getLinkNoiDung() {
        return LinkNoiDung;
    }

    public void setLinkNoiDung(String LinkNoiDung) {
        this.LinkNoiDung = LinkNoiDung;
    }

    public boolean isFlag() {
        return Flag;
    }

    public void setFlag(boolean Flag) {
        this.Flag = Flag;
    }

    public THONG_BAO(String MaThongBao, String TieuDe, String LinkNoiDung, boolean Flag) {
        this.MaThongBao = MaThongBao;
        this.TieuDe = TieuDe;
        this.LinkNoiDung = LinkNoiDung;
        this.Flag = Flag;
    }

    public THONG_BAO() {
    }

    public THONG_BAO(String MaThongBao, String TieuDe, String LinkNoiDung) {
        this.MaThongBao = MaThongBao;
        this.TieuDe = TieuDe;
        this.LinkNoiDung = LinkNoiDung;
    }
    
}
