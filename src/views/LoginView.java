/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import models.LoginModel;
//import models.LoginModel;

/**
 *
 * @author ADMIN
 */
public class LoginView extends javax.swing.JFrame {

    //private ImageIcon iconForm;
    /**
     * Creates new form Login
     */
    boolean passwordTyped = false;
    boolean usernameTyped = false;

    public LoginView() {
        setTitle("Login");
        ImageIcon iconForm = new ImageIcon("C:\\Users\\ADMIN\\OneDrive\\Documents\\NetBeansProjects\\QuanLyTienDien\\src\\icons\\login.png");
        setIconImage(iconForm.getImage());
        initComponents();
        txtMatKhau.setEchoChar((char) 0);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
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
        jLabel1 = new javax.swing.JLabel();
        btnDangNhap = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        JPanTaiKhoan = new javax.swing.JPanel();
        txtTaiKhoan = new javax.swing.JTextField();
        JPanMatKhau = new javax.swing.JPanel();
        txtMatKhau = new javax.swing.JPasswordField();
        labDangKi = new javax.swing.JLabel();
        labQuenMK = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(16, 14, 159));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PHẦN MỀM QUẢN LÝ TIỀN ĐIỆN");

        btnDangNhap.setBackground(new java.awt.Color(255, 255, 255));
        btnDangNhap.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/loginBtn.png"))); // NOI18N
        btnDangNhap.setText("Đăng Nhập");
        btnDangNhap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnDangNhapKeyPressed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logoEVN_Login.png"))); // NOI18N

        JPanTaiKhoan.setBackground(new java.awt.Color(102, 204, 255));

        txtTaiKhoan.setBackground(new java.awt.Color(102, 204, 255));
        txtTaiKhoan.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtTaiKhoan.setText("Tên đăng nhập");
        txtTaiKhoan.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTaiKhoanMouseClicked(evt);
            }
        });
        txtTaiKhoan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTaiKhoanKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout JPanTaiKhoanLayout = new javax.swing.GroupLayout(JPanTaiKhoan);
        JPanTaiKhoan.setLayout(JPanTaiKhoanLayout);
        JPanTaiKhoanLayout.setHorizontalGroup(
            JPanTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(JPanTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JPanTaiKhoanLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(txtTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        JPanTaiKhoanLayout.setVerticalGroup(
            JPanTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(JPanTaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(txtTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        );

        JPanMatKhau.setBackground(new java.awt.Color(102, 204, 255));

        txtMatKhau.setBackground(new java.awt.Color(102, 204, 255));
        txtMatKhau.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtMatKhau.setText("Mật Khẩu");
        txtMatKhau.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtMatKhauMouseClicked(evt);
            }
        });
        txtMatKhau.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMatKhauKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout JPanMatKhauLayout = new javax.swing.GroupLayout(JPanMatKhau);
        JPanMatKhau.setLayout(JPanMatKhauLayout);
        JPanMatKhauLayout.setHorizontalGroup(
            JPanMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanMatKhauLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        JPanMatKhauLayout.setVerticalGroup(
            JPanMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        labDangKi.setBackground(new java.awt.Color(193, 193, 193));
        labDangKi.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        labDangKi.setForeground(new java.awt.Color(242, 242, 242));
        labDangKi.setText("Đăng Kí");
        labDangKi.setToolTipText("");
        labDangKi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labDangKiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labDangKiMouseExited(evt);
            }
        });

        labQuenMK.setBackground(new java.awt.Color(193, 193, 193));
        labQuenMK.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labQuenMK.setForeground(new java.awt.Color(242, 242, 242));
        labQuenMK.setText("Quên Mật Khẩu");
        labQuenMK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labQuenMKMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labQuenMKMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(JPanTaiKhoan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JPanMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 492, Short.MAX_VALUE))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labDangKi)
                .addGap(121, 121, 121)
                .addComponent(labQuenMK)
                .addGap(129, 129, 129))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(JPanTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(JPanMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labQuenMK)
                    .addComponent(labDangKi))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTaiKhoanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTaiKhoanKeyPressed
        // TODO add your handling code here:
        if (!usernameTyped) {
            txtTaiKhoan.setText("");
            textFieldForcus(txtTaiKhoan, JPanTaiKhoan, "Tên đăng nhập", true);

            usernameTyped = true;
        } else {
            if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                // hien thi hint text khi input was cleared
                if (txtTaiKhoan.getText().length() <= 1) {
                    textFieldForcus(txtTaiKhoan, JPanTaiKhoan, "Nhập tên đăng nhập", false);
                    usernameTyped = false;
                }
            }

            if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                txtMatKhau.requestFocus();
                if (!passwordTyped) {
                    txtMatKhauForcus();
                    txtMatKhau.setEchoChar('●');
                    passwordTyped = true;
                }
            }
        }
    }//GEN-LAST:event_txtTaiKhoanKeyPressed

    private void txtMatKhauKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatKhauKeyPressed
        // TODO add your handling code here:
        /*  if(String.valueOf(txtMatKhau.getPassword()).indexOf("Tài Khoản")>-1)
        {
            txtMatKhau.setText("");
        }*/
        if (!passwordTyped) {
            textFieldForcus(txtMatKhau, JPanMatKhau, "Nhập mật khẩu", true);
            //txtMatKhauForcus();
            txtMatKhau.setEchoChar('●');
            passwordTyped = true;
        } else {
            if (evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
                // hien thi hint text khi input was cleared
                if (String.valueOf(txtMatKhau.getPassword()).length() <= 1) {
                    textFieldForcus(txtMatKhau, JPanMatKhau, "Nhập mật khẩu", false);
                    txtMatKhau.setEchoChar((char) 0);

                    passwordTyped = false;
                }
            }

            if (KeyEvent.VK_ENTER == evt.getKeyCode()) {
                //btnDangNhap.requestFocus();
                btnDangNhap.doClick();
            }
        }
    }//GEN-LAST:event_txtMatKhauKeyPressed

    private void btnDangNhapKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnDangNhapKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnDangNhap.doClick();
        }
        
    }//GEN-LAST:event_btnDangNhapKeyPressed

    private void txtTaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTaiKhoanMouseClicked
        // TODO add your handling code here:
        textFieldForcus(txtTaiKhoan, JPanTaiKhoan, "Nhập tên đăng nhập", true);
    }//GEN-LAST:event_txtTaiKhoanMouseClicked

    public void textFieldForcus(JTextField textField, JPanel container, String title, boolean isForcus) {
        if (isForcus) {
            textField.setText("");
            setCustomBorder(container, title, 16, true);
        } else {
            textField.setText(title + " ");
            setCustomBorder(container, title, 18, false);
        }

    }

    public void txtMatKhauForcus() {
        txtMatKhau.setText("");
        setCustomBorder(JPanMatKhau, "Mật khẩu", 16, true);
    }
    private void txtMatKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMatKhauMouseClicked
        // TODO add your handling code here:
        txtMatKhauForcus();

    }//GEN-LAST:event_txtMatKhauMouseClicked

    private void labDangKiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labDangKiMouseEntered
        // TODO add your handling code here:
        labDangKi.setForeground(Color.white);
    }//GEN-LAST:event_labDangKiMouseEntered

    private void labDangKiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labDangKiMouseExited
        // TODO add your handling code here:
        labDangKi.setForeground(new Color(242, 242, 242));
    }//GEN-LAST:event_labDangKiMouseExited

    private void labQuenMKMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labQuenMKMouseEntered
        // TODO add your handling code here:
        labQuenMK.setForeground(Color.white);
    }//GEN-LAST:event_labQuenMKMouseEntered

    private void labQuenMKMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labQuenMKMouseExited
        // TODO add your handling code here:
        labQuenMK.setForeground(new Color(242, 242, 242));
    }//GEN-LAST:event_labQuenMKMouseExited

    public void setCustomBorder(Object object, String title, int fontSize, boolean isForcus) {
        JPanel jPanelObject = (JPanel) object;
        if (isForcus) {
            jPanelObject.setBorder(BorderFactory.createTitledBorder(null, title, TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new Font("Tahoma", 0, fontSize)));
        } else {
            jPanelObject.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        }

    }

    public static void main(String[] args) {
        new LoginView();
    }

    public LoginModel getModel() {
        String taiKhoan = txtTaiKhoan.getText();
        String matKhau = String.valueOf(txtMatKhau.getPassword());
        return new LoginModel(taiKhoan, matKhau);
    }

    /**
     * @param args the command line arguments
     */
    public JButton getBtnDangNhap() {
        return btnDangNhap;
    }

    public void setBtnDangNhap(JButton btnDangNhap) {
        this.btnDangNhap = btnDangNhap;
    }

  
    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JPasswordField getTxtMatKhau() {
        return txtMatKhau;
    }

    public void setTxtMatKhau(JPasswordField txtMatKhau) {
        this.txtMatKhau = txtMatKhau;
    }

    public JTextField getTxtTaiKhoan() {
        return txtTaiKhoan;
    }

    public void setTxtTaiKhoan(JTextField txtTaiKhoan) {
        this.txtTaiKhoan = txtTaiKhoan;
    }

    public JLabel getLabDK() {
        return labDangKi;
    }

    public JLabel getLabQuenMK() {
        return labQuenMK;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanMatKhau;
    private javax.swing.JPanel JPanTaiKhoan;
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labDangKi;
    private javax.swing.JLabel labQuenMK;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtTaiKhoan;
    // End of variables declaration//GEN-END:variables

}