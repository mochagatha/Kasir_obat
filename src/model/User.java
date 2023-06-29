package model;
import java.sql.*;
/**
 *
 * @author ASUS
 */
public class User {
    private static String query;
    private static ResultSet rs;
    private static Statement stmt;
    private static int IDUser;
    
    public static void setIDUser(int id_user){
        User.IDUser = id_user;
    }    
    public static int getIDUser(){
        return IDUser;
    }
    public static int CekUser(String username, String password){
        Connection connect = Koneksi.koneksiDatabase();
        int data = 0;
        try{
            stmt = connect.createStatement();
            query = "SELECT COUNT(id_user) FROM user where username='"+username+"'"
                    + " and password='"+password+"' ";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                data = rs.getInt(1);
            }
            stmt.close();
            connect.close();
        }catch(SQLException ex){
            System.out.println("Error : " + ex.getMessage());
        }
        return data;       
    }
    public static int GetIDUser(String username, String password){
        Connection connect = Koneksi.koneksiDatabase();
        int data = 0;
        try{
            stmt = connect.createStatement();
            query = "SELECT id_user FROM user where username='"+username+"' "
                    + " and password='"+password+"' ";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                data = rs.getInt(1);
            }
            stmt.close();
            connect.close();
        }catch(SQLException ex){
            System.out.println("Error : " + ex.getMessage());
        }
        return data;
    }  
    public static String[][] getProfil(int id_user) {
        Connection connect = Koneksi.koneksiDatabase();
       String data[][] = null;
       try{
           stmt = connect.createStatement();
           query = "SELECT `nama`, `email` FROM `user` WHERE `id_user`="+id_user+" ";
           rs = stmt.executeQuery(query);
           ResultSetMetaData meta = rs.getMetaData();
           int jmlKolom = meta.getColumnCount();
           data = new String[1000][jmlKolom];
           int r = 0;
           while(rs.next()){
               for(int c=0; c<jmlKolom; c++){
                   data[r][c] = rs.getString(c+1);
               }
               r++;
           }
           int jmlBaris = r;
           String [][] tmparray = data;
           data = new String[jmlBaris][jmlKolom];
           for(r=0; r<jmlBaris; r++){
               for(int c=0; c<jmlKolom; c++){
                   data[r][c] = tmparray[r][c];
               }
           }
           stmt.close();
           connect.close();
       }catch (SQLException ex){
           System.out.println("Error : " + ex.getMessage());
       }
       return data;
    }
    
        public static String[][] getProfil(String IDUser) {
        Connection connect = Koneksi.koneksiDatabase();
       String data[][] = null;
       try{
           stmt = connect.createStatement();
           query = "SELECT `nama`, `email` FROM `user` WHERE `id_user`="+IDUser+" ";
           rs = stmt.executeQuery(query);
           ResultSetMetaData meta = rs.getMetaData();
           int jmlKolom = meta.getColumnCount();
           data = new String[1000][jmlKolom];
           int r = 0;
           while(rs.next()){
               for(int c=0; c<jmlKolom; c++){
                   data[r][c] = rs.getString(c+1);
               }
               r++;
           }
           int jmlBaris = r;
           String [][] tmparray = data;
           data = new String[jmlBaris][jmlKolom];
           for(r=0; r<jmlBaris; r++){
               for(int c=0; c<jmlKolom; c++){
                   data[r][c] = tmparray[r][c];
               }
           }
           stmt.close();
           connect.close();
       }catch (SQLException ex){
           System.out.println("Error : " + ex.getMessage());
       }
       return data;
    }
        
        //ambil data kelompok
        public static String[][] NamaKelompok() {
        Connection connect = Koneksi.koneksiDatabase();
       String data[][] = null;
       try{
           stmt = connect.createStatement();
           query = "SELECT `nama`, `nim` FROM `user` WHERE `id_user`";
           rs = stmt.executeQuery(query);
           ResultSetMetaData meta = rs.getMetaData();
           int jmlKolom = meta.getColumnCount();
           data = new String[1000][jmlKolom];
           int r = 0;
           while(rs.next()){
               for(int c=0; c<jmlKolom; c++){
                   data[r][c] = rs.getString(c+1);
               }
               r++;
           }
           int jmlBaris = r;
           String [][] tmparray = data;
           data = new String[jmlBaris][jmlKolom];
           for(r=0; r<jmlBaris; r++){
               for(int c=0; c<jmlKolom; c++){
                   data[r][c] = tmparray[r][c];
               }
           }
           stmt.close();
           connect.close();
       }catch (SQLException ex){
           System.out.println("Error : " + ex.getMessage());
       }
       return data;
    }
   

}

