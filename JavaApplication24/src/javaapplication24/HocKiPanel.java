/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication24;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JPanel;
import models.DIEM;
import models.MON_HOC;

/**
 *
 * @author Admin
 */
public class HocKiPanel extends javax.swing.JPanel {
    javax.swing.JLabel t;
    boolean flag;
    public ArrayList<DIEM> Diem;
    public ArrayList<MON_HOC> MonHoc;
    public HocKiPanel(String s){
        super();
        this.flag = false;
        this.t = new javax.swing.JLabel();
        t.setText(s);
        t.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11));
        t.setForeground(Color.white);
        super.add(t);
        super.setBackground(new Color(0, 150, 150));
    };
    public void setDiem(ArrayList<DIEM> Diem){
        this.Diem = Diem;
    }
    
    public void setMonHoc(ArrayList<MON_HOC> MonHoc){
        this.MonHoc = MonHoc;
    }
    
    public void changeFlag(){
        if (flag == false){flag=true;}
        else flag=false;
    };
    public void changeColor(JPanel hover, Color rand) {
        hover.setBackground(rand);
    }
    public void addTextLabel(String s){
        t.setText(s);
    };
    public void HocKiPanelMouseEntered() {
        if (this.flag==false)
    super.setBackground(new Color(0, 200, 200));
    };
    public void HocKiPanelMouseExited() {
    if (this.flag==false)
    super.setBackground(new Color(0, 150, 150));
    };
}
