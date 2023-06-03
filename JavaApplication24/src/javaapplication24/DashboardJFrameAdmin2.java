package javaapplication24;

import java.awt.*;
import javax.swing.*;

public class DashboardJFrameAdmin2 extends javax.swing.JFrame {
    private int x;
    private int y;
    public DashboardJFrameAdmin2() {
        initComponents();
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
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
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
        QuanlyHoctap = new javaapplication24.RoundPanel();
        roundPanel1 = new javaapplication24.RoundPanel();
        roundPanel2 = new javaapplication24.RoundPanel();
        roundPanel3 = new javaapplication24.RoundPanel();
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

        roundPanel7.add(roundPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 10, 80, 40));

        roundPanel8.setBackground(new java.awt.Color(0, 153, 0));
        roundPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
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

        roundPanel7.add(roundPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 55, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("MSSV:");
        roundPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 90, 40));

        jTextField2.setBackground(new Color(255, 255, 255, 180));
        jTextField2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 8, 3, 3));
        roundPanel7.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 210, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("TÀI KHOẢN:");
        roundPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 105, 90, 40));

        jTextField3.setBackground(new Color(255, 255, 255, 180));
        jTextField3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextField3.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 8, 3, 3));
        roundPanel7.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 105, 210, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("MẬT KHẨU:");
        roundPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 90, 40));

        jTextField4.setBackground(new Color(255, 255, 255, 180));
        jTextField4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextField4.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 8, 3, 3));
        roundPanel7.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 210, 40));

        roundPanel10.setBackground(new java.awt.Color(0, 153, 255));
        roundPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
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

        roundPanel6.setBackground(new Color(255, 255, 255, 128));
        QuanlySinhvien.add(roundPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 535, 355));

        materialTabbed1.addTab("QUẢN LÝ SINH VIÊN", QuanlySinhvien);

        QuanlyHoctap.setBackground(new java.awt.Color(255, 255, 255, 80));
        QuanlyHoctap.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        QuanlyHoctap.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        materialTabbed1.addTab("QUẢN LÝ HỌC TẬP", QuanlyHoctap);

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255, 80));
        materialTabbed1.addTab("tab3", roundPanel1);

        roundPanel2.setBackground(new java.awt.Color(255, 255, 255, 80));
        materialTabbed1.addTab("tab4", roundPanel2);

        roundPanel3.setBackground(new java.awt.Color(255, 255, 255, 80));
        materialTabbed1.addTab("tab5", roundPanel3);

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
        changeColor(roundPanel14, new Color(252,3,28));
    }//GEN-LAST:event_roundPanel14MouseExited

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
    private javaapplication24.RoundPanel QuanlyHoctap;
    private javaapplication24.RoundPanel QuanlySinhvien;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Title1;
    private javax.swing.JPanel Titlebar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javaapplication24.MaterialTabbed materialTabbed1;
    private javaapplication24.RoundPanel roundPanel1;
    private javaapplication24.RoundPanel roundPanel10;
    private javaapplication24.RoundPanel roundPanel11;
    private javaapplication24.RoundPanel roundPanel12;
    private javaapplication24.RoundPanel roundPanel13;
    private javaapplication24.RoundPanel roundPanel14;
    private javaapplication24.RoundPanel roundPanel2;
    private javaapplication24.RoundPanel roundPanel3;
    private javaapplication24.RoundPanel roundPanel4;
    private javaapplication24.RoundPanel roundPanel5;
    private javaapplication24.RoundPanel roundPanel6;
    private javaapplication24.RoundPanel roundPanel7;
    private javaapplication24.RoundPanel roundPanel8;
    private javaapplication24.RoundPanel roundPanel9;
    // End of variables declaration//GEN-END:variables
}
