/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;
import model.NhanVien;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class DbNhanVien {
    public static PreparedStatement truyvan;
    
    public static void themNhanVien(NhanVien nv) throws SQLException{
        try{
            truyvan = ConnectionDatabase.getConnection().prepareStatement("INSERT INTO nhanvien values(?,?,?,?,?)");
            truyvan.setString(1, nv.getMaNV());
            truyvan.setString(2, nv.getTenNV());
            truyvan.setString(3, nv.getSdtNV());
            truyvan.setString(4, nv.getDiaChiNV());
            truyvan.setString(5, nv.getChucVu());
            
            int p=JOptionPane.showConfirmDialog(null,"Bạn có chắc chắn muốn lưu không ?");
            if(p==JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Lưu thành công" , "Message", JOptionPane.INFORMATION_MESSAGE);
                truyvan.execute();
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public boolean suaNhanVien(NhanVien nv){
        try{
            truyvan = ConnectionDatabase.getConnection().prepareStatement("UPDATE nhanvien SET  "
                    + "Ten_NV = ?, SDT_NV = ?,"
                    + "Dc_NV = ?, Chuc_vu = ? where Ma_NV = ?");
                    
            truyvan.setString(5, nv.getMaNV());
            truyvan.setString(1, nv.getTenNV());
            truyvan.setString(2, nv.getSdtNV());
            truyvan.setString(3, nv.getDiaChiNV());
            truyvan.setString(4, nv.getChucVu());
            return truyvan.executeUpdate() >0;
   
        
        }catch(Exception e){
            return false;
        }
    }
    
    public boolean xoaNhanVien(String maNV) {
        try {
            truyvan = ConnectionDatabase.getConnection().prepareStatement("DELETE FROM nhanvien WHERE Ma_NV = ?");
            truyvan.setString(1, maNV);
            return truyvan.executeUpdate() >0;
        } catch(Exception e) {
            return false;
        }
    }
}
