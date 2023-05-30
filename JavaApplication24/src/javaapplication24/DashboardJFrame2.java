package javaapplication24;

import java.awt.*;
import javax.swing.*;


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

public class DashboardJFrame2 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    private int x;
    private int y;
    
    public DashboardJFrame2() {
        initComponents();
        // CAP NHAT CAC HOC KY
        int m = 70;
        int n = 16;
        HocKiPanel[] HocKi = new HocKiPanel[n];
        HocKiPanel[] HocKiChuongTrinhKhung = new HocKiPanel[m];
        
        for (int i=0;i<m;i++){
            HocKiChuongTrinhKhung[i]= new HocKiPanel("Học kỳ " + (1+i));
            HocKiChuongTrinhKhung[i].setBounds(10, i*50+20, 120,40);
            final int j = i;
            HocKiChuongTrinhKhung[i].addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                for (int t=0;t<m;t++){
                    HocKiChuongTrinhKhung[t].flag=false;
                    HocKiChuongTrinhKhung[t].HocKiPanelMouseExited();
                }
                changeColor(HocKiChuongTrinhKhung[j],new Color(0,250,250));///////////////////////KIEM THU
                HocKiChuongTrinhKhung[j].flag=true;
            }
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HocKiChuongTrinhKhung[j].HocKiPanelMouseEntered();
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                if (HocKiChuongTrinhKhung[j].flag==false){
                    HocKiChuongTrinhKhung[j].HocKiPanelMouseExited();
                            }
            }
        });
            jPanel15.setPreferredSize(new Dimension(120, m*50+30));
            jPanel15.add(HocKiChuongTrinhKhung[i]);
        }
        
        for (int i=0;i<n;i++){
            
            // Add HocKiPanel
            HocKi[i] = new HocKiPanel("Học kỳ " + (1+i));
            HocKi[i].setBounds(10, i*50+20, 120,40);
            final int j = i;
            HocKi[i].addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                for (int t=0;t<n;t++){
                    HocKi[t].flag=false;
                    HocKi[t].HocKiPanelMouseExited();
                }
                changeColor(HocKi[j],new Color(0,250,250));///////////////////////KIEM THU
                HocKi[j].flag=true;
            }
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HocKi[j].HocKiPanelMouseEntered();
            }
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                if (HocKi[j].flag==false){
                    HocKi[j].HocKiPanelMouseExited();
                            }
            }
            });
            jPanel14.setPreferredSize(new Dimension(120, n*50+30));
            jPanel14.add(HocKi[i]);
        }
        
//        double diem[] = new double[n];
//        for(int i = 0; i < n;i++){
//        chart2.addLegend(""+(i+1), new Color(230, 190, 135));
//        diem[i]= i+1;
//        }
//        chart2.addData(new ModelChart("HỌC KỲ", diem));
        chart2.addLegend("", Color.yellow);
        for(int i = 1; i <= 8; i++) {
            chart2.addData(new ModelChart("Học Kỳ " + i, new double[]{i}));            
        }
//        chart2.addLegend("HỌC KỲ 1", new Color(245, 189, 135));
//        chart2.addLegend("HỌC KỲ 2", new Color(135, 189, 245));
//        chart2.addLegend("HỌC KỲ 3", new Color(189, 135, 245));
//        chart2.addLegend("HỌC KỲ 4", new Color(139, 229, 222));
//        chart2.addData(new ModelChart("HỌC KỲ", new double[]{10, 9, 8, 7}));
        
        NoScalingIcon icon1 = new NoScalingIcon(new ImageIcon(getClass().getResource("/folder/pepe.jpg")));
        avatar.setIcon(icon1);
        
        NoScalingIcon icon2 = new NoScalingIcon(new ImageIcon(getClass().getResource("/folder/skills.png")));
        Setting.setIcon(icon2);
        
        NoScalingIcon icon3 = new NoScalingIcon(new ImageIcon(getClass().getResource("/folder/changePassword.png")));
        changePassword.setIcon(icon3);
        
        NoScalingIcon icon4 = new NoScalingIcon(new ImageIcon(getClass().getResource("/folder/logout.png")));
        Logout.setIcon(icon4);
        
        jPanel9.setVisible(false);
        jPanel12.setVisible(false);
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

        Titlebar = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        roundPanel9 = new javaapplication24.RoundPanel();
        jLabel30 = new javax.swing.JLabel();
        passwordField1 = new javaapplication24.PasswordField();
        passwordField2 = new javaapplication24.PasswordField();
        passwordField3 = new javaapplication24.PasswordField();
        jPanel24 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Setting = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        changePassword1 = new javaapplication24.RoundPanel();
        changePassword = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        Logout1 = new javaapplication24.RoundPanel();
        Logout = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        materialTabbed = new javaapplication24.MaterialTabbed();
        ThongtinSinhvien = new javaapplication24.RoundPanel();
        Separator = new javax.swing.JSeparator();
        TITLE = new javax.swing.JLabel();
        ThongtinSinhvien1 = new javaapplication24.RoundPanel();
        Hoten = new javax.swing.JLabel();
        Mssv = new javax.swing.JLabel();
        GioiTinh = new javax.swing.JLabel();
        Hoten1 = new javax.swing.JLabel();
        Mssv1 = new javax.swing.JLabel();
        GioiTinh1 = new javax.swing.JLabel();
        ThongtinSinhvien2 = new javaapplication24.RoundPanel();
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
        Dantoc = new javax.swing.JLabel();
        Dantoc1 = new javax.swing.JLabel();
        Noisinh2 = new javax.swing.JLabel();
        ThongtinSinhvien3 = new javaapplication24.RoundPanel();
        Lophoc = new javax.swing.JLabel();
        Khoa = new javax.swing.JLabel();
        Nganh = new javax.swing.JLabel();
        BacDaotao = new javax.swing.JLabel();
        Khoahoc = new javax.swing.JLabel();
        Lophoc1 = new javax.swing.JLabel();
        Khoa1 = new javax.swing.JLabel();
        Nganh1 = new javax.swing.JLabel();
        BacDaotao1 = new javax.swing.JLabel();
        Khoahoc1 = new javax.swing.JLabel();
        avatar = new javax.swing.JLabel();
        QuatrinhHoctap2 = new javaapplication24.RoundPanel();
        Hocky = new javaapplication24.RoundPanel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        scrollPaneWin111 = new javaapplication24.ScrollPaneWin11();
        jPanel14 = new javax.swing.JPanel();
        DanhSachmon = new javaapplication24.RoundPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        scrollPaneWin112 = new javaapplication24.ScrollPaneWin11();
        table1 = new javaapplication24.Table();
        Danhgia = new javaapplication24.RoundPanel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        Dienhe10 = new javax.swing.JLabel();
        Diem10 = new javax.swing.JLabel();
        Diemhe4 = new javax.swing.JLabel();
        Diem4 = new javax.swing.JLabel();
        SoTinchi = new javax.swing.JLabel();
        Tinchi = new javax.swing.JLabel();
        XeploaiHocluc = new javax.swing.JLabel();
        Hocluc = new javax.swing.JLabel();
        Hoten3 = new javax.swing.JLabel();
        Hoten5 = new javax.swing.JLabel();
        ChuongtrinhKhung2 = new javaapplication24.RoundPanel();
        Separator1 = new javax.swing.JSeparator();
        TITLE1 = new javax.swing.JLabel();
        Hocky1 = new javaapplication24.RoundPanel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        scrollPaneWin113 = new javaapplication24.ScrollPaneWin11();
        jPanel15 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        scrollPaneWin114 = new javaapplication24.ScrollPaneWin11();
        table2 = new javaapplication24.Table();
        ThongkeHoctap = new javax.swing.JPanel();
        roundPanel1 = new javaapplication24.RoundPanel();
        chart2 = new javaapplication24.Chart();
        roundPanel4 = new javaapplication24.RoundPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        roundPanel10 = new javaapplication24.RoundPanel();
        jLabel34 = new javax.swing.JLabel();
        Separator4 = new javax.swing.JSeparator();
        scrollPaneWin120 = new javaapplication24.ScrollPaneWin11();
        table8 = new javaapplication24.Table();
        roundPanel11 = new javaapplication24.RoundPanel();
        jLabel35 = new javax.swing.JLabel();
        Separator5 = new javax.swing.JSeparator();
        scrollPaneWin121 = new javaapplication24.ScrollPaneWin11();
        table7 = new javaapplication24.Table();
        ThongBao = new javax.swing.JPanel();
        roundPanel5 = new javaapplication24.RoundPanel();
        jLabel24 = new javax.swing.JLabel();
        roundPanel6 = new javaapplication24.RoundPanel();
        jLabel25 = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();
        scrollPaneWin118 = new javaapplication24.ScrollPaneWin11();
        jPanel67 = new javax.swing.JPanel();
        scrollPaneWin117 = new javaapplication24.ScrollPaneWin11();
        jPanel66 = new javax.swing.JPanel();
        GopY = new javax.swing.JPanel();
        roundPanel7 = new javaapplication24.RoundPanel();
        jLabel26 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        scrollPaneWin119 = new javaapplication24.ScrollPaneWin11();
        jTextArea2 = new javax.swing.JTextArea();
        roundPanel8 = new javaapplication24.RoundPanel();
        jLabel27 = new javax.swing.JLabel();
        scrollPaneWin1110 = new javaapplication24.ScrollPaneWin11();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
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
        jLabel10.setText("QUẢN LÝ ĐIỂM HUCE");
        jLabel10.setPreferredSize(new java.awt.Dimension(1140, 25));
        jPanel11.add(jLabel10, java.awt.BorderLayout.CENTER);

        Titlebar.add(jPanel11, java.awt.BorderLayout.WEST);

        getContentPane().add(Titlebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 25));

        jPanel12.setBackground(new Color(0, 0, 0, 100));

        roundPanel9.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 25)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 102));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("ĐỔI MẬT KHẨU");
        roundPanel9.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 400, 100));

        passwordField1.setLabelText("Xác nhận mật khẩu");
        roundPanel9.add(passwordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 380, -1));

        passwordField2.setLabelText("Mật khẩu cũ");
        roundPanel9.add(passwordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 380, -1));

        passwordField3.setLabelText("Mật khẩu mới");
        roundPanel9.add(passwordField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 380, -1));

        jPanel24.setBackground(new java.awt.Color(255, 90, 0));
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("GỬI YÊU CẦU");
        jLabel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel33.setPreferredSize(new java.awt.Dimension(225, 32));
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel33MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel33MouseExited(evt);
            }
        });
        jPanel24.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        roundPanel9.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 400, -1, -1));

        jPanel25.setBackground(new java.awt.Color(255, 90, 0));
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("HỦY ");
        jLabel36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel36.setPreferredSize(new java.awt.Dimension(225, 32));
        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel36MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel36MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel36MouseExited(evt);
            }
        });
        jPanel25.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        roundPanel9.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 350, -1, -1));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1140, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(roundPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(roundPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 25, 1140, 600));

        jPanel2.setBackground(new java.awt.Color(23, 100, 126));
        jPanel2.setLayout(new java.awt.BorderLayout());

        Setting.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Setting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SettingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SettingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SettingMouseExited(evt);
            }
        });
        jPanel2.add(Setting, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1095, 31, 35, 35));

        jPanel9.setBackground(new Color(0, 0, 0, 0));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        changePassword1.setBackground(new Color(47, 84, 97));
        changePassword1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changePassword1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                changePassword1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                changePassword1MouseExited(evt);
            }
        });
        changePassword1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        changePassword1.add(changePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 32, 32));

        jLabel31.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("ĐỔI MẬT KHẨU");
        changePassword1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 0, 93, 35));

        jPanel9.add(changePassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 125, 35));

        Logout1.setBackground(new Color(47, 84, 97));
        Logout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Logout1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Logout1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Logout1MouseExited(evt);
            }
        });
        Logout1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Logout1.add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 32, 32));

        jLabel32.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("ĐĂNG XUẤT");
        Logout1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 0, 80, 35));

        jPanel9.add(Logout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 37, 125, 35));

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1008, 68, -1, -1));

        materialTabbed.setBackground(new java.awt.Color(255, 255, 255));
        materialTabbed.setForeground(new java.awt.Color(255, 255, 255));
        materialTabbed.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N

        ThongtinSinhvien.setBackground(new java.awt.Color(255, 255, 255, 80));
        ThongtinSinhvien.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Separator.setBackground(new java.awt.Color(0, 0, 0));
        Separator.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ThongtinSinhvien.add(Separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 1105, 3));

        TITLE.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        TITLE.setForeground(new java.awt.Color(255, 255, 255));
        TITLE.setText("THÔNG TIN SINH VIÊN");
        TITLE.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        ThongtinSinhvien.add(TITLE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 1090, 50));

        ThongtinSinhvien1.setBackground(new java.awt.Color(27,36,52, 127));

        Hoten.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        Hoten.setForeground(new java.awt.Color(255, 255, 255));
        Hoten.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Hoten.setText("Họ tên:");
        Hoten.setPreferredSize(new java.awt.Dimension(70, 50));

        Mssv.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        Mssv.setForeground(new java.awt.Color(255, 255, 255));
        Mssv.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Mssv.setText("MSSV:");
        Mssv.setPreferredSize(new java.awt.Dimension(70, 50));

        GioiTinh.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        GioiTinh.setForeground(new java.awt.Color(255, 255, 255));
        GioiTinh.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        GioiTinh.setText("Giới tính:");
        GioiTinh.setPreferredSize(new java.awt.Dimension(70, 50));

        Hoten1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Hoten1.setForeground(new java.awt.Color(255, 255, 255));
        Hoten1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hoten1.setText("Họ & tên");
        Hoten1.setPreferredSize(new java.awt.Dimension(70, 50));

        Mssv1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Mssv1.setForeground(new java.awt.Color(255, 255, 255));
        Mssv1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mssv1.setText("Mã Số Sinh Viên");
        Mssv1.setPreferredSize(new java.awt.Dimension(70, 50));

        GioiTinh1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        GioiTinh1.setForeground(new java.awt.Color(255, 255, 255));
        GioiTinh1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GioiTinh1.setText("Giới tính");
        GioiTinh1.setPreferredSize(new java.awt.Dimension(70, 50));

        javax.swing.GroupLayout ThongtinSinhvien1Layout = new javax.swing.GroupLayout(ThongtinSinhvien1);
        ThongtinSinhvien1.setLayout(ThongtinSinhvien1Layout);
        ThongtinSinhvien1Layout.setHorizontalGroup(
            ThongtinSinhvien1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThongtinSinhvien1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ThongtinSinhvien1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Hoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mssv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ThongtinSinhvien1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Mssv1, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(Hoten1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GioiTinh1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ThongtinSinhvien1Layout.setVerticalGroup(
            ThongtinSinhvien1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThongtinSinhvien1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ThongtinSinhvien1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ThongtinSinhvien1Layout.createSequentialGroup()
                        .addComponent(Hoten1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(Mssv1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(GioiTinh1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ThongtinSinhvien1Layout.createSequentialGroup()
                        .addComponent(Hoten, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addGap(0, 0, 0)
                        .addComponent(Mssv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(GioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        ThongtinSinhvien.add(ThongtinSinhvien1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 250, 150));

        ThongtinSinhvien2.setBackground(new java.awt.Color(27,36,52, 127));

        Ngaysinh.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        Ngaysinh.setForeground(new java.awt.Color(255, 255, 255));
        Ngaysinh.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Ngaysinh.setText("Ngày sinh:");
        Ngaysinh.setPreferredSize(new java.awt.Dimension(95, 50));

        Ngaysinh1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Ngaysinh1.setForeground(new java.awt.Color(255, 255, 255));
        Ngaysinh1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Ngaysinh1.setText("Ngày sinh");
        Ngaysinh1.setPreferredSize(new java.awt.Dimension(70, 50));

        CCCD.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        CCCD.setForeground(new java.awt.Color(255, 255, 255));
        CCCD.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        CCCD.setText("Số CCCD:");
        CCCD.setPreferredSize(new java.awt.Dimension(95, 50));

        CCCD1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        CCCD1.setForeground(new java.awt.Color(255, 255, 255));
        CCCD1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CCCD1.setText("Mã CCCD");
        CCCD1.setPreferredSize(new java.awt.Dimension(70, 50));

        Email.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        Email.setForeground(new java.awt.Color(255, 255, 255));
        Email.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Email.setText("Email:");
        Email.setPreferredSize(new java.awt.Dimension(95, 50));

        Email1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Email1.setForeground(new java.awt.Color(255, 255, 255));
        Email1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Email1.setText("Email");
        Email1.setPreferredSize(new java.awt.Dimension(70, 50));

        Sodienthoai.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        Sodienthoai.setForeground(new java.awt.Color(255, 255, 255));
        Sodienthoai.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Sodienthoai.setText("Số điện thoại:");
        Sodienthoai.setPreferredSize(new java.awt.Dimension(95, 50));

        Sodienthoai1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Sodienthoai1.setForeground(new java.awt.Color(255, 255, 255));
        Sodienthoai1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Sodienthoai1.setText("Số Điện Thoại");
        Sodienthoai1.setPreferredSize(new java.awt.Dimension(70, 50));

        Noisinh.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        Noisinh.setForeground(new java.awt.Color(255, 255, 255));
        Noisinh.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Noisinh.setText("Nơi sinh:");
        Noisinh.setPreferredSize(new java.awt.Dimension(95, 50));

        Noisinh1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Noisinh1.setForeground(new java.awt.Color(255, 255, 255));
        Noisinh1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Noisinh1.setText("55 Giải Phóng, Đồng Tâm, Hai Bà Trưng, Hà Nội, Việt Nam");

        Thuongtru.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        Thuongtru.setForeground(new java.awt.Color(255, 255, 255));
        Thuongtru.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Thuongtru.setText("Thường trú:");
        Thuongtru.setPreferredSize(new java.awt.Dimension(95, 50));

        Dantoc.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        Dantoc.setForeground(new java.awt.Color(255, 255, 255));
        Dantoc.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Dantoc.setText("Dân tộc:");
        Dantoc.setPreferredSize(new java.awt.Dimension(95, 50));

        Dantoc1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Dantoc1.setForeground(new java.awt.Color(255, 255, 255));
        Dantoc1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Dantoc1.setText("Dân tộc");
        Dantoc1.setPreferredSize(new java.awt.Dimension(70, 50));

        Noisinh2.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Noisinh2.setForeground(new java.awt.Color(255, 255, 255));
        Noisinh2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Noisinh2.setText("55 Giải Phóng, Đồng Tâm, Hai Bà Trưng, Hà Nội, Việt Nam");

        javax.swing.GroupLayout ThongtinSinhvien2Layout = new javax.swing.GroupLayout(ThongtinSinhvien2);
        ThongtinSinhvien2.setLayout(ThongtinSinhvien2Layout);
        ThongtinSinhvien2Layout.setHorizontalGroup(
            ThongtinSinhvien2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThongtinSinhvien2Layout.createSequentialGroup()
                .addComponent(Ngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Ngaysinh1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
            .addGroup(ThongtinSinhvien2Layout.createSequentialGroup()
                .addComponent(Dantoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Dantoc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThongtinSinhvien2Layout.createSequentialGroup()
                .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Email1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThongtinSinhvien2Layout.createSequentialGroup()
                .addComponent(CCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(CCCD1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(ThongtinSinhvien2Layout.createSequentialGroup()
                .addGroup(ThongtinSinhvien2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Sodienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Noisinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Thuongtru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(ThongtinSinhvien2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Sodienthoai1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Noisinh1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Noisinh2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ThongtinSinhvien2Layout.setVerticalGroup(
            ThongtinSinhvien2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThongtinSinhvien2Layout.createSequentialGroup()
                .addGroup(ThongtinSinhvien2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Ngaysinh1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Ngaysinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(3, 3, 3)
                .addGroup(ThongtinSinhvien2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CCCD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CCCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(ThongtinSinhvien2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Email1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(ThongtinSinhvien2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Sodienthoai1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Sodienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(ThongtinSinhvien2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Noisinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Noisinh1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(ThongtinSinhvien2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Thuongtru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Noisinh2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(ThongtinSinhvien2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Dantoc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Dantoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ThongtinSinhvien.add(ThongtinSinhvien2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 570, 410));

        ThongtinSinhvien3.setBackground(new java.awt.Color(27,36,52, 127));

        Lophoc.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        Lophoc.setForeground(new java.awt.Color(255, 255, 255));
        Lophoc.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Lophoc.setText("Lớp học:");
        Lophoc.setToolTipText("");
        Lophoc.setPreferredSize(new java.awt.Dimension(55, 50));

        Khoa.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        Khoa.setForeground(new java.awt.Color(255, 255, 255));
        Khoa.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Khoa.setText("Khoa:");

        Nganh.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        Nganh.setForeground(new java.awt.Color(255, 255, 255));
        Nganh.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Nganh.setText("Ngành:");

        BacDaotao.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        BacDaotao.setForeground(new java.awt.Color(255, 255, 255));
        BacDaotao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        BacDaotao.setText("Bậc đào tạo:");

        Khoahoc.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        Khoahoc.setForeground(new java.awt.Color(255, 255, 255));
        Khoahoc.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Khoahoc.setText("Khóa học:");

        Lophoc1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Lophoc1.setForeground(new java.awt.Color(255, 255, 255));
        Lophoc1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lophoc1.setText("Lớp học");
        Lophoc1.setToolTipText("");
        Lophoc1.setPreferredSize(new java.awt.Dimension(55, 50));

        Khoa1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Khoa1.setForeground(new java.awt.Color(255, 255, 255));
        Khoa1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Khoa1.setText("Khoa");

        Nganh1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Nganh1.setForeground(new java.awt.Color(255, 255, 255));
        Nganh1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Nganh1.setText("Ngành");

        BacDaotao1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        BacDaotao1.setForeground(new java.awt.Color(255, 255, 255));
        BacDaotao1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BacDaotao1.setText("Bậc đào tạo");

        Khoahoc1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Khoahoc1.setForeground(new java.awt.Color(255, 255, 255));
        Khoahoc1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Khoahoc1.setText("Khóa học");

        javax.swing.GroupLayout ThongtinSinhvien3Layout = new javax.swing.GroupLayout(ThongtinSinhvien3);
        ThongtinSinhvien3.setLayout(ThongtinSinhvien3Layout);
        ThongtinSinhvien3Layout.setHorizontalGroup(
            ThongtinSinhvien3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThongtinSinhvien3Layout.createSequentialGroup()
                .addGroup(ThongtinSinhvien3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lophoc, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Khoa, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nganh, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BacDaotao, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Khoahoc, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ThongtinSinhvien3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nganh1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Khoa1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Lophoc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BacDaotao1, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(Khoahoc1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ThongtinSinhvien3Layout.setVerticalGroup(
            ThongtinSinhvien3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThongtinSinhvien3Layout.createSequentialGroup()
                .addGroup(ThongtinSinhvien3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ThongtinSinhvien3Layout.createSequentialGroup()
                        .addComponent(Lophoc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(Khoa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(Nganh, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(BacDaotao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(Khoahoc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ThongtinSinhvien3Layout.createSequentialGroup()
                        .addComponent(Lophoc1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(Khoa1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(Nganh1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(BacDaotao1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(Khoahoc1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 148, Short.MAX_VALUE))
        );

        ThongtinSinhvien.add(ThongtinSinhvien3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 70, 250, 410));

        avatar.setBackground(new java.awt.Color(255, 255, 255));
        avatar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ThongtinSinhvien.add(avatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 250, 250));

        materialTabbed.addTab("THÔNG TIN SINH VIÊN", ThongtinSinhvien);

        QuatrinhHoctap2.setBackground(new java.awt.Color(255, 255, 255, 80));
        QuatrinhHoctap2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Hocky.setBackground(new java.awt.Color(27,36,52, 127));
        Hocky.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("HỌC KỲ");
        Hocky.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 50));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jSeparator2.setPreferredSize(new java.awt.Dimension(150, 3));
        jSeparator2.setVerifyInputWhenFocusTarget(false);
        Hocky.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 150, -1));

        scrollPaneWin111.setBackground(new Color(255, 255, 255, 100));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
        );

        scrollPaneWin111.setViewportView(jPanel14);

        Hocky.add(scrollPaneWin111, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, 150, 455));

        QuatrinhHoctap2.add(Hocky, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, 515));

        DanhSachmon.setBackground(new java.awt.Color(27,36,52, 127));
        DanhSachmon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jSeparator3.setPreferredSize(new java.awt.Dimension(150, 3));
        jSeparator3.setVerifyInputWhenFocusTarget(false);
        DanhSachmon.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 880, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("DANH SÁCH ĐIỂM CÁC MÔN");
        DanhSachmon.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 50));

        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã học phần", "Tên học phần", "Số tín chỉ", "ĐQT", "ĐKT", "Điểm tổng kết", "Điểm 4", "Điểm chữ", "Đạt"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Short.class, java.lang.String.class, java.lang.String.class, java.lang.Short.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.setMaximumSize(new java.awt.Dimension(2147483647, 2000));
        table1.setMinimumSize(new java.awt.Dimension(60, 2000));
        table1.setPreferredSize(new java.awt.Dimension(300, 2000));
        table1.getTableHeader().setReorderingAllowed(false);
        scrollPaneWin112.setViewportView(table1);
        if (table1.getColumnModel().getColumnCount() > 0) {
            table1.getColumnModel().getColumn(0).setResizable(false);
            table1.getColumnModel().getColumn(0).setPreferredWidth(0);
            table1.getColumnModel().getColumn(1).setResizable(false);
            table1.getColumnModel().getColumn(1).setPreferredWidth(60);
            table1.getColumnModel().getColumn(2).setResizable(false);
            table1.getColumnModel().getColumn(2).setPreferredWidth(300);
            table1.getColumnModel().getColumn(3).setResizable(false);
            table1.getColumnModel().getColumn(3).setPreferredWidth(40);
            table1.getColumnModel().getColumn(4).setResizable(false);
            table1.getColumnModel().getColumn(4).setPreferredWidth(0);
            table1.getColumnModel().getColumn(5).setResizable(false);
            table1.getColumnModel().getColumn(5).setPreferredWidth(0);
            table1.getColumnModel().getColumn(6).setResizable(false);
            table1.getColumnModel().getColumn(6).setPreferredWidth(65);
            table1.getColumnModel().getColumn(7).setResizable(false);
            table1.getColumnModel().getColumn(7).setPreferredWidth(25);
            table1.getColumnModel().getColumn(8).setResizable(false);
            table1.getColumnModel().getColumn(8).setPreferredWidth(45);
            table1.getColumnModel().getColumn(9).setResizable(false);
            table1.getColumnModel().getColumn(9).setPreferredWidth(20);
        }

        jPanel18.add(scrollPaneWin112, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 300));

        DanhSachmon.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 55, 870, 300));

        QuatrinhHoctap2.add(DanhSachmon, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 880, 360));

        Danhgia.setBackground(new java.awt.Color(27,36,52, 127));
        Danhgia.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("ĐÁNH GIÁ");
        Danhgia.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 140));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Danhgia.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 2, 140));

        jPanel3.setBackground(new Color(255, 255, 255, 100));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Dienhe10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Dienhe10.setForeground(new java.awt.Color(255, 255, 255));
        Dienhe10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Dienhe10.setText("Điểm trung bình học kỳ hệ 10:");
        Dienhe10.setPreferredSize(new java.awt.Dimension(60, 50));
        jPanel3.add(Dienhe10, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 200, -1));

        Diem10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Diem10.setForeground(new java.awt.Color(255, 255, 255));
        Diem10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Diem10.setText("10.0");
        Diem10.setPreferredSize(new java.awt.Dimension(70, 50));
        jPanel3.add(Diem10, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 5, -1, -1));

        Diemhe4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Diemhe4.setForeground(new java.awt.Color(255, 255, 255));
        Diemhe4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Diemhe4.setText("Điểm trung bình học kỳ hệ 4:");
        Diemhe4.setPreferredSize(new java.awt.Dimension(60, 50));
        jPanel3.add(Diemhe4, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 85, 200, -1));

        Diem4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Diem4.setForeground(new java.awt.Color(255, 255, 255));
        Diem4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Diem4.setText("4.0");
        Diem4.setPreferredSize(new java.awt.Dimension(70, 50));
        jPanel3.add(Diem4, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 85, -1, -1));

        SoTinchi.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        SoTinchi.setForeground(new java.awt.Color(255, 255, 255));
        SoTinchi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        SoTinchi.setText("Số tín chỉ đăng ký:");
        SoTinchi.setPreferredSize(new java.awt.Dimension(60, 50));
        jPanel3.add(SoTinchi, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 5, 130, -1));

        Tinchi.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Tinchi.setForeground(new java.awt.Color(255, 255, 255));
        Tinchi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tinchi.setText("20");
        Tinchi.setPreferredSize(new java.awt.Dimension(70, 50));
        jPanel3.add(Tinchi, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 5, -1, -1));

        XeploaiHocluc.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        XeploaiHocluc.setForeground(new java.awt.Color(255, 255, 255));
        XeploaiHocluc.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        XeploaiHocluc.setText("Xếp loại học lực:");
        XeploaiHocluc.setPreferredSize(new java.awt.Dimension(60, 50));
        jPanel3.add(XeploaiHocluc, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 85, 130, -1));

        Hocluc.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Hocluc.setForeground(new java.awt.Color(255, 255, 255));
        Hocluc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hocluc.setText("Giỏi");
        Hocluc.setPreferredSize(new java.awt.Dimension(70, 50));
        jPanel3.add(Hocluc, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 85, -1, -1));

        Hoten3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Hoten3.setForeground(new java.awt.Color(255, 255, 255));
        Hoten3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Hoten3.setText("Số tín chỉ đã hoàn thành:");
        Hoten3.setPreferredSize(new java.awt.Dimension(60, 50));
        jPanel3.add(Hoten3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 5, 170, -1));

        Hoten5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Hoten5.setForeground(new java.awt.Color(255, 255, 255));
        Hoten5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hoten5.setText("15");
        Hoten5.setPreferredSize(new java.awt.Dimension(70, 50));
        jPanel3.add(Hoten5, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 5, 70, -1));

        Danhgia.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 0, 780, 140));

        QuatrinhHoctap2.add(Danhgia, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 880, 140));

        materialTabbed.addTab("QUÁ TRÌNH HỌC TẬP", QuatrinhHoctap2);

        ChuongtrinhKhung2.setBackground(new java.awt.Color(255, 255, 255, 80));
        ChuongtrinhKhung2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Separator1.setBackground(new java.awt.Color(0, 0, 0));
        Separator1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ChuongtrinhKhung2.add(Separator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 1105, 3));

        TITLE1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        TITLE1.setForeground(new java.awt.Color(255, 255, 255));
        TITLE1.setText("CHƯƠNG TRÌNH KHUNG");
        TITLE1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        ChuongtrinhKhung2.add(TITLE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 1090, 50));

        Hocky1.setBackground(new java.awt.Color(27,36,52, 127));
        Hocky1.setForeground(new java.awt.Color(255, 255, 255));
        Hocky1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("HỌC KỲ");
        Hocky1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 50));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jSeparator4.setPreferredSize(new java.awt.Dimension(150, 3));
        jSeparator4.setVerifyInputWhenFocusTarget(false);
        Hocky1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 150, -1));

        scrollPaneWin113.setBackground(new Color(255, 255, 255, 100));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 411, Short.MAX_VALUE)
        );

        scrollPaneWin113.setViewportView(jPanel15);

        Hocky1.add(scrollPaneWin113, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, 150, 413));

        ChuongtrinhKhung2.add(Hocky1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 150, 470));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255, 160));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scrollPaneWin114.setPreferredSize(new java.awt.Dimension(1090, 465));

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã học phần", "Tên học phần", "Số tín chỉ", "Đạt"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Short.class, java.lang.String.class, java.lang.String.class, java.lang.Short.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        table2.setMaximumSize(new java.awt.Dimension(2147483647, 2000));
        table2.setMinimumSize(new java.awt.Dimension(60, 2000));
        table2.setPreferredSize(new java.awt.Dimension(300, 2000));
        table2.getTableHeader().setReorderingAllowed(false);
        scrollPaneWin114.setViewportView(table2);
        if (table2.getColumnModel().getColumnCount() > 0) {
            table2.getColumnModel().getColumn(0).setPreferredWidth(35);
            table2.getColumnModel().getColumn(0).setMaxWidth(35);
            table2.getColumnModel().getColumn(1).setPreferredWidth(85);
            table2.getColumnModel().getColumn(1).setMaxWidth(85);
            table2.getColumnModel().getColumn(2).setPreferredWidth(675);
            table2.getColumnModel().getColumn(2).setMaxWidth(675);
            table2.getColumnModel().getColumn(3).setPreferredWidth(65);
            table2.getColumnModel().getColumn(3).setMaxWidth(65);
            table2.getColumnModel().getColumn(4).setPreferredWidth(35);
            table2.getColumnModel().getColumn(4).setMaxWidth(35);
        }

        jPanel1.add(scrollPaneWin114, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 915, 465));

        ChuongtrinhKhung2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 915, 470));

        materialTabbed.addTab("CHƯƠNG TRÌNH KHUNG", ChuongtrinhKhung2);

        ThongkeHoctap.setBackground(new java.awt.Color(255, 255, 255, 80));
        ThongkeHoctap.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel1.setBackground(new Color(23,100,126, 127));
        roundPanel1.setPreferredSize(new java.awt.Dimension(1000, 382));

        chart2.setBackground(new Color(23,100,126, 0));
        chart2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chart2, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addComponent(chart2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        ThongkeHoctap.add(roundPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 770, 280));

        roundPanel4.setBackground(new Color(0, 0, 0, 85));

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Điểm Trung Bình Tích Lũy Hệ 10:");

        jLabel18.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Điểm Trung Bình Tích Lũy Hệ 4:");

        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("Số Tín Chỉ Tích Lũy:");

        jLabel20.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("Điều kiện ra trường:");

        jLabel21.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setText("Bằng giỏi:");

        jLabel22.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("Bằng khá:");

        jLabel23.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setText("Yêu cầu tối thiểu:");

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DATA");

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("DATA");

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("DATA");

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("DATA");

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("DATA");

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("DATA");

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("DATA");

        javax.swing.GroupLayout roundPanel4Layout = new javax.swing.GroupLayout(roundPanel4);
        roundPanel4.setLayout(roundPanel4Layout);
        roundPanel4Layout.setHorizontalGroup(
            roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(roundPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(roundPanel4Layout.createSequentialGroup()
                        .addGroup(roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(roundPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9))
                            .addGroup(roundPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13))
                            .addGroup(roundPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel14)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(roundPanel4Layout.createSequentialGroup()
                        .addGroup(roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(roundPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7))
                            .addGroup(roundPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8))
                            .addGroup(roundPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12)))
                        .addGap(0, 37, Short.MAX_VALUE))))
        );
        roundPanel4Layout.setVerticalGroup(
            roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel7))
                .addGap(6, 6, 6)
                .addGroup(roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel8))
                .addGap(6, 6, 6)
                .addGroup(roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel9))
                .addGap(6, 6, 6)
                .addGroup(roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel12))
                .addGap(6, 6, 6)
                .addGroup(roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel11))
                .addGap(6, 6, 6)
                .addGroup(roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel13))
                .addGap(6, 6, 6)
                .addGroup(roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel14))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        ThongkeHoctap.add(roundPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, 300, 190));

        roundPanel10.setBackground(new Color(23,100,126, 127));
        roundPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("CÁC MÔN HỌC CẢI THIỆN");
        roundPanel10.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 24));

        Separator4.setBackground(new java.awt.Color(0, 0, 0));
        Separator4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        roundPanel10.add(Separator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 24, 525, 3));

        table8.setModel(new javax.swing.table.DefaultTableModel(
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
                "STT", "Mã học phần", "Tên học phần", "Số tín chỉ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Short.class, java.lang.String.class, java.lang.String.class, java.lang.Short.class
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
        scrollPaneWin120.setViewportView(table8);
        if (table8.getColumnModel().getColumnCount() > 0) {
            table8.getColumnModel().getColumn(0).setPreferredWidth(35);
            table8.getColumnModel().getColumn(0).setMaxWidth(35);
            table8.getColumnModel().getColumn(1).setPreferredWidth(85);
            table8.getColumnModel().getColumn(1).setMaxWidth(85);
            table8.getColumnModel().getColumn(2).setPreferredWidth(310);
            table8.getColumnModel().getColumn(2).setMaxWidth(310);
            table8.getColumnModel().getColumn(3).setPreferredWidth(80);
            table8.getColumnModel().getColumn(3).setMaxWidth(80);
        }

        roundPanel10.add(scrollPaneWin120, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 27, 525, 180));

        ThongkeHoctap.add(roundPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, 525, 210));

        roundPanel11.setBackground(new Color(23,100,126, 127));
        roundPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("CÁC MÔN CHƯA ĐẠT");
        roundPanel11.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 24));

        Separator5.setBackground(new java.awt.Color(0, 0, 0));
        Separator5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        roundPanel11.add(Separator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 24, 525, 3));

        table7.setModel(new javax.swing.table.DefaultTableModel(
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
                "STT", "Mã học phần", "Tên học phần", "Số tín chỉ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Short.class, java.lang.String.class, java.lang.String.class, java.lang.Short.class
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
        scrollPaneWin121.setViewportView(table7);
        if (table7.getColumnModel().getColumnCount() > 0) {
            table7.getColumnModel().getColumn(0).setPreferredWidth(35);
            table7.getColumnModel().getColumn(0).setMaxWidth(35);
            table7.getColumnModel().getColumn(1).setPreferredWidth(85);
            table7.getColumnModel().getColumn(1).setMaxWidth(85);
            table7.getColumnModel().getColumn(2).setPreferredWidth(310);
            table7.getColumnModel().getColumn(2).setMaxWidth(310);
            table7.getColumnModel().getColumn(3).setPreferredWidth(80);
            table7.getColumnModel().getColumn(3).setMaxWidth(80);
        }

        roundPanel11.add(scrollPaneWin121, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 27, 525, 180));

        ThongkeHoctap.add(roundPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 525, 210));

        materialTabbed.addTab("THỐNG KÊ HỌC TẬP", ThongkeHoctap);

        ThongBao.setBackground(new java.awt.Color(255, 255, 255, 80));
        ThongBao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel5.setBackground(new java.awt.Color(255, 255, 255, 100));
        roundPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("BẢNG TIN");
        roundPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 74));

        ThongBao.add(roundPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 12, 300, 74));

        roundPanel6.setBackground(new java.awt.Color(255, 255, 255, 100));
        roundPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("THÔNG BÁO");
        roundPanel6.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 74));

        ThongBao.add(roundPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 12, 710, 74));

        jSplitPane1.setPreferredSize(new java.awt.Dimension(1040, 500));
        jSplitPane1.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
                jSplitPane1AncestorMoved(evt);
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
                jSplitPane1AncestorResized(evt);
            }
        });

        jPanel67.setBackground(new java.awt.Color(255, 255, 255));
        jPanel67.setPreferredSize(new java.awt.Dimension(300, 410));
        jPanel67.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                jPanel67HierarchyChanged(evt);
            }
        });
        jPanel67.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        scrollPaneWin118.setViewportView(jPanel67);

        jSplitPane1.setLeftComponent(scrollPaneWin118);

        jPanel66.setBackground(new java.awt.Color(255, 255, 255));
        jPanel66.setPreferredSize(new java.awt.Dimension(600, 410));
        jPanel66.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                jPanel66HierarchyChanged(evt);
            }
        });
        jPanel66.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        scrollPaneWin117.setViewportView(jPanel66);

        jSplitPane1.setRightComponent(scrollPaneWin117);

        ThongBao.add(jSplitPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, 410));

        materialTabbed.addTab("THÔNG BÁO", ThongBao);

        GopY.setBackground(new java.awt.Color(255, 255, 255, 80));
        GopY.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel7.setBackground(new java.awt.Color(27,36,52, 90));
        roundPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("NHẬP TIÊU ĐỀ:");
        roundPanel7.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 50));

        jSeparator5.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator5.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        roundPanel7.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 42, 930, 2));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        scrollPaneWin119.setViewportView(jTextArea2);

        roundPanel7.add(scrollPaneWin119, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 10, 930, 30));

        GopY.add(roundPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 1065, 50));

        roundPanel8.setBackground(new java.awt.Color(27,36,52, 90));
        roundPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("NHẬP TIÊU ĐỀ:");
        roundPanel8.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 50));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        scrollPaneWin1110.setViewportView(jTextArea1);

        roundPanel8.add(scrollPaneWin1110, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 10, 930, 240));

        jPanel4.setBackground(new Color(27,36,52, 90));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(255, 90, 0));
        jPanel7.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
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

        jLabel28.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel28.setText("XÓA");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel28)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel28)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, 106, 40));

        jPanel8.setBackground(new java.awt.Color(255, 90, 0));
        jPanel8.setBorder(javax.swing.BorderFactory.createEmptyBorder(3, 3, 3, 3));
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

        jLabel29.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel29.setText("GỬI");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel29)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel29)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel4.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 67, 106, 40));

        roundPanel8.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 110, 130));

        GopY.add(roundPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 1065, 260));

        materialTabbed.addTab("GÓP Ý & HỖ TRỢ", GopY);

        getContentPane().add(materialTabbed, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 30, 1130, 590));

        Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/folder/StudentBackground.jpg"))); // NOI18N
        Background.setMaximumSize(new java.awt.Dimension(1140, 625));
        Background.setMinimumSize(new java.awt.Dimension(1140, 625));
        Background.setPreferredSize(new java.awt.Dimension(1140, 625));
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

    private void SettingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingMouseExited
        changeColor(jPanel2, new Color(23,100,126));  
//        jPanel9.setVisible(false);
    }//GEN-LAST:event_SettingMouseExited

    private void SettingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingMouseEntered
        changeColor(jPanel2, new Color(23, 111, 126));   
//        jPanel9.setVisible(true);
    }//GEN-LAST:event_SettingMouseEntered

    private void jPanel66HierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jPanel66HierarchyChanged

    }//GEN-LAST:event_jPanel66HierarchyChanged

    private void jSplitPane1AncestorMoved(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jSplitPane1AncestorMoved

    }//GEN-LAST:event_jSplitPane1AncestorMoved

    private void jSplitPane1AncestorResized(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jSplitPane1AncestorResized

    }//GEN-LAST:event_jSplitPane1AncestorResized

    private void jPanel67HierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jPanel67HierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel67HierarchyChanged

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
        changeColor(jPanel7, new Color(220, 86, 13));
    }//GEN-LAST:event_jPanel7MouseEntered

    private void jPanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseExited
        changeColor(jPanel7, new Color(255,90,0));
    }//GEN-LAST:event_jPanel7MouseExited

    private void jPanel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseEntered
        changeColor(jPanel8, new Color(220, 86, 13));
    }//GEN-LAST:event_jPanel8MouseEntered

    private void jPanel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseExited
        changeColor(jPanel8, new Color(255,90,0));
    }//GEN-LAST:event_jPanel8MouseExited

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        jTextArea1.setText("");
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        Object[] options = {"Có", "Không"};
        int n = JOptionPane.showOptionDialog(GopY, "Bạn muốn gửi tới hòm thư?", null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
    }//GEN-LAST:event_jPanel8MouseClicked

    private void SettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingMouseClicked
        jPanel9.setVisible(!jPanel9.isVisible());
    }//GEN-LAST:event_SettingMouseClicked

    private void changePassword1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePassword1MouseEntered
        changeColor(changePassword1, new Color(47, 97, 95));
    }//GEN-LAST:event_changePassword1MouseEntered

    private void changePassword1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePassword1MouseExited
        changeColor(changePassword1, new Color(47, 84, 97));
    }//GEN-LAST:event_changePassword1MouseExited

    private void Logout1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Logout1MouseEntered
        changeColor(Logout1, new Color(47, 97, 95));
    }//GEN-LAST:event_Logout1MouseEntered

    private void Logout1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Logout1MouseExited
        changeColor(Logout1, new Color(47, 84, 97));
    }//GEN-LAST:event_Logout1MouseExited

    private void Logout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Logout1MouseClicked
        this.setVisible(false);
        LoginJFrame login = new LoginJFrame();
        login.setVisible(true);
    }//GEN-LAST:event_Logout1MouseClicked

    private void changePassword1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePassword1MouseClicked
        jPanel12.setVisible(true);
        materialTabbed.setVisible(false);
    }//GEN-LAST:event_changePassword1MouseClicked

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
        // TODO add your handling code here:    }
        Object[] options = {"Có", "Không"};
        int n = JOptionPane.showOptionDialog(jPanel12,"Bạn muốn yêu cầu cấp lại mật khẩu?",null,JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[1]);
        if (n == JOptionPane.YES_OPTION) {            
            jPanel12.setVisible(false);
            materialTabbed.setVisible(true);
        }
        else if (n == JOptionPane.NO_OPTION) {
        }
    }//GEN-LAST:event_jLabel33MouseClicked

    private void jLabel33MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseEntered
        changeColor(jPanel24, new Color(220, 86, 13));
    }//GEN-LAST:event_jLabel33MouseEntered

    private void jLabel33MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseExited
        changeColor(jPanel24, new Color(255,90,0));
    }//GEN-LAST:event_jLabel33MouseExited

    private void jLabel36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseClicked
        jPanel12.setVisible(false);
        materialTabbed.setVisible(true);
    }//GEN-LAST:event_jLabel36MouseClicked

    private void jLabel36MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseEntered
        changeColor(jPanel25, new Color(220, 86, 13));
    }//GEN-LAST:event_jLabel36MouseEntered

    private void jLabel36MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseExited
        changeColor(jPanel25, new Color(255,90,0));
    }//GEN-LAST:event_jLabel36MouseExited

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
            java.util.logging.Logger.getLogger(DashboardJFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardJFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardJFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardJFrame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardJFrame2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BacDaotao;
    private javax.swing.JLabel BacDaotao1;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel CCCD;
    private javax.swing.JLabel CCCD1;
    private javaapplication24.RoundPanel ChuongtrinhKhung2;
    private javaapplication24.RoundPanel DanhSachmon;
    private javaapplication24.RoundPanel Danhgia;
    private javax.swing.JLabel Dantoc;
    private javax.swing.JLabel Dantoc1;
    private javax.swing.JLabel Diem10;
    private javax.swing.JLabel Diem4;
    private javax.swing.JLabel Diemhe4;
    private javax.swing.JLabel Dienhe10;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Email1;
    private javax.swing.JLabel GioiTinh;
    private javax.swing.JLabel GioiTinh1;
    private javax.swing.JPanel GopY;
    private javaapplication24.RoundPanel Hocky;
    private javaapplication24.RoundPanel Hocky1;
    private javax.swing.JLabel Hocluc;
    private javax.swing.JLabel Hoten;
    private javax.swing.JLabel Hoten1;
    private javax.swing.JLabel Hoten3;
    private javax.swing.JLabel Hoten5;
    private javax.swing.JLabel Khoa;
    private javax.swing.JLabel Khoa1;
    private javax.swing.JLabel Khoahoc;
    private javax.swing.JLabel Khoahoc1;
    private javax.swing.JLabel Logout;
    private javaapplication24.RoundPanel Logout1;
    private javax.swing.JLabel Lophoc;
    private javax.swing.JLabel Lophoc1;
    private javax.swing.JLabel Mssv;
    private javax.swing.JLabel Mssv1;
    private javax.swing.JLabel Nganh;
    private javax.swing.JLabel Nganh1;
    private javax.swing.JLabel Ngaysinh;
    private javax.swing.JLabel Ngaysinh1;
    private javax.swing.JLabel Noisinh;
    private javax.swing.JLabel Noisinh1;
    private javax.swing.JLabel Noisinh2;
    private javaapplication24.RoundPanel QuatrinhHoctap2;
    private javax.swing.JSeparator Separator;
    private javax.swing.JSeparator Separator1;
    private javax.swing.JSeparator Separator4;
    private javax.swing.JSeparator Separator5;
    private javax.swing.JLabel Setting;
    private javax.swing.JLabel SoTinchi;
    private javax.swing.JLabel Sodienthoai;
    private javax.swing.JLabel Sodienthoai1;
    private javax.swing.JLabel TITLE;
    private javax.swing.JLabel TITLE1;
    private javax.swing.JPanel ThongBao;
    private javax.swing.JPanel ThongkeHoctap;
    private javaapplication24.RoundPanel ThongtinSinhvien;
    private javaapplication24.RoundPanel ThongtinSinhvien1;
    private javaapplication24.RoundPanel ThongtinSinhvien2;
    private javaapplication24.RoundPanel ThongtinSinhvien3;
    private javax.swing.JLabel Thuongtru;
    private javax.swing.JLabel Tinchi;
    private javax.swing.JPanel Titlebar;
    private javax.swing.JLabel XeploaiHocluc;
    private javax.swing.JLabel avatar;
    private javax.swing.JLabel changePassword;
    private javaapplication24.RoundPanel changePassword1;
    private javaapplication24.Chart chart2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel66;
    private javax.swing.JPanel jPanel67;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javaapplication24.MaterialTabbed materialTabbed;
    private javaapplication24.PasswordField passwordField1;
    private javaapplication24.PasswordField passwordField2;
    private javaapplication24.PasswordField passwordField3;
    private javaapplication24.RoundPanel roundPanel1;
    private javaapplication24.RoundPanel roundPanel10;
    private javaapplication24.RoundPanel roundPanel11;
    private javaapplication24.RoundPanel roundPanel4;
    private javaapplication24.RoundPanel roundPanel5;
    private javaapplication24.RoundPanel roundPanel6;
    private javaapplication24.RoundPanel roundPanel7;
    private javaapplication24.RoundPanel roundPanel8;
    private javaapplication24.RoundPanel roundPanel9;
    private javaapplication24.ScrollPaneWin11 scrollPaneWin111;
    private javaapplication24.ScrollPaneWin11 scrollPaneWin1110;
    private javaapplication24.ScrollPaneWin11 scrollPaneWin112;
    private javaapplication24.ScrollPaneWin11 scrollPaneWin113;
    private javaapplication24.ScrollPaneWin11 scrollPaneWin114;
    private javaapplication24.ScrollPaneWin11 scrollPaneWin117;
    private javaapplication24.ScrollPaneWin11 scrollPaneWin118;
    private javaapplication24.ScrollPaneWin11 scrollPaneWin119;
    private javaapplication24.ScrollPaneWin11 scrollPaneWin120;
    private javaapplication24.ScrollPaneWin11 scrollPaneWin121;
    private javaapplication24.Table table1;
    private javaapplication24.Table table2;
    private javaapplication24.Table table7;
    private javaapplication24.Table table8;
    // End of variables declaration//GEN-END:variables
}
