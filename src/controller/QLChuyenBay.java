/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.sun.jdi.connect.spi.Connection;
import database.ConnectionDatabase;
import database.DbChuyenBay;
import java.util.*;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.*;
import model.ChuyenBay;
import model.MayBay;

/**
 *
 * @author Admin
 */
public class QLChuyenBay extends javax.swing.JFrame {

    private String cbTV = "SELECT * FROM chuyenbay ORDER BY Ma_CB ASC";
    //private String mbTV = "SELECT * FROM maybay ORDER BY Ma_MB ASC";
    DbChuyenBay cbDB = new DbChuyenBay();
   
    public static PreparedStatement truyvan ;
    public static ResultSet contro ;
    public static java.sql.Connection con = ConnectionDatabase.getConnection();
    
    public QLChuyenBay() {
        initComponents();
        setSize(875,550);
        setLocationRelativeTo(this);
        
        Bang.LoadData(cbTV, tbChuyenBay);
        Bang.getMaMBToCombobox(jcbMaMB);
        ProcessCrt1(false);
    }
    
    public void ProcessCrt1(boolean b) {
        this.btLuu.setEnabled(b);
        this.btSua.setEnabled(b);
        this.btXoa.setEnabled(b);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btThem = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        btLuu = new javax.swing.JButton();
        btTim = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jcbMaMB = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbChuyenBay = new javax.swing.JTable();
        btQuayLai = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cotroller/anh_nhan_vien.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Quản lý chuyến bay");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 15, 310, 43);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Mã chuyến bay :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 70, 140, 20);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Điểm đi :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 100, 150, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Ngày bay :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(370, 110, 101, 21);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Điểm đến :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 140, 101, 21);

        btThem.setBackground(new java.awt.Color(255, 204, 204));
        btThem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btThem.setForeground(new java.awt.Color(51, 51, 51));
        btThem.setText("Thêm");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });
        jPanel1.add(btThem);
        btThem.setBounds(45, 180, 80, 27);

        btSua.setBackground(new java.awt.Color(255, 204, 204));
        btSua.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btSua.setForeground(new java.awt.Color(51, 51, 51));
        btSua.setText("Sửa ");
        btSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaActionPerformed(evt);
            }
        });
        jPanel1.add(btSua);
        btSua.setBounds(210, 180, 80, 27);

        btXoa.setBackground(new java.awt.Color(255, 204, 204));
        btXoa.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btXoa.setForeground(new java.awt.Color(51, 51, 51));
        btXoa.setText("Xóa");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });
        jPanel1.add(btXoa);
        btXoa.setBounds(370, 180, 72, 27);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(160, 60, 170, 30);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(160, 100, 170, 30);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(160, 140, 170, 30);

        btLuu.setBackground(new java.awt.Color(255, 204, 204));
        btLuu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btLuu.setForeground(new java.awt.Color(51, 51, 51));
        btLuu.setText("Lưu");
        btLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLuuActionPerformed(evt);
            }
        });
        jPanel1.add(btLuu);
        btLuu.setBounds(551, 180, 70, 27);

        btTim.setBackground(new java.awt.Color(153, 153, 255));
        btTim.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btTim.setForeground(new java.awt.Color(51, 51, 51));
        btTim.setText("Tìm kiếm : ");
        btTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTimActionPerformed(evt);
            }
        });
        jPanel1.add(btTim);
        btTim.setBounds(6, 6, 147, 35);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(183, 6, 265, 35);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Giờ bay :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(380, 150, 80, 21);
        jPanel1.add(jTextField6);
        jTextField6.setBounds(470, 140, 180, 30);
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(470, 102, 180, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Mã máy bay :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(350, 70, 120, 21);

        jPanel1.add(jcbMaMB);
        jcbMaMB.setBounds(470, 62, 180, 30);

        jLabel12.setIcon(new javax.swing.ImageIcon("D:\\Ổ E\\BTL-CSDL\\form ảnh\\anh-dep-may-bay-buoi-chieu.jpg")); // NOI18N
        jPanel1.add(jLabel12);
        jLabel12.setBounds(-60, -70, 870, 510);
        jPanel1.add(jLabel10);
        jLabel10.setBounds(0, 0, 750, 210);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(60, 70, 750, 210);

        tbChuyenBay.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tbChuyenBay.setForeground(new java.awt.Color(51, 51, 51));
        tbChuyenBay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbChuyenBay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbChuyenBayMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbChuyenBay);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(60, 290, 750, 190);

        btQuayLai.setBackground(new java.awt.Color(255, 204, 204));
        btQuayLai.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btQuayLai.setForeground(new java.awt.Color(102, 102, 102));
        btQuayLai.setText("Quay lại");
        btQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btQuayLaiActionPerformed(evt);
            }
        });
        getContentPane().add(btQuayLai);
        btQuayLai.setBounds(10, 10, 90, 20);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cotroller/anh-dep-may-bay-buoi-chieu.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 860, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public java.sql.Date convertJavaDateToSqlDate(java.util.Date date) {
        return new java.sql.Date(date.getTime());
    }
    
    private void btQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btQuayLaiActionPerformed
        TongQuan t = new TongQuan();
        t.setVisible(true);
        dispose();
    }//GEN-LAST:event_btQuayLaiActionPerformed

    private void btTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTimActionPerformed
        if(this.jTextField5.getText().length() == 0) {
            String sql1 = "SELECT * from chuyenbay ";
            Bang.LoadData(sql1, tbChuyenBay);
        }
        else {
            String sql1 = "SELECT * from chuyenbay WHERE Ma_CB like N'%"+this.jTextField5.getText()+"%' "
            +"or Ma_MB like N'%"+this.jTextField5.getText()+"%'"
            + "or Diem_di like N'%"+this.jTextField5.getText()+"%'"
            + "or Diem_den like N'%"+this.jTextField5.getText()+"%'"
            + "or Ngay_bay like N'%"+this.jTextField5.getText()+"%'"
            + "or Gio_bay like N'%"+this.jTextField5.getText()+"%'";
            
            
            Bang.LoadData(sql1, tbChuyenBay);
        }
    }//GEN-LAST:event_btTimActionPerformed

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        JOptionPane.showMessageDialog(null, "Nhập thông tin chuyến bay" , "Message", JOptionPane.INFORMATION_MESSAGE);
        ProcessCrt1(false);
        this.btLuu.setEnabled(true);
        this.jTextField1.setText(null);
        this.jTextField2.setText(null);
        this.jTextField4.setText(null);
        this.jTextField6.setText(null);
        
    }//GEN-LAST:event_btThemActionPerformed

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        if (this.jTextField1.getText().length()==0) JOptionPane.showMessageDialog(null, "Vui lòng nhập thông tin mã chuyến bay", "Message", JOptionPane.INFORMATION_MESSAGE);
        else {
//            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//            SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
            ChuyenBay cb = null;
            
                cb = new ChuyenBay(this.jTextField1.getText(),this.jcbMaMB.getSelectedItem().toString(), this.jTextField2.getText(), this.jTextField4.getText(),
                        convertJavaDateToSqlDate(jDateChooser1.getDate()),this.jTextField6.getText());
            
            int p=JOptionPane.showConfirmDialog(null,"Bạn có chắc chắn muốn sửa không ?");
            if(p==JOptionPane.YES_OPTION) {
                if(cbDB.suaChuyenBay(cb)) {
                   JOptionPane.showMessageDialog(null, "Sửa thành công" , "Message", JOptionPane.INFORMATION_MESSAGE);
               }
                else JOptionPane.showMessageDialog(null,"Sửa không thành công" , "Message", JOptionPane.INFORMATION_MESSAGE);
                this.btTim.doClick();    
            }
        }
    }//GEN-LAST:event_btSuaActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        int p=JOptionPane.showConfirmDialog(null,"Bạn có chắc chắn muốn xoá không ?");
        if(p==JOptionPane.YES_OPTION) {
            if(cbDB.xoaChuyenBay(this.jTextField1.getText())) {
                JOptionPane.showMessageDialog(null, "Xoá thành công" , "Message", JOptionPane.INFORMATION_MESSAGE);
                }
            else JOptionPane.showMessageDialog(null, "Xoá không thành công" , "Message", JOptionPane.INFORMATION_MESSAGE);
            this.btTim.doClick();
            }
    }//GEN-LAST:event_btXoaActionPerformed

    private void btLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLuuActionPerformed
        try {
            if (this.jTextField1.getText().length()==0) JOptionPane.showMessageDialog(null, "Vui lòng nhập thông tin mã chuyến bay", "Message", JOptionPane.INFORMATION_MESSAGE);
            else {

                ChuyenBay cb = new ChuyenBay(this.jTextField1.getText(),this.jcbMaMB.getSelectedItem().toString(), this.jTextField2.getText(), this.jTextField4.getText(),
                convertJavaDateToSqlDate(jDateChooser1.getDate()),this.jTextField6.getText());
                DbChuyenBay.themChuyenBay(cb);
                this.btTim.doClick();
                }
        } catch (Exception e) {
            int p=JOptionPane.showConfirmDialog(null,"Bạn có chắc chắn muốn lưu không ?");
            if(p==JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Lưu không thành công" , "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btLuuActionPerformed

    private void tbChuyenBayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbChuyenBayMouseClicked
        ProcessCrt1(true);
        this.btLuu.setEnabled(false);
        try{
            int row = this.tbChuyenBay.getSelectedRow();
            String IDrow = (this.tbChuyenBay.getModel().getValueAt(row, 0)).toString();
            String sql1 = "SELECT * FROM chuyenbay where Ma_CB='"+IDrow+"'";
            ResultSet rs = Bang.show(sql1);
            if(rs.next()) {
                this.jTextField1.setText(rs.getString("Ma_CB"));
                
                this.jTextField2.setText(rs.getString("Diem_di"));
                //this.jTextField3.setText(rs.getString("Ngay_bay"));
                this.jDateChooser1.setDate(rs.getDate("Ngay_bay"));
                this.jTextField4.setText(rs.getString("Diem_den"));
                this.jTextField6.setText(rs.getString("Gio_bay"));
                String item = rs.getString("Ma_MB");
                 for(int i=0;i<jcbMaMB.getItemCount();i++){
                if(jcbMaMB.getItemAt(i).toString().equals(item)){
                    jcbMaMB.setSelectedIndex(i);
                    break;
                }
            }
            }
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi" , "Message", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_tbChuyenBayMouseClicked

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

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
            java.util.logging.Logger.getLogger(QLChuyenBay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLChuyenBay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLChuyenBay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLChuyenBay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new QLChuyenBay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLuu;
    private javax.swing.JButton btQuayLai;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btTim;
    private javax.swing.JButton btXoa;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JComboBox<String> jcbMaMB;
    private javax.swing.JTable tbChuyenBay;
    // End of variables declaration//GEN-END:variables
}
