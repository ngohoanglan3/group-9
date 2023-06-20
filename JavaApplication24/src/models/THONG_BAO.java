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
    private int MaThongBao;
    private String TieuDe;
    private boolean Flag;

    public int getMaThongBao() {
        return MaThongBao;
    }

    public void setMaThongBao(int MaThongBao) {
        this.MaThongBao = MaThongBao;
    }

    public String getTieuDe() {
        return TieuDe;
    }

    public void setTieuDe(String TieuDe) {
        this.TieuDe = TieuDe;
    }

    public boolean isFlag() {
        return Flag;
    }

    public void setFlag(boolean Flag) {
        this.Flag = Flag;
    }

    public THONG_BAO(int MaThongBao, String TieuDe, boolean Flag) {
        this.MaThongBao = MaThongBao;
        this.TieuDe = TieuDe;
        this.Flag = Flag;
    }

    public THONG_BAO() {
    }

    
}
