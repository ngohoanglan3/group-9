/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication24;

import database.BAC_DAO_TAO_DAO;
import database.CHUONG_TRINH_KHUNG_DAO;
import database.DIEM_DAO;
import database.HOC_KY_DAO;
import database.HOM_THU_DAO;
import database.KHOA_DAO;
import database.KHOA_HOC_DAO;
import database.LOAI_HINH_DAO_TAO_DAO;
import database.LOP_DAO;
import database.MON_HOC_DAO;
import database.NGANH_DAO;
import database.SINH_VIEN_DAO;
import database.THONG_BAO_DAO;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import models.BAC_DAO_TAO;
import models.CHUONG_TRINH_KHUNG;
import models.DIEM;
import models.HOC_KY;
import models.HOM_THU;
import models.KHOA;
import models.LOP;
import models.MON_HOC;
import models.SINH_VIEN;
import models.THONG_BAO;

/**
 *
 * @author ngoho
 */

class HocKiPanel extends javax.swing.JPanel {
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


class ThongBaoPanel extends javax.swing.JLabel {
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

public class DashboardJFrame2 extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    private int x;
    private int y;
    SINH_VIEN sinhvien;
    public DashboardJFrame2(){}
    public DashboardJFrame2(SINH_VIEN sv) {
        initComponents();
        this.sinhvien = sv;
        //cap nhat thong tin sinh vien
        Hoten1.setText(sinhvien.getHo() + " " + sinhvien.getTen());
        
        Mssv1.setText(sinhvien.getMaSV());
        
        if (sinhvien.getGioiTinh()== true){
        GioiTinh1.setText("Nam");}
        else GioiTinh1.setText("Nữ");
        
        Ngaysinh1.setText(sinhvien.getNgaySinh());
        
        CCCD1.setText(sinhvien.getCCCD());
        
        Email1.setText(sinhvien.getEmail());
        
        Sodienthoai1.setText(sinhvien.getSDT());
        
        Noisinh1.setText(sinhvien.getNoiSinh());
        
        Thuongtru1.setText(sinhvien.getHoKhauThuongTru());
        
        Dantoc1.setText(sinhvien.getDanToc());
        
        if(sinhvien.getMaNganh()!=null) if(new NGANH_DAO().getThongTin(sinhvien.getMaNganh()).getFlag()==true)
        {Nganh1.setText(new NGANH_DAO().getThongTin(sinhvien.getMaNganh()).getTenNganh());
        
        Khoa1.setText(new KHOA_DAO().getThongTin(new NGANH_DAO().getThongTin(sinhvien.getMaNganh()).getMaKhoa()).getTenKhoa());}
        
        if(sinhvien.getMaKhoaHoc()!=null ) if(new KHOA_HOC_DAO().getThongTin(sinhvien.getMaKhoaHoc()).getFlag()==true)
        Khoahoc1.setText(sinhvien.getMaKhoaHoc());
        
        if(new LOP_DAO().getThongTin(sinhvien.getMaLop()).getFlag()==true)
        Lophoc1.setText(new LOP_DAO().getThongTin(sinhvien.getMaLop()).getTenLop());
        
        if(sinhvien.getMaBac()!=null) if(new BAC_DAO_TAO_DAO().getThongTin(sinhvien.getMaBac()).getFlag()==true)
        BacDaotao1.setText(new BAC_DAO_TAO_DAO().getThongTin(sinhvien.getMaBac()).getTenBac());
        
        if(sinhvien.getMaLoaiHinhDaoTao()!=null) if(new LOAI_HINH_DAO_TAO_DAO().getThongTin(sinhvien.getMaLoaiHinhDaoTao()).getFlag()==true)
        Loaihinh1.setText(new LOAI_HINH_DAO_TAO_DAO().getThongTin(sinhvien.getMaLoaiHinhDaoTao()).getTenLoaiHinhDaoTao());
        

// khoi tao cac bien
        if(sinhvien.getMaNganh()!=null ) if(new NGANH_DAO().getThongTin(sinhvien.getMaNganh()).getFlag()==true)
        if(sinhvien.getMaKhoaHoc()!=null ) if(new KHOA_HOC_DAO().getThongTin(sinhvien.getMaKhoaHoc()).getFlag()==true)
        try{
        ArrayList<String> danhsachhocky = new SINH_VIEN_DAO().getDanhSachHocKy(sinhvien.getMaSV());
        ArrayList<Integer> danhsachchuongtrinhkhung = new CHUONG_TRINH_KHUNG_DAO().getDanhSachHocKy(sinhvien.getMaNganh());
        int n = danhsachhocky.size();
        int m = danhsachchuongtrinhkhung.size();
        HocKiPanel[] HocKi = new HocKiPanel[n];
        HocKiPanel[] HocKiChuongTrinhKhung = new HocKiPanel[m];
        


        

        
//CHUONG_TRINH_KHUNG

        for (int i=0;i<m;i++){
            //crk = new CHUONG_TRINH_KHUNG_DAO().;
            ArrayList<MON_HOC> danhsach = new CHUONG_TRINH_KHUNG_DAO().getDanhSachChuongTrinhKhung(sinhvien.getMaNganh(), danhsachchuongtrinhkhung.get(i));
            HocKiChuongTrinhKhung[i]= new HocKiPanel("Học kỳ " + (1+i));
            HocKiChuongTrinhKhung[i].setBounds(10, i*50+20, 120,40);
            HocKiChuongTrinhKhung[i].setMonHoc(danhsach);
            final int j = i;
            HocKiChuongTrinhKhung[i].addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                for (int t=0;t<m;t++){
                    HocKiChuongTrinhKhung[t].flag=false;
                    HocKiChuongTrinhKhung[t].HocKiPanelMouseExited();
                }
                changeColor(HocKiChuongTrinhKhung[j],new Color(0,250,250));///////////////////////KIEM THU
                HocKiChuongTrinhKhung[j].flag=true;
                
                table3.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                            "Mã học phần", "Tên học phần", "Học phần song hành", "Học phần tiên quyết"
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
                for(int t=0;t< HocKiChuongTrinhKhung[j].MonHoc.size();t++){
                    String ma =HocKiChuongTrinhKhung[j].MonHoc.get(t).getMaMon();
                    String ten =HocKiChuongTrinhKhung[j].MonHoc.get(t).getTenMon();
                    String songhanh=HocKiChuongTrinhKhung[j].MonHoc.get(t).getSongHanh();
                    String tienquyet=HocKiChuongTrinhKhung[j].MonHoc.get(t).getTienQuyet();
                    Object[] data = {ma, ten, songhanh, tienquyet};
                    table3.addRow(data);
                
                }
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
            jPanel14.setPreferredSize(new Dimension(120, m*50+30));
            jPanel14.add(HocKiChuongTrinhKhung[i]);
        };
        

//HOC_KY        
        HOC_KY hocky;
        for (int i=0;i<n;i++){
            
            hocky = new HOC_KY_DAO().getThongTin(danhsachhocky.get(i));
            HocKi[i] = new HocKiPanel("Học kỳ " + hocky.getSoThuTu() + "/"+ hocky.getNam());
            
            HocKi[i].setBounds(10, i*50+20, 120,40);
            
            HocKi[i].setDiem(new DIEM_DAO().getDanhSachDiem(sinhvien.getMaSV(), danhsachhocky.get(i)));
            final int j = i;
            
            HocKi[i].addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                for (int t=0;t<n;t++){
                    HocKi[t].flag=false;
                    HocKi[t].HocKiPanelMouseExited();
                }
                changeColor(HocKi[j],new Color(0,250,250));
                HocKi[j].flag=true;
                
                
                table1.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                        },
                        new String [] {
                            "Tên môn", "Điểm chuyên cần", "Điểm giữa Kỳ", "Điểm Kết thúc", "Điểm trung bình", "Điểm chữ", "Đạt"
                        }
                    ) {
                        Class[] types = new Class [] {
                            java.lang.Object.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Object.class, java.lang.Boolean.class
                        };

                        public Class getColumnClass(int columnIndex) {
                            return types [columnIndex];
                        }
                    });
                
                int cc = new KHOA_HOC_DAO().getThongTin(sinhvien.getMaKhoaHoc()).getHeSoDCC();
                int gk = new KHOA_HOC_DAO().getThongTin(sinhvien.getMaKhoaHoc()).getHeSoDGK();
                int kt = new KHOA_HOC_DAO().getThongTin(sinhvien.getMaKhoaHoc()).getHeSoDKT();
                int tinchi =0;
                int tinchihoclai=0;
                double tongdiem10 = 0;
                double tongdiem4 = 0;
                for(int t=0;t< HocKi[j].Diem.size();t++){
                    String ten = new MON_HOC_DAO().getThongTin(HocKi[j].Diem.get(t).getMaMon()).getTenMon(); 
                    tinchi += new MON_HOC_DAO().getThongTin(HocKi[j].Diem.get(t).getMaMon()).getSoTinChi();
                    Float dcc = HocKi[j].Diem.get(t).getDiemChuyenCan();
                    Float dgk = HocKi[j].Diem.get(t).getDiemGiuaKy();
                    Float dkt = HocKi[j].Diem.get(t).getDiemKetThuc();
                    double dtb = Math.ceil(((dcc*cc+ dgk*gk)/100*(100-kt) + dkt*kt))/100;
                    //if(Math.ceil(((dcc*cc+ dgk*gk)/100*(100-kt) + dkt*kt))/100 <4.0) dtb = 0;
                    tongdiem10+= dtb * new MON_HOC_DAO().getThongTin(HocKi[j].Diem.get(t).getMaMon()).getSoTinChi();;
                    String dc ="A";
                    if (dtb>=8.6) {
                        dc = "A";
                        tongdiem4 += 4 *new MON_HOC_DAO().getThongTin(HocKi[j].Diem.get(t).getMaMon()).getSoTinChi();
                    }
                    else if (dtb>=8) {
                        dc = "B+";
                        tongdiem4 += 3.5 *new MON_HOC_DAO().getThongTin(HocKi[j].Diem.get(t).getMaMon()).getSoTinChi();
                    }
                    else if (dtb>=7) {
                        dc = "B";
                        tongdiem4 += 3 *new MON_HOC_DAO().getThongTin(HocKi[j].Diem.get(t).getMaMon()).getSoTinChi();
                    }
                    else if (dtb>=6) {
                        dc = "C+";
                        tongdiem4 += 2.5 *new MON_HOC_DAO().getThongTin(HocKi[j].Diem.get(t).getMaMon()).getSoTinChi();
                    }
                    else if (dtb>=5) {
                        dc = "C";
                        tongdiem4 += 2 *new MON_HOC_DAO().getThongTin(HocKi[j].Diem.get(t).getMaMon()).getSoTinChi();
                    }
                    else if (dtb>=4) {
                        dc = "D";
                        tongdiem4 += 1.5 *new MON_HOC_DAO().getThongTin(HocKi[j].Diem.get(t).getMaMon()).getSoTinChi();
                    }
                    else if (dtb>=0) {
                        dc = "F";
                        tongdiem4 += 1 *new MON_HOC_DAO().getThongTin(HocKi[j].Diem.get(t).getMaMon()).getSoTinChi();
                    }
                    Boolean dat;
                    if(dtb >=4) dat = true;
                    else {
                        dat = false;
                        tinchihoclai+=new MON_HOC_DAO().getThongTin(HocKi[j].Diem.get(t).getMaMon()).getSoTinChi();
                    }
                    Object[] data = {ten, dcc, dgk, dkt, dtb, dc, dat};
                table1.addRow(data);
            }
                String hocluc = "Giỏi";
                double dtbhk4 = Math.ceil(tongdiem4/tinchi*100)/100;
                if (dtbhk4>=3.6) {
                        hocluc = "Xuất sắc";
                        }
                    else if (dtbhk4>=3.2) {
                        hocluc = "Giỏi";
                       }
                    else if (dtbhk4>=2.5) {
                        hocluc = "Khá";
                        }
                    else if (dtbhk4>=2) {
                        hocluc = "TB";
                        }
                    else if (dtbhk4>=0) {
                        hocluc = "Kém";
                        }
                Diem10.setText(String.valueOf(Math.ceil(tongdiem10/tinchi*100)/100));
                Diem10.setOpaque(true);
                Diem4.setText(String.valueOf(dtbhk4));
                Diem4.setOpaque(true);
                Tinchi.setText(String.valueOf(tinchi));
                Tinchi.setOpaque(true);
                TinChiDaHoanThanh.setText(String.valueOf(tinchi - tinchihoclai));
                TinChiDaHoanThanh.setOpaque(true);
                Hocluc.setText(hocluc);
                Hocluc.setOpaque(true);
                
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
            jPanel13.setPreferredSize(new Dimension(120, n*50+30));
            jPanel13.add(HocKi[i]);
        };
        
        //THONG_KE
        float diemtichluy=0;
        double diem[] = new double[n];
        double diem1[] = new double[n];
       
        for(int i = 0; i < n;i++){
            int chart = (int) Math.round(new DIEM_DAO().getDiemTrungBinhHocKy10(sinhvien.getMaSV(), danhsachhocky.get(i)));
            if (chart < 5) {
                chart2.addLegend(""+(i+1), new Color(255, chart*25, 0));
            }
            else {
                chart2.addLegend(""+(i+1), new Color(255-chart*25, 250, 0));
            }
             //double diem2[] = new double[1];
             diem[i]= new DIEM_DAO().getDiemTrungBinhHocKy10(sinhvien.getMaSV(), danhsachhocky.get(i));
        //if(new DIEM_DAO().getDiemTrungBinhHocKy10(sinhvien.getMaSV(), danhsachhocky.get(i)) < 4.0)
        //{diem[i]=0;}
            ///diem2[0]=diem[i];
             diemtichluy+=diem[i];
             //chart2.addData(new ModelChart("HỌC KỲ " + i,diem)); 
        }
        chart2.addData(new ModelChart("HỌC KỲ ",diem)); 
        //for (int i=0;i<5;i++){diem[3+i]=10; chart2.addLegend("11", Color.yellow);};
//        for(int i = 1; i <= n; i++) {
//            
//        }        
        
        
        jLabel7.setText(String.valueOf(Math.ceil(diemtichluy/n*100)/100));
        diemtichluy=0;
        for(int i = 0; i < n;i++){
        diem1[i]= new DIEM_DAO().getDiemTrungBinhHocKy4(sinhvien.getMaSV(), danhsachhocky.get(i));
        diemtichluy+=diem1[i];
        }
        
        
        jLabel8.setText(String.valueOf(Math.ceil(diemtichluy/n*100)/100));
        
        
        jLabel9.setText(String.valueOf(new DIEM_DAO().getSoTinChiTichLuu(sinhvien.getMaSV())));
        
        
        float totnghiep =(float) (Math.ceil((2.0*m-Math.ceil(diemtichluy/n*100)/100*n)/(m-n)*100)/100);
        float banggioi =(float) (Math.ceil((3.2*m-Math.ceil(diemtichluy/n*100)/100*n)/(m-n)*100)/100);
        float bangkha =(float) (Math.ceil((2.5*m-Math.ceil(diemtichluy/n*100)/100*n)/(m-n)*100)/100);
        if (totnghiep >4.0) jLabel12.setText("Không khả thi");
        else jLabel12.setText(String.valueOf(Math.ceil((2.0*m-Math.ceil(diemtichluy/n*100)/100*n)/(m-n)*100)/100));
        if (banggioi >4.0) jLabel13.setText("Không khả thi");
        else jLabel13.setText(String.valueOf(Math.ceil((3.2*m-Math.ceil(diemtichluy/n*100)/100*n)/(m-n)*100)/100));
        if (bangkha >4.0) jLabel14.setText("Không khả thi");
        else jLabel14.setText(String.valueOf(Math.ceil((2.5*m-Math.ceil(diemtichluy/n*100)/100*n)/(m-n)*100)/100));
        
        
        ArrayList<DIEM> monhoclai = new DIEM_DAO().getMonHocLai(sinhvien.getMaSV());
        for(int i=0;i<monhoclai.size();i++){
            String mamon = monhoclai.get(i).getMaMon();
            String ten= new MON_HOC_DAO().getThongTin(mamon).getTenMon();
            DIEM moncaonhat = new DIEM_DAO().getKiemTraDiemCaoNhat(sinhvien.getMaSV(),mamon);
            if(new DIEM_DAO().getDiemTrungBinh10(sinhvien.getMaSV(), moncaonhat.getMaHocKy(), mamon)<4.0)
            {Object[] data = {mamon,ten};
            table4.addRow(data);}
                    }
        
        
        ArrayList<DIEM> monhocnangdiem = new DIEM_DAO().getMonHocNangDiem(sinhvien.getMaSV());
        for(int i=0;i<monhocnangdiem.size();i++){
            String mamon = monhocnangdiem.get(i).getMaMon();
            String ten= new MON_HOC_DAO().getThongTin(mamon).getTenMon();
            DIEM moncaonhat = new DIEM_DAO().getKiemTraDiemCaoNhat(sinhvien.getMaSV(),mamon);
            if(new DIEM_DAO().getDiemTrungBinh10(sinhvien.getMaSV(), moncaonhat.getMaHocKy(), mamon)>=4.0 && new DIEM_DAO().getDiemTrungBinh10(sinhvien.getMaSV(), moncaonhat.getMaHocKy(), mamon)< 5.0)
            {Object[] data = {mamon,ten,new DIEM_DAO().getDiemTrungBinh10(sinhvien.getMaSV(), moncaonhat.getMaHocKy(), mamon)};
            table5.addRow(data);}
                    }
        
        //chart2.addLegend("HỌC KỲ 1", new Color(245, 189, 135));
        //chart2.addLegend("HỌC KỲ 2", new Color(135, 189, 245));
        //chart2.addLegend("HỌC KỲ 3", new Color(189, 135, 245));
        //chart2.addLegend("HỌC KỲ 4", new Color(139, 229, 222));
        //chart2.addData(new ModelChart("HỌC KỲ", new double[]{10, 9, 8, 7}));
        }
        catch(Exception ex){ex.printStackTrace();}
        
        ArrayList<THONG_BAO> thongbao = new THONG_BAO_DAO().getThongTin(15);
        ThongBaoPanel[] DanhSachThongBao= new ThongBaoPanel[thongbao.size()];
        javax.swing.JLabel[] mess = new javax.swing.JLabel[thongbao.size()];
        for(int i=0;i<thongbao.size();i++){
            NoScalingIcon thongbaoimage = new NoScalingIcon(new ImageIcon(getClass().getResource("/Folder/mess.png")));
            mess[i] = new javax.swing.JLabel();
            mess[i].setIcon(thongbaoimage);
            DanhSachThongBao[i] = new ThongBaoPanel(thongbao.get(i).getTieuDe());
            //DanhSachThongBao[i].setText(thongbao.get(i).getTieuDe());
            mess[i].setBounds(10, i*50+20, 400,40);
            DanhSachThongBao[i].setBounds(60, i*50+20, 400,40);
            final int j = i;
            DanhSachThongBao[i].addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                for (int t=0;t<thongbao.size();t++){
                    DanhSachThongBao[t].flag=false;
                    DanhSachThongBao[t].ThongBaoPanelMouseExited();
                }
                DanhSachThongBao[j].setForeground(new Color(0,255,255));
                DanhSachThongBao[j].flag=true;
                try{
                    NoScalingIcon thongbaoimage = new NoScalingIcon(new ImageIcon(getClass().getResource("/ThongBao/"+thongbao.get(j).getMaThongBao()+".jpg")));
                    jLabel11.setIcon(thongbaoimage);}
                catch(Exception ex){
                    NoScalingIcon thongbaoimage = new NoScalingIcon(new ImageIcon(getClass().getResource("/folder/unknown.jpg")));
                    jLabel11.setIcon(thongbaoimage);
                    }
                
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DanhSachThongBao[j].ThongBaoPanelMouseEntered();
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DanhSachThongBao[j].ThongBaoPanelMouseExited();
            }
        });
            jPanel16.setPreferredSize(new Dimension(120, i*50+30));
            jPanel16.add(mess[i]);
            jPanel16.add(DanhSachThongBao[i]);
        }
        
        
        //SET_ANH
        try{
        NoScalingIcon icon1 = new NoScalingIcon(new ImageIcon(getClass().getResource("/Avatar/"+sinhvien.getMaSV()+".jpg")));
        avatar.setIcon(icon1);}
        catch(Exception ex){
        NoScalingIcon icon1 = new NoScalingIcon(new ImageIcon(getClass().getResource("/folder/unknown.jpg")));
        avatar.setIcon(icon1);
        }
        
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
        jPanel15 = new javax.swing.JPanel();
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
        ThongtinSinhvien = new javax.swing.JPanel();
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
        Thuongtru1 = new javax.swing.JLabel();
        ThongtinSinhvien3 = new javaapplication24.RoundPanel();
        Lophoc = new javax.swing.JLabel();
        Khoa = new javax.swing.JLabel();
        Nganh = new javax.swing.JLabel();
        BacDaotao = new javax.swing.JLabel();
        Loaihinh = new javax.swing.JLabel();
        Lophoc1 = new javax.swing.JLabel();
        Khoa1 = new javax.swing.JLabel();
        Nganh1 = new javax.swing.JLabel();
        Loaihinh1 = new javax.swing.JLabel();
        Khoahoc1 = new javax.swing.JLabel();
        Khoahoc = new javax.swing.JLabel();
        BacDaotao1 = new javax.swing.JLabel();
        avatar = new javax.swing.JLabel();
        QuatrinhHoctap = new javax.swing.JPanel();
        Hocky = new javaapplication24.RoundPanel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        scrollPaneWin111 = new javaapplication24.ScrollPaneWin11();
        jPanel13 = new javax.swing.JPanel();
        DanhSachmon = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        scrollPaneWin112 = new javaapplication24.ScrollPaneWin11();
        table1 = new javaapplication24.Table();
        Danhgia = new javax.swing.JPanel();
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
        SoTinChiDaHoanThanh = new javax.swing.JLabel();
        TinChiDaHoanThanh = new javax.swing.JLabel();
        ChuongtrinhKhung = new javax.swing.JPanel();
        Separator1 = new javax.swing.JSeparator();
        TITLE1 = new javax.swing.JLabel();
        Hocky1 = new javaapplication24.RoundPanel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        scrollPaneWin113 = new javaapplication24.ScrollPaneWin11();
        jPanel14 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        scrollPaneWin114 = new javaapplication24.ScrollPaneWin11();
        table3 = new javaapplication24.Table();
        ThongkeHoctap = new javax.swing.JPanel();
        roundPanel1 = new javaapplication24.RoundPanel();
        chart2 = new javaapplication24.Chart();
        roundPanel2 = new javaapplication24.RoundPanel();
        jLabel3 = new javax.swing.JLabel();
        Separator2 = new javax.swing.JSeparator();
        scrollPaneWin115 = new javaapplication24.ScrollPaneWin11();
        table4 = new javaapplication24.Table();
        roundPanel3 = new javaapplication24.RoundPanel();
        jLabel4 = new javax.swing.JLabel();
        Separator3 = new javax.swing.JSeparator();
        scrollPaneWin116 = new javaapplication24.ScrollPaneWin11();
        table5 = new javaapplication24.Table();
        roundPanel4 = new javaapplication24.RoundPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ThongBao = new javax.swing.JPanel();
        roundPanel5 = new javaapplication24.RoundPanel();
        jLabel24 = new javax.swing.JLabel();
        roundPanel6 = new javaapplication24.RoundPanel();
        jLabel25 = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();
        scrollPaneWin118 = new javaapplication24.ScrollPaneWin11();
        jPanel16 = new javax.swing.JPanel();
        scrollPaneWin117 = new javaapplication24.ScrollPaneWin11();
        jPanel17 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
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

        jLabel33.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("GỬI YÊU CẦU");
        jLabel33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel33.setPreferredSize(new java.awt.Dimension(225, 32));
        jPanel24.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        roundPanel9.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 400, -1, -1));

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

        jPanel15.setOpaque(false);
        jPanel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel15MouseExited(evt);
            }
        });
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(23, 100, 126));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel2MouseExited(evt);
            }
        });
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

        jPanel15.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 35, 35));

        getContentPane().add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1095, 31, 35, 40));

        jPanel9.setBackground(new Color(0, 0, 0, 0));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel9MouseExited(evt);
            }
        });
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        changePassword1.setBackground(new Color(47, 84, 95));
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

        ThongtinSinhvien.setBackground(new java.awt.Color(255, 255, 255, 80));
        ThongtinSinhvien.setVerifyInputWhenFocusTarget(false);
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
        Hoten1.setPreferredSize(new java.awt.Dimension(70, 50));

        Mssv1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Mssv1.setForeground(new java.awt.Color(255, 255, 255));
        Mssv1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mssv1.setPreferredSize(new java.awt.Dimension(70, 50));

        GioiTinh1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        GioiTinh1.setForeground(new java.awt.Color(255, 255, 255));
        GioiTinh1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
        Ngaysinh1.setPreferredSize(new java.awt.Dimension(70, 50));

        CCCD.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        CCCD.setForeground(new java.awt.Color(255, 255, 255));
        CCCD.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        CCCD.setText("Số CCCD:");
        CCCD.setPreferredSize(new java.awt.Dimension(95, 50));

        CCCD1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        CCCD1.setForeground(new java.awt.Color(255, 255, 255));
        CCCD1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CCCD1.setPreferredSize(new java.awt.Dimension(70, 50));

        Email.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        Email.setForeground(new java.awt.Color(255, 255, 255));
        Email.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Email.setText("Email:");
        Email.setPreferredSize(new java.awt.Dimension(95, 50));

        Email1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Email1.setForeground(new java.awt.Color(255, 255, 255));
        Email1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Email1.setPreferredSize(new java.awt.Dimension(70, 50));

        Sodienthoai.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        Sodienthoai.setForeground(new java.awt.Color(255, 255, 255));
        Sodienthoai.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Sodienthoai.setText("Số điện thoại:");
        Sodienthoai.setPreferredSize(new java.awt.Dimension(95, 50));

        Sodienthoai1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Sodienthoai1.setForeground(new java.awt.Color(255, 255, 255));
        Sodienthoai1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Sodienthoai1.setPreferredSize(new java.awt.Dimension(70, 50));

        Noisinh.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        Noisinh.setForeground(new java.awt.Color(255, 255, 255));
        Noisinh.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Noisinh.setText("Nơi sinh:");
        Noisinh.setPreferredSize(new java.awt.Dimension(95, 50));

        Noisinh1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Noisinh1.setForeground(new java.awt.Color(255, 255, 255));
        Noisinh1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

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
        Dantoc1.setPreferredSize(new java.awt.Dimension(70, 50));

        Thuongtru1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Thuongtru1.setForeground(new java.awt.Color(255, 255, 255));
        Thuongtru1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

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
                    .addComponent(Thuongtru1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(Thuongtru1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        Loaihinh.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        Loaihinh.setForeground(new java.awt.Color(255, 255, 255));
        Loaihinh.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Loaihinh.setText("Loại hình:");

        Lophoc1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Lophoc1.setForeground(new java.awt.Color(255, 255, 255));
        Lophoc1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Lophoc1.setToolTipText("");
        Lophoc1.setPreferredSize(new java.awt.Dimension(55, 50));

        Khoa1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Khoa1.setForeground(new java.awt.Color(255, 255, 255));
        Khoa1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        Nganh1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Nganh1.setForeground(new java.awt.Color(255, 255, 255));
        Nganh1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        Loaihinh1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Loaihinh1.setForeground(new java.awt.Color(255, 255, 255));
        Loaihinh1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        Khoahoc1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Khoahoc1.setForeground(new java.awt.Color(255, 255, 255));
        Khoahoc1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        Khoahoc.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        Khoahoc.setForeground(new java.awt.Color(255, 255, 255));
        Khoahoc.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Khoahoc.setText("Khóa học:");

        BacDaotao1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        BacDaotao1.setForeground(new java.awt.Color(255, 255, 255));
        BacDaotao1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout ThongtinSinhvien3Layout = new javax.swing.GroupLayout(ThongtinSinhvien3);
        ThongtinSinhvien3.setLayout(ThongtinSinhvien3Layout);
        ThongtinSinhvien3Layout.setHorizontalGroup(
            ThongtinSinhvien3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThongtinSinhvien3Layout.createSequentialGroup()
                .addGroup(ThongtinSinhvien3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Khoahoc, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ThongtinSinhvien3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Lophoc, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Khoa, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Nganh, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BacDaotao, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Loaihinh, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ThongtinSinhvien3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nganh1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Khoa1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Lophoc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Loaihinh1, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(Khoahoc1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BacDaotao1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
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
                        .addGroup(ThongtinSinhvien3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BacDaotao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BacDaotao1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(ThongtinSinhvien3Layout.createSequentialGroup()
                        .addComponent(Lophoc1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(Khoa1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(Nganh1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addGroup(ThongtinSinhvien3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Loaihinh, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Loaihinh1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ThongtinSinhvien3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Khoahoc1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Khoahoc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 92, Short.MAX_VALUE))
        );

        ThongtinSinhvien.add(ThongtinSinhvien3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 70, 250, 410));

        avatar.setBackground(new java.awt.Color(255, 255, 255));
        avatar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ThongtinSinhvien.add(avatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 250, 250));

        materialTabbed.addTab("THÔNG TIN SINH VIÊN", ThongtinSinhvien);

        QuatrinhHoctap.setBackground(new java.awt.Color(255, 255, 255, 80));
        QuatrinhHoctap.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );

        scrollPaneWin111.setViewportView(jPanel13);

        Hocky.add(scrollPaneWin111, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, 150, 400));

        QuatrinhHoctap.add(Hocky, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 150, 460));

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

            },
            new String [] {
                "Tên môn", "Điểm chuyên cần", "Điểm giữa Kỳ", "Điểm Kết thúc", "Điểm trung bình", "Điểm chữ", "Đạt"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table1.setEnabled(false);
        table1.setMaximumSize(new java.awt.Dimension(2147483647, 2000));
        table1.setMinimumSize(new java.awt.Dimension(60, 2000));
        scrollPaneWin112.setViewportView(table1);

        jPanel18.add(scrollPaneWin112, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 240));
        scrollPaneWin112.getAccessibleContext().setAccessibleName("");

        DanhSachmon.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 55, 870, 240));

        QuatrinhHoctap.add(DanhSachmon, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 880, 300));

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

        Diem10.setBackground(new java.awt.Color(0, 153, 153));
        Diem10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Diem10.setForeground(new java.awt.Color(255, 255, 255));
        Diem10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Diem10.setPreferredSize(new java.awt.Dimension(70, 25));
        jPanel3.add(Diem10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        Diemhe4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Diemhe4.setForeground(new java.awt.Color(255, 255, 255));
        Diemhe4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Diemhe4.setText("Điểm trung bình học kỳ hệ 4:");
        Diemhe4.setPreferredSize(new java.awt.Dimension(60, 50));
        jPanel3.add(Diemhe4, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 85, 200, -1));

        Diem4.setBackground(new java.awt.Color(0, 153, 153));
        Diem4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Diem4.setForeground(new java.awt.Color(255, 255, 255));
        Diem4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Diem4.setPreferredSize(new java.awt.Dimension(70, 25));
        jPanel3.add(Diem4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));

        SoTinchi.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        SoTinchi.setForeground(new java.awt.Color(255, 255, 255));
        SoTinchi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        SoTinchi.setText("Số tín chỉ đăng ký:");
        SoTinchi.setPreferredSize(new java.awt.Dimension(60, 50));
        jPanel3.add(SoTinchi, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 5, 130, -1));

        Tinchi.setBackground(new java.awt.Color(0, 153, 153));
        Tinchi.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Tinchi.setForeground(new java.awt.Color(255, 255, 255));
        Tinchi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tinchi.setPreferredSize(new java.awt.Dimension(70, 25));
        jPanel3.add(Tinchi, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 20, -1, -1));

        XeploaiHocluc.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        XeploaiHocluc.setForeground(new java.awt.Color(255, 255, 255));
        XeploaiHocluc.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        XeploaiHocluc.setText("Xếp loại học lực:");
        XeploaiHocluc.setPreferredSize(new java.awt.Dimension(60, 50));
        jPanel3.add(XeploaiHocluc, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 85, 130, -1));

        Hocluc.setBackground(new java.awt.Color(0, 153, 153));
        Hocluc.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        Hocluc.setForeground(new java.awt.Color(255, 255, 255));
        Hocluc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hocluc.setPreferredSize(new java.awt.Dimension(70, 25));
        Hocluc.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel3.add(Hocluc, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 100, -1, -1));

        SoTinChiDaHoanThanh.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        SoTinChiDaHoanThanh.setForeground(new java.awt.Color(255, 255, 255));
        SoTinChiDaHoanThanh.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        SoTinChiDaHoanThanh.setText("Số tín chỉ đã hoàn thành:");
        SoTinChiDaHoanThanh.setPreferredSize(new java.awt.Dimension(60, 50));
        jPanel3.add(SoTinChiDaHoanThanh, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 5, 170, -1));

        TinChiDaHoanThanh.setBackground(new java.awt.Color(0, 153, 153));
        TinChiDaHoanThanh.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        TinChiDaHoanThanh.setForeground(new java.awt.Color(255, 255, 255));
        TinChiDaHoanThanh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TinChiDaHoanThanh.setPreferredSize(new java.awt.Dimension(70, 25));
        jPanel3.add(TinChiDaHoanThanh, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 20, 70, -1));

        Danhgia.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 0, 780, 140));

        QuatrinhHoctap.add(Danhgia, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 880, 140));

        materialTabbed.addTab("QUÁ TRÌNH HỌC TẬP", QuatrinhHoctap);

        ChuongtrinhKhung.setBackground(new java.awt.Color(255, 255, 255, 80));
        ChuongtrinhKhung.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Separator1.setBackground(new java.awt.Color(0, 0, 0));
        Separator1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ChuongtrinhKhung.add(Separator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 1105, 3));

        TITLE1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        TITLE1.setForeground(new java.awt.Color(255, 255, 255));
        TITLE1.setText("CHƯƠNG TRÌNH KHUNG");
        TITLE1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        ChuongtrinhKhung.add(TITLE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 1090, 50));

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

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 411, Short.MAX_VALUE)
        );

        scrollPaneWin113.setViewportView(jPanel14);

        Hocky1.add(scrollPaneWin113, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 55, 150, 413));

        ChuongtrinhKhung.add(Hocky1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 150, 470));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255, 160));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scrollPaneWin114.setPreferredSize(new java.awt.Dimension(1090, 465));

        table3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã học phần", "Tên học phần", "Học phần song hành", "Học phần tiên quyết"
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
        table3.setEnabled(false);
        scrollPaneWin114.setViewportView(table3);

        jPanel1.add(scrollPaneWin114, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 915, 465));

        ChuongtrinhKhung.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 915, 470));

        materialTabbed.addTab("CHƯƠNG TRÌNH KHUNG", ChuongtrinhKhung);

        ThongkeHoctap.setBackground(new java.awt.Color(255, 255, 255, 80));
        ThongkeHoctap.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundPanel1.setBackground(new Color(23,100,126, 127));
        roundPanel1.setPreferredSize(new java.awt.Dimension(1000, 382));

        chart2.setBackground(new Color(23,100,126, 0));

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addComponent(chart2, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(chart2, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );

        ThongkeHoctap.add(roundPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 720, 280));

        roundPanel2.setBackground(new Color(23,100,126, 127));
        roundPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CÁC MÔN CHƯA ĐẠT");
        roundPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 30));

        Separator2.setBackground(new java.awt.Color(0, 0, 0));
        Separator2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        roundPanel2.add(Separator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 670, 3));

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

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table4.setEnabled(false);
        scrollPaneWin115.setViewportView(table4);

        roundPanel2.add(scrollPaneWin115, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 33, 520, 180));

        ThongkeHoctap.add(roundPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 525, 210));

        roundPanel3.setBackground(new Color(23,100,126, 127));
        roundPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CÁC MÔN HỌC NÂNG ĐIỂM");
        roundPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 30));

        Separator3.setBackground(new java.awt.Color(0, 0, 0));
        Separator3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        roundPanel3.add(Separator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 670, 3));

        table5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã học phần", "Tên học phần", "Điểm trung bình"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table5.setEnabled(false);
        scrollPaneWin116.setViewportView(table5);

        roundPanel3.add(scrollPaneWin116, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 33, 520, 180));

        ThongkeHoctap.add(roundPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 525, 210));

        roundPanel4.setBackground(new Color(0, 0, 0, 85));

        jLabel17.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Điểm Trung Bình Tích Lũy Hệ 10:");

        jLabel18.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Điểm Trung Bình Tích Lũy Hệ 4:");

        jLabel19.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Số Tín Chỉ Tích Lũy:");

        jLabel20.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Để ra trường, các môn cần có GPA tối thiểu:");

        jLabel21.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Để có bằng giỏi:");

        jLabel22.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Để có bằng khá:");

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("jLabel7");

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("jLabel8");

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("jLabel9");

        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("jLabel12");

        jLabel13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("jLabel13");

        jLabel14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("jLabel14");

        javax.swing.GroupLayout roundPanel4Layout = new javax.swing.GroupLayout(roundPanel4);
        roundPanel4.setLayout(roundPanel4Layout);
        roundPanel4Layout.setHorizontalGroup(
            roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13))
                            .addGroup(roundPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel14)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(roundPanel4Layout.createSequentialGroup()
                        .addGroup(roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(roundPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9))
                            .addGroup(roundPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel12)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        roundPanel4Layout.setVerticalGroup(
            roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel7))
                .addGap(5, 5, 5)
                .addGroup(roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel8))
                .addGap(4, 4, 4)
                .addGroup(roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roundPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel14))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        ThongkeHoctap.add(roundPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 20, 350, 190));

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

        scrollPaneWin118.setBackground(new java.awt.Color(255, 255, 255));
        scrollPaneWin118.setMinimumSize(new java.awt.Dimension(300, 20));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 463, Short.MAX_VALUE)
        );

        scrollPaneWin118.setViewportView(jPanel16);

        jSplitPane1.setLeftComponent(scrollPaneWin118);

        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel17.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, -80, -1, -1));

        scrollPaneWin117.setViewportView(jPanel17);

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
        jPanel9.setVisible(false);
    }//GEN-LAST:event_SettingMouseExited

    private void SettingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingMouseEntered
        changeColor(jPanel2, new Color(23, 111, 126));   
        jPanel9.setVisible(true);
    }//GEN-LAST:event_SettingMouseEntered

    private void jSplitPane1AncestorMoved(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jSplitPane1AncestorMoved

    }//GEN-LAST:event_jSplitPane1AncestorMoved

    private void jSplitPane1AncestorResized(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jSplitPane1AncestorResized

    }//GEN-LAST:event_jSplitPane1AncestorResized

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
        if((jTextArea2.getText().equals(null) && jTextArea1.equals(null)||
           (jTextArea2.getText().equals(null) && jTextArea1.getText().equals(""))||
           (jTextArea2.getText().equals("") && jTextArea1.getText().equals(null))||
           (jTextArea2.getText().equals("") && jTextArea1.getText().equals(""))))
           {JOptionPane.showMessageDialog(null, "Bạn phải nhập tiêu đề và nội dung thư","Nhắc nhở",JOptionPane.INFORMATION_MESSAGE);}
        else if(jTextArea1.getText().equals("") || jTextArea2.getText().equals(null)){JOptionPane.showMessageDialog(null, "Bạn phải nhập nội dung","Nhắc nhở",JOptionPane.INFORMATION_MESSAGE);}
        else if(jTextArea2.getText().equals("") || jTextArea2.getText().equals(null)){JOptionPane.showMessageDialog(null, "Bạn phải nhập tiêu đề","Nhắc nhở",JOptionPane.INFORMATION_MESSAGE);}
        else{int n = JOptionPane.showOptionDialog(GopY, "Bạn muốn gửi tới hòm thư?", null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        if (n == JOptionPane.YES_OPTION) {
            HOM_THU thugui = new HOM_THU();
            int t =0;
            try{
                thugui = new HOM_THU(new HOM_THU_DAO().getSoThu2()+1,jTextArea2.getText(),jTextArea1.getText(),sinhvien.getMaSV(),false);
                t = new HOM_THU_DAO().insert(thugui);
            }
            catch(Exception e){
                thugui = new HOM_THU(new HOM_THU_DAO().getSoThu()+1,jTextArea2.getText(),jTextArea1.getText(),sinhvien.getMaSV(),false);
                t = new HOM_THU_DAO().insert(thugui);
            }
            
//            if (t==0){
//                thugui = new HOM_THU(new HOM_THU_DAO().getSoThu()+1,jTextArea2.getText(),jTextArea1.getText(),sinhvien.getMaSV(),false);
//                t = new HOM_THU_DAO().insert(thugui);}
            if (t==1) JOptionPane.showMessageDialog(null, "Bạn đã gửi thư thành công","Thông báo",JOptionPane.INFORMATION_MESSAGE);
            jTextArea2.setText("");
            jTextArea1.setText("");
        }
        }
    }//GEN-LAST:event_jPanel8MouseClicked

    private void SettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SettingMouseClicked
        jPanel9.setVisible(!jPanel9.isVisible());
    }//GEN-LAST:event_SettingMouseClicked

    private void changePassword1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePassword1MouseEntered
        changeColor(changePassword1, new Color(47, 97, 97));
        jPanel9.setVisible(true);
    }//GEN-LAST:event_changePassword1MouseEntered

    private void changePassword1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePassword1MouseExited
        changeColor(changePassword1, new Color(47, 84, 95));
       jPanel9.setVisible(false);
    }//GEN-LAST:event_changePassword1MouseExited

    private void Logout1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Logout1MouseEntered
        changeColor(Logout1, new Color(47, 97, 97));
        jPanel9.setVisible(true);
    }//GEN-LAST:event_Logout1MouseEntered

    private void Logout1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Logout1MouseExited
        changeColor(Logout1, new Color(47, 84, 95));
        jPanel9.setVisible(false);
    }//GEN-LAST:event_Logout1MouseExited

    private void Logout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Logout1MouseClicked
        this.setVisible(false);
        LoginJFrame login = new LoginJFrame();
        login.setVisible(true);
    }//GEN-LAST:event_Logout1MouseClicked

    private void jPanel24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel24MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel24MouseEntered

    private void jPanel24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel24MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel24MouseExited

    private void jLabel31MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel31MouseDragged

    private void jPanel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseEntered
        changeColor(jPanel2, new Color(23, 111, 126));   
        jPanel9.setVisible(true);
    }//GEN-LAST:event_jPanel13MouseEntered

    private void jPanel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseExited
        changeColor(jPanel2, new Color(23,100,126));  
        //jPanel9.setVisible(false);
    }//GEN-LAST:event_jPanel13MouseExited

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        changeColor(jPanel2, new Color(23, 111, 126));   
        jPanel9.setVisible(true);
    }//GEN-LAST:event_jPanel2MouseEntered

    private void jPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseExited
        changeColor(jPanel2, new Color(23,100,126));  
        jPanel9.setVisible(false);
    }//GEN-LAST:event_jPanel2MouseExited

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
        jPanel12.setVisible(true);
        materialTabbed.setVisible(false);
    }//GEN-LAST:event_jLabel31MouseClicked

    private void jPanel15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MouseExited
        changeColor(jPanel2, new Color(23,100,126));  
        jPanel9.setVisible(false);
    }//GEN-LAST:event_jPanel15MouseExited

    private void jPanel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MouseEntered
        changeColor(jPanel2, new Color(23, 111, 126));   
        jPanel9.setVisible(true);
    }//GEN-LAST:event_jPanel15MouseEntered

    private void jPanel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseEntered
        jPanel9.setVisible(true);
    }//GEN-LAST:event_jPanel9MouseEntered

    private void jPanel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseExited
        jPanel9.setVisible(false);
    }//GEN-LAST:event_jPanel9MouseExited

    private void changePassword1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePassword1MouseClicked
        materialTabbed.setVisible(false);
        jPanel12.setVisible(true);
    }//GEN-LAST:event_changePassword1MouseClicked

    private void jPanel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel24MouseClicked
        String password1 = "";
        char[] getpassword1 = passwordField1.getPassword();
        for(int i=0;i < getpassword1.length;i++){
            password1+=getpassword1[i];
        };
        
        String password2 = "";
        char[] getpassword2 = passwordField2.getPassword();
        for(int i=0;i < getpassword2.length;i++){
            password2+=getpassword2[i];
        };
        
        String password3 = "";
        char[] getpassword3 = passwordField3.getPassword();
        for(int i=0;i < getpassword3.length;i++){
            password3+=getpassword3[i];
        };
        
        Object[] options = {"Có", "Không"};
        int n = JOptionPane.showOptionDialog(jPanel12,"Bạn muốn yêu cầu đổi lại mật khẩu?",null,JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[1]);
        if (n == JOptionPane.YES_OPTION) {
            if ((sinhvien.getMatKhau().equals(password2)) && (password2.equals(password3))){
            SINH_VIEN_DAO temp = new SINH_VIEN_DAO();
            temp.passwordChange(sinhvien.getTen(),sinhvien.getMaSV(),password1);
            jPanel12.setVisible(false);
            materialTabbed.setVisible(true);
            this.sinhvien = new SINH_VIEN_DAO().getThongTin3(sinhvien.getMaSV());
                JOptionPane.showMessageDialog(null, "Đổi mật khẩu thành công","Thông báo",JOptionPane.INFORMATION_MESSAGE);}
            else {
                System.out.println(password2);
                System.out.println(password3);
                System.out.println(password1);
                JOptionPane.showMessageDialog(null, "Mật khẩu không đúng, xin hãy nhập lại","Thông báo",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else if (n == JOptionPane.NO_OPTION) {
            materialTabbed.setVisible(true);
            jPanel12.setVisible(false);
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
    private javax.swing.JPanel ChuongtrinhKhung;
    private javax.swing.JPanel DanhSachmon;
    private javax.swing.JPanel Danhgia;
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
    private javax.swing.JLabel Khoa;
    private javax.swing.JLabel Khoa1;
    private javax.swing.JLabel Khoahoc;
    private javax.swing.JLabel Khoahoc1;
    private javax.swing.JLabel Loaihinh;
    private javax.swing.JLabel Loaihinh1;
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
    private javax.swing.JPanel QuatrinhHoctap;
    private javax.swing.JSeparator Separator;
    private javax.swing.JSeparator Separator1;
    private javax.swing.JSeparator Separator2;
    private javax.swing.JSeparator Separator3;
    private javax.swing.JLabel Setting;
    private javax.swing.JLabel SoTinChiDaHoanThanh;
    private javax.swing.JLabel SoTinchi;
    private javax.swing.JLabel Sodienthoai;
    private javax.swing.JLabel Sodienthoai1;
    private javax.swing.JLabel TITLE;
    private javax.swing.JLabel TITLE1;
    private javax.swing.JPanel ThongBao;
    private javax.swing.JPanel ThongkeHoctap;
    private javax.swing.JPanel ThongtinSinhvien;
    private javaapplication24.RoundPanel ThongtinSinhvien1;
    private javaapplication24.RoundPanel ThongtinSinhvien2;
    private javaapplication24.RoundPanel ThongtinSinhvien3;
    private javax.swing.JLabel Thuongtru;
    private javax.swing.JLabel Thuongtru1;
    private javax.swing.JLabel TinChiDaHoanThanh;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
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
    private javaapplication24.RoundPanel roundPanel2;
    private javaapplication24.RoundPanel roundPanel3;
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
    private javaapplication24.ScrollPaneWin11 scrollPaneWin115;
    private javaapplication24.ScrollPaneWin11 scrollPaneWin116;
    private javaapplication24.ScrollPaneWin11 scrollPaneWin117;
    private javaapplication24.ScrollPaneWin11 scrollPaneWin118;
    private javaapplication24.ScrollPaneWin11 scrollPaneWin119;
    private javaapplication24.Table table1;
    private javaapplication24.Table table3;
    private javaapplication24.Table table4;
    private javaapplication24.Table table5;
    // End of variables declaration//GEN-END:variables

    private Object LOAI_HINH_DAO_TAO_DAO() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
