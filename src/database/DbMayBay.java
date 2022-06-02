/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;
import model.MayBay;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class DbMayBay {
    public static PreparedStatement truyvan;
    
    public static void themMayBay(MayBay mb) throws SQLException{
        try{
            truyvan = ConnectionDatabase.getConnection().prepareStatement("INSERT INTO maybay values(?,?,?,?)");
            truyvan.setString(1, mb.getMaMB());
            truyvan.setString(2, mb.getTenMB());
            truyvan.setString(3, mb.getHangMB());
            truyvan.setInt(4, mb.getSoGhe());
            
            
            int p=JOptionPane.showConfirmDialog(null,"Bạn có chắc chắn muốn lưu không ?");
            if(p==JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Lưu thành công" , "Message", JOptionPane.INFORMATION_MESSAGE);
                truyvan.execute();
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public boolean suaMayBay(MayBay mb){
        try{
            truyvan = ConnectionDatabase.getConnection().prepareStatement("UPDATE maybay SET  "
                    + "Ten_MB = ?, Hang_MB = ?,"
                    + "So_ghe = ? where Ma_MB = ?");
                    
            truyvan.setString(4, mb.getMaMB());
            truyvan.setString(1, mb.getTenMB());
            truyvan.setString(2, mb.getHangMB());
            truyvan.setInt(3, mb.getSoGhe());
            return truyvan.executeUpdate() >0;
   
        
        }catch(Exception e){
            return false;
        }
    }
    
    public boolean xoaMayBay(String maMB) {
        try {
            truyvan = ConnectionDatabase.getConnection().prepareStatement("DELETE FROM maybay WHERE Ma_MB = ?");
            truyvan.setString(1, maMB);
            return truyvan.executeUpdate() >0;
        } catch(Exception e) {
            return false;
        }
    }
}
