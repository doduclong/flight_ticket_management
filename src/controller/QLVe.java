/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import model.Ve;
import database.*;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class QLVe extends javax.swing.JFrame {

    private String veTV = "SELECT * FROM vemaybay ORDER BY Ma_Ve ASC";
    DbVe veDB = new DbVe();
    
    public QLVe() {
        initComponents();
        setSize(875,550);
        setLocationRelativeTo(this);
        
        Bang.LoadData(veTV, tbVe);
        Bang.getMaCBToCombobox(jComboBox1);
        Bang.getMaKHToCombobox(jComboBox2);
        Bang.getMaNVToCombobox(jComboBox3);
        ProcessCrt1(false);
    }
    
    public void ProcessCrt1(boolean b) {
        this.btLuu.setEnabled(b);
        this.btSua.setEnabled(b);
        this.btXoa.setEnabled(b);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btThem = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        btLuu = new javax.swing.JButton();
        btTim = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboTim = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbVe = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cotroller/anh_nhan_vien.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Qu???n l?? v??");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(340, 10, 170, 43);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("M?? v?? :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 70, 70, 20);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Lo???i gh??? :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(470, 140, 90, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Lo???i v?? :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(470, 70, 101, 20);

        btThem.setBackground(new java.awt.Color(255, 204, 204));
        btThem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btThem.setForeground(new java.awt.Color(51, 51, 51));
        btThem.setText("Th??m");
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
        btSua.setText("S???a ");
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
        btXoa.setText("X??a");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });
        jPanel1.add(btXoa);
        btXoa.setBounds(370, 180, 72, 27);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(90, 70, 130, 30);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(570, 60, 130, 30);

        btLuu.setBackground(new java.awt.Color(255, 204, 204));
        btLuu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btLuu.setForeground(new java.awt.Color(51, 51, 51));
        btLuu.setText("L??u");
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
        btTim.setText("T??m ki???m : ");
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
        jLabel8.setText("Gi?? v?? :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(470, 110, 80, 21);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(570, 100, 130, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("M?? CB :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 130, 80, 30);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(570, 140, 130, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("M?? KH :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(230, 76, 80, 20);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("M?? NV :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(230, 140, 80, 21);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(90, 130, 130, 30);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(310, 70, 110, 30);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox3);
        jComboBox3.setBounds(310, 130, 110, 30);

        jComboTim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Theo Th??ng tin v??", "Theo T??n KH", "Theo T??n NV", " " }));
        jComboTim.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboTimItemStateChanged(evt);
            }
        });
        jPanel1.add(jComboTim);
        jComboTim.setBounds(500, 10, 150, 30);

        jLabel12.setIcon(new javax.swing.ImageIcon("D:\\??? E\\BTL-CSDL\\form ???nh\\anh-dep-may-bay-buoi-chieu.jpg")); // NOI18N
        jPanel1.add(jLabel12);
        jLabel12.setBounds(-60, -20, 880, 420);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(60, 70, 750, 210);

        tbVe.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tbVe.setForeground(new java.awt.Color(51, 51, 51));
        tbVe.setModel(new javax.swing.table.DefaultTableModel(
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
        tbVe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbVeMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbVe);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(60, 290, 750, 190);

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Quay l???i");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 10, 90, 23);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cotroller/anh-dep-may-bay-buoi-chieu.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 880, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTimActionPerformed
       String sql1 ="";
        if(this.jTextField5.getText().length() == 0) {
             sql1 = "SELECT * from vemaybay ";
            Bang.LoadData(sql1, tbVe);
        }
        else {
            if(jComboTim.getSelectedIndex() ==0){
             sql1 = "SELECT * from vemaybay WHERE Ma_Ve like N'%"+this.jTextField5.getText().toUpperCase()+"%' "
            + "or Ma_CB like N'%"+this.jTextField5.getText().toUpperCase()+"%'"
            + "or Ma_KH like N'%"+this.jTextField5.getText().toUpperCase()+"%'"
            + "or Ma_NV like N'%"+this.jTextField5.getText().toUpperCase()+"%'"
            + "or Loai_ve like N'%"+this.jTextField5.getText()+"%'"
            + "or Gia_ve like N'%"+this.jTextField5.getText()+"%'"
            + "or Loai_ghe like N'%"+this.jTextField5.getText()+"%'";
           }
            else if(jComboTim.getSelectedIndex() ==1){
                sql1 = "SELECT Ma_Ve,vemaybay.Ma_KH,khachhang.Ten_KH,Loai_ve,Gia_ve,Loai_ghe FROM qlms.vemaybay "
                        + "inner join qlms.khachhang on  vemaybay.Ma_KH = khachhang.Ma_KH where Ten_KH like N'%"+this.jTextField5.getText()+"%'";
            }else if(jComboTim.getSelectedIndex() ==2){
                sql1 = "SELECT Ma_Ve,vemaybay.Ma_NV,nhanvien.Ten_NV FROM qlms.vemaybay"
                        + " inner join qlms.nhanvien on  vemaybay.Ma_NV = nhanvien.Ma_NV where Ten_NV like N'%"+this.jTextField5.getText()+"%'";
            }
            Bang.LoadData(sql1, tbVe);
            
        }
    }//GEN-LAST:event_btTimActionPerformed

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        JOptionPane.showMessageDialog(null, "Nh???p th??ng tin v?? m??y bay" , "Message", JOptionPane.INFORMATION_MESSAGE);
        ProcessCrt1(false);
        this.btLuu.setEnabled(true);
        this.jTextField1.setText(null);
        this.jTextField2.setText(null);
        this.jTextField3.setText(null);
        this.jTextField4.setText(null);
    }//GEN-LAST:event_btThemActionPerformed

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        if (this.jTextField1.getText().length()==0) JOptionPane.showMessageDialog(null, "Vui l??ng nh???p th??ng tin m?? v?? m??y bay", "Message", JOptionPane.INFORMATION_MESSAGE);
        else {
            Ve ve = new Ve(this.jTextField1.getText(),this.jComboBox1.getSelectedItem().toString(),this.jComboBox2.getSelectedItem().toString(),this.jComboBox3.getSelectedItem().toString(), 
                        this.jTextField2.getText(),  Integer.parseInt(this.jTextField3.getText()),this.jTextField4.getText());
            int p=JOptionPane.showConfirmDialog(null,"B???n c?? ch???c ch???n mu???n s???a kh??ng ?");
            if(p==JOptionPane.YES_OPTION) {
                if(veDB.suaVe(ve)) {
                   JOptionPane.showMessageDialog(null, "S???a th??nh c??ng" , "Message", JOptionPane.INFORMATION_MESSAGE);
               }
                else JOptionPane.showMessageDialog(null,"S???a kh??ng th??nh c??ng" , "Message", JOptionPane.INFORMATION_MESSAGE);
                this.btTim.doClick();    
            }
        }
    }//GEN-LAST:event_btSuaActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        int p=JOptionPane.showConfirmDialog(null,"B???n c?? ch???c ch???n mu???n xo?? kh??ng ?");
        if(p==JOptionPane.YES_OPTION) {
            if(veDB.xoaVe(this.jTextField1.getText())) {
                JOptionPane.showMessageDialog(null, "Xo?? th??nh c??ng" , "Message", JOptionPane.INFORMATION_MESSAGE);
                }
            else JOptionPane.showMessageDialog(null, "Xo?? kh??ng th??nh c??ng" , "Message", JOptionPane.INFORMATION_MESSAGE);
            this.btTim.doClick();
            }
    }//GEN-LAST:event_btXoaActionPerformed

    private void btLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLuuActionPerformed
        try {
            if (this.jTextField1.getText().length()==0) JOptionPane.showMessageDialog(null, "Vui l??ng nh???p th??ng tin m?? v?? m??y bay", "Message", JOptionPane.INFORMATION_MESSAGE);
            else {
                Ve ve = new Ve(this.jTextField1.getText(),this.jComboBox1.getSelectedItem().toString(),this.jComboBox2.getSelectedItem().toString(),this.jComboBox3.getSelectedItem().toString(), 
                        this.jTextField2.getText(),  Integer.parseInt(this.jTextField3.getText()),this.jTextField4.getText());
                DbVe.themVe(ve);
                this.btTim.doClick();
                }
        } catch (Exception e) {
            int p=JOptionPane.showConfirmDialog(null,"B???n c?? ch???c ch???n mu???n l??u kh??ng ?");
            if(p==JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "L??u kh??ng th??nh c??ng" , "Message", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btLuuActionPerformed

    private void tbVeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbVeMouseClicked
        ProcessCrt1(true);
        this.btLuu.setEnabled(false);
        try{
            int row = this.tbVe.getSelectedRow();
            String IDrow = (this.tbVe.getModel().getValueAt(row, 0)).toString();
            String sql1 = "SELECT * FROM vemaybay where Ma_Ve='"+IDrow+"'";
            ResultSet rs = Bang.show(sql1);
            if(rs.next()) {
                this.jTextField1.setText(rs.getString("Ma_Ve"));
                this.jTextField4.setText(rs.getString("Loai_ghe"));
                this.jTextField2.setText(rs.getString("Loai_ve"));
                this.jTextField3.setText(rs.getString("Gia_ve"));
                // get item vao ma chuyen bay
                String item1 = rs.getString("Ma_CB");
                 for(int i=0;i<jComboBox1.getItemCount();i++){
                if(jComboBox1.getItemAt(i).toString().equals(item1)){
                    jComboBox1.setSelectedIndex(i);
                    break;
                }
            }
            // get item vao ma khach hang
            String item2 = rs.getString("Ma_KH");
                 for(int i=0;i<jComboBox2.getItemCount();i++){
                if(jComboBox2.getItemAt(i).toString().equals(item2)){
                    jComboBox2.setSelectedIndex(i);
                    break;
                }
            }
              // get item vao ma nhan vien
            String item3 = rs.getString("Ma_NV");
                 for(int i=0;i<jComboBox3.getItemCount();i++){
                if(jComboBox3.getItemAt(i).toString().equals(item3)){
                    jComboBox3.setSelectedIndex(i);
                    break;
                }
            }  
            }
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, "L???i" , "Message", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_tbVeMouseClicked

    private void jComboTimItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboTimItemStateChanged
        // TODO add your handling code here:
        //String sql = 
        //if(jComboTim.getSelectedIndex() ==0){
            
       // }
    }//GEN-LAST:event_jComboTimItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TongQuan t = new TongQuan();
        t.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(QLVe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLVe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLVe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLVe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new QLVe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLuu;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btTim;
    private javax.swing.JButton btXoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboTim;
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
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTable tbVe;
    // End of variables declaration//GEN-END:variables
}
