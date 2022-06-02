package controller;

import database.ConnectionDatabase;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import model.*;
import net.proteanit.sql.DbUtils;

public class Bang {
    public static PreparedStatement truyvan ;
    public static ResultSet contro ;
    public static Connection con = ConnectionDatabase.getConnection();
    
    public static void LoadData (String sql,JTable tb) {
        try{
            truyvan = con.prepareStatement(sql);
            contro = truyvan.executeQuery();
            tb.setModel((DbUtils.resultSetToTableModel(contro)));
            
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e ,"Lỗi",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public static ResultSet show(String sql) {
        try{
            truyvan = con.prepareStatement(sql);
            return truyvan.executeQuery(); 
        }
        catch(Exception e) {
            return null;
        }
    }
    
     public static void getMaMBToCombobox(JComboBox j){
       // List<MayBay> listMB = new ArrayList<>();
        j.removeAllItems();
        try{
            
            truyvan = con.prepareStatement("SELECT * FROM maybay ORDER BY Ma_MB ASC");
            contro = truyvan.executeQuery();
            while(contro.next()){
               // MayBay mb = new MayBay(contro.getString("Ma_MB"),contro.getString("Ten_MB"),contro.getString("Hang_MB"),contro.getInt("So_ghe"));
                //listMB.add(mb);
                j.addItem(contro.getString("Ma_MB"));
            }
            
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e ,"Lỗi",JOptionPane.WARNING_MESSAGE);
        }
    }
     
    public static void getMaNVToCombobox(JComboBox j){
       
        j.removeAllItems();
        try{
            
            truyvan = con.prepareStatement("SELECT * FROM nhanvien ORDER BY Ma_NV ASC");
            contro = truyvan.executeQuery();
            while(contro.next()){
              
                j.addItem(contro.getString("Ma_NV"));
            }
            
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e ,"Lỗi",JOptionPane.WARNING_MESSAGE);
        }
    }
     public static void getMaKHToCombobox(JComboBox j){
       
        j.removeAllItems();
        try{
            
            truyvan = con.prepareStatement("SELECT * FROM khachhang ORDER BY Ma_KH ASC");
            contro = truyvan.executeQuery();
            while(contro.next()){
              
                j.addItem(contro.getString("Ma_KH"));
            }
            
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e ,"Lỗi",JOptionPane.WARNING_MESSAGE);
        }
    }
     public static void getMaCBToCombobox(JComboBox j){
       
        j.removeAllItems();
        try{
            
            truyvan = con.prepareStatement("SELECT * FROM chuyenbay ORDER BY Ma_CB ASC");
            contro = truyvan.executeQuery();
            while(contro.next()){
              
                j.addItem(contro.getString("Ma_CB"));
            }
            
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e ,"Lỗi",JOptionPane.WARNING_MESSAGE);
        }
    }
}
    
    
