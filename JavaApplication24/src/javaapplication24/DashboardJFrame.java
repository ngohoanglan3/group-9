/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication24;

import java.awt.*;
import javax.swing.*;


/**
 *
 * @author ngohoanglan2k3
 */

class HocKiPanel extends javax.swing.JPanel {
    javax.swing.JLabel t;
    boolean flag;
    public HocKiPanel(String s){
        super();
        this.flag = false;
        this.t = new javax.swing.JLabel();
        t.setText(s);
        t.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12));
        t.setForeground(Color.white);
        super.add(t);
        super.setBackground(new Color(0, 150, 150));
    };
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

class BieuDoPanel extends javax.swing.JPanel {
    javax.swing.JLabel t;
    public BieuDoPanel(String s){
        super();
        this.t = new javax.swing.JLabel();
        t.setText(s);
        t.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12));
        t.setForeground(Color.white);
        
        super.add(t);
        super.setBackground(new Color(250, 102, 102));
    };
    
    public void changeColor(JPanel hover, Color rand) {
        hover.setBackground(rand);
    }
}


public class DashboardJFrame extends javax.swing.JFrame {
    private int x;
    private int y;              
    
    public DashboardJFrame() {
        initComponents();
        //Add Dynamic Components
        int n = 10;
        int m = 4;
        HocKiPanel[] HocKi = new HocKiPanel[n];
        BieuDoPanel[] BieuDo = new BieuDoPanel[n];
        HocKiPanel[] HocKiChuongTrinhKhung = new HocKiPanel[m];
        
        for (int i=0;i<m;i++){
            HocKiChuongTrinhKhung[i]= new HocKiPanel("Học kỳ " + (1+i));
            HocKiChuongTrinhKhung[i].setBounds(10, i*50+20, 110,40);
            final int j = i;
            HocKiChuongTrinhKhung[i].addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                for (int t=0;t<m;t++){
                    HocKiChuongTrinhKhung[t].flag=false;
                    HocKiChuongTrinhKhung[t].HocKiPanelMouseExited();
                }
                changeColor(HocKiChuongTrinhKhung[j],new Color(0,250,250));///////////////////////KIEM THU
                HocKiChuongTrinhKhung[j].flag=true;
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HocKiChuongTrinhKhung[j].HocKiPanelMouseEntered();
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                if (HocKiChuongTrinhKhung[j].flag==false){
                    HocKiChuongTrinhKhung[j].HocKiPanelMouseExited();
                            }
            }
        });
            jPanel76.setPreferredSize(new Dimension(120, m*50+30));
            jPanel76.add(HocKiChuongTrinhKhung[i]);
        };
        
        for (int i=0;i<n;i++){
            
            // Add HocKiPanel
            HocKi[i] = new HocKiPanel("Học kỳ " + (1+i));
            HocKi[i].setBounds(10, i*50+20, 110,40);
            final int j = i;
            HocKi[i].addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                for (int t=0;t<n;t++){
                    HocKi[t].flag=false;
                    HocKi[t].HocKiPanelMouseExited();
                }
                changeColor(HocKi[j],new Color(0,250,250));///////////////////////KIEM THU
                HocKi[j].flag=true;
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HocKi[j].HocKiPanelMouseEntered();
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                if (HocKi[j].flag==false){
                    HocKi[j].HocKiPanelMouseExited();
                            }
            }
        });
            
            //Add BieuDoPanel
            BieuDo[i] = new BieuDoPanel(String.valueOf(i+1));
            BieuDo[i].setBounds(10+(i+1)*50, 205-20*(i+1), 20,20*(i+1));//////////////KIEM THU
            
            //Add all BieuDo components in to their main panel
            jPanel33.setPreferredSize(new Dimension(50*n + 30,200));
            jPanel33.add(BieuDo[i]);
            //Add all HocKi components in to their main panel
            jPanel27.setPreferredSize(new Dimension(120, n*50+30));
            jPanel27.add(HocKi[i]);
        }
        
    }
    
    
    public void changeColor(JPanel hover, Color rand) {
        hover.setBackground(rand);
    }
    
    void invisibleAllContentLayout(){
        ThongTinSinhVien.setVisible(false);
        XemDiem.setVisible(false);
        ThongKe.setVisible(false);
        XemKhoa.setVisible(false);
        XemNganh.setVisible(false);
        XemLop.setVisible(false);
        ThongBao.setVisible(false);
        GopY.setVisible(false);
        ChuongTrinhKhung.setVisible(false);
        DoiMatKhau.setVisible(false);
    };
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DecoratedBar = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        MainLayout = new javax.swing.JPanel();
        ToolBar = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        ContentLayout = new javax.swing.JPanel();
        SonOfToolBar_1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        SonOfToolBar_2 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        SonOfToolBar_3 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        RealContentLayout = new javax.swing.JPanel();
        ThongTinSinhVien = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        ThongtinSinhvienTitle = new javax.swing.JLabel();
        ThongtinSinhvien1 = new javax.swing.JPanel();
        Hoten = new javax.swing.JLabel();
        Mssv = new javax.swing.JLabel();
        GioiTinh = new javax.swing.JLabel();
        Hoten1 = new javax.swing.JLabel();
        Mssv1 = new javax.swing.JLabel();
        GioiTinh1 = new javax.swing.JLabel();
        ThongtinSinhvien2 = new javax.swing.JPanel();
        Ngaysinh = new javax.swing.JLabel();
        Ngaysinh1 = new javax.swing.JLabel();
        CCCD = new javax.swing.JLabel();
        CCCD1 = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        Email1 = new javax.swing.JLabel();
        Sodienthoai = new javax.swing.JLabel();
        Sodienthoai1 = new javax.swing.JLabel();
        Noisinh = new javax.swing.JLabel();
        Noisinh1 = new javax.swing.JLabel();
        Thuongtru = new javax.swing.JLabel();
        Thuongtru1 = new javax.swing.JLabel();
        Dantoc = new javax.swing.JLabel();
        Dantoc1 = new javax.swing.JLabel();
        ThongtinSinhvien3 = new javax.swing.JPanel();
        Lophoc = new javax.swing.JLabel();
        Lophoc1 = new javax.swing.JLabel();
        Khoa = new javax.swing.JLabel();
        Khoa1 = new javax.swing.JLabel();
        Nganh = new javax.swing.JLabel();
        Nganh1 = new javax.swing.JLabel();
        BacDaotao = new javax.swing.JLabel();
        BacDaotao1 = new javax.swing.JLabel();
        LoaiHinhdaotao = new javax.swing.JLabel();
        LoaiHinhdaotao1 = new javax.swing.JLabel();
        Khoahoc = new javax.swing.JLabel();
        Khoahoc1 = new javax.swing.JLabel();
        imageAvatar2 = new javaapplication24.ImageAvatar();
        jLabel63 = new javax.swing.JLabel();
        XemDiem = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel27 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        Hoten2 = new javax.swing.JLabel();
        Hoten3 = new javax.swing.JLabel();
        Hoten4 = new javax.swing.JLabel();
        Hoten5 = new javax.swing.JLabel();
        Hoten6 = new javax.swing.JLabel();
        Hoten7 = new javax.swing.JLabel();
        Hoten8 = new javax.swing.JLabel();
        Hoten9 = new javax.swing.JLabel();
        Hoten10 = new javax.swing.JLabel();
        Hoten11 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        ThongKe = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        DiemTichLuy = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        DoThi = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel33 = new javax.swing.JPanel();
        TinhToanThongKe = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        MonHocConLai = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        CacMonHocLai = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jPanel45 = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        XemKhoa = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        Hoten13 = new javax.swing.JLabel();
        Hoten15 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jPanel47 = new javax.swing.JPanel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel48 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jPanel49 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel50 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jPanel51 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jPanel52 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jPanel46 = new javax.swing.JPanel();
        TitleXemKhoa = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        XemNganh = new javax.swing.JPanel();
        jPanel53 = new javax.swing.JPanel();
        jPanel54 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jPanel55 = new javax.swing.JPanel();
        Hoten14 = new javax.swing.JLabel();
        Hoten16 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        Hoten17 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jPanel56 = new javax.swing.JPanel();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel57 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jPanel58 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jPanel59 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jPanel60 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jPanel61 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jPanel62 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        TitleXemNganh = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        ThongBao = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        jPanel66 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jLabel54 = new javax.swing.JLabel();
        jPanel72 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jPanel73 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        GopY = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jPanel69 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel81 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        ChuongTrinhKhung = new javax.swing.JPanel();
        jPanel74 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jPanel75 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jPanel76 = new javax.swing.JPanel();
        jPanel77 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jPanel78 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        XemLop = new javax.swing.JPanel();
        jPanel63 = new javax.swing.JPanel();
        jPanel64 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        jPanel65 = new javax.swing.JPanel();
        Hoten18 = new javax.swing.JLabel();
        Hoten19 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        Hoten20 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jPanel67 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jPanel68 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        TitleThongTinLopHoc = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        DoiMatKhau = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextField32 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextField33 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextField34 = new javax.swing.JTextField();
        jButton42 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(250, 250, 250));
        setUndecorated(true);
        setResizable(false);

        DecoratedBar.setBackground(new java.awt.Color(0, 50, 80));
        DecoratedBar.setPreferredSize(new java.awt.Dimension(25, 25));
        DecoratedBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                DecoratedBarMouseDragged(evt);
            }
        });
        DecoratedBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DecoratedBarMousePressed(evt);
            }
        });
        DecoratedBar.setLayout(new java.awt.BorderLayout());

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 50, 80));
        jPanel5.setPreferredSize(new java.awt.Dimension(25, 25));

        jLabel1.setBackground(new java.awt.Color(0, 50, 80));
        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("×");
        jLabel1.setPreferredSize(new java.awt.Dimension(25, 25));
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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 0, -1, -1));

        jPanel6.setBackground(new java.awt.Color(0, 50, 80));
        jPanel6.setPreferredSize(new java.awt.Dimension(25, 25));

        jLabel2.setBackground(new java.awt.Color(0, 50, 80));
        jLabel2.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("—");
        jLabel2.setPreferredSize(new java.awt.Dimension(25, 25));
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

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel4.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        DecoratedBar.add(jPanel4, java.awt.BorderLayout.EAST);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("QUẢN LÝ ĐIỂM HUCE");
        jLabel10.setPreferredSize(new java.awt.Dimension(125, 25));
        DecoratedBar.add(jLabel10, java.awt.BorderLayout.CENTER);

        getContentPane().add(DecoratedBar, java.awt.BorderLayout.NORTH);

        MainLayout.setLayout(new java.awt.BorderLayout());

        ToolBar.setBackground(new java.awt.Color(0, 80, 100));
        ToolBar.setPreferredSize(new java.awt.Dimension(1140, 50));
        ToolBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 80, 100));
        jPanel3.setPreferredSize(new java.awt.Dimension(130, 50));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Thông tin bộ môn");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(22, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addContainerGap(22, Short.MAX_VALUE)))
        );

        ToolBar.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, -5, -1, 60));

        jPanel7.setBackground(new java.awt.Color(0, 80, 100));
        jPanel7.setPreferredSize(new java.awt.Dimension(130, 50));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel7MouseExited(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Thông tin sinh viên");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                    .addContainerGap(13, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addContainerGap(12, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                    .addContainerGap(22, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addContainerGap(22, Short.MAX_VALUE)))
        );

        ToolBar.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, -5, -1, 60));

        jPanel8.setBackground(new java.awt.Color(0, 80, 100));
        jPanel8.setPreferredSize(new java.awt.Dimension(130, 50));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel8MouseExited(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Thông báo");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                    .addContainerGap(35, Short.MAX_VALUE)
                    .addComponent(jLabel9)
                    .addContainerGap(36, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                    .addContainerGap(22, Short.MAX_VALUE)
                    .addComponent(jLabel9)
                    .addContainerGap(22, Short.MAX_VALUE)))
        );

        ToolBar.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, -5, -1, 60));

        jPanel9.setBackground(new java.awt.Color(0, 80, 100));
        jPanel9.setPreferredSize(new java.awt.Dimension(130, 50));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel9MouseExited(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Góp ý");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                    .addContainerGap(49, Short.MAX_VALUE)
                    .addComponent(jLabel11)
                    .addContainerGap(49, Short.MAX_VALUE)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                    .addContainerGap(22, Short.MAX_VALUE)
                    .addComponent(jLabel11)
                    .addContainerGap(22, Short.MAX_VALUE)))
        );

        ToolBar.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, -5, -1, 60));

        jPanel10.setBackground(new java.awt.Color(0, 80, 100));
        jPanel10.setPreferredSize(new java.awt.Dimension(130, 50));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel10MouseExited(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quá trình học tập");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                    .addContainerGap(17, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addContainerGap(17, Short.MAX_VALUE)))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                    .addContainerGap(22, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addContainerGap(22, Short.MAX_VALUE)))
        );

        ToolBar.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, -5, -1, 60));

        jPanel15.setBackground(new java.awt.Color(0, 80, 100));
        jPanel15.setPreferredSize(new java.awt.Dimension(130, 50));
        jPanel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel15MouseExited(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Cài đặt");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                    .addContainerGap(46, Short.MAX_VALUE)
                    .addComponent(jLabel15)
                    .addContainerGap(46, Short.MAX_VALUE)))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                    .addContainerGap(22, Short.MAX_VALUE)
                    .addComponent(jLabel15)
                    .addContainerGap(22, Short.MAX_VALUE)))
        );

        ToolBar.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, -5, -1, 60));

        MainLayout.add(ToolBar, java.awt.BorderLayout.PAGE_START);

        ContentLayout.setBackground(new java.awt.Color(255, 255, 255));
        ContentLayout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SonOfToolBar_1.setVisible(false);
        SonOfToolBar_1.setBackground(new java.awt.Color(0, 100, 150));
        SonOfToolBar_1.setPreferredSize(new java.awt.Dimension(130, 100));
        SonOfToolBar_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SonOfToolBar_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SonOfToolBar_1MouseExited(evt);
            }
        });
        SonOfToolBar_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 125, 175));
        jPanel1.setPreferredSize(new java.awt.Dimension(130, 50));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel1MouseExited(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Thống kê");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(39, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addContainerGap(40, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(17, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addContainerGap(17, Short.MAX_VALUE)))
        );

        SonOfToolBar_1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 125, 175));
        jPanel2.setPreferredSize(new java.awt.Dimension(130, 50));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel2MouseExited(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Xem điểm ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(36, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addContainerGap(36, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(17, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addContainerGap(17, Short.MAX_VALUE)))
        );

        SonOfToolBar_1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ContentLayout.add(SonOfToolBar_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, -1, -1));

        SonOfToolBar_2.setVisible(false);
        SonOfToolBar_2.setBackground(new java.awt.Color(0, 100, 150));
        SonOfToolBar_2.setPreferredSize(new java.awt.Dimension(130, 150));
        SonOfToolBar_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SonOfToolBar_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SonOfToolBar_2MouseExited(evt);
            }
        });
        SonOfToolBar_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(0, 125, 175));
        jPanel11.setPreferredSize(new java.awt.Dimension(130, 50));
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel11MouseExited(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Xem khoa");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                    .addContainerGap(38, Short.MAX_VALUE)
                    .addComponent(jLabel12)
                    .addContainerGap(38, Short.MAX_VALUE)))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                    .addContainerGap(17, Short.MAX_VALUE)
                    .addComponent(jLabel12)
                    .addContainerGap(17, Short.MAX_VALUE)))
        );

        SonOfToolBar_2.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel12.setBackground(new java.awt.Color(0, 125, 175));
        jPanel12.setPreferredSize(new java.awt.Dimension(130, 50));
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel12MouseExited(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Xem lớp");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                    .addContainerGap(42, Short.MAX_VALUE)
                    .addComponent(jLabel13)
                    .addContainerGap(43, Short.MAX_VALUE)))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                    .addContainerGap(17, Short.MAX_VALUE)
                    .addComponent(jLabel13)
                    .addContainerGap(17, Short.MAX_VALUE)))
        );

        SonOfToolBar_2.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        jPanel13.setBackground(new java.awt.Color(0, 125, 175));
        jPanel13.setPreferredSize(new java.awt.Dimension(130, 50));
        jPanel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel13MouseExited(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Xem ngành ");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                    .addContainerGap(32, Short.MAX_VALUE)
                    .addComponent(jLabel14)
                    .addContainerGap(32, Short.MAX_VALUE)))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                    .addContainerGap(17, Short.MAX_VALUE)
                    .addComponent(jLabel14)
                    .addContainerGap(17, Short.MAX_VALUE)))
        );

        SonOfToolBar_2.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        ContentLayout.add(SonOfToolBar_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, -1));

        SonOfToolBar_3.setVisible(false);
        SonOfToolBar_3.setBackground(new java.awt.Color(0, 100, 150));
        SonOfToolBar_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SonOfToolBar_3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SonOfToolBar_3MouseExited(evt);
            }
        });
        SonOfToolBar_3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel16.setBackground(new java.awt.Color(255, 75, 0));
        jPanel16.setPreferredSize(new java.awt.Dimension(130, 50));
        jPanel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel16MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel16MouseExited(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Đăng xuất");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                    .addContainerGap(36, Short.MAX_VALUE)
                    .addComponent(jLabel16)
                    .addContainerGap(37, Short.MAX_VALUE)))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                    .addContainerGap(17, Short.MAX_VALUE)
                    .addComponent(jLabel16)
                    .addContainerGap(17, Short.MAX_VALUE)))
        );

        SonOfToolBar_3.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        jPanel17.setBackground(new java.awt.Color(255, 75, 0));
        jPanel17.setPreferredSize(new java.awt.Dimension(130, 50));
        jPanel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel17MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel17MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel17MouseExited(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Đổi mật khẩu");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                    .addContainerGap(28, Short.MAX_VALUE)
                    .addComponent(jLabel17)
                    .addContainerGap(28, Short.MAX_VALUE)))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                    .addContainerGap(17, Short.MAX_VALUE)
                    .addComponent(jLabel17)
                    .addContainerGap(17, Short.MAX_VALUE)))
        );

        SonOfToolBar_3.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ContentLayout.add(SonOfToolBar_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 0, -1, -1));

        RealContentLayout.setLayout(new java.awt.CardLayout());

        ThongTinSinhVien.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel14.setBackground(new java.awt.Color(255, 255, 255, 80));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jSeparator1.setPreferredSize(new java.awt.Dimension(225, 3));
        jPanel14.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 1020, -1));

        ThongtinSinhvienTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ThongtinSinhvienTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ThongtinSinhvienTitle.setText("Thông tin sinh viên");
        ThongtinSinhvienTitle.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel14.add(ThongtinSinhvienTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 210, 50));

        ThongtinSinhvien1.setBackground(new java.awt.Color(255, 255, 255, 100));

        Hoten.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Hoten.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hoten.setText("Họ tên:");
        Hoten.setPreferredSize(new java.awt.Dimension(60, 50));

        Mssv.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Mssv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mssv.setText("MSSV:");
        Mssv.setPreferredSize(new java.awt.Dimension(60, 50));

        GioiTinh.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        GioiTinh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GioiTinh.setText("Giới tính:");
        GioiTinh.setPreferredSize(new java.awt.Dimension(60, 50));

        Hoten1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Hoten1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hoten1.setText("Họ & tên");
        Hoten1.setPreferredSize(new java.awt.Dimension(70, 50));

        Mssv1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Mssv1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mssv1.setText("Mã Số Sinh Viên");
        Mssv1.setPreferredSize(new java.awt.Dimension(70, 50));

        GioiTinh1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        GioiTinh1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GioiTinh1.setText("Giới tính");
        GioiTinh1.setPreferredSize(new java.awt.Dimension(70, 50));

        javax.swing.GroupLayout ThongtinSinhvien1Layout = new javax.swing.GroupLayout(ThongtinSinhvien1);
        ThongtinSinhvien1.setLayout(ThongtinSinhvien1Layout);
        ThongtinSinhvien1Layout.setHorizontalGroup(
            ThongtinSinhvien1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThongtinSinhvien1Layout.createSequentialGroup()
                .addGroup(ThongtinSinhvien1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Hoten, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                    .addComponent(Mssv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GioiTinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ThongtinSinhvien1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Mssv1, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(Hoten1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GioiTinh1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6))
        );
        ThongtinSinhvien1Layout.setVerticalGroup(
            ThongtinSinhvien1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThongtinSinhvien1Layout.createSequentialGroup()
                .addGroup(ThongtinSinhvien1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Hoten1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Hoten, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(ThongtinSinhvien1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ThongtinSinhvien1Layout.createSequentialGroup()
                        .addComponent(Mssv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(GioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThongtinSinhvien1Layout.createSequentialGroup()
                        .addComponent(Mssv1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(GioiTinh1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel14.add(ThongtinSinhvien1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 210, 150));

        ThongtinSinhvien2.setBackground(new java.awt.Color(255, 255, 255, 100));

        Ngaysinh.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Ngaysinh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ngaysinh.setText("Ngày sinh:");
        Ngaysinh.setPreferredSize(new java.awt.Dimension(95, 50));

        Ngaysinh1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Ngaysinh1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ngaysinh1.setText("Ngày sinh");
        Ngaysinh1.setPreferredSize(new java.awt.Dimension(70, 50));

        CCCD.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        CCCD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CCCD.setText("Số CCCD:");
        CCCD.setPreferredSize(new java.awt.Dimension(95, 50));

        CCCD1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        CCCD1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CCCD1.setText("Mã CCCD");
        CCCD1.setPreferredSize(new java.awt.Dimension(70, 50));

        Email.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Email.setText("Email:");
        Email.setPreferredSize(new java.awt.Dimension(95, 50));

        Email1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Email1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Email1.setText("Email");
        Email1.setPreferredSize(new java.awt.Dimension(70, 50));

        Sodienthoai.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Sodienthoai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sodienthoai.setText("Số điện thoại:");
        Sodienthoai.setPreferredSize(new java.awt.Dimension(95, 50));

        Sodienthoai1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Sodienthoai1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sodienthoai1.setText("Số Điện Thoại");
        Sodienthoai1.setPreferredSize(new java.awt.Dimension(70, 50));

        Noisinh.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Noisinh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Noisinh.setText("Nơi sinh:");
        Noisinh.setPreferredSize(new java.awt.Dimension(95, 50));

        Noisinh1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Noisinh1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Noisinh1.setText("Nơi sinh");
        Noisinh1.setPreferredSize(new java.awt.Dimension(70, 50));

        Thuongtru.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Thuongtru.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Thuongtru.setText("Thường trú:");
        Thuongtru.setPreferredSize(new java.awt.Dimension(95, 50));

        Thuongtru1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Thuongtru1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Thuongtru1.setText("Thường trú");
        Thuongtru1.setPreferredSize(new java.awt.Dimension(70, 50));

        Dantoc.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Dantoc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Dantoc.setText("Dân tộc:");
        Dantoc.setPreferredSize(new java.awt.Dimension(95, 50));

        Dantoc1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Dantoc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Dantoc1.setText("Dân tộc");
        Dantoc1.setPreferredSize(new java.awt.Dimension(70, 50));

        javax.swing.GroupLayout ThongtinSinhvien2Layout = new javax.swing.GroupLayout(ThongtinSinhvien2);
        ThongtinSinhvien2.setLayout(ThongtinSinhvien2Layout);
        ThongtinSinhvien2Layout.setHorizontalGroup(
            ThongtinSinhvien2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThongtinSinhvien2Layout.createSequentialGroup()
                .addGroup(ThongtinSinhvien2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(ThongtinSinhvien2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CCCD1, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                    .addComponent(Ngaysinh1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Email1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6))
            .addGroup(ThongtinSinhvien2Layout.createSequentialGroup()
                .addComponent(Sodienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(Sodienthoai1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(ThongtinSinhvien2Layout.createSequentialGroup()
                .addComponent(Noisinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(Noisinh1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(ThongtinSinhvien2Layout.createSequentialGroup()
                .addComponent(Thuongtru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(Thuongtru1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(ThongtinSinhvien2Layout.createSequentialGroup()
                .addComponent(Dantoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(Dantoc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ThongtinSinhvien2Layout.setVerticalGroup(
            ThongtinSinhvien2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThongtinSinhvien2Layout.createSequentialGroup()
                .addGroup(ThongtinSinhvien2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Ngaysinh1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Ngaysinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(ThongtinSinhvien2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ThongtinSinhvien2Layout.createSequentialGroup()
                        .addComponent(CCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThongtinSinhvien2Layout.createSequentialGroup()
                        .addComponent(CCCD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Email1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addGroup(ThongtinSinhvien2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Sodienthoai1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Sodienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(ThongtinSinhvien2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Noisinh1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Noisinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(ThongtinSinhvien2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Thuongtru1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Thuongtru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(ThongtinSinhvien2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Dantoc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Dantoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 20, Short.MAX_VALUE))
        );

        jPanel14.add(ThongtinSinhvien2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 400, 370));

        ThongtinSinhvien3.setBackground(new java.awt.Color(255, 255, 255, 100));

        Lophoc.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Lophoc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lophoc.setText("Lớp học:");
        Lophoc.setPreferredSize(new java.awt.Dimension(80, 50));

        Lophoc1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Lophoc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lophoc1.setText("Lớp học");
        Lophoc1.setPreferredSize(new java.awt.Dimension(70, 50));

        Khoa.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Khoa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Khoa.setText("Khoa:");
        Khoa.setPreferredSize(new java.awt.Dimension(80, 50));

        Khoa1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Khoa1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Khoa1.setText("Khoa");
        Khoa1.setPreferredSize(new java.awt.Dimension(70, 50));

        Nganh.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Nganh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nganh.setText("Ngành:");
        Nganh.setPreferredSize(new java.awt.Dimension(80, 50));

        Nganh1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Nganh1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nganh1.setText("Ngành");
        Nganh1.setPreferredSize(new java.awt.Dimension(70, 50));

        BacDaotao.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        BacDaotao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BacDaotao.setText("Bậc đào tạo:");
        BacDaotao.setPreferredSize(new java.awt.Dimension(80, 50));

        BacDaotao1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        BacDaotao1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BacDaotao1.setText("Bậc đào tạo");
        BacDaotao1.setPreferredSize(new java.awt.Dimension(70, 50));

        LoaiHinhdaotao.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        LoaiHinhdaotao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoaiHinhdaotao.setText("Loại hình đào tạo:");
        LoaiHinhdaotao.setPreferredSize(new java.awt.Dimension(80, 50));

        LoaiHinhdaotao1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        LoaiHinhdaotao1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoaiHinhdaotao1.setText("Loại hình đào tạo");
        LoaiHinhdaotao1.setPreferredSize(new java.awt.Dimension(70, 50));

        Khoahoc.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Khoahoc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Khoahoc.setText("Khóa học:");
        Khoahoc.setPreferredSize(new java.awt.Dimension(80, 50));

        Khoahoc1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Khoahoc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Khoahoc1.setText("Khóa học");
        Khoahoc1.setPreferredSize(new java.awt.Dimension(70, 50));

        javax.swing.GroupLayout ThongtinSinhvien3Layout = new javax.swing.GroupLayout(ThongtinSinhvien3);
        ThongtinSinhvien3.setLayout(ThongtinSinhvien3Layout);
        ThongtinSinhvien3Layout.setHorizontalGroup(
            ThongtinSinhvien3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThongtinSinhvien3Layout.createSequentialGroup()
                .addGroup(ThongtinSinhvien3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lophoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Khoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(ThongtinSinhvien3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Khoa1, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                    .addComponent(Lophoc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Nganh1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6))
            .addGroup(ThongtinSinhvien3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BacDaotao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(BacDaotao1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(ThongtinSinhvien3Layout.createSequentialGroup()
                .addComponent(LoaiHinhdaotao, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LoaiHinhdaotao1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(ThongtinSinhvien3Layout.createSequentialGroup()
                .addComponent(Khoahoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(Khoahoc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ThongtinSinhvien3Layout.setVerticalGroup(
            ThongtinSinhvien3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThongtinSinhvien3Layout.createSequentialGroup()
                .addGroup(ThongtinSinhvien3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Lophoc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Lophoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(ThongtinSinhvien3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ThongtinSinhvien3Layout.createSequentialGroup()
                        .addComponent(Khoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Nganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThongtinSinhvien3Layout.createSequentialGroup()
                        .addComponent(Khoa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(Nganh1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addGroup(ThongtinSinhvien3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BacDaotao1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BacDaotao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(ThongtinSinhvien3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LoaiHinhdaotao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoaiHinhdaotao1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(ThongtinSinhvien3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Khoahoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Khoahoc1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 70, Short.MAX_VALUE))
        );

        jPanel14.add(ThongtinSinhvien3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 370, 370));

        imageAvatar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/pp,840x830-pad,1000x1000,f8f8f8.jpg"))); // NOI18N
        jPanel14.add(imageAvatar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 210, 210));

        ThongTinSinhVien.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 1040, 450));

        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/80081542_p0_master1200.jpg"))); // NOI18N
        ThongTinSinhVien.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        RealContentLayout.add(ThongTinSinhVien, "card2");

        XemDiem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel21.setPreferredSize(new java.awt.Dimension(840, 400));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã môn", "Tên môn", "Số tín chỉ", "Điểm chuyên cần", "Điểm giữa kỳ", "Điểm kết thúc", "Điểm trung bình", "Điểm chữ", "số lần học", "Tình trạng"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 838, Short.MAX_VALUE)
            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
        );

        XemDiem.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 75, -1, 270));

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel22.setPreferredSize(new java.awt.Dimension(150, 400));

        jPanel27.setBackground(new java.awt.Color(255, 255, 255));
        jPanel27.setPreferredSize(new java.awt.Dimension(120, 500));

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 136, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jPanel27);

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
        );

        XemDiem.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 75, -1, -1));

        jPanel23.setBackground(new java.awt.Color(0, 102, 102));
        jPanel23.setPreferredSize(new java.awt.Dimension(840, 50));

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("DANH SÁCH ĐIỂM CÁC MÔN");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                    .addContainerGap(298, Short.MAX_VALUE)
                    .addComponent(jLabel29)
                    .addContainerGap(297, Short.MAX_VALUE)))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                    .addContainerGap(13, Short.MAX_VALUE)
                    .addComponent(jLabel29)
                    .addContainerGap(12, Short.MAX_VALUE)))
        );

        XemDiem.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 25, -1, -1));

        jPanel25.setBackground(new java.awt.Color(0, 102, 102));
        jPanel25.setPreferredSize(new java.awt.Dimension(150, 50));

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("HỌC KỲ");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
            .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                    .addContainerGap(43, Short.MAX_VALUE)
                    .addComponent(jLabel28)
                    .addContainerGap(42, Short.MAX_VALUE)))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                    .addContainerGap(13, Short.MAX_VALUE)
                    .addComponent(jLabel28)
                    .addContainerGap(12, Short.MAX_VALUE)))
        );

        XemDiem.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 25, -1, 50));

        jPanel26.setBackground(new java.awt.Color(255, 255, 255,90));
        jPanel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel26.setPreferredSize(new java.awt.Dimension(780, 100));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Hoten2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Hoten2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hoten2.setText("Điểm trung bình học kỳ hệ 4:");
        Hoten2.setPreferredSize(new java.awt.Dimension(60, 50));
        jPanel26.add(Hoten2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 45, 225, -1));

        Hoten3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Hoten3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hoten3.setText("Số tín chỉ đã hoàn thành:");
        Hoten3.setPreferredSize(new java.awt.Dimension(60, 50));
        jPanel26.add(Hoten3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 170, -1));

        Hoten4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Hoten4.setForeground(new java.awt.Color(255, 255, 255));
        Hoten4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hoten4.setText("4.0");
        Hoten4.setPreferredSize(new java.awt.Dimension(70, 50));
        jPanel26.add(Hoten4, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 45, -1, -1));

        Hoten5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Hoten5.setForeground(new java.awt.Color(255, 255, 255));
        Hoten5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hoten5.setText("15");
        Hoten5.setPreferredSize(new java.awt.Dimension(70, 50));
        jPanel26.add(Hoten5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 70, -1));

        Hoten6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Hoten6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hoten6.setText("Điểm trung bình học kỳ hệ 10:");
        Hoten6.setPreferredSize(new java.awt.Dimension(60, 50));
        jPanel26.add(Hoten6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 225, -1));

        Hoten7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Hoten7.setForeground(new java.awt.Color(255, 255, 255));
        Hoten7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hoten7.setText("10.0");
        Hoten7.setPreferredSize(new java.awt.Dimension(70, 50));
        jPanel26.add(Hoten7, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 0, -1, -1));

        Hoten8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Hoten8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hoten8.setText("Số tín chỉ đăng ký:");
        Hoten8.setPreferredSize(new java.awt.Dimension(60, 50));
        jPanel26.add(Hoten8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 140, -1));

        Hoten9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Hoten9.setForeground(new java.awt.Color(255, 255, 255));
        Hoten9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hoten9.setText("20");
        Hoten9.setPreferredSize(new java.awt.Dimension(70, 50));
        jPanel26.add(Hoten9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, -1, -1));

        Hoten10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Hoten10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hoten10.setText("Xếp loại học lực:");
        Hoten10.setPreferredSize(new java.awt.Dimension(60, 50));
        jPanel26.add(Hoten10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 45, 140, -1));

        Hoten11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Hoten11.setForeground(new java.awt.Color(255, 255, 255));
        Hoten11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hoten11.setText("Giỏi");
        Hoten11.setPreferredSize(new java.awt.Dimension(70, 50));
        jPanel26.add(Hoten11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 45, -1, -1));

        XemDiem.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 375, -1, -1));

        jPanel28.setBackground(new java.awt.Color(0, 102, 102));
        jPanel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel28.setPreferredSize(new java.awt.Dimension(60, 100));

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("giá");

        jLabel31.setBackground(new java.awt.Color(255, 255, 255));
        jLabel31.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Đánh");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel30))
                    .addComponent(jLabel31))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addGap(27, 27, 27))
        );

        XemDiem.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 375, -1, -1));

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/80081542_p0_master1200.jpg"))); // NOI18N
        XemDiem.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        RealContentLayout.add(XemDiem, "card3");

        ThongKe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel32.setBackground(new java.awt.Color(255, 255, 255));
        jPanel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel32.setPreferredSize(new java.awt.Dimension(250, 220));

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 248, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 218, Short.MAX_VALUE)
        );

        ThongKe.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        DiemTichLuy.setBackground(new java.awt.Color(0, 102, 102));
        DiemTichLuy.setPreferredSize(new java.awt.Dimension(250, 25));
        DiemTichLuy.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setBackground(new java.awt.Color(255, 255, 255));
        jLabel32.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Điểm tích lũy");
        DiemTichLuy.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 6, -1, -1));

        ThongKe.add(DiemTichLuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 25, -1, -1));

        DoThi.setBackground(new java.awt.Color(255, 255, 255));
        DoThi.setPreferredSize(new java.awt.Dimension(710, 204));

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(null);
        jScrollPane3.setAutoscrolls(true);

        jPanel33.setBackground(new java.awt.Color(255, 255, 255));
        jPanel33.setPreferredSize(new java.awt.Dimension(706, 215));

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 225, Short.MAX_VALUE)
        );

        jScrollPane3.setViewportView(jPanel33);

        javax.swing.GroupLayout DoThiLayout = new javax.swing.GroupLayout(DoThi);
        DoThi.setLayout(DoThiLayout);
        DoThiLayout.setHorizontalGroup(
            DoThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
            .addGroup(DoThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(DoThiLayout.createSequentialGroup()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        DoThiLayout.setVerticalGroup(
            DoThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 225, Short.MAX_VALUE)
            .addGroup(DoThiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
        );

        ThongKe.add(DoThi, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 295, -1, 225));

        TinhToanThongKe.setBackground(new java.awt.Color(0, 102, 102));
        TinhToanThongKe.setPreferredSize(new java.awt.Dimension(250, 25));
        TinhToanThongKe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setBackground(new java.awt.Color(255, 255, 255));
        jLabel33.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Điều kiện ra trường");
        TinhToanThongKe.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 6, -1, -1));

        ThongKe.add(TinhToanThongKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        jPanel39.setBackground(new java.awt.Color(255, 255, 255));
        jPanel39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel39.setPreferredSize(new java.awt.Dimension(360, 220));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã môn", "Tên môn", "Số tín chỉ"
            }
        ));
        jScrollPane4.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        ThongKe.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 365, -1));

        MonHocConLai.setBackground(new java.awt.Color(0, 102, 102));
        MonHocConLai.setPreferredSize(new java.awt.Dimension(365, 25));
        MonHocConLai.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setBackground(new java.awt.Color(255, 255, 255));
        jLabel34.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Các học phần còn lại");
        MonHocConLai.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 6, -1, -1));

        ThongKe.add(MonHocConLai, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 25, -1, -1));

        jPanel42.setBackground(new java.awt.Color(255, 255, 255));
        jPanel42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel42.setPreferredSize(new java.awt.Dimension(365, 220));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã môn", "Tên môn", "Số tín chỉ"
            }
        ));
        jScrollPane5.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        ThongKe.add(jPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 50, -1, -1));

        CacMonHocLai.setBackground(new java.awt.Color(0, 102, 102));
        CacMonHocLai.setPreferredSize(new java.awt.Dimension(250, 25));
        CacMonHocLai.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setBackground(new java.awt.Color(255, 255, 255));
        jLabel35.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Những học phần phải học lại");
        CacMonHocLai.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 6, -1, -1));

        ThongKe.add(CacMonHocLai, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 25, 365, -1));

        jPanel44.setBackground(new java.awt.Color(0, 150, 150));
        jPanel44.setPreferredSize(new java.awt.Dimension(250, 25));
        jPanel44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel44MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel44MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel44MouseExited(evt);
            }
        });
        jPanel44.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel39.setBackground(new java.awt.Color(255, 255, 255));
        jLabel39.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Các học phần đã hoàn thành");
        jPanel44.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 6, -1, -1));

        ThongKe.add(jPanel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(725, 270, 365, -1));

        jPanel45.setBackground(new java.awt.Color(255, 255, 255));
        jPanel45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel45.setPreferredSize(new java.awt.Dimension(250, 225));

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 248, Short.MAX_VALUE)
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 223, Short.MAX_VALUE)
        );

        ThongKe.add(jPanel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 295, -1, -1));

        jPanel43.setBackground(new java.awt.Color(0, 150, 150));
        jPanel43.setPreferredSize(new java.awt.Dimension(250, 25));
        jPanel43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel43MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel43MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel43MouseExited(evt);
            }
        });
        jPanel43.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel38.setBackground(new java.awt.Color(255, 255, 255));
        jLabel38.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Xem chương trình khung");
        jPanel43.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 6, -1, -1));

        ThongKe.add(jPanel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 365, -1));

        jPanel41.setBackground(new java.awt.Color(0, 102, 102));
        jPanel41.setPreferredSize(new java.awt.Dimension(50, 200));
        jPanel41.setVerifyInputWhenFocusTarget(false);

        jLabel36.setBackground(new java.awt.Color(255, 255, 255));
        jLabel36.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("BIỂU");

        jLabel37.setBackground(new java.awt.Color(255, 255, 255));
        jLabel37.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("ĐỒ");

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addComponent(jLabel37))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel37)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        ThongKe.add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 295, -1, 225));

        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/80081542_p0_master1200.jpg"))); // NOI18N
        ThongKe.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        RealContentLayout.add(ThongKe, "card4");

        XemKhoa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel37.setBackground(new java.awt.Color(255, 255, 255));
        jPanel37.setOpaque(false);
        jPanel37.setPreferredSize(new java.awt.Dimension(1040, 400));
        jPanel37.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel38.setBackground(new java.awt.Color(0, 102, 102));
        jPanel38.setPreferredSize(new java.awt.Dimension(200, 50));

        jLabel43.setBackground(new java.awt.Color(255, 255, 255));
        jLabel43.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("THÔNG TIN CƠ BẢN");

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
            .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel43)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel43)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel37.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 25, -1, -1));

        jPanel40.setBackground(new java.awt.Color(255, 255, 255,90));
        jPanel40.setPreferredSize(new java.awt.Dimension(200, 300));
        jPanel40.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Hoten13.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Hoten13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hoten13.setText("Tên khoa:");
        Hoten13.setPreferredSize(new java.awt.Dimension(60, 50));
        jPanel40.add(Hoten13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 50));

        Hoten15.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Hoten15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hoten15.setText("Mã khoa:");
        Hoten15.setPreferredSize(new java.awt.Dimension(60, 50));
        jPanel40.add(Hoten15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 100, 50));

        jLabel73.setBackground(new java.awt.Color(255, 255, 255));
        jLabel73.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setText("12345");
        jPanel40.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 150, 170, -1));

        jLabel74.setBackground(new java.awt.Color(255, 255, 255));
        jLabel74.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        jLabel74.setText("Công nghệ thông tin");
        jPanel40.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 50, 170, -1));

        jPanel37.add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 75, -1, -1));

        jPanel47.setBackground(new java.awt.Color(255, 255, 255,90));
        jPanel47.setPreferredSize(new java.awt.Dimension(400, 300));
        jPanel47.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setLineWrap( true );
        jTextArea1.setWrapStyleWord( true );
        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(51, 51, 51));
        jTextArea1.setRows(5);
        jTextArea1.setText(" Khoa được thành lập vào.....");
        jTextArea1.setBorder(null);
        jScrollPane14.setViewportView(jTextArea1);

        jPanel47.add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 360, 260));

        jPanel37.add(jPanel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 75, -1, -1));

        jPanel48.setBackground(new java.awt.Color(102, 102, 102));
        jPanel48.setPreferredSize(new java.awt.Dimension(330, 25));
        jPanel48.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel45.setBackground(new java.awt.Color(255, 255, 255));
        jLabel45.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Danh sách các ngành thuộc khoa");
        jPanel48.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 6, -1, -1));

        jPanel37.add(jPanel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 25, -1, -1));

        jPanel49.setBackground(new java.awt.Color(255, 255, 255));
        jPanel49.setPreferredSize(new java.awt.Dimension(200, 300));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Mã ngành", "Tên ngành"
            }
        ));
        jScrollPane6.setViewportView(jTable4);

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
            .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE))
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
            .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
        );

        jPanel37.add(jPanel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 330, 230));

        jPanel50.setBackground(new java.awt.Color(0, 150, 150));
        jPanel50.setPreferredSize(new java.awt.Dimension(155, 70));
        jPanel50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel50MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel50MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel50MouseExited(evt);
            }
        });

        jLabel41.setBackground(new java.awt.Color(255, 255, 255));
        jLabel41.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Danh sách các khoa khác");

        javax.swing.GroupLayout jPanel50Layout = new javax.swing.GroupLayout(jPanel50);
        jPanel50.setLayout(jPanel50Layout);
        jPanel50Layout.setHorizontalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
            .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel50Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel41)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel50Layout.setVerticalGroup(
            jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(jPanel50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel50Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel41)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel37.add(jPanel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 305, 155, 70));

        jPanel51.setBackground(new java.awt.Color(0, 150, 150));
        jPanel51.setPreferredSize(new java.awt.Dimension(155, 70));
        jPanel51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel51MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel51MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel51MouseExited(evt);
            }
        });

        jLabel42.setBackground(new java.awt.Color(255, 255, 255));
        jLabel42.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Xem ngành của bạn");

        javax.swing.GroupLayout jPanel51Layout = new javax.swing.GroupLayout(jPanel51);
        jPanel51.setLayout(jPanel51Layout);
        jPanel51Layout.setHorizontalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
            .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel51Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel42)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel51Layout.setVerticalGroup(
            jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(jPanel51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel51Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel42)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel37.add(jPanel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(855, 305, -1, -1));

        jPanel52.setBackground(new java.awt.Color(0, 102, 102));
        jPanel52.setPreferredSize(new java.awt.Dimension(400, 50));

        jLabel46.setBackground(new java.awt.Color(255, 255, 255));
        jLabel46.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("GIỚI THIỆU KHOA");

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel52Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel46)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel52Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel46)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel37.add(jPanel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 25, -1, -1));

        jPanel46.setBackground(new java.awt.Color(0, 125, 125));
        jPanel46.setPreferredSize(new java.awt.Dimension(400, 50));

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel37.add(jPanel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(835, 305, 20, 70));

        XemKhoa.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 75, -1, -1));

        TitleXemKhoa.setBackground(new java.awt.Color(0, 102, 102));
        TitleXemKhoa.setPreferredSize(new java.awt.Dimension(250, 50));

        jLabel40.setBackground(new java.awt.Color(255, 255, 255));
        jLabel40.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("THÔNG TIN KHOA");

        javax.swing.GroupLayout TitleXemKhoaLayout = new javax.swing.GroupLayout(TitleXemKhoa);
        TitleXemKhoa.setLayout(TitleXemKhoaLayout);
        TitleXemKhoaLayout.setHorizontalGroup(
            TitleXemKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
            .addGroup(TitleXemKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitleXemKhoaLayout.createSequentialGroup()
                    .addContainerGap(419, Short.MAX_VALUE)
                    .addComponent(jLabel40)
                    .addContainerGap(418, Short.MAX_VALUE)))
        );
        TitleXemKhoaLayout.setVerticalGroup(
            TitleXemKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(TitleXemKhoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitleXemKhoaLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel40)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        XemKhoa.add(TitleXemKhoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 25, 1040, -1));

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/80081542_p0_master1200.jpg"))); // NOI18N
        XemKhoa.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        RealContentLayout.add(XemKhoa, "card5");

        XemNganh.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel53.setBackground(new java.awt.Color(255, 255, 255));
        jPanel53.setOpaque(false);
        jPanel53.setPreferredSize(new java.awt.Dimension(1040, 400));
        jPanel53.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel54.setBackground(new java.awt.Color(0, 102, 102));
        jPanel54.setPreferredSize(new java.awt.Dimension(200, 50));

        jLabel44.setBackground(new java.awt.Color(255, 255, 255));
        jLabel44.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("THÔNG TIN CƠ BẢN");

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
            .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel54Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel44)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel54Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel44)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel53.add(jPanel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 25, -1, -1));

        jPanel55.setBackground(new java.awt.Color(255, 255, 255, 90));
        jPanel55.setPreferredSize(new java.awt.Dimension(200, 300));
        jPanel55.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Hoten14.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Hoten14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hoten14.setText("Tên ngành:");
        Hoten14.setPreferredSize(new java.awt.Dimension(60, 50));
        jPanel55.add(Hoten14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 50));

        Hoten16.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Hoten16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hoten16.setText("Thuộc khoa:");
        Hoten16.setPreferredSize(new java.awt.Dimension(60, 50));
        jPanel55.add(Hoten16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 100, 50));

        jLabel75.setBackground(new java.awt.Color(255, 255, 255));
        jLabel75.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(255, 255, 255));
        jLabel75.setText("1234511111");
        jPanel55.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 150, 170, -1));

        jLabel76.setBackground(new java.awt.Color(255, 255, 255));
        jLabel76.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(255, 255, 255));
        jLabel76.setText("Công nghệ phần mềm");
        jPanel55.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 50, 170, -1));

        Hoten17.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Hoten17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hoten17.setText("Mã ngành:");
        Hoten17.setPreferredSize(new java.awt.Dimension(60, 50));
        jPanel55.add(Hoten17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 100, 50));

        jLabel77.setBackground(new java.awt.Color(255, 255, 255));
        jLabel77.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setText("Công nghệ thông tin");
        jPanel55.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 250, 170, -1));

        jPanel53.add(jPanel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 75, -1, -1));

        jPanel56.setBackground(new java.awt.Color(255, 255, 255, 90));
        jPanel56.setPreferredSize(new java.awt.Dimension(400, 300));
        jPanel56.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setLineWrap( true );
        jTextArea1.setWrapStyleWord( true );
        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(51, 51, 51));
        jTextArea2.setRows(5);
        jTextArea2.setText(" Ngành được thành lập vào.....");
        jTextArea2.setBorder(null);
        jScrollPane15.setViewportView(jTextArea2);

        jPanel56.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 360, 260));

        jPanel53.add(jPanel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 75, -1, -1));

        jPanel57.setBackground(new java.awt.Color(102, 102, 102));
        jPanel57.setPreferredSize(new java.awt.Dimension(330, 25));
        jPanel57.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel47.setBackground(new java.awt.Color(255, 255, 255));
        jLabel47.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Danh sách các học phần thuộc ngành");
        jPanel57.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 6, -1, -1));

        jPanel53.add(jPanel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 25, -1, -1));

        jPanel58.setBackground(new java.awt.Color(255, 255, 255));
        jPanel58.setPreferredSize(new java.awt.Dimension(200, 300));

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã môn", "Tên môn", "Số tín chỉ"
            }
        ));
        jScrollPane7.setViewportView(jTable5);

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
            .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE))
        );
        jPanel58Layout.setVerticalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
            .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
        );

        jPanel53.add(jPanel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 330, 230));

        jPanel59.setBackground(new java.awt.Color(0, 150, 150));
        jPanel59.setPreferredSize(new java.awt.Dimension(155, 70));
        jPanel59.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel59MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel59MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel59MouseExited(evt);
            }
        });

        jLabel48.setBackground(new java.awt.Color(255, 255, 255));
        jLabel48.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Ngành khác thuộc khoa");

        javax.swing.GroupLayout jPanel59Layout = new javax.swing.GroupLayout(jPanel59);
        jPanel59.setLayout(jPanel59Layout);
        jPanel59Layout.setHorizontalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
            .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel59Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel48)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel59Layout.setVerticalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel59Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel48)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel53.add(jPanel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 305, 155, 70));

        jPanel60.setBackground(new java.awt.Color(0, 150, 150));
        jPanel60.setPreferredSize(new java.awt.Dimension(155, 70));
        jPanel60.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel60MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel60MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel60MouseExited(evt);
            }
        });

        jLabel49.setBackground(new java.awt.Color(255, 255, 255));
        jLabel49.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Xem chương trình khung");

        javax.swing.GroupLayout jPanel60Layout = new javax.swing.GroupLayout(jPanel60);
        jPanel60.setLayout(jPanel60Layout);
        jPanel60Layout.setHorizontalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
            .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel60Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel49)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel60Layout.setVerticalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel60Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel49)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel53.add(jPanel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(855, 305, -1, -1));

        jPanel61.setBackground(new java.awt.Color(0, 102, 102));
        jPanel61.setPreferredSize(new java.awt.Dimension(400, 50));

        jLabel50.setBackground(new java.awt.Color(255, 255, 255));
        jLabel50.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("GIỚI THIỆU NGÀNH");

        javax.swing.GroupLayout jPanel61Layout = new javax.swing.GroupLayout(jPanel61);
        jPanel61.setLayout(jPanel61Layout);
        jPanel61Layout.setHorizontalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel61Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel50)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel61Layout.setVerticalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel61Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel50)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel53.add(jPanel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 25, -1, -1));

        jPanel62.setBackground(new java.awt.Color(0, 125, 125));
        jPanel62.setPreferredSize(new java.awt.Dimension(400, 50));

        javax.swing.GroupLayout jPanel62Layout = new javax.swing.GroupLayout(jPanel62);
        jPanel62.setLayout(jPanel62Layout);
        jPanel62Layout.setHorizontalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel62Layout.setVerticalGroup(
            jPanel62Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel53.add(jPanel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(835, 305, 20, 70));
        jPanel53.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        XemNganh.add(jPanel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 75, -1, -1));

        TitleXemNganh.setBackground(new java.awt.Color(0, 102, 102));
        TitleXemNganh.setPreferredSize(new java.awt.Dimension(250, 50));

        jLabel51.setBackground(new java.awt.Color(255, 255, 255));
        jLabel51.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("THÔNG TIN NGÀNH");

        javax.swing.GroupLayout TitleXemNganhLayout = new javax.swing.GroupLayout(TitleXemNganh);
        TitleXemNganh.setLayout(TitleXemNganhLayout);
        TitleXemNganhLayout.setHorizontalGroup(
            TitleXemNganhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
            .addGroup(TitleXemNganhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitleXemNganhLayout.createSequentialGroup()
                    .addContainerGap(408, Short.MAX_VALUE)
                    .addComponent(jLabel51)
                    .addContainerGap(408, Short.MAX_VALUE)))
        );
        TitleXemNganhLayout.setVerticalGroup(
            TitleXemNganhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(TitleXemNganhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitleXemNganhLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel51)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        XemNganh.add(TitleXemNganh, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 25, 1040, -1));

        jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/80081542_p0_master1200.jpg"))); // NOI18N
        XemNganh.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        RealContentLayout.add(XemNganh, "card6");

        ThongBao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSplitPane1.setPreferredSize(new java.awt.Dimension(1040, 500));
        jSplitPane1.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
                jSplitPane1AncestorMoved(evt);
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                jSplitPane1AncestorResized(evt);
            }
        });

        jScrollPane9.setMinimumSize(new java.awt.Dimension(250, 250));
        jScrollPane9.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                jScrollPane9AncestorResized(evt);
            }
        });

        jPanel66.setBackground(new java.awt.Color(255, 255, 255));
        jPanel66.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                jPanel66HierarchyChanged(evt);
            }
        });
        jPanel66.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane9.setViewportView(jPanel66);

        jSplitPane1.setLeftComponent(jScrollPane9);

        jScrollPane11.setViewportView(jLabel54);

        jSplitPane1.setRightComponent(jScrollPane11);

        ThongBao.add(jSplitPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 75, -1, 410));

        jPanel72.setBackground(new java.awt.Color(0, 102, 102));
        jPanel72.setPreferredSize(new java.awt.Dimension(200, 50));

        jLabel60.setBackground(new java.awt.Color(255, 255, 255));
        jLabel60.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("THÔNG BÁO");

        javax.swing.GroupLayout jPanel72Layout = new javax.swing.GroupLayout(jPanel72);
        jPanel72.setLayout(jPanel72Layout);
        jPanel72Layout.setHorizontalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
            .addGroup(jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel72Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel60)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel72Layout.setVerticalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel72Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel60)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        ThongBao.add(jPanel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 25, 780, -1));

        jPanel73.setBackground(new java.awt.Color(0, 102, 102));
        jPanel73.setPreferredSize(new java.awt.Dimension(200, 50));

        jLabel61.setBackground(new java.awt.Color(255, 255, 255));
        jLabel61.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("BẢNG TIN");

        javax.swing.GroupLayout jPanel73Layout = new javax.swing.GroupLayout(jPanel73);
        jPanel73.setLayout(jPanel73Layout);
        jPanel73Layout.setHorizontalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
            .addGroup(jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel73Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel61)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel73Layout.setVerticalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel73Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel61)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        ThongBao.add(jPanel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 25, 250, -1));

        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/80081542_p0_master1200.jpg"))); // NOI18N
        ThongBao.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        RealContentLayout.add(ThongBao, "card8");

        GopY.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane10.setMaximumSize(new java.awt.Dimension(32767, 790));

        jTextPane1.setMaximumSize(new java.awt.Dimension(790, 2147483647));
        jScrollPane10.setViewportView(jTextPane1);

        GopY.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 790, 155));
        jScrollPane10.getAccessibleContext().setAccessibleName("");

        jScrollPane16.setMaximumSize(new java.awt.Dimension(32767, 790));

        jTextPane2.setMaximumSize(new java.awt.Dimension(790, 2147483647));
        jScrollPane16.setViewportView(jTextPane2);

        GopY.add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 25, 790, 25));

        jPanel69.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255,0)));
        jPanel69.setOpaque(false);
        jPanel69.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel59.setBackground(new java.awt.Color(255, 255, 255));
        jLabel59.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("NHẬP TIÊU ĐỀ:");
        jPanel69.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 30));

        jButton2.setText("Xóa");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel69.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jButton1.setText("Gửi");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel69.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel81.setBackground(new java.awt.Color(255, 255, 255));
        jLabel81.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(255, 255, 255));
        jLabel81.setText("NHẬP GÓP Ý:");
        jPanel69.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 50));

        GopY.add(jPanel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 25, 110, 190));

        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/80081542_p0_master1200.jpg"))); // NOI18N
        GopY.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        RealContentLayout.add(GopY, "card9");

        ChuongTrinhKhung.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel74.setBackground(new java.awt.Color(255, 255, 255));
        jPanel74.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel74.setPreferredSize(new java.awt.Dimension(840, 400));

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã môn", "Tên môn", "Số tín chỉ", "Số tiết", "Bắt buộc", "Tự chọn", "Môn tiên quyết", "Môn song hành"
            }
        ));
        jScrollPane12.setViewportView(jTable7);

        javax.swing.GroupLayout jPanel74Layout = new javax.swing.GroupLayout(jPanel74);
        jPanel74.setLayout(jPanel74Layout);
        jPanel74Layout.setHorizontalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 838, Short.MAX_VALUE)
            .addGroup(jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE))
        );
        jPanel74Layout.setVerticalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
            .addGroup(jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel74Layout.createSequentialGroup()
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        ChuongTrinhKhung.add(jPanel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 75, -1, 400));

        jPanel75.setBackground(new java.awt.Color(255, 255, 255));
        jPanel75.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));
        jPanel75.setPreferredSize(new java.awt.Dimension(150, 400));

        jPanel76.setBackground(new java.awt.Color(255, 255, 255));
        jPanel76.setPreferredSize(new java.awt.Dimension(120, 500));

        javax.swing.GroupLayout jPanel76Layout = new javax.swing.GroupLayout(jPanel76);
        jPanel76.setLayout(jPanel76Layout);
        jPanel76Layout.setHorizontalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 136, Short.MAX_VALUE)
        );
        jPanel76Layout.setVerticalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jScrollPane13.setViewportView(jPanel76);

        javax.swing.GroupLayout jPanel75Layout = new javax.swing.GroupLayout(jPanel75);
        jPanel75.setLayout(jPanel75Layout);
        jPanel75Layout.setHorizontalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane13)
        );
        jPanel75Layout.setVerticalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
        );

        ChuongTrinhKhung.add(jPanel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 75, -1, -1));

        jPanel77.setBackground(new java.awt.Color(0, 102, 102));
        jPanel77.setPreferredSize(new java.awt.Dimension(840, 50));

        jLabel56.setBackground(new java.awt.Color(255, 255, 255));
        jLabel56.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("CHƯƠNG TRÌNH KHUNG");

        javax.swing.GroupLayout jPanel77Layout = new javax.swing.GroupLayout(jPanel77);
        jPanel77.setLayout(jPanel77Layout);
        jPanel77Layout.setHorizontalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
            .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel77Layout.createSequentialGroup()
                    .addContainerGap(315, Short.MAX_VALUE)
                    .addComponent(jLabel56)
                    .addContainerGap(315, Short.MAX_VALUE)))
        );
        jPanel77Layout.setVerticalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel77Layout.createSequentialGroup()
                    .addContainerGap(13, Short.MAX_VALUE)
                    .addComponent(jLabel56)
                    .addContainerGap(12, Short.MAX_VALUE)))
        );

        ChuongTrinhKhung.add(jPanel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 25, -1, -1));

        jPanel78.setBackground(new java.awt.Color(0, 102, 102));
        jPanel78.setPreferredSize(new java.awt.Dimension(150, 50));

        jLabel62.setBackground(new java.awt.Color(255, 255, 255));
        jLabel62.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("HỌC KỲ");

        javax.swing.GroupLayout jPanel78Layout = new javax.swing.GroupLayout(jPanel78);
        jPanel78.setLayout(jPanel78Layout);
        jPanel78Layout.setHorizontalGroup(
            jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
            .addGroup(jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel78Layout.createSequentialGroup()
                    .addContainerGap(43, Short.MAX_VALUE)
                    .addComponent(jLabel62)
                    .addContainerGap(42, Short.MAX_VALUE)))
        );
        jPanel78Layout.setVerticalGroup(
            jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel78Layout.createSequentialGroup()
                    .addContainerGap(13, Short.MAX_VALUE)
                    .addComponent(jLabel62)
                    .addContainerGap(12, Short.MAX_VALUE)))
        );

        ChuongTrinhKhung.add(jPanel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 25, -1, 50));

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/80081542_p0_master1200.jpg"))); // NOI18N
        ChuongTrinhKhung.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        RealContentLayout.add(ChuongTrinhKhung, "card10");

        XemLop.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel63.setBackground(new java.awt.Color(255, 255, 255));
        jPanel63.setOpaque(false);
        jPanel63.setPreferredSize(new java.awt.Dimension(1040, 400));
        jPanel63.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel64.setBackground(new java.awt.Color(0, 102, 102));
        jPanel64.setPreferredSize(new java.awt.Dimension(200, 50));

        jLabel52.setBackground(new java.awt.Color(255, 255, 255));
        jLabel52.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("THÔNG TIN CƠ BẢN");

        javax.swing.GroupLayout jPanel64Layout = new javax.swing.GroupLayout(jPanel64);
        jPanel64.setLayout(jPanel64Layout);
        jPanel64Layout.setHorizontalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
            .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel64Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel52)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel64Layout.setVerticalGroup(
            jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(jPanel64Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel64Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel52)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel63.add(jPanel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 25, -1, -1));

        jPanel65.setBackground(new java.awt.Color(255, 255, 255,90));
        jPanel65.setPreferredSize(new java.awt.Dimension(200, 300));
        jPanel65.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Hoten18.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Hoten18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hoten18.setText("Tên lớp:");
        Hoten18.setPreferredSize(new java.awt.Dimension(60, 50));
        jPanel65.add(Hoten18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 50));

        Hoten19.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Hoten19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hoten19.setText("Sĩ số sinh viên:");
        Hoten19.setPreferredSize(new java.awt.Dimension(60, 50));
        jPanel65.add(Hoten19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 120, 50));

        jLabel78.setBackground(new java.awt.Color(255, 255, 255));
        jLabel78.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(255, 255, 255));
        jLabel78.setText("K66");
        jPanel65.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 150, 170, -1));

        jLabel79.setBackground(new java.awt.Color(255, 255, 255));
        jLabel79.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
        jLabel79.setText("66IT1");
        jPanel65.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 50, 170, -1));

        Hoten20.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Hoten20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hoten20.setText("Khóa:");
        Hoten20.setPreferredSize(new java.awt.Dimension(60, 50));
        jPanel65.add(Hoten20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 60, 50));

        jLabel80.setBackground(new java.awt.Color(255, 255, 255));
        jLabel80.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(255, 255, 255));
        jLabel80.setText("50");
        jPanel65.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 250, 170, -1));

        jPanel63.add(jPanel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 75, -1, -1));

        jPanel67.setBackground(new java.awt.Color(102, 102, 102));
        jPanel67.setPreferredSize(new java.awt.Dimension(330, 25));
        jPanel67.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel53.setBackground(new java.awt.Color(255, 255, 255));
        jLabel53.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("Danh sách sinh viên");
        jPanel67.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 6, -1, -1));

        jPanel63.add(jPanel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 25, 760, -1));

        jPanel68.setBackground(new java.awt.Color(255, 255, 255));
        jPanel68.setPreferredSize(new java.awt.Dimension(200, 300));

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "MSSV", "Họ", "Tên", "Giới tính", "Ngày sinh", "Email"
            }
        ));
        jScrollPane8.setViewportView(jTable6);

        javax.swing.GroupLayout jPanel68Layout = new javax.swing.GroupLayout(jPanel68);
        jPanel68.setLayout(jPanel68Layout);
        jPanel68Layout.setHorizontalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel68Layout.createSequentialGroup()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel68Layout.setVerticalGroup(
            jPanel68Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
        );

        jPanel63.add(jPanel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 760, 325));

        XemLop.add(jPanel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 75, -1, -1));

        TitleThongTinLopHoc.setBackground(new java.awt.Color(0, 102, 102));
        TitleThongTinLopHoc.setPreferredSize(new java.awt.Dimension(250, 50));

        jLabel57.setBackground(new java.awt.Color(255, 255, 255));
        jLabel57.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("THÔNG TIN LỚP HỌC");

        javax.swing.GroupLayout TitleThongTinLopHocLayout = new javax.swing.GroupLayout(TitleThongTinLopHoc);
        TitleThongTinLopHoc.setLayout(TitleThongTinLopHocLayout);
        TitleThongTinLopHocLayout.setHorizontalGroup(
            TitleThongTinLopHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
            .addGroup(TitleThongTinLopHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitleThongTinLopHocLayout.createSequentialGroup()
                    .addContainerGap(401, Short.MAX_VALUE)
                    .addComponent(jLabel57)
                    .addContainerGap(400, Short.MAX_VALUE)))
        );
        TitleThongTinLopHocLayout.setVerticalGroup(
            TitleThongTinLopHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(TitleThongTinLopHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitleThongTinLopHocLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel57)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        XemLop.add(TitleThongTinLopHoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 25, 1040, -1));

        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/80081542_p0_master1200.jpg"))); // NOI18N
        XemLop.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        RealContentLayout.add(XemLop, "card7");

        DoiMatKhau.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel29.setBackground(new java.awt.Color(255, 255, 255,90));
        jPanel29.setPreferredSize(new java.awt.Dimension(300, 400));
        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setText("Tài khoản:");
        jPanel29.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jTextField12.setOpaque(true);
        jTextField12.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel29.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 75, 175, -1));

        jLabel23.setText("Mật khẩu:");
        jPanel29.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jTextField32.setOpaque(true);
        jTextField32.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel29.add(jTextField32, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 125, 175, -1));

        jLabel24.setText("Mật khẩu mới:");
        jPanel29.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jTextField33.setOpaque(true);
        jTextField33.setPreferredSize(new java.awt.Dimension(150, 30));
        jTextField33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField33ActionPerformed(evt);
            }
        });
        jPanel29.add(jTextField33, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 225, 175, -1));

        jLabel25.setText("Nhập lại:");
        jPanel29.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jTextField34.setOpaque(true);
        jTextField34.setPreferredSize(new java.awt.Dimension(150, 30));
        jPanel29.add(jTextField34, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 275, 175, -1));

        jButton42.setBackground(new java.awt.Color(51, 0, 255));
        jButton42.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jButton42.setForeground(new java.awt.Color(255, 255, 255));
        jButton42.setText("Xác nhận");
        jButton42.setPreferredSize(new java.awt.Dimension(100, 25));
        jButton42.setRequestFocusEnabled(false);
        jButton42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton42MouseClicked(evt);
            }
        });
        jPanel29.add(jButton42, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, -1));

        DoiMatKhau.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 75, -1, -1));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 102));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("THAY ĐỔI MẬT KHẨU");
        jLabel26.setPreferredSize(new java.awt.Dimension(300, 50));
        DoiMatKhau.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 25, -1, -1));

        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/80081542_p0_master1200.jpg"))); // NOI18N
        DoiMatKhau.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        RealContentLayout.add(DoiMatKhau, "card10");

        ContentLayout.add(RealContentLayout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 550));

        MainLayout.add(ContentLayout, java.awt.BorderLayout.CENTER);

        getContentPane().add(MainLayout, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
        changeColor(jPanel5, new Color(252, 3, 28));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        // TODO add your handling code here:
        changeColor(jPanel5, new Color(0,50,80));
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
        changeColor(jPanel6, new Color(30,70,100));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
        changeColor(jPanel6, new Color(0,50,80));
    }//GEN-LAST:event_jLabel2MouseExited

    private void DecoratedBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DecoratedBarMouseDragged
        int xx = evt.getXOnScreen();
        int xy = evt.getYOnScreen();
        this.setLocation(xx - x, xy - y);
    }//GEN-LAST:event_DecoratedBarMouseDragged

    private void DecoratedBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DecoratedBarMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_DecoratedBarMousePressed

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
        changeColor(jPanel7, new Color(0,100,150));
    }//GEN-LAST:event_jPanel7MouseEntered

    private void jPanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseExited
        changeColor(jPanel7, new Color(0,80,100));
    }//GEN-LAST:event_jPanel7MouseExited

    private void jPanel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseEntered
        changeColor(jPanel10, new Color(0,100,150));
        SonOfToolBar_1.setVisible(true);
    }//GEN-LAST:event_jPanel10MouseEntered

    private void jPanel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseExited
        changeColor(jPanel10, new Color(0,80,100));
        SonOfToolBar_1.setVisible(false);
    }//GEN-LAST:event_jPanel10MouseExited

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        changeColor(jPanel3, new Color(0,100,150));
        SonOfToolBar_2.setVisible(true);
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        changeColor(jPanel3, new Color(0,80,100));
        SonOfToolBar_2.setVisible(false);
    }//GEN-LAST:event_jPanel3MouseExited

    private void jPanel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseEntered
        changeColor(jPanel8, new Color(0,100,150));
    }//GEN-LAST:event_jPanel8MouseEntered

    private void jPanel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseExited
        changeColor(jPanel8, new Color(0,80,100));
    }//GEN-LAST:event_jPanel8MouseExited

    private void jPanel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseEntered
        changeColor(jPanel9, new Color(0,100,150));
    }//GEN-LAST:event_jPanel9MouseEntered

    private void jPanel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseExited
        changeColor(jPanel9, new Color(0,80,100));
    }//GEN-LAST:event_jPanel9MouseExited

    private void SonOfToolBar_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SonOfToolBar_1MouseEntered
    SonOfToolBar_1.setVisible(true);
    changeColor(jPanel10, new Color(0,100,150));
    }//GEN-LAST:event_SonOfToolBar_1MouseEntered

    private void SonOfToolBar_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SonOfToolBar_1MouseExited
    SonOfToolBar_1.setVisible(false);
    changeColor(jPanel10, new Color(0,80,100));
    }//GEN-LAST:event_SonOfToolBar_1MouseExited

    private void SonOfToolBar_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SonOfToolBar_2MouseEntered
    SonOfToolBar_2.setVisible(true);
    changeColor(jPanel3, new Color(0,100,150));
    }//GEN-LAST:event_SonOfToolBar_2MouseEntered

    private void SonOfToolBar_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SonOfToolBar_2MouseExited
    SonOfToolBar_2.setVisible(false);
    changeColor(jPanel3, new Color(0,80,100));
    }//GEN-LAST:event_SonOfToolBar_2MouseExited

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
    changeColor(jPanel10, new Color(0,100,150));
    changeColor(jPanel2, new Color(0,150,200));
    SonOfToolBar_1.setVisible(true);
    }//GEN-LAST:event_jPanel2MouseEntered

    private void jPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseExited
    changeColor(jPanel10, new Color(0,80,100));
    changeColor(jPanel2, new Color(0,125,175));
    SonOfToolBar_1.setVisible(false);
    }//GEN-LAST:event_jPanel2MouseExited

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
    changeColor(jPanel10, new Color(0,100,150));
    changeColor(jPanel1, new Color(0,150,200));
    SonOfToolBar_1.setVisible(true);
    }//GEN-LAST:event_jPanel1MouseEntered

    private void jPanel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseExited
    changeColor(jPanel10, new Color(0,80,100));
    changeColor(jPanel1, new Color(0,125,175));
    SonOfToolBar_1.setVisible(false);
    }//GEN-LAST:event_jPanel1MouseExited

    private void jPanel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseEntered
    changeColor(jPanel3, new Color(0,100,150));
    changeColor(jPanel11, new Color(0,150,200));
    SonOfToolBar_2.setVisible(true);
    }//GEN-LAST:event_jPanel11MouseEntered

    private void jPanel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseExited
    changeColor(jPanel3, new Color(0,80,100));
    changeColor(jPanel11, new Color(0,125,175));
    SonOfToolBar_2.setVisible(false);
    }//GEN-LAST:event_jPanel11MouseExited

    private void jPanel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseEntered
    changeColor(jPanel3, new Color(0,100,150));
    changeColor(jPanel12, new Color(0,150,200));
    SonOfToolBar_2.setVisible(true);
    }//GEN-LAST:event_jPanel12MouseEntered

    private void jPanel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseExited
    changeColor(jPanel3, new Color(0,80,100));
    changeColor(jPanel12, new Color(0,125,175));
    SonOfToolBar_2.setVisible(false);
    }//GEN-LAST:event_jPanel12MouseExited

    private void jPanel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseEntered
    changeColor(jPanel3, new Color(0,100,150));
    changeColor(jPanel13, new Color(0,150,200));
    SonOfToolBar_2.setVisible(true);
    }//GEN-LAST:event_jPanel13MouseEntered

    private void jPanel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseExited
    changeColor(jPanel3, new Color(0,80,100));
    changeColor(jPanel13, new Color(0,125,175));
    SonOfToolBar_2.setVisible(false);
    }//GEN-LAST:event_jPanel13MouseExited

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        invisibleAllContentLayout();
        ThongTinSinhVien.setVisible(true);
    
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        invisibleAllContentLayout();
        XemDiem.setVisible(true);
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        invisibleAllContentLayout();
        ThongKe.setVisible(true);
    }//GEN-LAST:event_jPanel1MouseClicked

    private void jPanel43MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel43MouseEntered
        changeColor(jPanel43,new Color(0,200,200));
    }//GEN-LAST:event_jPanel43MouseEntered

    private void jPanel43MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel43MouseExited
        changeColor(jPanel43,new Color(0,150,150));
    }//GEN-LAST:event_jPanel43MouseExited

    private void jPanel44MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel44MouseEntered
        changeColor(jPanel44,new Color(0,200,200));
    }//GEN-LAST:event_jPanel44MouseEntered

    private void jPanel44MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel44MouseExited
        changeColor(jPanel44,new Color(0,150,150));
    }//GEN-LAST:event_jPanel44MouseExited

    private void jPanel50MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel50MouseEntered
        changeColor(jPanel50,new Color(0,200,200));
    }//GEN-LAST:event_jPanel50MouseEntered

    private void jPanel50MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel50MouseExited
        changeColor(jPanel50,new Color(0,150,150));
    }//GEN-LAST:event_jPanel50MouseExited

    private void jPanel51MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel51MouseEntered
        changeColor(jPanel51,new Color(0,200,200));
    }//GEN-LAST:event_jPanel51MouseEntered

    private void jPanel51MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel51MouseExited
        changeColor(jPanel51,new Color(0,150,150));
    }//GEN-LAST:event_jPanel51MouseExited

    private void jPanel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseClicked
        invisibleAllContentLayout();
        XemKhoa.setVisible(true);
    }//GEN-LAST:event_jPanel11MouseClicked

    private void jPanel59MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel59MouseEntered
        changeColor(jPanel59,new Color(0,200,200));
    }//GEN-LAST:event_jPanel59MouseEntered

    private void jPanel59MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel59MouseExited
        changeColor(jPanel59,new Color(0,150,150));
    }//GEN-LAST:event_jPanel59MouseExited

    private void jPanel60MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel60MouseEntered
        changeColor(jPanel60,new Color(0,200,200));
    }//GEN-LAST:event_jPanel60MouseEntered

    private void jPanel60MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel60MouseExited
        changeColor(jPanel60,new Color(0,150,150));
    }//GEN-LAST:event_jPanel60MouseExited

    private void jPanel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseClicked
        invisibleAllContentLayout();
        XemNganh.setVisible(true);
    }//GEN-LAST:event_jPanel13MouseClicked

    private void jPanel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseClicked
        invisibleAllContentLayout();
        XemLop.setVisible(true);
    }//GEN-LAST:event_jPanel12MouseClicked

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        invisibleAllContentLayout();
        ThongBao.setVisible(true);
    }//GEN-LAST:event_jPanel8MouseClicked

    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked
        invisibleAllContentLayout();
        GopY.setVisible(true);
    }//GEN-LAST:event_jPanel9MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPanel66HierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jPanel66HierarchyChanged

    }//GEN-LAST:event_jPanel66HierarchyChanged

    private void jSplitPane1AncestorMoved(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jSplitPane1AncestorMoved

    }//GEN-LAST:event_jSplitPane1AncestorMoved

    private void jSplitPane1AncestorResized(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jSplitPane1AncestorResized

    }//GEN-LAST:event_jSplitPane1AncestorResized

    private void jScrollPane9AncestorResized(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jScrollPane9AncestorResized

    }//GEN-LAST:event_jScrollPane9AncestorResized

    private void jPanel43MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel43MouseClicked
        invisibleAllContentLayout();
        ChuongTrinhKhung.setVisible(true);
    }//GEN-LAST:event_jPanel43MouseClicked

    private void jPanel60MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel60MouseClicked
        invisibleAllContentLayout();
        ChuongTrinhKhung.setVisible(true);
    }//GEN-LAST:event_jPanel60MouseClicked

    private void jPanel51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel51MouseClicked
        invisibleAllContentLayout();
        XemNganh.setVisible(true);
    }//GEN-LAST:event_jPanel51MouseClicked

    private void jPanel44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel44MouseClicked
        ConsoleJFrame console = new ConsoleJFrame();
        console.CacHocPhanDaHoanThanh();
        console.setVisible(true);
    }//GEN-LAST:event_jPanel44MouseClicked

    private void jPanel50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel50MouseClicked
        ConsoleJFrame console = new ConsoleJFrame();
        console.CacKhoaKhac();
        console.setVisible(true);
    }//GEN-LAST:event_jPanel50MouseClicked

    private void jPanel59MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel59MouseClicked
        ConsoleJFrame console = new ConsoleJFrame();
        console.CacNganhKhac();
        console.setVisible(true);
    }//GEN-LAST:event_jPanel59MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Object[] options = {"Có","Không"};
        int n = JOptionPane.showOptionDialog(GopY,
"Bạn muốn gửi tới hòm thư?",null, JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[1]);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel15MouseClicked

    private void jPanel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MouseEntered
        changeColor(jPanel15, new Color(255,75,0));
        SonOfToolBar_3.setVisible(true);
    }//GEN-LAST:event_jPanel15MouseEntered

    private void jPanel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MouseExited
        changeColor(jPanel15, new Color(0,80,100));
        SonOfToolBar_3.setVisible(false);
    }//GEN-LAST:event_jPanel15MouseExited

    private void jPanel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseClicked
        this.setVisible(false);
        LoginJFrame login = new LoginJFrame();
        login.setVisible(true);
    }//GEN-LAST:event_jPanel16MouseClicked

    private void jPanel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseEntered
        changeColor(jPanel15, new Color(255,75,0));
        changeColor(jPanel16, new Color(255,125,0));
        SonOfToolBar_3.setVisible(true);
    }//GEN-LAST:event_jPanel16MouseEntered

    private void jPanel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseExited
        changeColor(jPanel15, new Color(0,80,100));
        changeColor(jPanel16, new Color(255,75,0));
        SonOfToolBar_3.setVisible(false);
    }//GEN-LAST:event_jPanel16MouseExited

    private void jPanel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseClicked
        invisibleAllContentLayout();
        DoiMatKhau.setVisible(true);
    }//GEN-LAST:event_jPanel17MouseClicked

    private void jPanel17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseEntered
        changeColor(jPanel15, new Color(255,75,0));
        changeColor(jPanel17, new Color(255,125,0));
        SonOfToolBar_3.setVisible(true);
    }//GEN-LAST:event_jPanel17MouseEntered

    private void jPanel17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseExited
        changeColor(jPanel15, new Color(0,80,100));
        changeColor(jPanel17, new Color(255,75,0));
        SonOfToolBar_3.setVisible(false);
    }//GEN-LAST:event_jPanel17MouseExited

    private void SonOfToolBar_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SonOfToolBar_3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_SonOfToolBar_3MouseEntered

    private void SonOfToolBar_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SonOfToolBar_3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_SonOfToolBar_3MouseExited

    private void jTextField33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField33ActionPerformed

    private void jButton42MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton42MouseClicked
        Object[] options = {"Có","Không"};
        int n = JOptionPane.showOptionDialog(DoiMatKhau,
            "Bạn muốn thay đổi mật khẩu?",null, JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[1]);

    }//GEN-LAST:event_jButton42MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        jTextPane1.setText("");
    }//GEN-LAST:event_jButton2MouseClicked
     
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
            java.util.logging.Logger.getLogger(DashboardJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BacDaotao;
    private javax.swing.JLabel BacDaotao1;
    private javax.swing.JLabel CCCD;
    private javax.swing.JLabel CCCD1;
    private javax.swing.JPanel CacMonHocLai;
    private javax.swing.JPanel ChuongTrinhKhung;
    private javax.swing.JPanel ContentLayout;
    private javax.swing.JLabel Dantoc;
    private javax.swing.JLabel Dantoc1;
    private javax.swing.JPanel DecoratedBar;
    private javax.swing.JPanel DiemTichLuy;
    private javax.swing.JPanel DoThi;
    private javax.swing.JPanel DoiMatKhau;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Email1;
    private javax.swing.JLabel GioiTinh;
    private javax.swing.JLabel GioiTinh1;
    private javax.swing.JPanel GopY;
    private javax.swing.JLabel Hoten;
    private javax.swing.JLabel Hoten1;
    private javax.swing.JLabel Hoten10;
    private javax.swing.JLabel Hoten11;
    private javax.swing.JLabel Hoten13;
    private javax.swing.JLabel Hoten14;
    private javax.swing.JLabel Hoten15;
    private javax.swing.JLabel Hoten16;
    private javax.swing.JLabel Hoten17;
    private javax.swing.JLabel Hoten18;
    private javax.swing.JLabel Hoten19;
    private javax.swing.JLabel Hoten2;
    private javax.swing.JLabel Hoten20;
    private javax.swing.JLabel Hoten3;
    private javax.swing.JLabel Hoten4;
    private javax.swing.JLabel Hoten5;
    private javax.swing.JLabel Hoten6;
    private javax.swing.JLabel Hoten7;
    private javax.swing.JLabel Hoten8;
    private javax.swing.JLabel Hoten9;
    private javax.swing.JLabel Khoa;
    private javax.swing.JLabel Khoa1;
    private javax.swing.JLabel Khoahoc;
    private javax.swing.JLabel Khoahoc1;
    private javax.swing.JLabel LoaiHinhdaotao;
    private javax.swing.JLabel LoaiHinhdaotao1;
    private javax.swing.JLabel Lophoc;
    private javax.swing.JLabel Lophoc1;
    private javax.swing.JPanel MainLayout;
    private javax.swing.JPanel MonHocConLai;
    private javax.swing.JLabel Mssv;
    private javax.swing.JLabel Mssv1;
    private javax.swing.JLabel Nganh;
    private javax.swing.JLabel Nganh1;
    private javax.swing.JLabel Ngaysinh;
    private javax.swing.JLabel Ngaysinh1;
    private javax.swing.JLabel Noisinh;
    private javax.swing.JLabel Noisinh1;
    private javax.swing.JPanel RealContentLayout;
    private javax.swing.JLabel Sodienthoai;
    private javax.swing.JLabel Sodienthoai1;
    private javax.swing.JPanel SonOfToolBar_1;
    private javax.swing.JPanel SonOfToolBar_2;
    private javax.swing.JPanel SonOfToolBar_3;
    private javax.swing.JPanel ThongBao;
    private javax.swing.JPanel ThongKe;
    private javax.swing.JPanel ThongTinSinhVien;
    private javax.swing.JPanel ThongtinSinhvien1;
    private javax.swing.JPanel ThongtinSinhvien2;
    private javax.swing.JPanel ThongtinSinhvien3;
    private javax.swing.JLabel ThongtinSinhvienTitle;
    private javax.swing.JLabel Thuongtru;
    private javax.swing.JLabel Thuongtru1;
    private javax.swing.JPanel TinhToanThongKe;
    private javax.swing.JPanel TitleThongTinLopHoc;
    private javax.swing.JPanel TitleXemKhoa;
    private javax.swing.JPanel TitleXemNganh;
    private javax.swing.JPanel ToolBar;
    private javax.swing.JPanel XemDiem;
    private javax.swing.JPanel XemKhoa;
    private javax.swing.JPanel XemLop;
    private javax.swing.JPanel XemNganh;
    private javaapplication24.ImageAvatar imageAvatar2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton42;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
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
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel62;
    private javax.swing.JPanel jPanel63;
    private javax.swing.JPanel jPanel64;
    private javax.swing.JPanel jPanel65;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel72;
    private javax.swing.JPanel jPanel73;
    private javax.swing.JPanel jPanel74;
    private javax.swing.JPanel jPanel75;
    private javax.swing.JPanel jPanel76;
    private javax.swing.JPanel jPanel77;
    private javax.swing.JPanel jPanel78;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    // End of variables declaration//GEN-END:variables
}
