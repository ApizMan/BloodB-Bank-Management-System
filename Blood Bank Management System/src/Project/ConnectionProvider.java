/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class ConnectionProvider {
    Connection myConn;
    Statement myStmt;
    ResultSet myRs;
    PreparedStatement pstmt;
    
    
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms", "root","");
            return con;
        }catch(Exception e){
            return null;
        }
    }
    
   
    
//    public void setConnect(String user, String pass){
//        try{
//            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms", user, pass);
//            myStmt = myConn.createStatement();
//            JOptionPane.showMessageDialog(null, "Success");
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//    }
}
