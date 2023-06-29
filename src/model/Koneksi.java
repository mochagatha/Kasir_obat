/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.*;

/**
 *
 * @author ASUS
 */
public class Koneksi {
public static Connection Koneksi = null;
    public static Connection koneksiDatabase(){
        try{
            //SETTING DRIVER MYSQL
            Class.forName("com.mysql.jdbc.Driver");
            //BUAT CONNECTION
            Koneksi = DriverManager.getConnection("jdbc:mysql:///penjualan_obat","root","");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Connection Error : " + e.getMessage());
        }
        return Koneksi;
    }    
}
