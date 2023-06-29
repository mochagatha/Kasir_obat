package model;
import java.sql.*;

/**
 *
 * @author sabina
 */
public class DataSuplier {
        private static String query;
    private static ResultSet rs;
    private static Statement stmt;
    private static ResultSet rs_c;
    private static Statement stmt_c;
    private static int jumBaris;
    
    // untuk tabel
    public static String [][] getSuplier(){
       Connection connect = Koneksi.koneksiDatabase();
       String data[][] = null;
       try{
           stmt = connect.createStatement();
           query = "SELECT `id_suplier`, `nama_suplier`, alamat, no_telp" 
                   + " from `suplier` " 
                   + " order by `id_suplier`";
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
    public static String [] getListSuplier(){
        String data[] = null;
        Connection connect = Koneksi.koneksiDatabase();
        try{
            stmt = connect.createStatement();
            query = "SELECT id_suplier, nama_suplier"
                    + "  FROM suplier order by id_suplier";
            rs = stmt.executeQuery(query);
            ResultSetMetaData meta = rs.getMetaData();
            int jmlKolom = meta.getColumnCount();
            data = new String[1000];
            int r = 0;
            while(rs.next()){
                String id = rs.getString(1);
                String nama = rs.getString(2);
                String list = id +" - "+nama;
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
    
    //Hapus data
            public static void HapusData (String IDsuplier){
        Connection connect = Koneksi.koneksiDatabase();
        try{
            stmt = connect.createStatement();
            query = "DELETE FROM `suplier` WHERE `suplier`.`id_suplier` = '"+IDsuplier+"'";
            stmt.executeUpdate(query);
            
            stmt.close();
            connect.close();
        }catch(SQLException ex){
            System.err.println("Eror : " + ex.getMessage());
        }
    }
            
    //tambah data
    public static int TambahDataSuplier(String id, String nama, String alamat, String notelepon){
        jumBaris = 0;
        Connection connect = Koneksi.koneksiDatabase();
        try{
            stmt = connect.createStatement();
            query = "insert into suplier "
                    + "(id_suplier, nama_suplier, alamat, no_telp) "
                    + " values ('"+id+"','"+nama+"', '"+alamat+"', '"+notelepon+"')";
            stmt.executeUpdate(query);
            stmt_c = connect.createStatement();
            rs_c = stmt_c.executeQuery("SELECT COUNT(*) FROM `suplier`");
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
    
    //update data
        public static void UpdateDataSuplier(String IDSuplier, String nama, String alamat, String notelepon){
        Connection connect = Koneksi.koneksiDatabase();
        try{
            stmt = connect.createStatement();
            query = "UPDATE `suplier` SET `nama_suplier` = '"+nama+"', `alamat` = '"+alamat+"', `no_telp` = '"+notelepon+"' "
                    + "WHERE `suplier`.`id_suplier` = '"+IDSuplier+"'";
            stmt.execute(query);
            
            stmt.close();
            connect.close();
        }catch(SQLException ex){
            System.out.println("Error : " + ex.getMessage());
        }
    }
        
    //cari data
        public static String [][] Caridatasuplier(String kataKunci){
        Connection connect = Koneksi.koneksiDatabase();
        String data[][] = null;
        try{
            stmt = connect.createStatement();
            query = "SELECT*from suplier where `nama_suplier` LIKE '%"+kataKunci+"%'"; 
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
       public static String EditNama(String IDSuplier){
       Connection connect = Koneksi.koneksiDatabase();
       String data = null;
       try{
           stmt = connect.createStatement();
           query = "SELECT nama_suplier FROM suplier "
                   + "where id_suplier= '"+IDSuplier+"'";
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
       public static String EditAlamat(String IDSuplier){
       Connection connect = Koneksi.koneksiDatabase();
       String data = null;
       try{
           stmt = connect.createStatement();
           query = "SELECT alamat FROM suplier "
                   + "where id_suplier= '"+IDSuplier+"'";
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
        public static String EditNoTelp(String IDSuplier){
       Connection connect = Koneksi.koneksiDatabase();
       String data = null;
       try{
           stmt = connect.createStatement();
           query = "SELECT no_telp FROM suplier "
                   + "where id_suplier= '"+IDSuplier+"'";
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
