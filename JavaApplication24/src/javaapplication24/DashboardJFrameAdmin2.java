package javaapplication24;

import database.DIEU_KHIEN_DAO;
import database.HOC_KY_DAO;
import database.MON_HOC_DAO;
import database.SINH_VIEN_DAO;
import java.awt.*;
import java.io.File;
import java.nio.file.spi.FileTypeDetector;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.table.DefaultTableCellRenderer;
import models.HOC_KY;
import models.MON_HOC;
import models.SINH_VIEN;

public class DashboardJFrameAdmin2 extends javax.swing.JFrame {
    private int x;
    private int y;
    public DashboardJFrameAdmin2() {
        initComponents();    
        
        /// KHAI BAO
        /// KHAI BAO SINH VIEN
        if (new DIEU_KHIEN_DAO().getVoHieuHoa().isVoHieuHoaSinhVien()==true){
            jLabel14.setText("CHẾ ĐỘ BẢO TRÌ");
        }
        else {jLabel14.setText("DỪNG CHẾ ĐỘ BẢO TRÌ");
                roundPanel14.setBackground(new Color(255,102,102));
        }
        
        table2.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = table2.rowAtPoint(evt.getPoint());
                int col = table2.columnAtPoint(evt.getPoint());
                if (row >= 0 && col >= 0) {

                    roundPanel11.setVisible(true);
                    roundPanel12.setVisible(true);
                    roundPanel13.setVisible(true);
                    String ma = table2.getValueAt(row, 0).toString();
                    for (int i = 0; i<table2.getRowCount();i++)
                        if(String.valueOf(table2.getValueAt(i, 0)).equals(ma)){
                                jTextField2.setText(ma);
                                jTextField2.setEnabled(false);
                                jTextField4.setText(String.valueOf(table2.getValueAt(i, 3)));
                                roundPanel10.setVisible(false);
                                if(new SINH_VIEN_DAO().getThongTin(ma, String.valueOf(table2.getValueAt(i, 3))).getFlag().equals(false)){
                                jLabel13.setText("MỞ KHÓA");
                                }
                                else jLabel13.setText("VÔ HIỆU");
                                break;
                            }
                        else{
                                jTextField2.setText("");
                                jTextField4.setText("");
                        }

                }
            }
        });
        
        table3.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = table3.rowAtPoint(evt.getPoint());
                int col = table3.columnAtPoint(evt.getPoint());
                if (row >= 0 && col >= 0) {

                    roundPanel23.setVisible(true);
                    roundPanel24.setVisible(true);
                    String ma = table3.getValueAt(row, 0).toString();
                    for (int i = 0; i<table3.getRowCount();i++)
                        if(String.valueOf(table3.getValueAt(i, 0)).equals(ma)){
                                jTextField6.setText(ma);
                                jTextField6.setEnabled(false);
                                jTextField7.setText(String.valueOf(table3.getValueAt(i, 1)));
                                jTextField8.setText(String.valueOf(table3.getValueAt(i, 2)));
                                roundPanel22.setVisible(false);
                                break;
                            }
                        else{
                                jTextField6.setText("");
                                jTextField7.setText("");
                                jTextField8.setText("");
                        }

                }
            }
        });
        
        table4.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                int row = table4.rowAtPoint(evt.getPoint());
                int col = table4.columnAtPoint(evt.getPoint());
                if (row >= 0 && col >= 0) {
        String ma = table4.getValueAt(row, 0).toString();
        for (int i = 0; i<table4.getRowCount();i++)
            if(String.valueOf(table4.getValueAt(i, 0)).equals(ma)){
                    roundPanel35.setVisible(true);
                    roundPanel36.setVisible(true);
                    jTextField10.setText(ma);
                    jTextField10.setEnabled(false);
                    jTextField11.setText(String.valueOf(table4.getValueAt(i, 1)));
                    jTextField12.setText(String.valueOf(new MON_HOC_DAO().getThongTin(ma).getSoTinChi()));
                    jTextField13.setText(String.valueOf(new MON_HOC_DAO().getThongTin(ma).getSoTiet()));
                    if(String.valueOf(new MON_HOC_DAO().getThongTin(ma).getTienQuyet()).equals("null")||String.valueOf(new MON_HOC_DAO().getThongTin(ma).getTienQuyet()).equals("0"))
                        jTextField14.setText("");
                    else jTextField14.setText(String.valueOf(new MON_HOC_DAO().getThongTin(ma).getTienQuyet()));
                    if(String.valueOf(new MON_HOC_DAO().getThongTin(ma).getSongHanh()).equals("null")||String.valueOf(new MON_HOC_DAO().getThongTin(ma).getSongHanh()).equals("0"))
                        jTextField15.setText("");
                    else jTextField15.setText(String.valueOf(new MON_HOC_DAO().getThongTin(ma).getSongHanh()));
                    if(new MON_HOC_DAO().getThongTin(ma).isBatBuoc()==true){
                        jCheckBoxCustom1.setSelected(true);
                        //jCheckBoxCustom2.setSelected(false);
                    }
                    else{
                        //jCheckBoxCustom2.setSelected(true);
                        jCheckBoxCustom1.setSelected(false);
                    }
                    
                    roundPanel34.setVisible(false);
                    break;
                }
            else{ 
                    jTextField10.setText("");
                    jTextField11.setText("");
                    jTextField12.setText("");
                    jTextField13.setText("");
                    jTextField14.setText("");
                    jTextField15.setText("");
                    roundPanel34.setVisible(true);
                    roundPanel35.setVisible(false);
                    roundPanel36.setVisible(false);
                    jTextField10.setEnabled(true);
            }
                }
            }
        });
        
        
        lam_moi_sinh_vien();
        lam_moi_hoc_ky();
        lam_moi_mon_hoc();
        ///KHAI BAO
        ////////
        
        getContentPane().setBackground(new Color(255, 255, 255));
        java.util.List<String> items1 = new ArrayList<>();
        items1.add("HỌC KỲ");
        items1.add("MÔN HỌC");
        multipleButton1.setItems(items1);
        multipleButton1.setEvent(new EventItemSelected() {
            @Override
            public void selected(int index) {
                if(index == 0) {
                    multipleButton1.setVisible(false);
                    roundPanel16.setVisible(true);
                }
                if(index == 1) {
                    multipleButton1.setVisible(false);
                    roundPanel25.setVisible(true);
                }
            }
        });
        
        getContentPane().setBackground(new Color(255, 255, 255));
        java.util.List<String> items2 = new ArrayList<>();
        items2.add("KHOA");
        items2.add("NGÀNH");
        items2.add("KHÓA");
        items2.add("LỚP");
        multipleButton2.setItems(items2);
        multipleButton2.setEvent(new EventItemSelected() {
            @Override
            public void selected(int index) {
                switch (index) {
                    case 0 -> {
                        multipleButton2.setVisible(false);
                        roundPanel1.setVisible(true);
                    }
                    case 1 -> {
                        multipleButton2.setVisible(false);
                        roundPanel2.setVisible(true);
                    }
                    case 2 -> {
                        multipleButton2.setVisible(false);
                        roundPanel3.setVisible(true);
                    }
                    case 3-> {
                        multipleButton2.setVisible(false);
                        roundPanel40.setVisible(true);
                    }
                    default -> {
                    }
                }
            }
        });
        
        NoScalingIcon icon1 = new NoScalingIcon(new ImageIcon(getClass().getResource("/folder/upload.png")));
        jLabel103.setIcon(icon1);
    }
    
    public void changeColor(JPanel hover, Color rand) {
        hover.setBackground(rand);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titlebar = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        materialTabbed1 = new javaapplication24.MaterialTabbed();
        QuanlySinhvien = new javaapplication24.RoundPanel();
        roundPanel4 = new javaapplication24.RoundPanel();
        Title = new javax.swing.JLabel();
        CapNhatTaiKhoanSinhVien = new javaapplication24.RoundPanel();
        roundPanel5 = new javaapplication24.RoundPanel();
        Title1 = new javax.swing.JLabel();
        roundPanel7 = new javaapplication24.RoundPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        roundPanel9 = new javaapplication24.RoundPanel();
        jLabel4 = new javax.swing.JLabel();
        roundPanel8 = new javaapplication24.RoundPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        roundPanel10 = new javaapplication24.RoundPanel();
        jLabel9 = new javax.swing.JLabel();
        roundPanel11 = new javaapplication24.RoundPanel();
        jLabel11 = new javax.swing.JLabel();
        roundPanel12 = new javaapplication24.RoundPanel();
        jLabel12 = new javax.swing.JLabel();
        roundPanel13 = new javaapplication24.RoundPanel();
        jLabel13 = new javax.swing.JLabel();
        roundPanel14 = new javaapplication24.RoundPanel();
        jLabel14 = new javax.swing.JLabel();
        roundPanel6 = new javaapplication24.RoundPanel();
        roundPanel15 = new javaapplication24.RoundPanel();
        jLabel15 = new javax.swing.JLabel();
        scrollPaneWin112 = new javaapplication24.ScrollPaneWin11();
        table2 = new javaapplication24.Table();
        QuanlyHoctap = new javaapplication24.RoundPanel();
        multipleButton1 = new javaapplication24.MultipleButton();
        roundPanel16 = new javaapplication24.RoundPanel();
        roundPanel17 = new javaapplication24.RoundPanel();
        Title2 = new javax.swing.JLabel();
        CapNhatTaiKhoanSinhVien1 = new javaapplication24.RoundPanel();
        roundPanel18 = new javaapplication24.RoundPanel();
        Title3 = new javax.swing.JLabel();
        roundPanel19 = new javaapplication24.RoundPanel();
        jLabel16 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        roundPanel20 = new javaapplication24.RoundPanel();
        jLabel17 = new javax.swing.JLabel();
        roundPanel21 = new javaapplication24.RoundPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        roundPanel22 = new javaapplication24.RoundPanel();
        jLabel22 = new javax.swing.JLabel();
        roundPanel23 = new javaapplication24.RoundPanel();
        jLabel23 = new javax.swing.JLabel();
        roundPanel24 = new javaapplication24.RoundPanel();
        jLabel24 = new javax.swing.JLabel();
        roundPanel26 = new javaapplication24.RoundPanel();
        jLabel26 = new javax.swing.JLabel();
        roundPanel27 = new javaapplication24.RoundPanel();
        roundPanel28 = new javaapplication24.RoundPanel();
        jLabel27 = new javax.swing.JLabel();
        scrollPaneWin113 = new javaapplication24.ScrollPaneWin11();
        table3 = new javaapplication24.Table();
        roundPanel25 = new javaapplication24.RoundPanel();
        roundPanel29 = new javaapplication24.RoundPanel();
        Title4 = new javax.swing.JLabel();
        CapNhatTaiKhoanSinhVien2 = new javaapplication24.RoundPanel();
        roundPanel30 = new javaapplication24.RoundPanel();
        Title5 = new javax.swing.JLabel();
        roundPanel31 = new javaapplication24.RoundPanel();
        jLabel25 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        roundPanel32 = new javaapplication24.RoundPanel();
        jLabel28 = new javax.swing.JLabel();
        roundPanel33 = new javaapplication24.RoundPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jCheckBoxCustom1 = new javaapplication24.JCheckBoxCustom();
        jLabel39 = new javax.swing.JLabel();
        jCheckBoxCustom2 = new javaapplication24.JCheckBoxCustom();
        jLabel41 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        roundPanel34 = new javaapplication24.RoundPanel();
        jLabel33 = new javax.swing.JLabel();
        roundPanel35 = new javaapplication24.RoundPanel();
        jLabel34 = new javax.swing.JLabel();
        roundPanel36 = new javaapplication24.RoundPanel();
        jLabel35 = new javax.swing.JLabel();
        roundPanel37 = new javaapplication24.RoundPanel();
        jLabel36 = new javax.swing.JLabel();
        roundPanel38 = new javaapplication24.RoundPanel();
        roundPanel39 = new javaapplication24.RoundPanel();
        jLabel37 = new javax.swing.JLabel();
        scrollPaneWin114 = new javaapplication24.ScrollPaneWin11();
        table4 = new javaapplication24.Table();
        QuanlyBomon = new javaapplication24.RoundPanel();
        multipleButton2 = new javaapplication24.MultipleButton();
        roundPanel1 = new javaapplication24.RoundPanel();
        roundPanel41 = new javaapplication24.RoundPanel();
        Title6 = new javax.swing.JLabel();
        CapNhatTaiKhoanSinhVien3 = new javaapplication24.RoundPanel();
        roundPanel42 = new javaapplication24.RoundPanel();
        Title7 = new javax.swing.JLabel();
        roundPanel43 = new javaapplication24.RoundPanel();
        jLabel43 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        roundPanel44 = new javaapplication24.RoundPanel();
        jLabel44 = new javax.swing.JLabel();
        roundPanel45 = new javaapplication24.RoundPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        roundPanel46 = new javaapplication24.RoundPanel();
        jLabel65 = new javax.swing.JLabel();
        roundPanel47 = new javaapplication24.RoundPanel();
        jLabel66 = new javax.swing.JLabel();
        roundPanel48 = new javaapplication24.RoundPanel();
        jLabel67 = new javax.swing.JLabel();
        roundPanel49 = new javaapplication24.RoundPanel();
        jLabel68 = new javax.swing.JLabel();
        scrollPaneWin116 = new javaapplication24.ScrollPaneWin11();
        table6 = new javaapplication24.Table();
        roundPanel52 = new javaapplication24.RoundPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        roundPanel53 = new javaapplication24.RoundPanel();
        jLabel70 = new javax.swing.JLabel();
        roundPanel54 = new javaapplication24.RoundPanel();
        jLabel71 = new javax.swing.JLabel();
        roundPanel50 = new javaapplication24.RoundPanel();
        roundPanel51 = new javaapplication24.RoundPanel();
        jLabel69 = new javax.swing.JLabel();
        scrollPaneWin115 = new javaapplication24.ScrollPaneWin11();
        table5 = new javaapplication24.Table();
        roundPanel2 = new javaapplication24.RoundPanel();
        roundPanel55 = new javaapplication24.RoundPanel();
        Title8 = new javax.swing.JLabel();
        CapNhatTaiKhoanSinhVien4 = new javaapplication24.RoundPanel();
        roundPanel56 = new javaapplication24.RoundPanel();
        Title9 = new javax.swing.JLabel();
        roundPanel57 = new javaapplication24.RoundPanel();
        jLabel51 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        roundPanel58 = new javaapplication24.RoundPanel();
        jLabel52 = new javax.swing.JLabel();
        roundPanel59 = new javaapplication24.RoundPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        roundPanel60 = new javaapplication24.RoundPanel();
        jLabel72 = new javax.swing.JLabel();
        roundPanel61 = new javaapplication24.RoundPanel();
        jLabel73 = new javax.swing.JLabel();
        roundPanel62 = new javaapplication24.RoundPanel();
        jLabel74 = new javax.swing.JLabel();
        roundPanel63 = new javaapplication24.RoundPanel();
        jLabel75 = new javax.swing.JLabel();
        scrollPaneWin117 = new javaapplication24.ScrollPaneWin11();
        table7 = new javaapplication24.Table();
        roundPanel64 = new javaapplication24.RoundPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        roundPanel65 = new javaapplication24.RoundPanel();
        jLabel76 = new javax.swing.JLabel();
        roundPanel66 = new javaapplication24.RoundPanel();
        jLabel77 = new javax.swing.JLabel();
        roundPanel67 = new javaapplication24.RoundPanel();
        roundPanel68 = new javaapplication24.RoundPanel();
        jLabel78 = new javax.swing.JLabel();
        scrollPaneWin119 = new javaapplication24.ScrollPaneWin11();
        table8 = new javaapplication24.Table();
        roundPanel3 = new javaapplication24.RoundPanel();
        roundPanel80 = new javaapplication24.RoundPanel();
        Title12 = new javax.swing.JLabel();
        CapNhatTaiKhoanSinhVien6 = new javaapplication24.RoundPanel();
        roundPanel81 = new javaapplication24.RoundPanel();
        Title13 = new javax.swing.JLabel();
        roundPanel82 = new javaapplication24.RoundPanel();
        jLabel84 = new javax.swing.JLabel();
        jTextField28 = new javax.swing.JTextField();
        roundPanel83 = new javaapplication24.RoundPanel();
        jLabel85 = new javax.swing.JLabel();
        roundPanel84 = new javaapplication24.RoundPanel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jTextField29 = new javax.swing.JTextField();
        jLabel88 = new javax.swing.JLabel();
        jTextField30 = new javax.swing.JTextField();
        jLabel89 = new javax.swing.JLabel();
        jTextField31 = new javax.swing.JTextField();
        roundPanel85 = new javaapplication24.RoundPanel();
        jLabel90 = new javax.swing.JLabel();
        roundPanel86 = new javaapplication24.RoundPanel();
        jLabel91 = new javax.swing.JLabel();
        roundPanel87 = new javaapplication24.RoundPanel();
        jLabel92 = new javax.swing.JLabel();
        roundPanel88 = new javaapplication24.RoundPanel();
        jLabel93 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jTextField32 = new javax.swing.JTextField();
        roundPanel89 = new javaapplication24.RoundPanel();
        roundPanel90 = new javaapplication24.RoundPanel();
        jLabel94 = new javax.swing.JLabel();
        scrollPaneWin121 = new javaapplication24.ScrollPaneWin11();
        table10 = new javaapplication24.Table();
        roundPanel40 = new javaapplication24.RoundPanel();
        roundPanel69 = new javaapplication24.RoundPanel();
        Title10 = new javax.swing.JLabel();
        CapNhatTaiKhoanSinhVien5 = new javaapplication24.RoundPanel();
        roundPanel70 = new javaapplication24.RoundPanel();
        Title11 = new javax.swing.JLabel();
        roundPanel71 = new javaapplication24.RoundPanel();
        jLabel59 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        roundPanel72 = new javaapplication24.RoundPanel();
        jLabel60 = new javax.swing.JLabel();
        roundPanel73 = new javaapplication24.RoundPanel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        roundPanel74 = new javaapplication24.RoundPanel();
        jLabel79 = new javax.swing.JLabel();
        roundPanel75 = new javaapplication24.RoundPanel();
        jLabel80 = new javax.swing.JLabel();
        roundPanel76 = new javaapplication24.RoundPanel();
        jLabel81 = new javax.swing.JLabel();
        roundPanel77 = new javaapplication24.RoundPanel();
        jLabel82 = new javax.swing.JLabel();
        scrollPaneWin120 = new javaapplication24.ScrollPaneWin11();
        table9 = new javaapplication24.Table();
        roundPanel78 = new javaapplication24.RoundPanel();
        jLabel83 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jTextField27 = new javax.swing.JTextField();
        roundPanel79 = new javaapplication24.RoundPanel();
        jLabel97 = new javax.swing.JLabel();
        roundPanel91 = new javaapplication24.RoundPanel();
        jLabel98 = new javax.swing.JLabel();
        jTextField33 = new javax.swing.JTextField();
        jLabel107 = new javax.swing.JLabel();
        jTextField34 = new javax.swing.JTextField();
        roundPanel92 = new javaapplication24.RoundPanel();
        roundPanel93 = new javaapplication24.RoundPanel();
        jLabel99 = new javax.swing.JLabel();
        scrollPaneWin123 = new javaapplication24.ScrollPaneWin11();
        table11 = new javaapplication24.Table();
        GuiThongbao = new javaapplication24.RoundPanel();
        roundPanel94 = new javaapplication24.RoundPanel();
        jLabel101 = new javax.swing.JLabel();
        roundPanel95 = new javaapplication24.RoundPanel();
        jLabel102 = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();
        scrollPaneWin122 = new javaapplication24.ScrollPaneWin11();
        jPanel67 = new javax.swing.JPanel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        scrollPaneWin125 = new javaapplication24.ScrollPaneWin11();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel105 = new javax.swing.JLabel();
        roundPanel96 = new javaapplication24.RoundPanel();
        jLabel106 = new javax.swing.JLabel();
        scrollPaneWin124 = new javaapplication24.ScrollPaneWin11();
        jPanel66 = new javax.swing.JPanel();
        Homthu = new javaapplication24.RoundPanel();
        roundPanel97 = new javaapplication24.RoundPanel();
        roundPanel98 = new javaapplication24.RoundPanel();
        jLabel48 = new javax.swing.JLabel();
        scrollPaneWin118 = new javaapplication24.ScrollPaneWin11();
        table12 = new javaapplication24.Table();
        roundPanel99 = new javaapplication24.RoundPanel();
        roundPanel100 = new javaapplication24.RoundPanel();
        jLabel56 = new javax.swing.JLabel();
        scrollPaneWin127 = new javaapplication24.ScrollPaneWin11();
        table14 = new javaapplication24.Table();
        CapNhatTaiKhoanSinhVien7 = new javaapplication24.RoundPanel();
        roundPanel101 = new javaapplication24.RoundPanel();
        Title14 = new javax.swing.JLabel();
        roundPanel102 = new javaapplication24.RoundPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel110 = new javax.swing.JLabel();
        jTextField35 = new javax.swing.JTextField();
        jLabel111 = new javax.swing.JLabel();
        scrollPaneWin111 = new javaapplication24.ScrollPaneWin11();
        jTextArea1 = new javax.swing.JTextArea();
        NhapDiem = new javaapplication24.RoundPanel();
        QuanLyGiangVien = new javaapplication24.RoundPanel();
        jLabel100 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titlebar.setBackground(new java.awt.Color(0, 63, 92));
        Titlebar.setMaximumSize(new java.awt.Dimension(400, 25));
        Titlebar.setMinimumSize(new java.awt.Dimension(400, 25));
        Titlebar.setPreferredSize(new java.awt.Dimension(400, 25));
        Titlebar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                TitlebarformMouseDragged(evt);
            }
        });
        Titlebar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TitlebarformMousePressed(evt);
            }
        });
        Titlebar.setLayout(new java.awt.BorderLayout());

        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(0, 63, 92));
        jPanel6.setMaximumSize(new java.awt.Dimension(25, 25));
        jPanel6.setMinimumSize(new java.awt.Dimension(25, 25));
        jPanel6.setPreferredSize(new java.awt.Dimension(25, 25));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("×");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        jPanel6.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel6, java.awt.BorderLayout.EAST);

        jPanel10.setBackground(new java.awt.Color(0, 63, 92));
        jPanel10.setPreferredSize(new java.awt.Dimension(25, 25));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("—");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        jPanel10.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel5.add(jPanel10, java.awt.BorderLayout.WEST);

        Titlebar.add(jPanel5, java.awt.BorderLayout.EAST);

        jPanel11.setBackground(new java.awt.Color(0, 63, 92));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("QUẢN LÝ ĐIỂM HUCE - ADMIN");
        jLabel10.setPreferredSize(new java.awt.Dimension(1140, 25));
        jPanel11.add(jLabel10, java.awt.BorderLayout.CENTER);

        Titlebar.add(jPanel11, java.awt.BorderLayout.WEST);

        getContentPane().add(Titlebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 25));

        materialTabbed1.setForeground(new java.awt.Color(255, 255, 255));
        materialTabbed1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        QuanlySinhvien.setBackground(new java.awt.Color(255, 255, 255, 80));
        QuanlySinhvien.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        QuanlySinhvien.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel4.setBackground(new Color(0,102,102, 128));
        roundPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Segoe UI Semibold", 0, 30)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("THÔNG TIN TÀI KHOẢN SINH VIÊN");
        roundPanel4.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 24, -1, -1));

        QuanlySinhvien.add(roundPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 925, 80));

        CapNhatTaiKhoanSinhVien.setBackground(new Color(0, 0, 0, 0));
        CapNhatTaiKhoanSinhVien.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel5.setBackground(new Color(0,102,102, 200));
        roundPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        Title1.setForeground(new java.awt.Color(255, 255, 255));
        Title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title1.setText("CẬP NHẬT TÀI KHOẢN SINH VIÊN");
        roundPanel5.add(Title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 16, 370, -1));

        CapNhatTaiKhoanSinhVien.add(roundPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 60));

        roundPanel7.setBackground(new Color(255, 255, 255, 128));
        roundPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nhập MSSV:");
        roundPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, 40));

        jTextField1.setBackground(new Color(255,90,0, 100));
        jTextField1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextField1.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 8, 3, 3));
        roundPanel7.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 120, 40));

        roundPanel9.setBackground(new java.awt.Color(0, 153, 0));
        roundPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roundPanel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel9MouseExited(evt);
            }
        });
        roundPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("LÀM MỚI");
        roundPanel9.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 40));

        roundPanel7.add(roundPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 10, 80, 40));

        roundPanel8.setBackground(new java.awt.Color(0, 153, 0));
        roundPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roundPanel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel8MouseExited(evt);
            }
        });
        roundPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("TÌM");
        roundPanel8.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 55, 40));

        roundPanel7.add(roundPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 10, 55, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("MSSV:");
        roundPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 90, 40));

        jTextField2.setBackground(new Color(255, 255, 255, 180));
        jTextField2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 8, 3, 3));
        roundPanel7.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 210, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("MẬT KHẨU:");
        roundPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 105, 90, 40));

        jTextField4.setBackground(new Color(255, 255, 255, 180));
        jTextField4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextField4.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 8, 3, 3));
        roundPanel7.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 105, 210, 40));

        roundPanel10.setBackground(new java.awt.Color(0, 153, 255));
        roundPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roundPanel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel10MouseExited(evt);
            }
        });
        roundPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("THÊM");
        roundPanel10.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        roundPanel7.add(roundPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 80, 30));

        roundPanel11.setBackground(new java.awt.Color(0, 153, 255));
        roundPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roundPanel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel11MouseExited(evt);
            }
        });
        roundPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("SỬA");
        roundPanel11.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        roundPanel7.add(roundPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 80, 30));

        roundPanel12.setBackground(new java.awt.Color(0, 153, 255));
        roundPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roundPanel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel12MouseExited(evt);
            }
        });
        roundPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("XÓA");
        roundPanel12.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        roundPanel7.add(roundPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 80, 30));

        roundPanel13.setBackground(new java.awt.Color(0, 153, 255));
        roundPanel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roundPanel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel13MouseExited(evt);
            }
        });
        roundPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("VÔ HIỆU");
        roundPanel13.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        roundPanel7.add(roundPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 80, 30));

        roundPanel14.setBackground(new java.awt.Color(252, 3, 28));
        roundPanel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roundPanel14MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel14MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel14MouseExited(evt);
            }
        });
        roundPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("CHẾ ĐỘ BẢO TRÌ");
        roundPanel14.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 30));

        roundPanel7.add(roundPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 140, 30));

        CapNhatTaiKhoanSinhVien.add(roundPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, 370, 290));

        QuanlySinhvien.add(CapNhatTaiKhoanSinhVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 370, 355));

        roundPanel6.setBackground(new Color(0, 0, 0, 0));
        roundPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel15.setBackground(new Color(102, 102, 102, 200));
        roundPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("DANH SÁCH TÀI KHOẢN SINH VIÊN");
        roundPanel15.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 535, 60));

        roundPanel6.add(roundPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 535, 60));

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MSSV", "Họ", "Tên ", "Mật khẩu"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPaneWin112.setViewportView(table2);
        if (table2.getColumnModel().getColumnCount() > 0) {
            table2.getColumnModel().getColumn(0).setResizable(false);
            table2.getColumnModel().getColumn(0).setPreferredWidth(0);
            table2.getColumnModel().getColumn(1).setResizable(false);
            table2.getColumnModel().getColumn(1).setPreferredWidth(40);
            table2.getColumnModel().getColumn(2).setResizable(false);
            table2.getColumnModel().getColumn(2).setPreferredWidth(60);
            table2.getColumnModel().getColumn(3).setResizable(false);
            table2.getColumnModel().getColumn(3).setPreferredWidth(50);
        }

        roundPanel6.add(scrollPaneWin112, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, 535, 290));

        QuanlySinhvien.add(roundPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 535, 355));

        materialTabbed1.addTab("QUẢN LÝ SINH VIÊN", QuanlySinhvien);

        QuanlyHoctap.setBackground(new java.awt.Color(255, 255, 255, 80));
        QuanlyHoctap.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        multipleButton1.setBackground(new java.awt.Color(255, 255, 255));
        multipleButton1.setForeground(new java.awt.Color(255, 255, 255));

        roundPanel16.setBackground(new java.awt.Color(0, 0, 0, 0));
        roundPanel16.setPreferredSize(new java.awt.Dimension(1125, 685));
        roundPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel17.setBackground(new Color(0,102,102, 128));
        roundPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 30)); // NOI18N
        Title2.setForeground(new java.awt.Color(255, 255, 255));
        Title2.setText("QUẢN LÝ HỌC KỲ");
        roundPanel17.add(Title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 19, -1, -1));

        roundPanel16.add(roundPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 925, 80));

        CapNhatTaiKhoanSinhVien1.setBackground(new Color(0, 0, 0, 0));
        CapNhatTaiKhoanSinhVien1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel18.setBackground(new Color(0,102,102, 200));
        roundPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        Title3.setForeground(new java.awt.Color(255, 255, 255));
        Title3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title3.setText("CẬP NHẬT HỌC KỲ");
        roundPanel18.add(Title3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 16, 370, -1));

        CapNhatTaiKhoanSinhVien1.add(roundPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 60));

        roundPanel19.setBackground(new Color(255, 255, 255, 128));
        roundPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel16.setText("Nhập mã:");
        roundPanel19.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, 40));

        jTextField5.setBackground(new Color(255,90,0, 100));
        jTextField5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextField5.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 8, 3, 3));
        roundPanel19.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 120, 40));

        roundPanel20.setBackground(new java.awt.Color(0, 153, 0));
        roundPanel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roundPanel20MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel20MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel20MouseExited(evt);
            }
        });
        roundPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("LÀM MỚI");
        roundPanel20.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 40));

        roundPanel19.add(roundPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 10, 80, 40));

        roundPanel21.setBackground(new java.awt.Color(0, 153, 0));
        roundPanel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roundPanel21MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel21MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel21MouseExited(evt);
            }
        });
        roundPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("TÌM");
        roundPanel21.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 55, 40));

        roundPanel19.add(roundPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 55, 40));

        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Mã học kỳ:");
        roundPanel19.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 90, 40));

        jTextField6.setBackground(new Color(255, 255, 255, 180));
        jTextField6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextField6.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 8, 3, 3));
        roundPanel19.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 210, 40));

        jLabel20.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Năm học:");
        roundPanel19.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 105, 90, 40));

        jTextField7.setBackground(new Color(255, 255, 255, 180));
        jTextField7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextField7.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 8, 3, 3));
        roundPanel19.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 105, 210, 40));

        jLabel21.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Thứ tự:");
        roundPanel19.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 90, 40));

        jTextField8.setBackground(new Color(255, 255, 255, 180));
        jTextField8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextField8.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 8, 3, 3));
        roundPanel19.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 210, 40));

        roundPanel22.setBackground(new java.awt.Color(0, 153, 255));
        roundPanel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roundPanel22MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel22MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel22MouseExited(evt);
            }
        });
        roundPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("THÊM");
        roundPanel22.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        roundPanel19.add(roundPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 80, 30));

        roundPanel23.setBackground(new java.awt.Color(0, 153, 255));
        roundPanel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roundPanel23MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel23MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel23MouseExited(evt);
            }
        });
        roundPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("SỬA");
        roundPanel23.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        roundPanel19.add(roundPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 80, 30));

        roundPanel24.setBackground(new java.awt.Color(0, 153, 255));
        roundPanel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roundPanel24MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel24MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel24MouseExited(evt);
            }
        });
        roundPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("XÓA");
        roundPanel24.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        roundPanel19.add(roundPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 240, 80, 30));

        roundPanel26.setBackground(new java.awt.Color(255, 90, 0));
        roundPanel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roundPanel26MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel26MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel26MouseExited(evt);
            }
        });
        roundPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("QUAY LẠI");
        roundPanel26.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 30));

        roundPanel19.add(roundPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 140, 30));

        CapNhatTaiKhoanSinhVien1.add(roundPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, 370, 290));

        roundPanel16.add(CapNhatTaiKhoanSinhVien1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 370, 355));

        roundPanel27.setBackground(new Color(0, 0, 0, 0));
        roundPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel28.setBackground(new Color(102, 102, 102, 200));
        roundPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("DANH SÁCH HỌC KỲ");
        roundPanel28.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 535, 60));

        roundPanel27.add(roundPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 535, 60));

        table3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã học kỳ", "Năm học", "Thứ tự"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPaneWin113.setViewportView(table3);
        if (table3.getColumnModel().getColumnCount() > 0) {
            table3.getColumnModel().getColumn(0).setResizable(false);
            table3.getColumnModel().getColumn(0).setPreferredWidth(0);
            table3.getColumnModel().getColumn(1).setResizable(false);
            table3.getColumnModel().getColumn(1).setPreferredWidth(40);
            table3.getColumnModel().getColumn(2).setResizable(false);
            table3.getColumnModel().getColumn(2).setPreferredWidth(60);
            table3.getColumnModel().getColumn(2).setHeaderValue("Thứ tự");
        }

        roundPanel27.add(scrollPaneWin113, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, 535, 290));

        roundPanel16.add(roundPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 535, 355));

        roundPanel25.setBackground(new Color(0, 0, 0, 0));
        roundPanel25.setPreferredSize(new java.awt.Dimension(1125, 685));
        roundPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel29.setBackground(new Color(0,102,102, 128));
        roundPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 30)); // NOI18N
        Title4.setForeground(new java.awt.Color(255, 255, 255));
        Title4.setText("QUẢN LÝ HỌC PHẦN");
        roundPanel29.add(Title4, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 19, -1, -1));

        roundPanel25.add(roundPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 30, 975, 80));

        CapNhatTaiKhoanSinhVien2.setBackground(new Color(0, 0, 0, 0));
        CapNhatTaiKhoanSinhVien2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel30.setBackground(new Color(0,102,102, 200));
        roundPanel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        Title5.setForeground(new java.awt.Color(255, 255, 255));
        Title5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title5.setText("CẬP NHẬT HỌC PHẦN");
        roundPanel30.add(Title5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 16, 370, -1));

        CapNhatTaiKhoanSinhVien2.add(roundPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 60));

        roundPanel31.setBackground(new Color(255, 255, 255, 128));
        roundPanel31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Nhập mã:");
        roundPanel31.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, 40));

        jTextField9.setBackground(new Color(255,90,0, 100));
        jTextField9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextField9.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 8, 3, 3));
        roundPanel31.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 120, 40));

        roundPanel32.setBackground(new java.awt.Color(0, 153, 0));
        roundPanel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roundPanel32MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel32MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel32MouseExited(evt);
            }
        });
        roundPanel32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("LÀM MỚI");
        roundPanel32.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 40));

        roundPanel31.add(roundPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 80, 40));

        roundPanel33.setBackground(new java.awt.Color(0, 153, 0));
        roundPanel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roundPanel33MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel33MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel33MouseExited(evt);
            }
        });
        roundPanel33.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("TÌM");
        roundPanel33.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 40));

        roundPanel31.add(roundPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 80, 40));

        jLabel30.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("Mã học phần:");
        roundPanel31.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 95, 40));

        jTextField10.setBackground(new Color(255, 255, 255, 180));
        jTextField10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextField10.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 8, 3, 3));
        roundPanel31.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 160, 40));

        jLabel31.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setText("Tên học phần:");
        roundPanel31.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 105, 95, 40));

        jTextField11.setBackground(new Color(255, 255, 255, 180));
        jTextField11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextField11.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 8, 3, 3));
        roundPanel31.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 105, 160, 40));

        jLabel32.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel32.setText("Số tín chỉ:");
        roundPanel31.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 95, 40));

        jTextField12.setBackground(new Color(255, 255, 255, 180));
        jTextField12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextField12.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 8, 3, 3));
        roundPanel31.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 160, 40));

        jLabel40.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel40.setText("Số tiết học:");
        roundPanel31.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 195, 95, 40));

        jTextField13.setBackground(new Color(255, 255, 255, 180));
        jTextField13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextField13.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 8, 3, 3));
        roundPanel31.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 195, 160, 40));

        jLabel38.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel38.setText("Bắt buộc");
        roundPanel31.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, 40));

        jCheckBoxCustom1.setBackground(new java.awt.Color(255, 0, 0));
        roundPanel31.add(jCheckBoxCustom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 71, -1, -1));

        jLabel39.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel39.setText("Song hành");
        roundPanel31.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 195, -1, 40));

        jCheckBoxCustom2.setBackground(new java.awt.Color(51, 153, 255));
        roundPanel31.add(jCheckBoxCustom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 117, -1, -1));

        jLabel41.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel41.setText("Tiên quyết");
        jLabel41.setRequestFocusEnabled(false);
        roundPanel31.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, 40));

        jTextField14.setBackground(new Color(255, 255, 255, 180));
        jTextField14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextField14.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 8, 3, 3));
        roundPanel31.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 150, 60, 40));

        jLabel42.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel42.setText("Tự chọn");
        roundPanel31.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 105, -1, 40));

        jTextField15.setBackground(new Color(255, 255, 255, 180));
        jTextField15.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextField15.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 8, 3, 3));
        roundPanel31.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 195, 60, 40));

        roundPanel34.setBackground(new java.awt.Color(0, 153, 255));
        roundPanel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel34MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel34MouseExited(evt);
            }
        });
        roundPanel34.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("THÊM");
        roundPanel34.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        roundPanel31.add(roundPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 80, 30));

        roundPanel35.setBackground(new java.awt.Color(0, 153, 255));
        roundPanel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roundPanel35MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel35MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel35MouseExited(evt);
            }
        });
        roundPanel35.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("SỬA");
        roundPanel35.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        roundPanel31.add(roundPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 80, 30));

        roundPanel36.setBackground(new java.awt.Color(0, 153, 255));
        roundPanel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roundPanel36MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel36MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel36MouseExited(evt);
            }
        });
        roundPanel36.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("XÓA");
        roundPanel36.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        roundPanel31.add(roundPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 80, 30));

        roundPanel37.setBackground(new java.awt.Color(255, 90, 0));
        roundPanel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roundPanel37MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel37MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel37MouseExited(evt);
            }
        });
        roundPanel37.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("QUAY LẠI");
        roundPanel37.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 30));

        roundPanel31.add(roundPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 140, 30));

        CapNhatTaiKhoanSinhVien2.add(roundPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, 410, 320));

        roundPanel25.add(CapNhatTaiKhoanSinhVien2, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 140, 410, 455));

        roundPanel38.setBackground(new Color(0, 0, 0, 0));
        roundPanel38.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel39.setBackground(new Color(102, 102, 102, 200));
        roundPanel39.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setText("DANH SÁCH HỌC PHẦN");
        roundPanel39.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 535, 60));

        roundPanel38.add(roundPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 535, 60));

        table4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã học phần", "Tên học phần"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPaneWin114.setViewportView(table4);
        if (table4.getColumnModel().getColumnCount() > 0) {
            table4.getColumnModel().getColumn(0).setResizable(false);
            table4.getColumnModel().getColumn(0).setPreferredWidth(0);
            table4.getColumnModel().getColumn(1).setResizable(false);
            table4.getColumnModel().getColumn(1).setPreferredWidth(40);
        }

        roundPanel38.add(scrollPaneWin114, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, 535, 320));

        roundPanel25.add(roundPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 140, 535, 455));

        javax.swing.GroupLayout QuanlyHoctapLayout = new javax.swing.GroupLayout(QuanlyHoctap);
        QuanlyHoctap.setLayout(QuanlyHoctapLayout);
        QuanlyHoctapLayout.setHorizontalGroup(
            QuanlyHoctapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuanlyHoctapLayout.createSequentialGroup()
                .addGap(0, 445, Short.MAX_VALUE)
                .addComponent(multipleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 445, Short.MAX_VALUE))
            .addGroup(QuanlyHoctapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(QuanlyHoctapLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(roundPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 1125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(QuanlyHoctapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(QuanlyHoctapLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(roundPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, 1125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        QuanlyHoctapLayout.setVerticalGroup(
            QuanlyHoctapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuanlyHoctapLayout.createSequentialGroup()
                .addGap(0, 288, Short.MAX_VALUE)
                .addComponent(multipleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 289, Short.MAX_VALUE))
            .addGroup(QuanlyHoctapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(QuanlyHoctapLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(roundPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(QuanlyHoctapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(QuanlyHoctapLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(roundPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        roundPanel16.setVisible(false);
        roundPanel25.setVisible(false);

        materialTabbed1.addTab("QUẢN LÝ HỌC TẬP", QuanlyHoctap);

        QuanlyBomon.setBackground(new java.awt.Color(255, 255, 255, 80));

        multipleButton2.setBackground(new java.awt.Color(255, 255, 255));
        multipleButton2.setForeground(new java.awt.Color(255, 255, 255));

        roundPanel1.setBackground(new Color(0, 0, 0, 0));
        roundPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel41.setBackground(new Color(0,102,102, 128));
        roundPanel41.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 30)); // NOI18N
        Title6.setForeground(new java.awt.Color(255, 255, 255));
        Title6.setText("QUẢN LÝ KHOA");
        roundPanel41.add(Title6, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 19, -1, -1));

        roundPanel1.add(roundPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 30, 975, 80));

        CapNhatTaiKhoanSinhVien3.setBackground(new Color(0, 0, 0, 0));
        CapNhatTaiKhoanSinhVien3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel42.setBackground(new Color(0,102,102, 200));
        roundPanel42.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        Title7.setForeground(new java.awt.Color(255, 255, 255));
        Title7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title7.setText("CẬP NHẬT KHOA");
        roundPanel42.add(Title7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 16, 610, -1));

        CapNhatTaiKhoanSinhVien3.add(roundPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 60));

        roundPanel43.setBackground(new Color(255, 255, 255, 128));
        roundPanel43.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel43.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel43.setText("Nhập mã:");
        roundPanel43.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, 40));

        jTextField16.setBackground(new Color(255,90,0, 100));
        jTextField16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextField16.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 8, 3, 3));
        roundPanel43.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 120, 40));

        roundPanel44.setBackground(new java.awt.Color(0, 153, 0));
        roundPanel44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel44MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel44MouseExited(evt);
            }
        });
        roundPanel44.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel44.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("LÀM MỚI");
        roundPanel44.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 40));

        roundPanel43.add(roundPanel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 80, 40));

        roundPanel45.setBackground(new java.awt.Color(0, 153, 0));
        roundPanel45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel45MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel45MouseExited(evt);
            }
        });
        roundPanel45.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel45.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("TÌM");
        roundPanel45.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 55, 40));

        roundPanel43.add(roundPanel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 55, 40));

        jLabel46.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel46.setText("Mã khoa:");
        roundPanel43.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 95, 40));

        jTextField17.setBackground(new Color(255, 255, 255, 180));
        jTextField17.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextField17.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 8, 3, 3));
        roundPanel43.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 200, 40));

        jLabel47.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel47.setText("Tên khoa:");
        roundPanel43.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 105, 95, 40));

        jTextField18.setBackground(new Color(255, 255, 255, 180));
        jTextField18.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextField18.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 8, 3, 3));
        roundPanel43.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 105, 200, 40));

        roundPanel46.setBackground(new java.awt.Color(0, 153, 255));
        roundPanel46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel46MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel46MouseExited(evt);
            }
        });
        roundPanel46.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel65.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setText("THÊM KHOA");
        roundPanel46.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        roundPanel43.add(roundPanel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 80, 30));

        roundPanel47.setBackground(new java.awt.Color(0, 153, 255));
        roundPanel47.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel47MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel47MouseExited(evt);
            }
        });
        roundPanel47.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel66.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setText("SỬA KHOA");
        roundPanel47.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        roundPanel43.add(roundPanel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 80, 30));

        roundPanel48.setBackground(new java.awt.Color(0, 153, 255));
        roundPanel48.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel48MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel48MouseExited(evt);
            }
        });
        roundPanel48.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel67.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setText("XÓA KHOA");
        roundPanel48.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        roundPanel43.add(roundPanel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 80, 30));

        roundPanel49.setBackground(new java.awt.Color(255, 90, 0));
        roundPanel49.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roundPanel49MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel49MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel49MouseExited(evt);
            }
        });
        roundPanel49.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel68.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel68.setText("QUAY LẠI");
        roundPanel49.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 30));

        roundPanel43.add(roundPanel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 140, 30));

        table6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Mã ngành", "Tên ngành"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPaneWin116.setViewportView(table6);
        if (table6.getColumnModel().getColumnCount() > 0) {
            table6.getColumnModel().getColumn(0).setResizable(false);
            table6.getColumnModel().getColumn(0).setPreferredWidth(0);
            table6.getColumnModel().getColumn(1).setResizable(false);
            table6.getColumnModel().getColumn(1).setPreferredWidth(40);
        }

        roundPanel43.add(scrollPaneWin116, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 55, 220, 175));

        roundPanel52.setBackground(new Color(102, 102, 102, 200)
        );

        jLabel49.setBackground(new java.awt.Color(255, 255, 255));
        jLabel49.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("NGÀNH THUỘC KHOA");

        javax.swing.GroupLayout roundPanel52Layout = new javax.swing.GroupLayout(roundPanel52);
        roundPanel52.setLayout(roundPanel52Layout);
        roundPanel52Layout.setHorizontalGroup(
            roundPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
            .addGroup(roundPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(roundPanel52Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel49)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        roundPanel52Layout.setVerticalGroup(
            roundPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(roundPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(roundPanel52Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel49)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        roundPanel43.add(roundPanel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 220, 40));

        jLabel50.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel50.setText("Nhập mã ngành:");
        roundPanel43.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, -1, 30));

        jTextField19.setBackground(new Color(255,90,0, 100));
        jTextField19.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextField19.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 8, 3, 3));
        roundPanel43.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 240, 120, 30));

        roundPanel53.setBackground(new java.awt.Color(0, 153, 255));
        roundPanel53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel53MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel53MouseExited(evt);
            }
        });
        roundPanel53.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel70.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setText("XÓA NGÀNH");
        roundPanel53.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        roundPanel43.add(roundPanel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 80, 30));

        roundPanel54.setBackground(new java.awt.Color(0, 153, 255));
        roundPanel54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel54MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel54MouseExited(evt);
            }
        });
        roundPanel54.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel71.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setText("THÊM NGÀNH");
        roundPanel54.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 30));

        roundPanel43.add(roundPanel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 90, 30));

        CapNhatTaiKhoanSinhVien3.add(roundPanel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, 610, 320));

        roundPanel1.add(CapNhatTaiKhoanSinhVien3, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 140, 610, 455));

        roundPanel50.setBackground(new Color(0, 0, 0, 0));
        roundPanel50.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel51.setBackground(new Color(102, 102, 102, 200));
        roundPanel51.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel69.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setText("DANH SÁCH KHOA");
        roundPanel51.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 335, 60));

        roundPanel50.add(roundPanel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 335, 60));

        table5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã khoa", "Tên khoa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPaneWin115.setViewportView(table5);
        if (table5.getColumnModel().getColumnCount() > 0) {
            table5.getColumnModel().getColumn(0).setResizable(false);
            table5.getColumnModel().getColumn(0).setPreferredWidth(0);
            table5.getColumnModel().getColumn(1).setResizable(false);
            table5.getColumnModel().getColumn(1).setPreferredWidth(40);
        }

        roundPanel50.add(scrollPaneWin115, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, 335, 320));

        roundPanel1.add(roundPanel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(715, 140, 335, 455));

        roundPanel2.setBackground(new Color(0, 0, 0, 0));
        roundPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel55.setBackground(new Color(0,102,102, 128));
        roundPanel55.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 30)); // NOI18N
        Title8.setForeground(new java.awt.Color(255, 255, 255));
        Title8.setText("QUẢN LÝ NGÀNH");
        roundPanel55.add(Title8, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 19, -1, -1));

        roundPanel2.add(roundPanel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 30, 975, 80));

        CapNhatTaiKhoanSinhVien4.setBackground(new Color(0, 0, 0, 0));
        CapNhatTaiKhoanSinhVien4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel56.setBackground(new Color(0,102,102, 200));
        roundPanel56.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        Title9.setForeground(new java.awt.Color(255, 255, 255));
        Title9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title9.setText("CẬP NHẬT NGÀNH");
        roundPanel56.add(Title9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 16, 610, -1));

        CapNhatTaiKhoanSinhVien4.add(roundPanel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 60));

        roundPanel57.setBackground(new Color(255, 255, 255, 128));
        roundPanel57.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel51.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel51.setText("Nhập mã:");
        roundPanel57.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, 40));

        jTextField20.setBackground(new Color(255,90,0, 100));
        jTextField20.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextField20.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 8, 3, 3));
        roundPanel57.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 120, 40));

        roundPanel58.setBackground(new java.awt.Color(0, 153, 0));
        roundPanel58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel58MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel58MouseExited(evt);
            }
        });
        roundPanel58.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel52.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("LÀM MỚI");
        roundPanel58.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 40));

        roundPanel57.add(roundPanel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 80, 40));

        roundPanel59.setBackground(new java.awt.Color(0, 153, 0));
        roundPanel59.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel59MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel59MouseExited(evt);
            }
        });
        roundPanel59.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel53.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("TÌM");
        roundPanel59.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 55, 40));

        roundPanel57.add(roundPanel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 55, 40));

        jLabel54.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel54.setText("Mã ngành:");
        roundPanel57.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 95, 40));

        jTextField21.setBackground(new Color(255, 255, 255, 180));
        jTextField21.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextField21.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 8, 3, 3));
        roundPanel57.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 200, 40));

        jLabel55.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel55.setText("Tên ngành:");
        roundPanel57.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 105, 95, 40));

        jTextField22.setBackground(new Color(255, 255, 255, 180));
        jTextField22.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextField22.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 8, 3, 3));
        roundPanel57.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 105, 200, 40));

        roundPanel60.setBackground(new java.awt.Color(0, 153, 255));
        roundPanel60.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel60MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel60MouseExited(evt);
            }
        });
        roundPanel60.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel72.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel72.setText("THÊM KHOA");
        roundPanel60.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        roundPanel57.add(roundPanel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 80, 30));

        roundPanel61.setBackground(new java.awt.Color(0, 153, 255));
        roundPanel61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel61MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel61MouseExited(evt);
            }
        });
        roundPanel61.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel73.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setText("SỬA KHOA");
        roundPanel61.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        roundPanel57.add(roundPanel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 80, 30));

        roundPanel62.setBackground(new java.awt.Color(0, 153, 255));
        roundPanel62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel62MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel62MouseExited(evt);
            }
        });
        roundPanel62.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel74.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel74.setText("XÓA KHOA");
        roundPanel62.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        roundPanel57.add(roundPanel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 80, 30));

        roundPanel63.setBackground(new java.awt.Color(255, 90, 0));
        roundPanel63.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roundPanel63MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel63MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel63MouseExited(evt);
            }
        });
        roundPanel63.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel75.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(255, 255, 255));
        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel75.setText("QUAY LẠI");
        roundPanel63.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 30));

        roundPanel57.add(roundPanel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 140, 30));

        table7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã môn ", "Tên môn"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPaneWin117.setViewportView(table7);
        if (table7.getColumnModel().getColumnCount() > 0) {
            table7.getColumnModel().getColumn(0).setResizable(false);
            table7.getColumnModel().getColumn(0).setPreferredWidth(0);
            table7.getColumnModel().getColumn(1).setResizable(false);
            table7.getColumnModel().getColumn(1).setPreferredWidth(40);
        }

        roundPanel57.add(scrollPaneWin117, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 55, 220, 175));

        roundPanel64.setBackground(new Color(102, 102, 102, 200)
        );

        jLabel57.setBackground(new java.awt.Color(255, 255, 255));
        jLabel57.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("CẬP NHẬT CHƯƠNG TRÌNH KHUNG");

        javax.swing.GroupLayout roundPanel64Layout = new javax.swing.GroupLayout(roundPanel64);
        roundPanel64.setLayout(roundPanel64Layout);
        roundPanel64Layout.setHorizontalGroup(
            roundPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
            .addGroup(roundPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(roundPanel64Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel57)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        roundPanel64Layout.setVerticalGroup(
            roundPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(roundPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(roundPanel64Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel57)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        roundPanel57.add(roundPanel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 220, 40));

        jLabel58.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel58.setText("Nhập mã ngành:");
        roundPanel57.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, -1, 30));

        jTextField23.setBackground(new Color(255,90,0, 100));
        jTextField23.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextField23.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 8, 3, 3));
        roundPanel57.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 240, 120, 30));

        roundPanel65.setBackground(new java.awt.Color(0, 153, 255));
        roundPanel65.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel65MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel65MouseExited(evt);
            }
        });
        roundPanel65.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel76.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(255, 255, 255));
        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel76.setText("XÓA NGÀNH");
        roundPanel65.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        roundPanel57.add(roundPanel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 80, 30));

        roundPanel66.setBackground(new java.awt.Color(0, 153, 255));
        roundPanel66.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel66MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel66MouseExited(evt);
            }
        });
        roundPanel66.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel77.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel77.setText("THÊM NGÀNH");
        roundPanel66.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 30));

        roundPanel57.add(roundPanel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 90, 30));

        CapNhatTaiKhoanSinhVien4.add(roundPanel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, 610, 320));

        roundPanel2.add(CapNhatTaiKhoanSinhVien4, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 140, 610, 455));

        roundPanel67.setBackground(new Color(0, 0, 0, 0));
        roundPanel67.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel68.setBackground(new Color(102, 102, 102, 200));
        roundPanel68.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel78.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(255, 255, 255));
        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel78.setText("DANH SÁCH NGÀNH");
        roundPanel68.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 335, 60));

        roundPanel67.add(roundPanel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 335, 60));

        table8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã ngành", "Tên ngành"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPaneWin119.setViewportView(table8);
        if (table8.getColumnModel().getColumnCount() > 0) {
            table8.getColumnModel().getColumn(0).setResizable(false);
            table8.getColumnModel().getColumn(0).setPreferredWidth(0);
            table8.getColumnModel().getColumn(1).setResizable(false);
            table8.getColumnModel().getColumn(1).setPreferredWidth(40);
        }

        roundPanel67.add(scrollPaneWin119, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, 335, 320));

        roundPanel2.add(roundPanel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(715, 140, 335, 455));

        roundPanel3.setBackground(new Color(0, 0, 0, 0));
        roundPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel80.setBackground(new Color(0,102,102, 128));
        roundPanel80.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 30)); // NOI18N
        Title12.setForeground(new java.awt.Color(255, 255, 255));
        Title12.setText("QUẢN LÝ KHÓA HỌC");
        roundPanel80.add(Title12, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 19, -1, -1));

        roundPanel3.add(roundPanel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 925, 80));

        CapNhatTaiKhoanSinhVien6.setBackground(new Color(0, 0, 0, 0));
        CapNhatTaiKhoanSinhVien6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel81.setBackground(new Color(0,102,102, 200));
        roundPanel81.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        Title13.setForeground(new java.awt.Color(255, 255, 255));
        Title13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title13.setText("CẬP NHẬT KHÓA HỌC ");
        roundPanel81.add(Title13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 16, 370, -1));

        CapNhatTaiKhoanSinhVien6.add(roundPanel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 60));

        roundPanel82.setBackground(new Color(255, 255, 255, 128));
        roundPanel82.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel84.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel84.setText("Nhập mã:");
        roundPanel82.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, 40));

        jTextField28.setBackground(new Color(255,90,0, 100));
        jTextField28.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextField28.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 8, 3, 3));
        roundPanel82.add(jTextField28, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 120, 40));

        roundPanel83.setBackground(new java.awt.Color(0, 153, 0));
        roundPanel83.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel83MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel83MouseExited(evt);
            }
        });
        roundPanel83.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel85.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(255, 255, 255));
        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel85.setText("LÀM MỚI");
        roundPanel83.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 40));

        roundPanel82.add(roundPanel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 10, 80, 40));

        roundPanel84.setBackground(new java.awt.Color(0, 153, 0));
        roundPanel84.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel84MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel84MouseExited(evt);
            }
        });
        roundPanel84.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel86.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(255, 255, 255));
        jLabel86.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel86.setText("TÌM");
        roundPanel84.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 55, 40));

        roundPanel82.add(roundPanel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 10, 55, 40));

        jLabel87.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel87.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel87.setText("Mã khóa:");
        roundPanel82.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 90, 40));

        jTextField29.setBackground(new Color(255, 255, 255, 180));
        jTextField29.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextField29.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 8, 3, 3));
        roundPanel82.add(jTextField29, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 210, 40));

        jLabel88.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel88.setText("Hệ số DCC:");
        roundPanel82.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 105, 90, 40));

        jTextField30.setBackground(new Color(255, 255, 255, 180));
        jTextField30.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextField30.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 8, 3, 3));
        roundPanel82.add(jTextField30, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 105, 210, 40));

        jLabel89.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel89.setText("Hệ số DGK:");
        roundPanel82.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 90, 40));

        jTextField31.setBackground(new Color(255, 255, 255, 180));
        jTextField31.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextField31.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 8, 3, 3));
        roundPanel82.add(jTextField31, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 210, 40));

        roundPanel85.setBackground(new java.awt.Color(0, 153, 255));
        roundPanel85.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel85MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel85MouseExited(evt);
            }
        });
        roundPanel85.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel90.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(255, 255, 255));
        jLabel90.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel90.setText("THÊM");
        roundPanel85.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        roundPanel82.add(roundPanel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 245, 80, 30));

        roundPanel86.setBackground(new java.awt.Color(0, 153, 255));
        roundPanel86.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel86MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel86MouseExited(evt);
            }
        });
        roundPanel86.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel91.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(255, 255, 255));
        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel91.setText("SỬA");
        roundPanel86.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        roundPanel82.add(roundPanel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 245, 80, 30));

        roundPanel87.setBackground(new java.awt.Color(0, 153, 255));
        roundPanel87.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel87MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel87MouseExited(evt);
            }
        });
        roundPanel87.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel92.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(255, 255, 255));
        jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel92.setText("XÓA");
        roundPanel87.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        roundPanel82.add(roundPanel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 285, 80, 30));

        roundPanel88.setBackground(new java.awt.Color(255, 90, 0));
        roundPanel88.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roundPanel88MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel88MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel88MouseExited(evt);
            }
        });
        roundPanel88.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel93.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(255, 255, 255));
        jLabel93.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel93.setText("QUAY LẠI");
        roundPanel88.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 30));

        roundPanel82.add(roundPanel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 285, 140, 30));

        jLabel95.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel95.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel95.setText("Hệ số DKT:");
        roundPanel82.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 195, 90, 40));

        jTextField32.setBackground(new Color(255, 255, 255, 180));
        jTextField32.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextField32.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 8, 3, 3));
        roundPanel82.add(jTextField32, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 195, 210, 40));

        CapNhatTaiKhoanSinhVien6.add(roundPanel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, 370, 320));

        roundPanel3.add(CapNhatTaiKhoanSinhVien6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 370, 455));

        roundPanel89.setBackground(new Color(0, 0, 0, 0));
        roundPanel89.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel90.setBackground(new Color(102, 102, 102, 200));
        roundPanel90.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel94.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(255, 255, 255));
        jLabel94.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel94.setText("DANH SÁCH KHÓA HỌC ");
        roundPanel90.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 535, 60));

        roundPanel89.add(roundPanel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 535, 60));

        table10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã khóa", "Hệ số DCC", "Hệ số DGK", "Hệ số DKT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPaneWin121.setViewportView(table10);
        if (table10.getColumnModel().getColumnCount() > 0) {
            table10.getColumnModel().getColumn(0).setResizable(false);
            table10.getColumnModel().getColumn(0).setPreferredWidth(0);
            table10.getColumnModel().getColumn(1).setResizable(false);
            table10.getColumnModel().getColumn(1).setPreferredWidth(40);
            table10.getColumnModel().getColumn(2).setPreferredWidth(60);
        }

        roundPanel89.add(scrollPaneWin121, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, 535, 320));

        roundPanel3.add(roundPanel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 535, 455));

        roundPanel40.setBackground(new Color(0, 0, 0, 0));
        roundPanel40.setPreferredSize(new java.awt.Dimension(1125, 685));
        roundPanel40.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel69.setBackground(new Color(0,102,102, 128));
        roundPanel69.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 30)); // NOI18N
        Title10.setForeground(new java.awt.Color(255, 255, 255));
        Title10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title10.setText("THÔNG TIN LỚP HỌC");
        roundPanel69.add(Title10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 19, 975, -1));

        roundPanel40.add(roundPanel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 30, 975, 80));

        CapNhatTaiKhoanSinhVien5.setBackground(new Color(0, 0, 0, 0));
        CapNhatTaiKhoanSinhVien5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel70.setBackground(new Color(0,102,102, 200));
        roundPanel70.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        Title11.setForeground(new java.awt.Color(255, 255, 255));
        Title11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title11.setText("CẬP NHẬT LỚP");
        roundPanel70.add(Title11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 16, 610, -1));

        CapNhatTaiKhoanSinhVien5.add(roundPanel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 60));

        roundPanel71.setBackground(new Color(255, 255, 255, 128));
        roundPanel71.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel59.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel59.setText("Nhập mã:");
        roundPanel71.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, 40));

        jTextField24.setBackground(new Color(255,90,0, 100));
        jTextField24.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextField24.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 8, 3, 3));
        roundPanel71.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 120, 40));

        roundPanel72.setBackground(new java.awt.Color(0, 153, 0));
        roundPanel72.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel72MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel72MouseExited(evt);
            }
        });
        roundPanel72.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel60.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("LÀM MỚI");
        roundPanel72.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 40));

        roundPanel71.add(roundPanel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 10, 80, 40));

        roundPanel73.setBackground(new java.awt.Color(0, 153, 0));
        roundPanel73.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel73MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel73MouseExited(evt);
            }
        });
        roundPanel73.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel61.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("TÌM");
        roundPanel73.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 55, 40));

        roundPanel71.add(roundPanel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 10, 55, 40));

        jLabel62.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel62.setText("Mã khoa:");
        roundPanel71.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 95, 40));

        jTextField25.setBackground(new Color(255, 255, 255, 180));
        jTextField25.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextField25.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 8, 3, 3));
        roundPanel71.add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 200, 40));

        jLabel63.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel63.setText("Mã lớp:");
        roundPanel71.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 105, 95, 40));

        jTextField26.setBackground(new Color(255, 255, 255, 180));
        jTextField26.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextField26.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 8, 3, 3));
        roundPanel71.add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 105, 200, 40));

        jLabel64.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel64.setText("Tên lớp:");
        roundPanel71.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 95, 40));

        roundPanel74.setBackground(new java.awt.Color(0, 153, 255));
        roundPanel74.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel74MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel74MouseExited(evt);
            }
        });
        roundPanel74.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel79.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel79.setText("THÊM KHOA");
        roundPanel74.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        roundPanel71.add(roundPanel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 80, 30));

        roundPanel75.setBackground(new java.awt.Color(0, 153, 255));
        roundPanel75.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel75MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel75MouseExited(evt);
            }
        });
        roundPanel75.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel80.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(255, 255, 255));
        jLabel80.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel80.setText("SỬA KHOA");
        roundPanel75.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        roundPanel71.add(roundPanel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 80, 30));

        roundPanel76.setBackground(new java.awt.Color(0, 153, 255));
        roundPanel76.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel76MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel76MouseExited(evt);
            }
        });
        roundPanel76.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel81.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(255, 255, 255));
        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel81.setText("XÓA KHOA");
        roundPanel76.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        roundPanel71.add(roundPanel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 80, 30));

        roundPanel77.setBackground(new java.awt.Color(255, 90, 0));
        roundPanel77.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roundPanel77MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel77MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel77MouseExited(evt);
            }
        });
        roundPanel77.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel82.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(255, 255, 255));
        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel82.setText("QUAY LẠI");
        roundPanel77.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 30));

        roundPanel71.add(roundPanel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 140, 30));

        table9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "MSSV", "Họ & Tên đệm", "Tên"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPaneWin120.setViewportView(table9);
        if (table9.getColumnModel().getColumnCount() > 0) {
            table9.getColumnModel().getColumn(0).setResizable(false);
            table9.getColumnModel().getColumn(0).setPreferredWidth(0);
            table9.getColumnModel().getColumn(1).setResizable(false);
            table9.getColumnModel().getColumn(1).setPreferredWidth(60);
            table9.getColumnModel().getColumn(2).setResizable(false);
            table9.getColumnModel().getColumn(2).setPreferredWidth(10);
        }

        roundPanel71.add(scrollPaneWin120, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 55, 220, 175));

        roundPanel78.setBackground(new Color(102, 102, 102, 200)
        );

        jLabel83.setBackground(new java.awt.Color(255, 255, 255));
        jLabel83.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(255, 255, 255));
        jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel83.setText("SINH VIÊN THUỘC LỚP");

        javax.swing.GroupLayout roundPanel78Layout = new javax.swing.GroupLayout(roundPanel78);
        roundPanel78.setLayout(roundPanel78Layout);
        roundPanel78Layout.setHorizontalGroup(
            roundPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
            .addGroup(roundPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(roundPanel78Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel83)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        roundPanel78Layout.setVerticalGroup(
            roundPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(roundPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(roundPanel78Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel83)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        roundPanel71.add(roundPanel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 220, 40));

        jLabel96.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel96.setText("Nhập mã ngành:");
        roundPanel71.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, -1, 30));

        jTextField27.setBackground(new Color(255,90,0, 100));
        jTextField27.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextField27.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 8, 3, 3));
        roundPanel71.add(jTextField27, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 240, 120, 30));

        roundPanel79.setBackground(new java.awt.Color(0, 153, 255));
        roundPanel79.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel79MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel79MouseExited(evt);
            }
        });
        roundPanel79.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel97.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(255, 255, 255));
        jLabel97.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel97.setText("XÓA NGÀNH");
        roundPanel79.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        roundPanel71.add(roundPanel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, 80, 30));

        roundPanel91.setBackground(new java.awt.Color(0, 153, 255));
        roundPanel91.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel91MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel91MouseExited(evt);
            }
        });
        roundPanel91.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel98.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(255, 255, 255));
        jLabel98.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel98.setText("THÊM NGÀNH");
        roundPanel91.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 30));

        roundPanel71.add(roundPanel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 90, 30));

        jTextField33.setBackground(new Color(255, 255, 255, 180));
        jTextField33.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextField33.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 8, 3, 3));
        roundPanel71.add(jTextField33, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 200, 40));

        jLabel107.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel107.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel107.setText("Mã khóa học:");
        jLabel107.setRequestFocusEnabled(false);
        roundPanel71.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 195, 95, 40));

        jTextField34.setBackground(new Color(255, 255, 255, 180));
        jTextField34.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextField34.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 8, 3, 3));
        jTextField34.setRequestFocusEnabled(false);
        roundPanel71.add(jTextField34, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 195, 200, 40));

        CapNhatTaiKhoanSinhVien5.add(roundPanel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, 610, 320));

        roundPanel40.add(CapNhatTaiKhoanSinhVien5, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 140, 610, 455));

        roundPanel92.setBackground(new Color(0, 0, 0, 0));
        roundPanel92.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel93.setBackground(new Color(102, 102, 102, 200));
        roundPanel93.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel99.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(255, 255, 255));
        jLabel99.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel99.setText("DANH SÁCH LỚP");
        roundPanel93.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 335, 60));

        roundPanel92.add(roundPanel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 335, 60));

        table11.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã lớp", "Tên lớp"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPaneWin123.setViewportView(table11);
        if (table11.getColumnModel().getColumnCount() > 0) {
            table11.getColumnModel().getColumn(0).setResizable(false);
            table11.getColumnModel().getColumn(0).setPreferredWidth(0);
            table11.getColumnModel().getColumn(1).setResizable(false);
            table11.getColumnModel().getColumn(1).setPreferredWidth(40);
        }

        roundPanel92.add(scrollPaneWin123, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, 335, 320));

        roundPanel40.add(roundPanel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(715, 140, 335, 455));

        javax.swing.GroupLayout QuanlyBomonLayout = new javax.swing.GroupLayout(QuanlyBomon);
        QuanlyBomon.setLayout(QuanlyBomonLayout);
        QuanlyBomonLayout.setHorizontalGroup(
            QuanlyBomonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1125, Short.MAX_VALUE)
            .addGroup(QuanlyBomonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QuanlyBomonLayout.createSequentialGroup()
                    .addContainerGap(452, Short.MAX_VALUE)
                    .addComponent(multipleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(453, Short.MAX_VALUE)))
            .addGroup(QuanlyBomonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(QuanlyBomonLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(QuanlyBomonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(QuanlyBomonLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(roundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(QuanlyBomonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(QuanlyBomonLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(roundPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(QuanlyBomonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(QuanlyBomonLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(roundPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, 1125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        QuanlyBomonLayout.setVerticalGroup(
            QuanlyBomonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
            .addGroup(QuanlyBomonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QuanlyBomonLayout.createSequentialGroup()
                    .addContainerGap(227, Short.MAX_VALUE)
                    .addComponent(multipleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(248, Short.MAX_VALUE)))
            .addGroup(QuanlyBomonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(QuanlyBomonLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(QuanlyBomonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(QuanlyBomonLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(roundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(QuanlyBomonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(QuanlyBomonLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(roundPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(QuanlyBomonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(QuanlyBomonLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(roundPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        roundPanel1.setVisible(false);
        roundPanel2.setVisible(false);
        roundPanel3.setVisible(false);
        roundPanel40.setVisible(false);

        materialTabbed1.addTab("QUẢN LÝ BỘ MÔN", QuanlyBomon);

        GuiThongbao.setBackground(new java.awt.Color(255, 255, 255, 80));
        GuiThongbao.setPreferredSize(new java.awt.Dimension(1125, 685));
        GuiThongbao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel94.setBackground(new java.awt.Color(255, 255, 255, 100));
        roundPanel94.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel101.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel101.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel101.setText("BẢNG TIN");
        roundPanel94.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 74));

        GuiThongbao.add(roundPanel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 12, 300, 74));

        roundPanel95.setBackground(new java.awt.Color(255, 255, 255, 100));
        roundPanel95.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel102.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel102.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel102.setText("THÔNG BÁO");
        roundPanel95.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 74));

        GuiThongbao.add(roundPanel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 12, 710, 74));

        jSplitPane1.setPreferredSize(new java.awt.Dimension(1040, 500));

        jPanel67.setBackground(new java.awt.Color(255, 255, 255));
        jPanel67.setPreferredSize(new java.awt.Dimension(300, 410));
        jPanel67.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel103.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel103MouseClicked(evt);
            }
        });
        jPanel67.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 35, 128, 128));

        jLabel104.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel104.setText("<tên file>");
        jPanel67.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 170, -1, -1));

        scrollPaneWin125.setBackground(new Color(255, 255, 255, 180));
        scrollPaneWin125.setPreferredSize(new java.awt.Dimension(160, 86));

        jTextArea3.setBackground(new Color(255, 255, 255, 180));
        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setPreferredSize(new java.awt.Dimension(160, 84));
        scrollPaneWin125.setViewportView(jTextArea3);

        jPanel67.add(scrollPaneWin125, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 175, 80));

        jLabel105.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel105.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel105.setText("Nhập tiêu đề:");
        jPanel67.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 95, 40));

        roundPanel96.setBackground(new java.awt.Color(0, 153, 255));
        roundPanel96.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                roundPanel96MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                roundPanel96MouseExited(evt);
            }
        });
        roundPanel96.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel106.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(255, 255, 255));
        jLabel106.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel106.setText("GỬI");
        roundPanel96.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 30));

        jPanel67.add(roundPanel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 80, 30));

        scrollPaneWin122.setViewportView(jPanel67);

        jSplitPane1.setLeftComponent(scrollPaneWin122);

        jPanel66.setBackground(new java.awt.Color(255, 255, 255));
        jPanel66.setPreferredSize(new java.awt.Dimension(600, 410));
        jPanel66.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        scrollPaneWin124.setViewportView(jPanel66);

        jSplitPane1.setRightComponent(scrollPaneWin124);

        GuiThongbao.add(jSplitPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, 410));

        materialTabbed1.addTab("GỬI THÔNG BÁO", GuiThongbao);

        Homthu.setBackground(new java.awt.Color(255, 255, 255, 80));
        Homthu.setPreferredSize(new java.awt.Dimension(1125, 685));
        Homthu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel97.setBackground(new Color(0, 0, 0, 0));
        roundPanel97.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel98.setBackground(new Color(102, 102, 102, 200));
        roundPanel98.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel48.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("CÁC THƯ GẦN ĐÂY");
        roundPanel98.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 60));

        roundPanel97.add(roundPanel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 60));

        table12.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "MSSV", "Tiêu đề "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPaneWin118.setViewportView(table12);
        if (table12.getColumnModel().getColumnCount() > 0) {
            table12.getColumnModel().getColumn(0).setResizable(false);
            table12.getColumnModel().getColumn(0).setPreferredWidth(0);
            table12.getColumnModel().getColumn(1).setResizable(false);
            table12.getColumnModel().getColumn(1).setPreferredWidth(40);
        }

        roundPanel97.add(scrollPaneWin118, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, 350, 420));

        Homthu.add(roundPanel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 30, 350, 485));

        roundPanel99.setBackground(new Color(0, 0, 0, 0));
        roundPanel99.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel100.setBackground(new Color(102, 102, 102, 200));
        roundPanel100.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel56.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("THƯ MỚI");
        roundPanel100.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 60));

        roundPanel99.add(roundPanel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 60));

        table14.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "MSSV", "Tiêu đề "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollPaneWin127.setViewportView(table14);
        if (table14.getColumnModel().getColumnCount() > 0) {
            table14.getColumnModel().getColumn(0).setResizable(false);
            table14.getColumnModel().getColumn(0).setPreferredWidth(0);
            table14.getColumnModel().getColumn(1).setResizable(false);
            table14.getColumnModel().getColumn(1).setPreferredWidth(40);
        }

        roundPanel99.add(scrollPaneWin127, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, 350, 420));

        Homthu.add(roundPanel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 350, 485));

        CapNhatTaiKhoanSinhVien7.setBackground(new Color(0, 0, 0, 0));
        CapNhatTaiKhoanSinhVien7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel101.setBackground(new Color(0,102,102, 200));
        roundPanel101.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        Title14.setForeground(new java.awt.Color(255, 255, 255));
        Title14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title14.setText("ĐỌC THƯ");
        roundPanel101.add(Title14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 16, 340, -1));

        CapNhatTaiKhoanSinhVien7.add(roundPanel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 60));

        roundPanel102.setBackground(new Color(255, 255, 255, 128));
        roundPanel102.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("MSSV:");
        roundPanel102.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 90, 40));

        jTextField3.setBackground(new Color(255,90,0, 100));
        jTextField3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextField3.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 8, 3, 3));
        roundPanel102.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 220, 40));

        jLabel110.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel110.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel110.setText("Tiêu đề:");
        roundPanel102.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 90, 40));

        jTextField35.setBackground(new Color(255, 255, 255, 180));
        jTextField35.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextField35.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 8, 3, 3));
        roundPanel102.add(jTextField35, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 220, 40));

        jLabel111.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel111.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel111.setText("Nội dung:");
        roundPanel102.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 105, 90, 40));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        scrollPaneWin111.setViewportView(jTextArea1);

        roundPanel102.add(scrollPaneWin111, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 105, 220, 100));

        CapNhatTaiKhoanSinhVien7.add(roundPanel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 65, 340, 415));

        Homthu.add(CapNhatTaiKhoanSinhVien7, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, 340, 485));

        materialTabbed1.addTab("HÒM THƯ ", Homthu);

        NhapDiem.setBackground(new java.awt.Color(255, 255, 255, 80));

        javax.swing.GroupLayout NhapDiemLayout = new javax.swing.GroupLayout(NhapDiem);
        NhapDiem.setLayout(NhapDiemLayout);
        NhapDiemLayout.setHorizontalGroup(
            NhapDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1125, Short.MAX_VALUE)
        );
        NhapDiemLayout.setVerticalGroup(
            NhapDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 543, Short.MAX_VALUE)
        );

        materialTabbed1.addTab("NHẬP ĐIỂM", NhapDiem);

        QuanLyGiangVien.setBackground(new java.awt.Color(255, 255, 255, 80));
        QuanLyGiangVien.setPreferredSize(new java.awt.Dimension(1125, 685));

        jLabel100.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(255, 255, 255));
        jLabel100.setText("TÍNH NĂNG SẮP RA MẮT");

        javax.swing.GroupLayout QuanLyGiangVienLayout = new javax.swing.GroupLayout(QuanLyGiangVien);
        QuanLyGiangVien.setLayout(QuanLyGiangVienLayout);
        QuanLyGiangVienLayout.setHorizontalGroup(
            QuanLyGiangVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1125, Short.MAX_VALUE)
            .addGroup(QuanLyGiangVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(QuanLyGiangVienLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel100)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        QuanLyGiangVienLayout.setVerticalGroup(
            QuanLyGiangVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 685, Short.MAX_VALUE)
            .addGroup(QuanLyGiangVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(QuanLyGiangVienLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel100)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        materialTabbed1.addTab("QUẢN LÝ GIẢNG VIÊN", QuanLyGiangVien);

        getContentPane().add(materialTabbed1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 30, 1130, 590));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/AdminBackground.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 625));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        changeColor(jPanel6, new Color(252, 3, 28));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        changeColor(jPanel6, new Color(0,63,92));
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        changeColor(jPanel10, new Color(30,70,100));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        changeColor(jPanel10, new Color(0,63,92));
    }//GEN-LAST:event_jLabel2MouseExited

    private void TitlebarformMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitlebarformMouseDragged
        int xx = evt.getXOnScreen();
        int xy = evt.getYOnScreen();
        this.setLocation(xx - x, xy - y);
    }//GEN-LAST:event_TitlebarformMouseDragged

    private void TitlebarformMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitlebarformMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_TitlebarformMousePressed

    private void roundPanel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel9MouseEntered
        changeColor(roundPanel9, new Color(105, 153, 0));
    }//GEN-LAST:event_roundPanel9MouseEntered

    private void roundPanel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel9MouseExited
        changeColor(roundPanel9, new Color(0,153,0));
    }//GEN-LAST:event_roundPanel9MouseExited

    private void roundPanel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel8MouseEntered
        changeColor(roundPanel8, new Color(105, 153, 0));
    }//GEN-LAST:event_roundPanel8MouseEntered

    private void roundPanel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel8MouseExited
        changeColor(roundPanel8, new Color(0,153,0));
    }//GEN-LAST:event_roundPanel8MouseExited

    private void roundPanel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel10MouseEntered
        changeColor(roundPanel10, new Color(0, 187, 255));
    }//GEN-LAST:event_roundPanel10MouseEntered

    private void roundPanel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel10MouseExited
        changeColor(roundPanel10, new Color(0,153,255));
    }//GEN-LAST:event_roundPanel10MouseExited

    private void roundPanel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel11MouseEntered
        changeColor(roundPanel11, new Color(0, 187, 255));
    }//GEN-LAST:event_roundPanel11MouseEntered

    private void roundPanel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel11MouseExited
        changeColor(roundPanel11, new Color(0,153,255));
    }//GEN-LAST:event_roundPanel11MouseExited

    private void roundPanel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel12MouseEntered
        changeColor(roundPanel12, new Color(0, 187, 255));
    }//GEN-LAST:event_roundPanel12MouseEntered

    private void roundPanel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel12MouseExited
        changeColor(roundPanel12, new Color(0,153,255));
    }//GEN-LAST:event_roundPanel12MouseExited

    private void roundPanel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel13MouseEntered
        changeColor(roundPanel13, new Color(0, 187, 255));
    }//GEN-LAST:event_roundPanel13MouseEntered

    private void roundPanel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel13MouseExited
        changeColor(roundPanel13, new Color(0,153,255));
    }//GEN-LAST:event_roundPanel13MouseExited

    private void roundPanel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel14MouseEntered
        changeColor(roundPanel14, new Color(252, 3, 90));
    }//GEN-LAST:event_roundPanel14MouseEntered

    private void roundPanel14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel14MouseExited
        if(jLabel14.getText().equals("CHẾ ĐỘ BẢO TRÌ"))
        changeColor(roundPanel14, new Color(252,3,28));
        else changeColor(roundPanel14, new Color(252,102,102));
    }//GEN-LAST:event_roundPanel14MouseExited

    private void roundPanel20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel20MouseEntered
        changeColor(roundPanel20, new Color(105, 153, 0));
    }//GEN-LAST:event_roundPanel20MouseEntered

    private void roundPanel20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel20MouseExited
        changeColor(roundPanel20, new Color(0,153,0));
    }//GEN-LAST:event_roundPanel20MouseExited

    private void roundPanel21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel21MouseEntered
        changeColor(roundPanel21, new Color(105, 153, 0));
    }//GEN-LAST:event_roundPanel21MouseEntered

    private void roundPanel21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel21MouseExited
        changeColor(roundPanel21, new Color(0,153,0));
    }//GEN-LAST:event_roundPanel21MouseExited

    private void roundPanel22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel22MouseEntered
        changeColor(roundPanel22, new Color(0, 187, 255));
    }//GEN-LAST:event_roundPanel22MouseEntered

    private void roundPanel22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel22MouseExited
        changeColor(roundPanel22, new Color(0,153,255));
    }//GEN-LAST:event_roundPanel22MouseExited

    private void roundPanel23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel23MouseEntered
        changeColor(roundPanel23, new Color(0, 187, 255));
    }//GEN-LAST:event_roundPanel23MouseEntered

    private void roundPanel23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel23MouseExited
        changeColor(roundPanel23, new Color(0,153,255));
    }//GEN-LAST:event_roundPanel23MouseExited

    private void roundPanel24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel24MouseEntered
        changeColor(roundPanel24, new Color(0, 187, 255));
    }//GEN-LAST:event_roundPanel24MouseEntered

    private void roundPanel24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel24MouseExited
        changeColor(roundPanel24, new Color(0,153,255));
    }//GEN-LAST:event_roundPanel24MouseExited

    private void roundPanel26MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel26MouseEntered
        changeColor(roundPanel26, new Color(220, 86, 13));
    }//GEN-LAST:event_roundPanel26MouseEntered

    private void roundPanel26MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel26MouseExited
        changeColor(roundPanel26, new Color(255,90,0));
    }//GEN-LAST:event_roundPanel26MouseExited

    private void roundPanel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel26MouseClicked
        roundPanel16.setVisible(false);
        multipleButton1.setVisible(true);        
    }//GEN-LAST:event_roundPanel26MouseClicked

    private void roundPanel32MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel32MouseEntered
        changeColor(roundPanel32, new Color(105, 153, 0));
    }//GEN-LAST:event_roundPanel32MouseEntered

    private void roundPanel32MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel32MouseExited
        changeColor(roundPanel32, new Color(0,153,0));
    }//GEN-LAST:event_roundPanel32MouseExited

    private void roundPanel33MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel33MouseEntered
        changeColor(roundPanel33, new Color(105, 153, 0));
    }//GEN-LAST:event_roundPanel33MouseEntered

    private void roundPanel33MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel33MouseExited
        changeColor(roundPanel33, new Color(0,153,0));
    }//GEN-LAST:event_roundPanel33MouseExited

    private void roundPanel34MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel34MouseEntered
        changeColor(roundPanel34, new Color(0, 187, 255));
    }//GEN-LAST:event_roundPanel34MouseEntered

    private void roundPanel34MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel34MouseExited
        changeColor(roundPanel34, new Color(0,153,255));
    }//GEN-LAST:event_roundPanel34MouseExited

    private void roundPanel35MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel35MouseEntered
        changeColor(roundPanel35, new Color(0, 187, 255));
    }//GEN-LAST:event_roundPanel35MouseEntered

    private void roundPanel35MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel35MouseExited
        changeColor(roundPanel35, new Color(0,153,255));
    }//GEN-LAST:event_roundPanel35MouseExited

    private void roundPanel36MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel36MouseEntered
        changeColor(roundPanel36, new Color(0, 187, 255));
    }//GEN-LAST:event_roundPanel36MouseEntered

    private void roundPanel36MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel36MouseExited
        changeColor(roundPanel36, new Color(0,153,255));
    }//GEN-LAST:event_roundPanel36MouseExited

    private void roundPanel37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel37MouseClicked
        roundPanel25.setVisible(false);
        multipleButton1.setVisible(true);        
    }//GEN-LAST:event_roundPanel37MouseClicked

    private void roundPanel37MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel37MouseEntered
        changeColor(roundPanel37, new Color(220, 86, 13));
    }//GEN-LAST:event_roundPanel37MouseEntered

    private void roundPanel37MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel37MouseExited
       changeColor(roundPanel37, new Color(255,90,0));
    }//GEN-LAST:event_roundPanel37MouseExited

    private void roundPanel49MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel49MouseExited
        changeColor(roundPanel49, new Color(255,90,0));
    }//GEN-LAST:event_roundPanel49MouseExited

    private void roundPanel49MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel49MouseEntered
        changeColor(roundPanel49, new Color(220, 86, 13));
    }//GEN-LAST:event_roundPanel49MouseEntered

    private void roundPanel49MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel49MouseClicked
        roundPanel1.setVisible(false);
        multipleButton2.setVisible(true);        
    }//GEN-LAST:event_roundPanel49MouseClicked

    private void roundPanel48MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel48MouseExited
        changeColor(roundPanel48, new Color(0,153,255));
    }//GEN-LAST:event_roundPanel48MouseExited

    private void roundPanel48MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel48MouseEntered
        changeColor(roundPanel48, new Color(0, 187, 255));
    }//GEN-LAST:event_roundPanel48MouseEntered

    private void roundPanel47MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel47MouseExited
        changeColor(roundPanel47, new Color(0,153,255));
    }//GEN-LAST:event_roundPanel47MouseExited

    private void roundPanel47MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel47MouseEntered
        changeColor(roundPanel47, new Color(0, 187, 255));
    }//GEN-LAST:event_roundPanel47MouseEntered

    private void roundPanel46MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel46MouseExited
        changeColor(roundPanel46, new Color(0,153,255));
    }//GEN-LAST:event_roundPanel46MouseExited

    private void roundPanel46MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel46MouseEntered
        changeColor(roundPanel46, new Color(0, 187, 255));
    }//GEN-LAST:event_roundPanel46MouseEntered

    private void roundPanel45MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel45MouseExited
        changeColor(roundPanel45, new Color(0,153,0));
    }//GEN-LAST:event_roundPanel45MouseExited

    private void roundPanel45MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel45MouseEntered
        changeColor(roundPanel45, new Color(105,153,0));
    }//GEN-LAST:event_roundPanel45MouseEntered

    private void roundPanel44MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel44MouseExited
        changeColor(roundPanel44, new Color(0,153,0));
    }//GEN-LAST:event_roundPanel44MouseExited

    private void roundPanel44MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel44MouseEntered
        changeColor(roundPanel44, new Color(105, 153, 0));
    }//GEN-LAST:event_roundPanel44MouseEntered

    private void roundPanel53MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel53MouseEntered
        changeColor(roundPanel53, new Color(0, 187, 255));
    }//GEN-LAST:event_roundPanel53MouseEntered

    private void roundPanel53MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel53MouseExited
        changeColor(roundPanel53, new Color(0,153,255));
    }//GEN-LAST:event_roundPanel53MouseExited

    private void roundPanel54MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel54MouseEntered
        changeColor(roundPanel54, new Color(0, 187, 255));
    }//GEN-LAST:event_roundPanel54MouseEntered

    private void roundPanel54MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel54MouseExited
        changeColor(roundPanel54, new Color(0,153,255));
    }//GEN-LAST:event_roundPanel54MouseExited

    private void roundPanel58MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel58MouseEntered
        changeColor(roundPanel58, new Color(105, 153, 0));        
    }//GEN-LAST:event_roundPanel58MouseEntered

    private void roundPanel58MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel58MouseExited
        changeColor(roundPanel58, new Color(0,153,0));
    }//GEN-LAST:event_roundPanel58MouseExited

    private void roundPanel59MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel59MouseEntered
        changeColor(roundPanel59, new Color(105, 153, 0));        
    }//GEN-LAST:event_roundPanel59MouseEntered

    private void roundPanel59MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel59MouseExited
        changeColor(roundPanel59, new Color(0,153,0));
    }//GEN-LAST:event_roundPanel59MouseExited

    private void roundPanel60MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel60MouseEntered
        changeColor(roundPanel60, new Color(0, 187, 255));
    }//GEN-LAST:event_roundPanel60MouseEntered

    private void roundPanel60MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel60MouseExited
        changeColor(roundPanel60, new Color(0,153,255));
    }//GEN-LAST:event_roundPanel60MouseExited

    private void roundPanel61MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel61MouseEntered
        changeColor(roundPanel61, new Color(0, 187, 255));
    }//GEN-LAST:event_roundPanel61MouseEntered

    private void roundPanel61MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel61MouseExited
        changeColor(roundPanel61, new Color(0,153,255));
    }//GEN-LAST:event_roundPanel61MouseExited

    private void roundPanel62MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel62MouseEntered
        changeColor(roundPanel62, new Color(0, 187, 255));
    }//GEN-LAST:event_roundPanel62MouseEntered

    private void roundPanel62MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel62MouseExited
        changeColor(roundPanel62, new Color(0,153,255));
    }//GEN-LAST:event_roundPanel62MouseExited

    private void roundPanel63MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel63MouseClicked
        roundPanel2.setVisible(false);
        multipleButton2.setVisible(true);        
    }//GEN-LAST:event_roundPanel63MouseClicked

    private void roundPanel63MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel63MouseEntered
        changeColor(roundPanel63, new Color(220, 86, 13));
    }//GEN-LAST:event_roundPanel63MouseEntered

    private void roundPanel63MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel63MouseExited
        changeColor(roundPanel63, new Color(255,90,0));
    }//GEN-LAST:event_roundPanel63MouseExited

    private void roundPanel65MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel65MouseEntered
        changeColor(roundPanel65, new Color(0, 187, 255));
    }//GEN-LAST:event_roundPanel65MouseEntered

    private void roundPanel65MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel65MouseExited
        changeColor(roundPanel65, new Color(0,153,255));
    }//GEN-LAST:event_roundPanel65MouseExited

    private void roundPanel66MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel66MouseEntered
        changeColor(roundPanel66, new Color(0, 187, 255));
    }//GEN-LAST:event_roundPanel66MouseEntered

    private void roundPanel66MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel66MouseExited
        changeColor(roundPanel66, new Color(0,153,255));
    }//GEN-LAST:event_roundPanel66MouseExited

    private void roundPanel83MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel83MouseEntered
        changeColor(roundPanel83, new Color(105, 153, 0));        
    }//GEN-LAST:event_roundPanel83MouseEntered

    private void roundPanel83MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel83MouseExited
        changeColor(roundPanel83, new Color(0,153,0));
    }//GEN-LAST:event_roundPanel83MouseExited

    private void roundPanel84MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel84MouseEntered
        changeColor(roundPanel84, new Color(105, 153, 0));        
    }//GEN-LAST:event_roundPanel84MouseEntered

    private void roundPanel84MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel84MouseExited
        changeColor(roundPanel84, new Color(0,153,0));
    }//GEN-LAST:event_roundPanel84MouseExited

    private void roundPanel85MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel85MouseEntered
        changeColor(roundPanel85, new Color(0, 187, 255));
    }//GEN-LAST:event_roundPanel85MouseEntered

    private void roundPanel85MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel85MouseExited
        changeColor(roundPanel85, new Color(0,153,255));
    }//GEN-LAST:event_roundPanel85MouseExited

    private void roundPanel86MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel86MouseEntered
        changeColor(roundPanel86, new Color(0, 187, 255));
    }//GEN-LAST:event_roundPanel86MouseEntered

    private void roundPanel86MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel86MouseExited
        changeColor(roundPanel86, new Color(0,153,255));
    }//GEN-LAST:event_roundPanel86MouseExited

    private void roundPanel87MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel87MouseEntered
        changeColor(roundPanel87, new Color(0, 187, 255));
    }//GEN-LAST:event_roundPanel87MouseEntered

    private void roundPanel87MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel87MouseExited
        changeColor(roundPanel87, new Color(0,153,255));
    }//GEN-LAST:event_roundPanel87MouseExited

    private void roundPanel88MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel88MouseClicked
        roundPanel3.setVisible(false);
        multipleButton2.setVisible(true);        
    }//GEN-LAST:event_roundPanel88MouseClicked

    private void roundPanel88MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel88MouseEntered
        changeColor(roundPanel88, new Color(220, 86, 13));
    }//GEN-LAST:event_roundPanel88MouseEntered

    private void roundPanel88MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel88MouseExited
        changeColor(roundPanel88, new Color(255,90,0));
    }//GEN-LAST:event_roundPanel88MouseExited

    private void roundPanel72MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel72MouseEntered
        changeColor(roundPanel72, new Color(105, 153, 0));        
    }//GEN-LAST:event_roundPanel72MouseEntered

    private void roundPanel72MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel72MouseExited
        changeColor(roundPanel72, new Color(0,153,0));
    }//GEN-LAST:event_roundPanel72MouseExited

    private void roundPanel73MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel73MouseEntered
        changeColor(roundPanel73, new Color(105, 153, 0));        
    }//GEN-LAST:event_roundPanel73MouseEntered

    private void roundPanel73MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel73MouseExited
        changeColor(roundPanel73, new Color(0,153,0));
    }//GEN-LAST:event_roundPanel73MouseExited

    private void roundPanel74MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel74MouseEntered
        changeColor(roundPanel74, new Color(0, 187, 255));
    }//GEN-LAST:event_roundPanel74MouseEntered

    private void roundPanel74MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel74MouseExited
        changeColor(roundPanel74, new Color(0,153,255));
    }//GEN-LAST:event_roundPanel74MouseExited

    private void roundPanel75MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel75MouseEntered
        changeColor(roundPanel75, new Color(0, 187, 255));
    }//GEN-LAST:event_roundPanel75MouseEntered

    private void roundPanel75MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel75MouseExited
        changeColor(roundPanel75, new Color(0,153,255));
    }//GEN-LAST:event_roundPanel75MouseExited

    private void roundPanel76MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel76MouseEntered
        changeColor(roundPanel76, new Color(0, 187, 255));
    }//GEN-LAST:event_roundPanel76MouseEntered

    private void roundPanel76MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel76MouseExited
        changeColor(roundPanel76, new Color(0,153,255));
    }//GEN-LAST:event_roundPanel76MouseExited

    private void roundPanel77MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel77MouseClicked
        roundPanel40.setVisible(false);
        multipleButton2.setVisible(true);        
    }//GEN-LAST:event_roundPanel77MouseClicked

    private void roundPanel77MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel77MouseEntered
        changeColor(roundPanel77, new Color(220, 86, 13));
    }//GEN-LAST:event_roundPanel77MouseEntered

    private void roundPanel77MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel77MouseExited
        changeColor(roundPanel77, new Color(255,90,0));
    }//GEN-LAST:event_roundPanel77MouseExited

    private void roundPanel79MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel79MouseEntered
        changeColor(roundPanel79, new Color(0, 187, 255));
    }//GEN-LAST:event_roundPanel79MouseEntered

    private void roundPanel79MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel79MouseExited
        changeColor(roundPanel79, new Color(0,153,255));
    }//GEN-LAST:event_roundPanel79MouseExited

    private void roundPanel91MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel91MouseEntered
        changeColor(roundPanel91, new Color(0, 187, 255));
    }//GEN-LAST:event_roundPanel91MouseEntered

    private void roundPanel91MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel91MouseExited
        changeColor(roundPanel91, new Color(0,153,255));
    }//GEN-LAST:event_roundPanel91MouseExited

    private void roundPanel96MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel96MouseEntered
        changeColor(roundPanel96, new Color(0, 187, 255));
    }//GEN-LAST:event_roundPanel96MouseEntered

    private void roundPanel96MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel96MouseExited
        changeColor(roundPanel96, new Color(0,153,255));
    }//GEN-LAST:event_roundPanel96MouseExited

    private void jLabel103MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel103MouseClicked
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileFilter() {

           @Override
           public String getDescription() {
               return "JPG Images (*.jpg)";
           }

           @Override
           public boolean accept(File f) {
               if (f.isDirectory()) {
                   return true;
               } else {
                   String filename = f.getName().toLowerCase();
                   return filename.endsWith(".jpg") || filename.endsWith(".jpeg") ;
               }
           }
        });
        int result = fileChooser.showOpenDialog(null);
    }//GEN-LAST:event_jLabel103MouseClicked

    private void roundPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel8MouseClicked
        /////
        roundPanel11.setVisible(true);
        roundPanel12.setVisible(true);
        roundPanel13.setVisible(true);
        String ma = jTextField1.getText();
        for (int i = 0; i<table2.getRowCount();i++)
            if(String.valueOf(table2.getValueAt(i, 0)).equals(ma)){
                    roundPanel11.setVisible(true);
                    roundPanel12.setVisible(true);
                    roundPanel13.setVisible(true);
                    jTextField2.setText(ma);
                    jTextField2.setEnabled(false);
                    jTextField4.setText(String.valueOf(table2.getValueAt(i, 3)));
                    roundPanel10.setVisible(false);
                    if(new SINH_VIEN_DAO().getThongTin(ma, String.valueOf(table2.getValueAt(i, 3))).getFlag().equals(false)){
                    jLabel13.setText("MỞ KHÓA");
                    }
                    else jLabel13.setText("VÔ HIỆU");
                    break;
                }
            else{ 
                    jTextField2.setText("");
                    jTextField4.setText("");
                    roundPanel10.setVisible(true);
                    roundPanel11.setVisible(false);
                    roundPanel12.setVisible(false);
                    roundPanel13.setVisible(false);
                    jTextField2.setEnabled(true);
            }
               
    /////////
    }//GEN-LAST:event_roundPanel8MouseClicked

    private void roundPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel9MouseClicked
        lam_moi_sinh_vien();
    }//GEN-LAST:event_roundPanel9MouseClicked

    private void roundPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel10MouseClicked
        String ma = jTextField2.getText();
        String matkhau = jTextField4.getText();
        if (ma.equals("") || matkhau.equals("")) 
        {JOptionPane.showMessageDialog(null, "Bạn phải nhập đầy đủ thông tin","Thông báo",JOptionPane.INFORMATION_MESSAGE);}
        else
        try{
        int kq = new SINH_VIEN_DAO().insert(new SINH_VIEN(ma,matkhau));
        if (kq==1){
        JOptionPane.showMessageDialog(null, "Bạn đã thêm thành công","Thông báo",JOptionPane.INFORMATION_MESSAGE);
        lam_moi_sinh_vien();}
        else
        JOptionPane.showMessageDialog(null, "Thêm không thành công","Thông báo",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception ex){
        }
    }//GEN-LAST:event_roundPanel10MouseClicked

    private void roundPanel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel11MouseClicked
        String ma = jTextField2.getText();
        String matkhau = jTextField4.getText();
        SINH_VIEN x = new SINH_VIEN_DAO().getThongTin3(ma);
        x.setMatKhau(matkhau);
        if (matkhau.equals("")) 
        {JOptionPane.showMessageDialog(null, "Tài khoản yêu cầu có mật khẩu","Thông báo",JOptionPane.INFORMATION_MESSAGE);}
        else
        try{
        int kq = new SINH_VIEN_DAO().update(ma, x);
        if (kq==1){
        JOptionPane.showMessageDialog(null, "Bạn đã sửa thành công","Thông báo",JOptionPane.INFORMATION_MESSAGE);
        lam_moi_sinh_vien();}
        else
        JOptionPane.showMessageDialog(null, "Sửa không thành công","Thông báo",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception ex){
        }
    }//GEN-LAST:event_roundPanel11MouseClicked

    private void roundPanel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel12MouseClicked
        String ma = jTextField2.getText();
        try{
        int kq = new SINH_VIEN_DAO().XoaDong(ma);
        if (kq==1){
        JOptionPane.showMessageDialog(null, "Bạn đã xóa thành công","Thông báo",JOptionPane.INFORMATION_MESSAGE);
        lam_moi_sinh_vien();}
        else
        JOptionPane.showMessageDialog(null, "Xóa không thành công","Thông báo",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception ex){
        }
    }//GEN-LAST:event_roundPanel12MouseClicked

    private void roundPanel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel13MouseClicked
        String ma = jTextField2.getText();
        if(new SINH_VIEN_DAO().getThongTin3(ma).getFlag()==false)
        try{
            int kq = new SINH_VIEN_DAO().KichHoat(ma);
            jLabel13.setText("VÔ HIỆU");
        }
        catch(Exception ex){
        }
        else
            try{
            int kq = new SINH_VIEN_DAO().VoHieu(ma);
            jLabel13.setText("MỞ KHÓA");
        }
        catch(Exception ex){
        }
    }//GEN-LAST:event_roundPanel13MouseClicked

    private void roundPanel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel14MouseClicked
        int kq;
        if (new DIEU_KHIEN_DAO().getVoHieuHoa().isVoHieuHoaSinhVien()== false){
            kq = new DIEU_KHIEN_DAO().KichHoat();
            jLabel14.setText("CHẾ ĐỘ BẢO TRÌ");
            JOptionPane.showMessageDialog(null, "Sinh viên có thể đăng nhập vào hệ thống","Thay đổi",JOptionPane.INFORMATION_MESSAGE);
        
        }
        else {
            kq = new DIEU_KHIEN_DAO().VoHieu();
            jLabel14.setText("DỪNG CHẾ ĐỘ BẢO TRÌ");
            roundPanel14.setBackground(new Color(255,102,102));
            JOptionPane.showMessageDialog(null, "Chặn toàn bộ sinh viên truy cập vào hệ thống","Thay đổi",JOptionPane.INFORMATION_MESSAGE);
        
        }
    }//GEN-LAST:event_roundPanel14MouseClicked

    private void roundPanel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel20MouseClicked
        lam_moi_hoc_ky();
    }//GEN-LAST:event_roundPanel20MouseClicked

    private void roundPanel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel22MouseClicked
        String ma = jTextField6.getText();
        String nam = jTextField7.getText();
        String thutu = jTextField8.getText();
        if (ma.equals("") || nam.equals("") || thutu.equals("")) 
        {JOptionPane.showMessageDialog(null, "Bạn phải nhập đầy đủ thông tin","Thông báo",JOptionPane.INFORMATION_MESSAGE);}
        else
        try{
        int kq = new HOC_KY_DAO().insert(new HOC_KY(ma,nam,Integer.valueOf(thutu),true));
        if (kq==1){
        JOptionPane.showMessageDialog(null, "Bạn đã thêm thành công","Thông báo",JOptionPane.INFORMATION_MESSAGE);
        lam_moi_hoc_ky();}
        else
        JOptionPane.showMessageDialog(null, "Thêm không thành công","Thông báo",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception ex){
        }
    }//GEN-LAST:event_roundPanel22MouseClicked

    private void roundPanel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel23MouseClicked
        String ma = jTextField6.getText();
        String nam = jTextField7.getText();
        String thutu = jTextField8.getText();
        HOC_KY x = new HOC_KY_DAO().getThongTin(ma);
        x.setNam(nam);
        x.setSoThuTu(Integer.valueOf(thutu));
        if (nam.equals("")) 
        {JOptionPane.showMessageDialog(null, "Học kỳ yêu cầu có năm học","Thông báo",JOptionPane.INFORMATION_MESSAGE);}
        else if (thutu.equals("")) 
        {JOptionPane.showMessageDialog(null, "Học kỳ yêu cầu có thứ tự học kỳ","Thông báo",JOptionPane.INFORMATION_MESSAGE);}
        else
        try{
        int kq = new HOC_KY_DAO().update(ma, x);
        if (kq==1){
        JOptionPane.showMessageDialog(null, "Bạn đã sửa thành công","Thông báo",JOptionPane.INFORMATION_MESSAGE);
        lam_moi_hoc_ky();}
        else
        JOptionPane.showMessageDialog(null, "Sửa không thành công","Thông báo",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception ex){
        }
    }//GEN-LAST:event_roundPanel23MouseClicked

    private void roundPanel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel21MouseClicked

        String ma = jTextField5.getText();
        for (int i = 0; i<table3.getRowCount();i++)
            if(String.valueOf(table3.getValueAt(i, 0)).equals(ma)){
                    roundPanel24.setVisible(true);
                    roundPanel23.setVisible(true);
                    jTextField6.setText(ma);
                    jTextField6.setEnabled(false);
                    jTextField7.setText(String.valueOf(table3.getValueAt(i, 1)));
                    jTextField8.setText(String.valueOf(table3.getValueAt(i, 2)));
                    roundPanel22.setVisible(false);
                    break;
                }
            else{ 
                
                    jTextField6.setText("");
                    jTextField7.setText("");
                    jTextField8.setText("");
                    roundPanel22.setVisible(true);
                    roundPanel23.setVisible(false);
                    roundPanel24.setVisible(false);
                    jTextField6.setEnabled(true);
            }
    }//GEN-LAST:event_roundPanel21MouseClicked

    private void roundPanel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel24MouseClicked
        String ma = jTextField6.getText();
        try{
        int kq = new HOC_KY_DAO().XoaDong(ma);
        if (kq==1){
        JOptionPane.showMessageDialog(null, "Bạn đã xóa thành công","Thông báo",JOptionPane.INFORMATION_MESSAGE);
        lam_moi_hoc_ky();}
        else
        JOptionPane.showMessageDialog(null, "Xóa không thành công","Thông báo",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception ex){
        }
    }//GEN-LAST:event_roundPanel24MouseClicked

    private void roundPanel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel32MouseClicked
        lam_moi_mon_hoc();
    }//GEN-LAST:event_roundPanel32MouseClicked

    private void roundPanel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel33MouseClicked

        String ma = jTextField9.getText();
        for (int i = 0; i<table4.getRowCount();i++)
            if(String.valueOf(table4.getValueAt(i, 0)).equals(ma)){
                    roundPanel35.setVisible(true);
                    roundPanel36.setVisible(true);
                    jTextField10.setText(ma);
                    jTextField10.setEnabled(false);
                    jTextField11.setText(String.valueOf(table4.getValueAt(i, 1)));
                    jTextField12.setText(String.valueOf(new MON_HOC_DAO().getThongTin(ma).getSoTinChi()));
                    jTextField13.setText(String.valueOf(new MON_HOC_DAO().getThongTin(ma).getSoTiet()));
                    if(String.valueOf(new MON_HOC_DAO().getThongTin(ma).getTienQuyet()).equals("null")||String.valueOf(new MON_HOC_DAO().getThongTin(ma).getTienQuyet()).equals("0"))
                        jTextField14.setText("");
                    else jTextField14.setText(String.valueOf(new MON_HOC_DAO().getThongTin(ma).getTienQuyet()));
                    if(String.valueOf(new MON_HOC_DAO().getThongTin(ma).getSongHanh()).equals("null")||String.valueOf(new MON_HOC_DAO().getThongTin(ma).getSongHanh()).equals("0"))
                        jTextField15.setText("");
                    else jTextField15.setText(String.valueOf(new MON_HOC_DAO().getThongTin(ma).getSongHanh()));
                    if(new MON_HOC_DAO().getThongTin(ma).isBatBuoc()==true){
                        jCheckBoxCustom1.setSelected(true);
                        //jCheckBoxCustom2.setSelected(false);
                    }
                    else{
                        //jCheckBoxCustom2.setSelected(true);
                        jCheckBoxCustom1.setSelected(false);
                    }
                    
                    roundPanel34.setVisible(false);
                    break;
                }
            else{ 
                
                    jTextField10.setText("");
                    jTextField11.setText("");
                    jTextField12.setText("");
                    jTextField13.setText("");
                    jTextField14.setText("");
                    jTextField15.setText("");
                    roundPanel34.setVisible(true);
                    roundPanel35.setVisible(false);
                    roundPanel36.setVisible(false);
                    jTextField10.setEnabled(true);
            }
    }//GEN-LAST:event_roundPanel33MouseClicked

    private void roundPanel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel35MouseClicked
        String ma = jTextField10.getText();
        String ten = jTextField11.getText();
        String tinchi = jTextField12.getText();
        String tiethoc = jTextField13.getText();
        String tienquyet = jTextField14.getText();
        String songhanh = jTextField15.getText();
        Boolean batbuoc = jCheckBoxCustom1.isSelected();
        MON_HOC x = new MON_HOC_DAO().getThongTin(ma);
        x.setTenMon(ten);
        x.setSoTinChi(Integer.valueOf(tinchi));
        x.setSoTiet(Integer.valueOf(tiethoc));
        if (tienquyet.equals("")) x.setTienQuyet("0");
        else x.setTienQuyet(tienquyet);
        if (songhanh.equals("")) x.setSongHanh("0");
        else x.setSongHanh(songhanh);
        x.setBatBuoc(batbuoc);
        if (ten.equals("")||tinchi.equals("")||tiethoc.equals("")) 
        {JOptionPane.showMessageDialog(null, "Bạn phải nhập đủ thông tin","Thông báo",JOptionPane.INFORMATION_MESSAGE);}
        else
        try{
        int kq = new MON_HOC_DAO().update(ma, x);
        if(new MON_HOC_DAO().getThongTin(ma).getTienQuyet().equals("0"))
            kq = new MON_HOC_DAO().update2(ma);
        if(new MON_HOC_DAO().getThongTin(ma).getSongHanh().equals("0"))
            kq = new MON_HOC_DAO().update3(ma);
        if (kq==1){
        JOptionPane.showMessageDialog(null, "Bạn đã sửa thành công","Thông báo",JOptionPane.INFORMATION_MESSAGE);
        lam_moi_mon_hoc();}
        else
        JOptionPane.showMessageDialog(null, "Sửa không thành công","Thông báo",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception ex){
        }
    }//GEN-LAST:event_roundPanel35MouseClicked

    private void roundPanel36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roundPanel36MouseClicked
        String ma = jTextField10.getText();
        try{
        int kq = new MON_HOC_DAO().XoaDong(ma);
        if (kq==1){
        JOptionPane.showMessageDialog(null, "Bạn đã xóa thành công","Thông báo",JOptionPane.INFORMATION_MESSAGE);
        lam_moi_mon_hoc();}
        else
        JOptionPane.showMessageDialog(null, "Xóa không thành công","Thông báo",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(Exception ex){
        }
    }//GEN-LAST:event_roundPanel36MouseClicked

     private void lam_moi_sinh_vien() { 
    ArrayList<SINH_VIEN> danhsachsinhvien = new SINH_VIEN_DAO().getDataList();
        roundPanel10.setVisible(true);
        roundPanel11.setVisible(false);
        roundPanel12.setVisible(false);
        roundPanel13.setVisible(false);
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField4.setText("");
        jTextField2.setEnabled(true);
        table2.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                    "MSSV", "Họ", "Tên ", "Mật khẩu"
                }
            ) {
                Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
                };
                boolean[] canEdit = new boolean [] {
                    false, false, false, false
                };

                public Class getColumnClass(int columnIndex) {
                    return types [columnIndex];
                }

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
        for(int i=0;i<danhsachsinhvien.size();i++){
            String ma = danhsachsinhvien.get(i).getMaSV();
            String ho = danhsachsinhvien.get(i).getHo();
            String ten = danhsachsinhvien.get(i).getTen();
            String matkhau = danhsachsinhvien.get(i).getMatKhau();
            Boolean flag = danhsachsinhvien.get(i).getFlag();
            if (matkhau.equals("")){}
            else{
                Object[] data = {ma, ho, ten, matkhau};
                table2.addRow(data);
            }
            
        }
    }
     
           private void lam_moi_hoc_ky() { 
     ArrayList<HOC_KY> danhsachhocky = new HOC_KY_DAO().getDataList();
        roundPanel22.setVisible(true);
        roundPanel23.setVisible(false);
        roundPanel24.setVisible(false);
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField6.setEnabled(true);
        table3.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                    "Mã hoc kỳ", "Năm học", "Thứ tự"
                }
            ) {
                Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
                };
                boolean[] canEdit = new boolean [] {
                    false, false, false, false
                };

                public Class getColumnClass(int columnIndex) {
                    return types [columnIndex];
                }

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
        for(int i=0;i<danhsachhocky.size();i++){
            String ma = danhsachhocky.get(i).getMaHocKy();
            String nam = danhsachhocky.get(i).getNam();
            int thutu = danhsachhocky.get(i).getSoThuTu();
            Boolean flag = danhsachhocky.get(i).isFlag();
            if (flag.equals(false)){}
            else{
                Object[] data = {ma, nam, thutu};
                table3.addRow(data);
            }
            
        }
    }
           
           private void lam_moi_mon_hoc() { 
     ArrayList<MON_HOC> danhsachmonhoc = new MON_HOC_DAO().seclectAll();
        roundPanel34.setVisible(true);
        roundPanel35.setVisible(false);
        roundPanel36.setVisible(false);
        jTextField9.setText("");
        jTextField10.setText("");
        jTextField11.setText("");
        jTextField12.setText("");
        jTextField13.setText("");
        jTextField14.setText("");
        jTextField15.setText("");
        jCheckBoxCustom1.setSelected(false);
        jTextField10.setEnabled(true);
        table4.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                    "Mã hoc phần", "Tên học phần"
                }
            ) {
                Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
                };
                boolean[] canEdit = new boolean [] {
                    false, false, false, false
                };

                public Class getColumnClass(int columnIndex) {
                    return types [columnIndex];
                }

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
        for(int i=0;i<danhsachmonhoc.size();i++){
            String ma = danhsachmonhoc.get(i).getMaMon();
            String ten = danhsachmonhoc.get(i).getTenMon();
            Boolean flag = danhsachmonhoc.get(i).isFlag();
            if (flag.equals(false)){}
            else{
                Object[] data = {ma,ten};
                table4.addRow(data);
            }
            
        }
    }
     
           private void lam_moi_khoa() { 
     ArrayList<MON_HOC> danhsachmonhoc = new MON_HOC_DAO().seclectAll();
        roundPanel34.setVisible(true);
        roundPanel35.setVisible(false);
        roundPanel36.setVisible(false);
        jTextField16.setText("");
        jTextField17.setText("");
        jTextField18.setText("");
        jTextField19.setText("");
        jCheckBoxCustom1.setSelected(false);
        jTextField10.setEnabled(true);
        table4.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                    "Mã hoc phần", "Tên học phần"
                }
            ) {
                Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
                };
                boolean[] canEdit = new boolean [] {
                    false, false, false, false
                };

                public Class getColumnClass(int columnIndex) {
                    return types [columnIndex];
                }

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
        for(int i=0;i<danhsachmonhoc.size();i++){
            String ma = danhsachmonhoc.get(i).getMaMon();
            String ten = danhsachmonhoc.get(i).getTenMon();
            Boolean flag = danhsachmonhoc.get(i).isFlag();
            if (flag.equals(false)){}
            else{
                Object[] data = {ma,ten};
                table4.addRow(data);
            }
            
        }
    }
           
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DashboardJFrameAdmin2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardJFrameAdmin2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardJFrameAdmin2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardJFrameAdmin2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DashboardJFrameAdmin2().setVisible(true);
            }
        });
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javaapplication24.RoundPanel CapNhatTaiKhoanSinhVien;
    private javaapplication24.RoundPanel CapNhatTaiKhoanSinhVien1;
    private javaapplication24.RoundPanel CapNhatTaiKhoanSinhVien2;
    private javaapplication24.RoundPanel CapNhatTaiKhoanSinhVien3;
    private javaapplication24.RoundPanel CapNhatTaiKhoanSinhVien4;
    private javaapplication24.RoundPanel CapNhatTaiKhoanSinhVien5;
    private javaapplication24.RoundPanel CapNhatTaiKhoanSinhVien6;
    private javaapplication24.RoundPanel CapNhatTaiKhoanSinhVien7;
    private javaapplication24.RoundPanel GuiThongbao;
    private javaapplication24.RoundPanel Homthu;
    private javaapplication24.RoundPanel NhapDiem;
    private javaapplication24.RoundPanel QuanLyGiangVien;
    private javaapplication24.RoundPanel QuanlyBomon;
    private javaapplication24.RoundPanel QuanlyHoctap;
    private javaapplication24.RoundPanel QuanlySinhvien;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Title1;
    private javax.swing.JLabel Title10;
    private javax.swing.JLabel Title11;
    private javax.swing.JLabel Title12;
    private javax.swing.JLabel Title13;
    private javax.swing.JLabel Title14;
    private javax.swing.JLabel Title2;
    private javax.swing.JLabel Title3;
    private javax.swing.JLabel Title4;
    private javax.swing.JLabel Title5;
    private javax.swing.JLabel Title6;
    private javax.swing.JLabel Title7;
    private javax.swing.JLabel Title8;
    private javax.swing.JLabel Title9;
    private javax.swing.JPanel Titlebar;
    private javaapplication24.JCheckBoxCustom jCheckBoxCustom1;
    private javaapplication24.JCheckBoxCustom jCheckBoxCustom2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javaapplication24.MaterialTabbed materialTabbed1;
    private javaapplication24.MultipleButton multipleButton1;
    private javaapplication24.MultipleButton multipleButton2;
    private javaapplication24.RoundPanel roundPanel1;
    private javaapplication24.RoundPanel roundPanel10;
    private javaapplication24.RoundPanel roundPanel100;
    private javaapplication24.RoundPanel roundPanel101;
    private javaapplication24.RoundPanel roundPanel102;
    private javaapplication24.RoundPanel roundPanel11;
    private javaapplication24.RoundPanel roundPanel12;
    private javaapplication24.RoundPanel roundPanel13;
    private javaapplication24.RoundPanel roundPanel14;
    private javaapplication24.RoundPanel roundPanel15;
    private javaapplication24.RoundPanel roundPanel16;
    private javaapplication24.RoundPanel roundPanel17;
    private javaapplication24.RoundPanel roundPanel18;
    private javaapplication24.RoundPanel roundPanel19;
    private javaapplication24.RoundPanel roundPanel2;
    private javaapplication24.RoundPanel roundPanel20;
    private javaapplication24.RoundPanel roundPanel21;
    private javaapplication24.RoundPanel roundPanel22;
    private javaapplication24.RoundPanel roundPanel23;
    private javaapplication24.RoundPanel roundPanel24;
    private javaapplication24.RoundPanel roundPanel25;
    private javaapplication24.RoundPanel roundPanel26;
    private javaapplication24.RoundPanel roundPanel27;
    private javaapplication24.RoundPanel roundPanel28;
    private javaapplication24.RoundPanel roundPanel29;
    private javaapplication24.RoundPanel roundPanel3;
    private javaapplication24.RoundPanel roundPanel30;
    private javaapplication24.RoundPanel roundPanel31;
    private javaapplication24.RoundPanel roundPanel32;
    private javaapplication24.RoundPanel roundPanel33;
    private javaapplication24.RoundPanel roundPanel34;
    private javaapplication24.RoundPanel roundPanel35;
    private javaapplication24.RoundPanel roundPanel36;
    private javaapplication24.RoundPanel roundPanel37;
    private javaapplication24.RoundPanel roundPanel38;
    private javaapplication24.RoundPanel roundPanel39;
    private javaapplication24.RoundPanel roundPanel4;
    private javaapplication24.RoundPanel roundPanel40;
    private javaapplication24.RoundPanel roundPanel41;
    private javaapplication24.RoundPanel roundPanel42;
    private javaapplication24.RoundPanel roundPanel43;
    private javaapplication24.RoundPanel roundPanel44;
    private javaapplication24.RoundPanel roundPanel45;
    private javaapplication24.RoundPanel roundPanel46;
    private javaapplication24.RoundPanel roundPanel47;
    private javaapplication24.RoundPanel roundPanel48;
    private javaapplication24.RoundPanel roundPanel49;
    private javaapplication24.RoundPanel roundPanel5;
    private javaapplication24.RoundPanel roundPanel50;
    private javaapplication24.RoundPanel roundPanel51;
    private javaapplication24.RoundPanel roundPanel52;
    private javaapplication24.RoundPanel roundPanel53;
    private javaapplication24.RoundPanel roundPanel54;
    private javaapplication24.RoundPanel roundPanel55;
    private javaapplication24.RoundPanel roundPanel56;
    private javaapplication24.RoundPanel roundPanel57;
    private javaapplication24.RoundPanel roundPanel58;
    private javaapplication24.RoundPanel roundPanel59;
    private javaapplication24.RoundPanel roundPanel6;
    private javaapplication24.RoundPanel roundPanel60;
    private javaapplication24.RoundPanel roundPanel61;
    private javaapplication24.RoundPanel roundPanel62;
    private javaapplication24.RoundPanel roundPanel63;
    private javaapplication24.RoundPanel roundPanel64;
    private javaapplication24.RoundPanel roundPanel65;
    private javaapplication24.RoundPanel roundPanel66;
    private javaapplication24.RoundPanel roundPanel67;
    private javaapplication24.RoundPanel roundPanel68;
    private javaapplication24.RoundPanel roundPanel69;
    private javaapplication24.RoundPanel roundPanel7;
    private javaapplication24.RoundPanel roundPanel70;
    private javaapplication24.RoundPanel roundPanel71;
    private javaapplication24.RoundPanel roundPanel72;
    private javaapplication24.RoundPanel roundPanel73;
    private javaapplication24.RoundPanel roundPanel74;
    private javaapplication24.RoundPanel roundPanel75;
    private javaapplication24.RoundPanel roundPanel76;
    private javaapplication24.RoundPanel roundPanel77;
    private javaapplication24.RoundPanel roundPanel78;
    private javaapplication24.RoundPanel roundPanel79;
    private javaapplication24.RoundPanel roundPanel8;
    private javaapplication24.RoundPanel roundPanel80;
    private javaapplication24.RoundPanel roundPanel81;
    private javaapplication24.RoundPanel roundPanel82;
    private javaapplication24.RoundPanel roundPanel83;
    private javaapplication24.RoundPanel roundPanel84;
    private javaapplication24.RoundPanel roundPanel85;
    private javaapplication24.RoundPanel roundPanel86;
    private javaapplication24.RoundPanel roundPanel87;
    private javaapplication24.RoundPanel roundPanel88;
    private javaapplication24.RoundPanel roundPanel89;
    private javaapplication24.RoundPanel roundPanel9;
    private javaapplication24.RoundPanel roundPanel90;
    private javaapplication24.RoundPanel roundPanel91;
    private javaapplication24.RoundPanel roundPanel92;
    private javaapplication24.RoundPanel roundPanel93;
    private javaapplication24.RoundPanel roundPanel94;
    private javaapplication24.RoundPanel roundPanel95;
    private javaapplication24.RoundPanel roundPanel96;
    private javaapplication24.RoundPanel roundPanel97;
    private javaapplication24.RoundPanel roundPanel98;
    private javaapplication24.RoundPanel roundPanel99;
    private javaapplication24.ScrollPaneWin11 scrollPaneWin111;
    private javaapplication24.ScrollPaneWin11 scrollPaneWin112;
    private javaapplication24.ScrollPaneWin11 scrollPaneWin113;
    private javaapplication24.ScrollPaneWin11 scrollPaneWin114;
    private javaapplication24.ScrollPaneWin11 scrollPaneWin115;
    private javaapplication24.ScrollPaneWin11 scrollPaneWin116;
    private javaapplication24.ScrollPaneWin11 scrollPaneWin117;
    private javaapplication24.ScrollPaneWin11 scrollPaneWin118;
    private javaapplication24.ScrollPaneWin11 scrollPaneWin119;
    private javaapplication24.ScrollPaneWin11 scrollPaneWin120;
    private javaapplication24.ScrollPaneWin11 scrollPaneWin121;
    private javaapplication24.ScrollPaneWin11 scrollPaneWin122;
    private javaapplication24.ScrollPaneWin11 scrollPaneWin123;
    private javaapplication24.ScrollPaneWin11 scrollPaneWin124;
    private javaapplication24.ScrollPaneWin11 scrollPaneWin125;
    private javaapplication24.ScrollPaneWin11 scrollPaneWin127;
    private javaapplication24.Table table10;
    private javaapplication24.Table table11;
    private javaapplication24.Table table12;
    private javaapplication24.Table table14;
    private javaapplication24.Table table2;
    private javaapplication24.Table table3;
    private javaapplication24.Table table4;
    private javaapplication24.Table table5;
    private javaapplication24.Table table6;
    private javaapplication24.Table table7;
    private javaapplication24.Table table8;
    private javaapplication24.Table table9;
    // End of variables declaration//GEN-END:variables
}
