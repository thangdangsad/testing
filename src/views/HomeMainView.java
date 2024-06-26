/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.DisplayMode;
import java.awt.GraphicsEnvironment;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import models.DanhMucModel;

/**
 *
 * @author ADMIN
 */
public class HomeMainView extends javax.swing.JFrame {

    /**
     * Creates new form HomeMain
     */
    public HomeMainView() {
        setTitle("QUẢN LÝ TIỀN ĐIỆN");
        ImageIcon iconForm = new ImageIcon("C:\\Users\\ADMIN\\OneDrive\\Documents\\NetBeansProjects\\QuanLyTienDien\\src\\icons\\Icon_app.png");
        setIconImage(iconForm.getImage());
        initComponents();
        setMaximized(true);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public void setMaximized(boolean maximized) {
        if (maximized) {
            DisplayMode mode = this.getGraphicsConfiguration().getDevice().getDisplayMode();
            Insets insets = Toolkit.getDefaultToolkit().getScreenInsets(this.getGraphicsConfiguration());
            this.setMaximizedBounds(new Rectangle(
                    mode.getWidth() - insets.right - insets.left,
                    mode.getHeight() - insets.top - insets.bottom
            ));
            this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        } else {
            this.setExtendedState(JFrame.NORMAL);
        }
    }
    
    

    public JPanel getJpnThongTin() {
        return jpnThongTin;
    }

    public JLabel getLabThongTin() {
        return labThongTin;
    }

    public JPanel getJpnChiSoDien() {
        return jpnChiSoDien;
    }

    public JLabel getLabChiSoDien() {
        return labChiSoDien;
    }

    public JPanel getJpnThongKe() {
        return jpnThongKe;
    }

    public JLabel getLabThongKe() {
        return labThongKe;
    }

    public JPanel getJpnThanhToan() {
        return jpnDanhSachThanhToan;
    }

    public JLabel getLabThanhToan() {
        return labThanhToan;
    }

    public JPanel getJpnHoaDon() {
        return jpnQuanLyHoaDon;
    }

    public JLabel getLabHoaDon() {
        return labHoaDon;
    }

    public JPanel getJpnView() {
        return jpnView;
    }

    public JLabel getLabLogout() {
        return labLogout;
    }

    public JLabel getLabTaiKhoan() {
        return labTaiKhoan;
    }

    public JPanel getJpnTaiKhoan() {
        return jpnTaiKhoan;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jpnMenu = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpnThongTin = new javax.swing.JPanel();
        labThongTin = new javax.swing.JLabel();
        jpnChiSoDien = new javax.swing.JPanel();
        labChiSoDien = new javax.swing.JLabel();
        jpnDanhSachThanhToan = new javax.swing.JPanel();
        labThanhToan = new javax.swing.JLabel();
        jpnQuanLyHoaDon = new javax.swing.JPanel();
        labHoaDon = new javax.swing.JLabel();
        jpnThongKe = new javax.swing.JPanel();
        labThongKe = new javax.swing.JLabel();
        labLogout = new javax.swing.JLabel();
        jpnTaiKhoan = new javax.swing.JPanel();
        labTaiKhoan = new javax.swing.JLabel();
        jpnView = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnMenu.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(102, 204, 255));

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Icon_app.png"))); // NOI18N
        jLabel1.setText("QUẢN LÝ TIỀN ĐIỆN");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnThongTin.setBackground(new java.awt.Color(76, 175, 80));
        jpnThongTin.setMinimumSize(new java.awt.Dimension(0, 90));
        jpnThongTin.setPreferredSize(new java.awt.Dimension(0, 90));

        labThongTin.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        labThongTin.setForeground(new java.awt.Color(255, 255, 255));
        labThongTin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labThongTin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/quan_Li.png"))); // NOI18N
        labThongTin.setText("QUẢN LÝ THÔNG TIN");

        javax.swing.GroupLayout jpnThongTinLayout = new javax.swing.GroupLayout(jpnThongTin);
        jpnThongTin.setLayout(jpnThongTinLayout);
        jpnThongTinLayout.setHorizontalGroup(
            jpnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnThongTinLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(labThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpnThongTinLayout.setVerticalGroup(
            jpnThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThongTinLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labThongTin, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnChiSoDien.setBackground(new java.awt.Color(76, 175, 80));
        jpnChiSoDien.setMinimumSize(new java.awt.Dimension(0, 90));
        jpnChiSoDien.setPreferredSize(new java.awt.Dimension(0, 90));

        labChiSoDien.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        labChiSoDien.setForeground(new java.awt.Color(255, 255, 255));
        labChiSoDien.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labChiSoDien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cap_nhat.png"))); // NOI18N
        labChiSoDien.setText("CẬP NHẬT CHỈ SỐ ĐIỆN");

        javax.swing.GroupLayout jpnChiSoDienLayout = new javax.swing.GroupLayout(jpnChiSoDien);
        jpnChiSoDien.setLayout(jpnChiSoDienLayout);
        jpnChiSoDienLayout.setHorizontalGroup(
            jpnChiSoDienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnChiSoDienLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labChiSoDien, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpnChiSoDienLayout.setVerticalGroup(
            jpnChiSoDienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnChiSoDienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labChiSoDien, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jpnDanhSachThanhToan.setBackground(new java.awt.Color(76, 175, 80));
        jpnDanhSachThanhToan.setMinimumSize(new java.awt.Dimension(0, 90));
        jpnDanhSachThanhToan.setPreferredSize(new java.awt.Dimension(0, 90));

        labThanhToan.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        labThanhToan.setForeground(new java.awt.Color(255, 255, 255));
        labThanhToan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labThanhToan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/thanh_toan.png"))); // NOI18N
        labThanhToan.setText("DANH SÁCH THANH TOÁN");

        javax.swing.GroupLayout jpnDanhSachThanhToanLayout = new javax.swing.GroupLayout(jpnDanhSachThanhToan);
        jpnDanhSachThanhToan.setLayout(jpnDanhSachThanhToanLayout);
        jpnDanhSachThanhToanLayout.setHorizontalGroup(
            jpnDanhSachThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnDanhSachThanhToanLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpnDanhSachThanhToanLayout.setVerticalGroup(
            jpnDanhSachThanhToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDanhSachThanhToanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jpnQuanLyHoaDon.setBackground(new java.awt.Color(76, 175, 80));
        jpnQuanLyHoaDon.setMinimumSize(new java.awt.Dimension(0, 90));
        jpnQuanLyHoaDon.setPreferredSize(new java.awt.Dimension(0, 90));

        labHoaDon.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        labHoaDon.setForeground(new java.awt.Color(255, 255, 255));
        labHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/hoa_don.png"))); // NOI18N
        labHoaDon.setText("QUẢN LÝ HOÁ ĐƠN");

        javax.swing.GroupLayout jpnQuanLyHoaDonLayout = new javax.swing.GroupLayout(jpnQuanLyHoaDon);
        jpnQuanLyHoaDon.setLayout(jpnQuanLyHoaDonLayout);
        jpnQuanLyHoaDonLayout.setHorizontalGroup(
            jpnQuanLyHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnQuanLyHoaDonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpnQuanLyHoaDonLayout.setVerticalGroup(
            jpnQuanLyHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnQuanLyHoaDonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        jpnThongKe.setBackground(new java.awt.Color(76, 175, 80));
        jpnThongKe.setMinimumSize(new java.awt.Dimension(0, 90));
        jpnThongKe.setPreferredSize(new java.awt.Dimension(0, 90));

        labThongKe.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        labThongKe.setForeground(new java.awt.Color(255, 255, 255));
        labThongKe.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/thong_ke.png"))); // NOI18N
        labThongKe.setText("THỐNG KÊ DOANH THU");

        javax.swing.GroupLayout jpnThongKeLayout = new javax.swing.GroupLayout(jpnThongKe);
        jpnThongKe.setLayout(jpnThongKeLayout);
        jpnThongKeLayout.setHorizontalGroup(
            jpnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnThongKeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpnThongKeLayout.setVerticalGroup(
            jpnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThongKeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addContainerGap())
        );

        labLogout.setBackground(new java.awt.Color(97, 93, 93));
        labLogout.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        labLogout.setForeground(new java.awt.Color(102, 102, 102));
        labLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/thoat.png"))); // NOI18N
        labLogout.setText("Đăng Xuất");
        labLogout.setAutoscrolls(true);
        labLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labLogoutMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                labLogoutMouseReleased(evt);
            }
        });

        jpnTaiKhoan.setBackground(new java.awt.Color(76, 175, 80));
        jpnTaiKhoan.setMinimumSize(new java.awt.Dimension(0, 90));

        labTaiKhoan.setFont(new java.awt.Font("Candara", 0, 20)); // NOI18N
        labTaiKhoan.setForeground(new java.awt.Color(255, 255, 255));
        labTaiKhoan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labTaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/baseline_admin_panel_settings_white_24dp.png"))); // NOI18N
        labTaiKhoan.setText("QUẢN LÝ TÀI KHOẢN");

        javax.swing.GroupLayout jpnTaiKhoanLayout = new javax.swing.GroupLayout(jpnTaiKhoan);
        jpnTaiKhoan.setLayout(jpnTaiKhoanLayout);
        jpnTaiKhoanLayout.setHorizontalGroup(
            jpnTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnTaiKhoanLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpnTaiKhoanLayout.setVerticalGroup(
            jpnTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnTaiKhoanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnThongTin, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
            .addComponent(jpnChiSoDien, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
            .addComponent(jpnThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labLogout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jpnTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnDanhSachThanhToan, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
            .addComponent(jpnQuanLyHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnChiSoDien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnQuanLyHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnDanhSachThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                .addComponent(labLogout)
                .addContainerGap())
        );

        jpnView.setBackground(new java.awt.Color(255, 255, 255));
        jpnView.setMinimumSize(new java.awt.Dimension(1400, 0));
        jpnView.setPreferredSize(new java.awt.Dimension(0, 0));

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 945, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnView, javax.swing.GroupLayout.PREFERRED_SIZE, 1389, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 945, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labLogoutMouseEntered
        // TODO add your handling code here:
        labLogout.setForeground(Color.BLACK);
    }//GEN-LAST:event_labLogoutMouseEntered

    private void labLogoutMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labLogoutMouseReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_labLogoutMouseReleased

    private void labLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labLogoutMouseExited
        // TODO add your handling code here:
        labLogout.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_labLogoutMouseExited

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jpnChiSoDien;
    private javax.swing.JPanel jpnDanhSachThanhToan;
    private javax.swing.JPanel jpnMenu;
    private javax.swing.JPanel jpnQuanLyHoaDon;
    private javax.swing.JPanel jpnTaiKhoan;
    private javax.swing.JPanel jpnThongKe;
    private javax.swing.JPanel jpnThongTin;
    private javax.swing.JPanel jpnView;
    private javax.swing.JLabel labChiSoDien;
    private javax.swing.JLabel labHoaDon;
    private javax.swing.JLabel labLogout;
    private javax.swing.JLabel labTaiKhoan;
    private javax.swing.JLabel labThanhToan;
    private javax.swing.JLabel labThongKe;
    private javax.swing.JLabel labThongTin;
    // End of variables declaration//GEN-END:variables
}
