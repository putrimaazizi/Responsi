package responsi124190055;
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author putrimaazizi
 */
public class ModelPerpustakaan {
    String DBurl = "jdbc:mysql://localhost:3306/responsi_perpus";
    String DBusername = "root";
    String DBpassword = "";
    Connection koneksi;
    Statement statement;
    
    public ModelPerpustakaan(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            koneksi = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/responsi_perpus?serverTimezone=UTC", "root", "");
            System.out.println("Koneksi Berhasil");
        }catch(Exception ex){
            System.out.println("Koneksi gagal");
        }
    }
    
    public void insertAccount(String username, String password){
        int jmlData=0;
        try {
           
           String query = "Select * from account WHERE username=" + username; 
           ResultSet resultSet = statement.executeQuery(query);
           
           while (resultSet.next()){ 
                jmlData++;
            }
           
            if (jmlData==0) {
                query = "INSERT INTO account(username, password) VALUES ('"+username+"','"+password+"')";
           
                statement = (Statement) koneksi.createStatement();
                statement.executeUpdate(query); //execute querynya
                System.out.println("Berhasil daftar");
                JOptionPane.showMessageDialog(null, "Berhasil daftar");
            }
            else {
                JOptionPane.showMessageDialog(null, "Username sudah terdaftar");
            }
        } catch (Exception sql) {
            System.out.println(sql.getMessage());   
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
    
    public void cekAccount(String username, String password){
        int jmlData=0;
        try {
           
           String query = "Select * from account WHERE username=" + username; 
           ResultSet resultSet = statement.executeQuery(query);
           
           while (resultSet.next()){ 
                jmlData++;
            }
           
            if (jmlData==0) {
                JOptionPane.showMessageDialog(null, "Login Gagal");
            }
            else {
                JOptionPane.showMessageDialog(null, "Berhasil Login");
                ViewHome vh = new ViewHome();
            }
        
        } catch (Exception sql) {
            System.out.println(sql.getMessage());   
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
       
    }
    
    public void insertPinjambuku(String id, String nama, String idbuku, String judul){
        int jmlData=0;
        try {
           
           String query = "Select * from transaction WHERE memberId=" + id; 
           ResultSet resultSet = statement.executeQuery(query);
           
           while (resultSet.next()){ 
                jmlData++;
            }
           
            if (jmlData==0) {
                query = "INSERT INTO transaction(memberId, memberName, bookId, bookName) VALUES ('"+id+"','"+nama+"','"+idbuku+"','"+judul+"')";
           
                statement = (Statement) koneksi.createStatement();
                statement.executeUpdate(query); //execute querynya
                System.out.println("Berhasil ditambahkan");
                JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
            }
            else {
                JOptionPane.showMessageDialog(null, "Data sudah ada");
            }
        } catch (Exception sql) {
            System.out.println(sql.getMessage());   
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
    
    public void updatePinjambuku(String id, String nama, String idbuku, String judul){
        int jmlData=0;
         try {
           String query = "Select * from transaction WHERE memberId=" + id; 
           ResultSet resultSet = statement.executeQuery(query);
           
           while (resultSet.next()){ 
                jmlData++;
            }
           
             if (jmlData==1) {
                query = "UPDATE transaction SET memberName='" + nama + "', bookId='" + idbuku +"' WHERE bookName=" + judul;
                statement = (Statement) koneksi.createStatement();
                statement.executeUpdate(query); //execute querynya
                System.out.println("Berhasil diupdate");
                JOptionPane.showMessageDialog(null, "Data Berhasil diupdate");
             }
             else {
                 JOptionPane.showMessageDialog(null, "Data Tidak Ada");
             }
           
        } catch (Exception sql) {
            System.out.println(sql.getMessage());   
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
    
    public int getBanyakData(){
        int jmlData = 0;
        try{
            statement = koneksi.createStatement();
            String query = "Select * from transaction";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){ 
                jmlData++;
            }
            return jmlData;
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }
    
    public String[][] readPinjambuku(){
        try{
            int jmlData = 0;
            
            String data[][] = new String[getBanyakData()][4]; 
            
            String query = "Select * from transaction"; 
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[jmlData][0] = resultSet.getString("id"); 
                data[jmlData][1] = resultSet.getString("nama");                
                data[jmlData][2] = resultSet.getString("idbuku");
                data[jmlData][3] = resultSet.getString("judul");
                jmlData++;
            }
            return data;
               
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
    
    public void deletePinjambuku (String id) {
        try{
            String query = "DELETE FROM transaction WHERE memberId = '"+id+"'";
            statement = koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
            
        }catch(SQLException sql) {
            System.out.println(sql.getMessage());
        }
    }
 
}
