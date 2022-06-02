/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import model.Ve;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class DbVe {
    public static PreparedStatement truyvan;
    
    public static void themVe(Ve v) throws SQLException{
        try{
            truyvan = ConnectionDatabase.getConnection().prepareStatement("INSERT INTO vemaybay values(?,?,?,?,?,?,?)");
            truyvan.setString(1, v.getMaVe());
            truyvan.setString(2, v.getMaCB());
            truyvan.setString(3, v.getMaKH());
            truyvan.setString(4, v.getMaNV());
            truyvan.setString(7, v.getLoaiGhe());
            truyvan.setString(5, v.getLoaiVe());
            truyvan.setInt(6,v.getGiaVe());
            
            
            int p=JOptionPane.showConfirmDialog(null,"Bạn có chắc chắn muốn lưu không ?");
            if(p==JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Lưu thành công" , "Message", JOptionPane.INFORMATION_MESSAGE);
                truyvan.execute();
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public boolean suaVe(Ve v){
        try{
            truyvan = ConnectionDatabase.getConnection().prepareStatement("UPDATE vemaybay SET  "
                    + "Ma_CB = ?, Ma_KH = ?,Ma_NV = ?,"
                    + "Loai_ve = ?,Gia_ve = ?,"
                    + "Loai_ghe = ? where Ma_Ve = ?");
                    
            truyvan.setString(7, v.getMaVe());
            truyvan.setString(1, v.getMaCB());
            truyvan.setString(2, v.getMaKH());
            truyvan.setString(3, v.getMaNV());
            truyvan.setString(6, v.getLoaiGhe());
            truyvan.setString(4, v.getLoaiVe());
            truyvan.setInt(5, v.getGiaVe());
            return truyvan.executeUpdate() >0;
   
        
        }catch(Exception e){
            return false;
        }
    }
    
    public boolean xoaVe(String maVe) {
        try {
            truyvan = ConnectionDatabase.getConnection().prepareStatement("DELETE FROM vemaybay WHERE Ma_Ve = ?");
            truyvan.setString(1, maVe);
            return truyvan.executeUpdate() >0;
        } catch(Exception e) {
            return false;
        }
    }
}
