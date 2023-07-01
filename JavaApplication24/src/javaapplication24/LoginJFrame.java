/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication24;

import database.SINH_VIEN_DAO;
import java.awt.Color;
import java.util.ArrayList;
//import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
//import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import models.SINH_VIEN;
import java.sql.Connection;
import models.DIEM;
import database.DIEM_DAO;
import database.DIEU_KHIEN_DAO;

/**
 *
 * @author ngoho
 */
public class LoginJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame1
     */
    private String user;
    private String password;
    private int x;
    private int y;

    public LoginJFrame() {
        initComponents();
        NoScalingIcon icon1 = new NoScalingIcon(new ImageIcon(getClass().getResource("/folder/logo_trans.png")));
        jLabel3.setIcon(icon1);

        NoScalingIcon user = new NoScalingIcon(new ImageIcon(getClass().getResource("/folder/user.png")));
        jLabel6.setIcon(user);
        jLabel14.setIcon(user);

        NoScalingIcon password = new NoScalingIcon(new ImageIcon(getClass().getResource("/folder/password.png")));
        jLabel11.setIcon(password);

        NoScalingIcon code = new NoScalingIcon(new ImageIcon(getClass().getResource("/folder/code.png")));
        jLabel15.setIcon(code);
    }

    public void changeColor(JPanel hover, Color rand) {
        hover.setBackground(rand);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        textField3 = new javaapplication24.TextField();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        passwordField1 = new javaapplication24.PasswordField();
        jLabel9 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        changePassName = new javaapplication24.TextField();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        changePassMSSV = new javaapplication24.PasswordField();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel4.setBackground(new java.awt.Color(0, 63, 92));
        jPanel4.setMaximumSize(new java.awt.Dimension(400, 25));
        jPanel4.setMinimumSize(new java.awt.Dimension(400, 25));
        jPanel4.setPreferredSize(new java.awt.Dimension(400, 25));
        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel4formMouseDragged(evt);
            }
        });
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4formMousePressed(evt);
            }
        });
        jPanel4.setLayout(new java.awt.BorderLayout());

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

        jPanel4.add(jPanel5, java.awt.BorderLayout.EAST);

        jPanel11.setBackground(new java.awt.Color(0, 63, 92));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("QUẢN LÝ ĐIỂM HUCE");
        jLabel10.setPreferredSize(new java.awt.Dimension(750, 25));
        jPanel11.add(jLabel10, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel11, java.awt.BorderLayout.WEST);

        getContentPane().add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(0, 42, 92));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 450));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel18.setBackground(new java.awt.Color(0, 42, 92));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel18Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel18Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 450));

        getContentPane().add(jPanel1, java.awt.BorderLayout.WEST);

        jPanel2.setBackground(new java.awt.Color(191, 211, 222));
        jPanel2.setLayout(new java.awt.CardLayout());

        jPanel19.setBackground(new java.awt.Color(191, 211, 222));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(191, 211, 222));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(4, 78, 183));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ĐĂNG NHẬP HỆ THỐNG");
        jLabel4.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel7.setBackground(new java.awt.Color(191, 211, 222));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(255, 90, 0));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ĐĂNG NHẬP");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel7.setPreferredSize(new java.awt.Dimension(225, 32));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });
        jPanel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jPanel9.setBackground(new java.awt.Color(191, 211, 222));
        jPanel9.setPreferredSize(new java.awt.Dimension(100, 16));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(4, 78, 183));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Quên Mật Khẩu?");
        jLabel8.setPreferredSize(new java.awt.Dimension(100, 16));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel7.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 204, -1, -1));

        jPanel12.setLayout(new java.awt.BorderLayout());

        jPanel13.setBackground(new java.awt.Color(191, 211, 222));
        jPanel13.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel13.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel12.add(jPanel13, java.awt.BorderLayout.WEST);

        jPanel14.setBackground(new java.awt.Color(191, 211, 222));
        jPanel14.setPreferredSize(new java.awt.Dimension(230, 50));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textField3.setBackground(new java.awt.Color(191, 211, 222));
        textField3.setBorder(null);
        textField3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        textField3.setLabelText("TÀI KHOẢN");
        textField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField3ActionPerformed(evt);
            }
        });
        jPanel14.add(textField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 50));

        jPanel12.add(jPanel14, java.awt.BorderLayout.EAST);

        jPanel7.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 280, 50));

        jPanel15.setLayout(new java.awt.BorderLayout());

        jPanel16.setBackground(new java.awt.Color(191, 211, 222));
        jPanel16.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel16.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel15.add(jPanel16, java.awt.BorderLayout.WEST);

        jPanel17.setBackground(new java.awt.Color(191, 211, 222));
        jPanel17.setPreferredSize(new java.awt.Dimension(230, 50));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passwordField1.setBackground(new java.awt.Color(191, 211, 222));
        passwordField1.setBorder(null);
        passwordField1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        passwordField1.setLabelText("MẬT KHẨU");
        jPanel17.add(passwordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 50));

        jPanel15.add(jPanel17, java.awt.BorderLayout.EAST);

        jPanel7.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 60, 280, 50));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 300, 280));

        jPanel19.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Copyright © 2023 Group9");
        jLabel9.setMinimumSize(new java.awt.Dimension(138, 16));
        jPanel19.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 400, -1, -1));

        jPanel2.add(jPanel19, "card2");

        jPanel20.setBackground(new java.awt.Color(191, 211, 222));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel21.setBackground(new java.awt.Color(191, 211, 222));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel22.setBackground(new java.awt.Color(191, 211, 222));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(4, 78, 183));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ĐỔI MẬT KHẨU");
        jLabel5.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel22.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel23.setBackground(new java.awt.Color(191, 211, 222));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel24.setBackground(new java.awt.Color(255, 90, 0));
        jPanel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel24MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel24MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel24MouseExited(evt);
            }
        });
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("GỬI YÊU CẦU");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel12.setPreferredSize(new java.awt.Dimension(225, 32));
        jPanel24.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel23.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jPanel25.setBackground(new java.awt.Color(191, 211, 222));
        jPanel25.setPreferredSize(new java.awt.Dimension(100, 16));

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(4, 78, 183));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Quay lại");
        jLabel13.setPreferredSize(new java.awt.Dimension(100, 16));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel13MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel23.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 204, -1, -1));

        jPanel26.setLayout(new java.awt.BorderLayout());

        jPanel27.setBackground(new java.awt.Color(191, 211, 222));
        jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel27.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel26.add(jPanel27, java.awt.BorderLayout.WEST);

        jPanel28.setBackground(new java.awt.Color(191, 211, 222));
        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        changePassName.setBackground(new java.awt.Color(191, 211, 222));
        changePassName.setBorder(null);
        changePassName.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        changePassName.setLabelText("NHẬP TÊN ");
        jPanel28.add(changePassName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 50));

        jPanel26.add(jPanel28, java.awt.BorderLayout.EAST);

        jPanel23.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 280, 50));

        jPanel29.setLayout(new java.awt.BorderLayout());

        jPanel30.setBackground(new java.awt.Color(191, 211, 222));
        jPanel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setPreferredSize(new java.awt.Dimension(50, 50));
        jPanel30.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel29.add(jPanel30, java.awt.BorderLayout.WEST);

        jPanel31.setBackground(new java.awt.Color(191, 211, 222));
        jPanel31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        changePassMSSV.setBackground(new java.awt.Color(191, 211, 222));
        changePassMSSV.setBorder(null);
        changePassMSSV.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        changePassMSSV.setLabelText("NHẬP MSSV");
        jPanel31.add(changePassMSSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 50));

        jPanel29.add(jPanel31, java.awt.BorderLayout.EAST);

        jPanel23.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 60, 280, 50));

        jPanel22.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 300, 280));

        jPanel21.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Copyright © 2023 Group9");
        jLabel16.setMinimumSize(new java.awt.Dimension(138, 16));
        jPanel21.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 400, -1, -1));

        jPanel20.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.add(jPanel20, "card3");

        getContentPane().add(jPanel2, java.awt.BorderLayout.EAST);

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
        changeColor(jPanel6, new Color(0, 63, 92));
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        changeColor(jPanel10, new Color(30, 70, 100));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        changeColor(jPanel10, new Color(0, 63, 92));
    }//GEN-LAST:event_jLabel2MouseExited

    private void jPanel4formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4formMouseDragged
        int xx = evt.getXOnScreen();
        int xy = evt.getYOnScreen();
        this.setLocation(xx - x, xy - y);
    }//GEN-LAST:event_jPanel4formMouseDragged

    private void jPanel4formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4formMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel4formMousePressed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked

        String user = textField3.getText();
        String password = "";
        char[] getpassword = passwordField1.getPassword();
        for (int i = 0; i < getpassword.length; i++) {
            password += getpassword[i];
        };
        //if(user.charAt(0)=='A' && user.charAt(1)=='D')
        if ((new DIEU_KHIEN_DAO().getVoHieuHoa().isVoHieuHoaSinhVien() == true) || (user.charAt(0) == 'A' && user.charAt(1) == 'D')) {
            try {
                SINH_VIEN_DAO sinhvien = new SINH_VIEN_DAO();
                SINH_VIEN thongtin = sinhvien.getThongTin(user, password);
                if (thongtin.getMaSV().charAt(0) == 'A' && thongtin.getMaSV().charAt(1) == 'D') {
                    if (thongtin.getMaSV().equals(user) && thongtin.getMatKhau().equals(password)) {
                        this.setVisible(false);
                        DashboardJFrameAdmin2 dash = new DashboardJFrameAdmin2(thongtin);
                        //DashboardJFrame2 dash = new DashboardJFrame2(new SINH_VIEN_DAO().getThongTin("ST0002", "123456"));
                        dash.setVisible(true);
                    }
                } else if (thongtin.getFlag() == true) {
                    //System.out.print(thongtin.get(0).getMaSV());
                    if (thongtin.getMaSV().equals(user) && thongtin.getMatKhau().equals(password)) {
                        this.setVisible(false);
                        DashboardJFrame2 dash = new DashboardJFrame2(thongtin);
                        dash.setVisible(true);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Tài khoản của bạn hiện đang vô hiệu hóa", "Đăng nhập đã bị chặn", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception ex) {
                Object[] options = {"Nhập lại"};
                int n = JOptionPane.showOptionDialog(jPanel12, "Bạn đã nhập sai tài khoản !",
                        null, JOptionPane.CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE, null,
                        options, options[0]);
            };

        } else {
            JOptionPane.showMessageDialog(null, "Hệ thống đang bảo trì", "Đăng nhập đã bị chặn", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        // TODO add your handling code here:
        jLabel8.setForeground(new Color(4, 78, 183));
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        // TODO add your handling code here:
        jLabel8.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        jPanel19.setVisible(false);
        jPanel20.setVisible(true);

    }//GEN-LAST:event_jLabel8MouseClicked

    private void jPanel24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel24MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel24MouseEntered

    private void jPanel24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel24MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel24MouseExited

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        jPanel19.setVisible(true);
        jPanel20.setVisible(false);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
        // TODO add your handling code here:
        jLabel13.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseExited
        // TODO add your handling code here:
        jLabel13.setForeground(new Color(4, 78, 183));
    }//GEN-LAST:event_jLabel13MouseExited

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        changeColor(jPanel8, new Color(220, 86, 13));
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        changeColor(jPanel8, new Color(255, 90, 0));
    }//GEN-LAST:event_jLabel7MouseExited

    private void textField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField3ActionPerformed

    private void jPanel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel24MouseClicked
        boolean check = false;
        Object[] options = {"Có", "Không"};
        int n = JOptionPane.showOptionDialog(jPanel12, "Bạn muốn yêu cầu cấp lại mật khẩu?", null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        if (n == JOptionPane.YES_OPTION) {
            String Name, MSSV = "";
            Name = changePassName.getText();
            //String MSSV = "";
            char[] getpassword = changePassMSSV.getPassword();
            for (int i = 0; i < getpassword.length; i++) {
                MSSV += getpassword[i];
            };
            if (MSSV.charAt(0) == 'A' && MSSV.charAt(1) == 'D') {
                JOptionPane.showMessageDialog(jPanel23, "Không khả thi vì đây là tài khoản quản trị viên", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } else {
                ArrayList<SINH_VIEN> dataList = new SINH_VIEN_DAO().getDataList();
                for (SINH_VIEN std : dataList) {
                    if (std.getTen().equals(Name)) {
                        if (std.getMaSV().equals(MSSV)) {
                            SINH_VIEN_DAO temp = new SINH_VIEN_DAO();
                            temp.passwordChange(Name, MSSV, "123456");
                            JOptionPane.showMessageDialog(jPanel23, "Mật khẩu của bạn đã được đổi thành 123456", "Cấp lại mật khẩu thành công", JOptionPane.INFORMATION_MESSAGE);
                            check = true;
                            break;
                        }
                    }
                }
                if (check == false) {
                    JOptionPane.showMessageDialog(jPanel23, "Thông tin bạn nhập không chính xác", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    jPanel19.setVisible(true);
                    jPanel20.setVisible(false);
                }
            }
        } else if (n == JOptionPane.NO_OPTION) {
        }
    }//GEN-LAST:event_jPanel24MouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //String user;
        //String password;
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javaapplication24.PasswordField changePassMSSV;
    private javaapplication24.TextField changePassName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javaapplication24.PasswordField passwordField1;
    private javaapplication24.TextField textField3;
    // End of variables declaration//GEN-END:variables
}
