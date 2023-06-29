
package model;
import java.sql.*;

/**
 *
 * @author sabina
 */
public class DataKategori {
    private static String query;
    private static ResultSet rs;
    private static Statement stmt;
    private static ResultSet rs_c;
    private static Statement stmt_c;
    private static int jumBaris;
    
    
    //tabel
    public static String [][] getKategori(){
       Connection connect = Koneksi.koneksiDatabase();
       String data[][] = null;
       try{
           stmt = connect.createStatement();
           query = "SELECT `id_kategori`, `nama_kategori` " 
                   + " from `kategori` " 
                   + " order by `id_kategori`";
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
    
    // combo box
    public static String [] getListKategori(){
        String data[] = null;
        Connection connect = Koneksi.koneksiDatabase();
        try{
            stmt = connect.createStatement();
            query = "SELECT id_kategori, nama_kategori"
                    + "  FROM kategori order by id_kategori";
            rs = stmt.executeQuery(query);
            ResultSetMetaData meta = rs.getMetaData();
            int jmlKolom = meta.getColumnCount();
            data = new String[1000];
            int r = 0;
            while(rs.next()){
                String id = rs.getString(1);
                String nama = rs.getString(2);
                String list = id+ " - " +nama;
                data[r] = list;
                r++;
            }
            int jmlBaris = r;
            String [] tmparray = data;
            data = new String[jmlBaris];
            for(r=0; r<jmlBaris; r++){
                data[r] = tmparray[r];
            }
            stmt.close();
            connect.close();
        }catch(SQLException ex){
            System.out.println("Error : " + ex.getMessage());
        }
        return data;
    }

//hapus data    
            public static void HapusDataKategori (String IDKategori){
        Connection connect = Koneksi.koneksiDatabase();
        try{
            stmt = connect.createStatement();
            query = "DELETE FROM `kategori` WHERE `kategori`.`id_kategori` = '"+IDKategori+"'";
            
            stmt.executeUpdate(query);
            
            stmt.close();
            connect.close();
        }catch(SQLException ex){
            System.err.println("Eror : " + ex.getMessage());
        }
    }

//create data            
    public static int TambahDataKategori(String IDKategori, String NamaKategori){
        jumBaris = 0;
        Connection connect = Koneksi.koneksiDatabase();
        try{
            stmt = connect.createStatement();
            query = "INSERT INTO `kategori` (`id_kategori`, `nama_kategori`)"
                    + " VALUES ('"+IDKategori+"', '"+NamaKategori+"')";
            stmt.executeUpdate(query);
            stmt_c = connect.createStatement();
            rs_c = stmt_c.executeQuery("SELECT COUNT(*) FROM `kategori`");
            while (rs_c.next()){
                jumBaris = rs_c.getInt(1);
            }
            stmt.close();
            stmt_c.close();
            connect.close();
        }catch(SQLException ex){
            System.out.println("Error : " + ex.getMessage());
        }
        return jumBaris;
    }

// update data setekah klick button edit    
        public static void UpdateDataKategori(String IDKategori, String NamaKategori){
        Connection connect = Koneksi.koneksiDatabase();
        try{
            stmt = connect.createStatement();
            query = "update kategori set nama_kategori='"+NamaKategori+"' "
                    + " where id_kategori = '"+IDKategori+"' ";
            stmt.execute(query);
            
            stmt.close();
            connect.close();
        }catch(SQLException ex){
            System.out.println("Error : " + ex.getMessage());
        }
    }
//search    
    public static String [][] CariObatHasilTransaksi(String kataKunci){
        Connection connect = Koneksi.koneksiDatabase();
        String data[][] = null;
        try{
            stmt = connect.createStatement();
            query = "SELECT*from kategori where `nama_kategori` LIKE '%"+kataKunci+"%'"; 
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
    
    //edit data
        public static String getDataKategori(String IDKategori){
       Connection connect = Koneksi.koneksiDatabase();
       String data = null;
       try{
           stmt = connect.createStatement();
           query = "SELECT nama_kategori FROM kategori "
                   + "where id_kategori= '"+IDKategori+"'";
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
    
}
