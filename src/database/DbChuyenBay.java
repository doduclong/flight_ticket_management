/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.ChuyenBay;

/**
 *
 * @author Admin
 */
public class DbChuyenBay {
    public static PreparedStatement truyvan;
    
    public static void themChuyenBay(ChuyenBay cb) throws SQLException{
        try{
            truyvan = ConnectionDatabase.getConnection().prepareStatement("INSERT INTO chuyenbay values(?,?,?,?,?,?)");
            truyvan.setString(1, cb.getMaCB());
             truyvan.setString(2, cb.getMaMB());
            truyvan.setString(3, cb.getDiemDi());
            truyvan.setString(4, cb.getDiemDen());
            truyvan.setDate(5, (Date) cb.getNgayBay());
            truyvan.setString(6, cb.getGioBay());
            
            int p=JOptionPane.showConfirmDialog(null,"Bạn có chắc chắn muốn lưu không ?");
            if(p==JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Lưu thành công" , "Message", JOptionPane.INFORMATION_MESSAGE);
                truyvan.execute();
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public boolean suaChuyenBay(ChuyenBay cb){
        try{
            truyvan = ConnectionDatabase.getConnection().prepareStatement("UPDATE chuyenbay SET  "
                    + "Ma_MB = ?,Diem_di = ?, Diem_den = ?,"
                    + "Ngay_bay = ?, Gio_bay = ? where Ma_CB = ?");
                    
            truyvan.setString(6, cb.getMaCB());
             truyvan.setString(1, cb.getMaMB());
            truyvan.setString(2, cb.getDiemDi());
            truyvan.setString(3, cb.getDiemDen());
            truyvan.setDate(4, (Date) cb.getNgayBay());
            truyvan.setString(5, cb.getGioBay());
            return truyvan.executeUpdate() >0;
   
        
        }catch(Exception e){
            return false;
        }
    }
    
    public boolean xoaChuyenBay(String maCB) {
        try {
            truyvan = ConnectionDatabase.getConnection().prepareStatement("DELETE FROM chuyenbay WHERE Ma_CB = ?");
            truyvan.setString(1, maCB);
            return truyvan.executeUpdate() >0;
        } catch(Exception e) {
            return false;
        }
    }
    
    
}
