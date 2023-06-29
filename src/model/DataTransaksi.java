/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.*;

/**
 *
 * @author sabina
 */
public class DataTransaksi {
    private static String query;
    private static ResultSet rs;
    private static Statement stmt;
    private static ResultSet rs_c;
    private static Statement stmt_c;
    private static int jumBaris;
    private static int IdObat;
 
// untuk tabel    
public static String [][] getTransaksi(){
       Connection connect = Koneksi.koneksiDatabase();
       String data[][] = null;
       try{
           stmt = connect.createStatement();
           query = "select t.id_transaksi, o.nama_obat, o.harga, t.jumlah, t.total "
                   + " from transaksi t inner join obat o "
                   + " on t.id_obat=o.id_obat order by id_transaksi;"; 
                   
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

    // insert
    public static int InsertTransaksi(String IDTransaksi, String IDObat, String Jumlah, String Total){
        jumBaris = 0;
        Connection connect = Koneksi.koneksiDatabase();
        try{
            stmt = connect.createStatement();
            query = "insert into transaksi (id_transaksi, id_obat, "
                    + "jumlah, total) "
                    + "values ('"+IDTransaksi+"','"+IDObat+"','"+Jumlah+"','"+Total+"') ";
            stmt.executeUpdate(query);
            stmt_c = connect.createStatement();
            rs_c = stmt_c.executeQuery("SELECT COUNT(*) FROM `transaksi`");
            while (rs_c.next()){
                jumBaris = rs_c.getInt(1);
            }
            stmt.close();
            stmt_c.close();
            connect.close();
        }catch(SQLException ex){
            System.out.println("Error : " +ex.getMessage());
        }
        return jumBaris;
    }
        //DELETE DATA
    public static void DeleteTransaksi(String IDTransaksi){
        Connection connect = Koneksi.koneksiDatabase();
        try{
            stmt = connect.createStatement();
            query = "DELETE FROM transaksi WHERE `id_transaksi` = '"+IDTransaksi+"'";
            stmt.executeUpdate(query);
            stmt.close();
            connect.close();
        }catch(SQLException ex){
            System.err.println("Eror : " + ex.getMessage());
        }
    }
    
    //get data based on id
    public static String [][] getDataTransaksi(String IDTransaksi){
        Connection connect = Koneksi.koneksiDatabase();
        String data[][] = null;
        try{
            stmt = connect.createStatement();
            query = "select o.id_obat, o.nama_obat, o.harga, t.jumlah, t.total "
                   + " from transaksi t inner join obat o "
                   + " on t.id_obat=o.id_obat "
                   + " where t.id_transaksi = "+IDTransaksi+""; 
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
        }catch(SQLException ex){
            System.out.println("Error : " +ex.getMessage());
        }
        return data;
    }
    
    //edit
    public static void editTransaksi(String IDTransaksi, String Obat, String IDObat, String Jumlah, String Total){
        Connection connect = Koneksi.koneksiDatabase();
        try{
            stmt = connect.createStatement();
            query = "update transaksi set `id_obat` = '"+IDObat+"',"
                    + " jumlah = '"+Jumlah+"',"
                    + " total = '"+Total+"'"
                    + " where `id_transaksi` = '"+IDTransaksi+"'";
            stmt.executeUpdate(query);
            stmt.close();
            connect.close();
        }catch(SQLException ex){
            System.out.println("Error : " + ex.getMessage());
        }
    }
    
    //harga
    public static String getHarga(String ID){
       Connection connect = Koneksi.koneksiDatabase();
       String data = null;
       try{
           stmt = connect.createStatement();
           query = "SELECT harga FROM obat"
                   + "where id_obat= '"+ID+"'";
           rs = stmt.executeQuery(query);
           while (rs.next()) {
               data = rs.getString(1);
           }
           rs.close();
           stmt.close();
           connect.close();
       }catch(SQLException ex){
           System.out.println("Error : " + ex.getMessage());
       }
       return data;
    }

//cari Transaksi
    public static String [][] Search(String kataKunci){
        Connection connect = Koneksi.koneksiDatabase();
        String data[][] = null;
        try{
            stmt = connect.createStatement();
            query = "select t.id_transaksi, o.nama_obat, o.harga, t.jumlah, t.total "
                   + " from transaksi t inner join obat o "
                   + " on t.id_obat=o.id_obat"
                   + " where o.nama_obat LIKE '%"+kataKunci+"%'"
                   + " order by t.id_transaksi, o.nama_obat";  
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
        }catch(SQLException ex){
            System.out.println("Connection Error : " + ex.getMessage());
        }
        return data;
    }
    
    public static String [][] setTotalBiayaTransaksi(){
        Connection connect = Koneksi.koneksiDatabase();
        String data[][] = null;
        try{
            stmt = connect.createStatement();
            query = "SELECT SUM(jumlah) AS total from transaksi ";
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
        }catch(SQLException ex){
            System.out.println("Error : " +ex.getMessage());
        }
        return data;
    }
    
    public static String [][] setRataBiayaTransaksi(){
        Connection connect = Koneksi.koneksiDatabase();
        String data[][] = null;
        try{
            stmt = connect.createStatement();
            query = "SELECT AVG(jumlah) AS rata from transaksi ";
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
        }catch(SQLException ex){
            System.out.println("Error : " +ex.getMessage());
        }
        return data;
    }
}