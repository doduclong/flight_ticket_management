/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;
import model.KhachHang;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class DbKhachHang {
    public static PreparedStatement truyvan;
    
    public static void themKhachHang(KhachHang kh) throws SQLException{
        try{
            truyvan = ConnectionDatabase.getConnection().prepareStatement("INSERT INTO khachhang values(?,?,?,?,?)");
            truyvan.setString(1, kh.getMaKH());
            truyvan.setString(2, kh.getTenKH());
            truyvan.setString(3, kh.getSdtKH());
            truyvan.setString(4, kh.getCmnd());
            truyvan.setString(5, kh.getDiaChiKH());
            
            
            int p=JOptionPane.showConfirmDialog(null,"Bạn có chắc chắn muốn lưu không ?");
            if(p==JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Lưu thành công" , "Message", JOptionPane.INFORMATION_MESSAGE);
                truyvan.execute();
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public boolean suaKhachHang(KhachHang kh){
        try{
            truyvan = ConnectionDatabase.getConnection().prepareStatement("UPDATE khachhang SET  "
                    + "Ten_KH = ?, SDT_KH = ?,"
                    + "CMND = ?, Dc_KH = ? where Ma_KH = ?");
                    
            truyvan.setString(5, kh.getMaKH());
            truyvan.setString(1, kh.getTenKH());
            truyvan.setString(2, kh.getSdtKH());
            truyvan.setString(3, kh.getCmnd());
            truyvan.setString(4, kh.getDiaChiKH());
            return truyvan.executeUpdate() >0;
   
        
        }catch(Exception e){
            return false;
        }
    }
    
    public boolean xoaKhachHang(String maKH) {
        try {
            truyvan = ConnectionDatabase.getConnection().prepareStatement("DELETE FROM khachhang WHERE Ma_KH = ?");
            truyvan.setString(1, maKH);
            return truyvan.executeUpdate() >0;
        } catch(Exception e) {
            return false;
        }
    }
}
