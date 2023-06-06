/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Admin
 */
public class DIEU_KHIEN {
    private boolean VoHieuHoaSinhVien;

    public DIEU_KHIEN() {
    }

    public DIEU_KHIEN(boolean VoHieuHoaSinhVien) {
        this.VoHieuHoaSinhVien = VoHieuHoaSinhVien;
    }

    public boolean isVoHieuHoaSinhVien() {
        return VoHieuHoaSinhVien;
    }

    public void setVoHieuHoaSinhVien(boolean VoHieuHoaSinhVien) {
        this.VoHieuHoaSinhVien = VoHieuHoaSinhVien;
    }
}
