 
package database;

import java.sql.*;


public class ConnectionDatabase {
    private  static Connection con;
    
    public static Connection getConnection(){
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlms?user=root&password=Thaiphuong1510*");
            //con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mbdb;Username=root;Password = 123456789");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
}
//jdbc:mysql://localhost:3306/mbdb?zeroDateTimeBehavior=CONVERT_TO_NULL [root on Default schema]