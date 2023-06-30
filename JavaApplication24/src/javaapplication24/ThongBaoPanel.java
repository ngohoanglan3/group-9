/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication24;

import java.awt.Color;

/**
 *
 * @author Admin
 */
public class ThongBaoPanel extends javax.swing.JLabel {
    Boolean flag;
    public ThongBaoPanel(String s){
        super();
        this.flag = false;
        this.setText(s);
        this.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14));
        this.setForeground(new Color(51,51,51));
    };
    public void changeFlag(){
        if (flag == false){flag=true;}
        else flag=false;
    };
    public void ThongBaoPanelMouseEntered() {
    if (this.flag==false)
    super.setForeground(new Color(51,204,255));
    };
    public void ThongBaoPanelMouseExited() {
    if (this.flag==false)
    super.setForeground(new Color(51,51,51));
    };
}
