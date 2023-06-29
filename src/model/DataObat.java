package model;
import java.sql.*;


public class DataObat {
    private static String query;
    private static ResultSet rs;
    private static Statement stmt;
    private static ResultSet rs_c;
    private static Statement stmt_c;
    private static int IDObat;
    private static int jumBaris;
    
    //untuk tabel
    public static String [][] getObat(){
        Connection connect = Koneksi.koneksiDatabase();
        String data [][] = null;
        try{
            stmt = connect.createStatement();
            query = "select o.id_obat, k.nama_kategori, s.nama_suplier, o.nama_obat, o.harga  "
                    + " from obat o inner join kategori k on o.id_kategori=k.id_kategori" 
                    + " inner join suplier s on o.id_suplier=s.id_suplier order by id_obat";
            rs = stmt.executeQuery(query);
            ResultSetMetaData meta = rs.getMetaData();
            int jmlKolom = meta.getColumnCount();
            data = new String[1000][jmlKolom];
            int r = 0;
            while(rs.next()){
                for(int c=0; c<jmlKolom; c++){
                    data [r][c] = rs.getString(c+1);
                }
                r++;
            }
            int jmlBaris = r;
            String [][] tmparray = data;
            data = new String [jmlBaris][jmlKolom];
            for(r=0; r<jmlBaris; r++){
                for(int c=0; c<jmlKolom; c++){
                    data[r][c] = tmparray[r][c];
                }
            }
            stmt.close();
            connect.close();
        }catch(SQLException ex){
            System.out.println("Error : " + ex.getMessage());
        }
        return data;
    }
    
    //get obat based on id for edit 
    public static String [][] getDataObat(String IDObat){
        Connection connect = Koneksi.koneksiDatabase();
        String data [][] = null;
        try{
            stmt = connect.createStatement();
            query = "select k.id_kategori, k.nama_kategori, s.id_suplier, s.nama_suplier, o.nama_obat, o.harga  "
                    + " from obat o inner join kategori k on o.id_kategori=k.id_kategori" 
                    + " inner join suplier s on o.id_suplier=s.id_suplier"
                    + " where o.id_obat = '"+IDObat+"'";
            rs = stmt.executeQuery(query);
            ResultSetMetaData meta = rs.getMetaData();
            int jmlKolom = meta.getColumnCount();
            data = new String[1000][jmlKolom];
            int r = 0;
            while(rs.next()){
                for(int c=0; c<jmlKolom; c++){
                    data [r][c] = rs.getString(c+1);
                }
                r++;
            }
            int jmlBaris = r;
            String [][] tmparray = data;
            data = new String [jmlBaris][jmlKolom];
            for(r=0; r<jmlBaris; r++){
                for(int c=0; c<jmlKolom; c++){
                    data[r][c] = tmparray[r][c];
                }
            }
            stmt.close();
            connect.close();
        }catch(SQLException ex){
            System.out.println("Error : " + ex.getMessage());
        }
        return data;
    }
    
    // insert data
    public static int InsertObat(String IDObat, String IDKategori, String IDSuplier, String Nama, String Harga){
        jumBaris = 0;
        Connection connect = Koneksi.koneksiDatabase();
        try{
            stmt = connect.createStatement();
            query = "INSERT INTO `obat` (`id_obat`, `id_kategori`, `id_suplier`, `nama_obat`, `harga`)"
                    + " VALUES ('"+IDObat+"', '"+IDKategori+"', '"+IDSuplier+"', '"+Nama+"', '"+Harga+"')";
            stmt.executeUpdate(query);
            stmt_c = connect.createStatement();
            rs_c = stmt_c.executeQuery("SELECT COUNT(*) FROM `obat`");
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

//    // edit
    public static void editObat(String IDObat, String Kategori, String IDKategori, String Suplier, String IDSuplier, String NamaObat, String Harga){
        Connection connect = Koneksi.koneksiDatabase();
        try{
            stmt = connect.createStatement();
            query = "update obat set `id_kategori` = '"+IDKategori+"',"
                    + " id_suplier = '"+IDSuplier+"',"
                    + " `nama_obat` = '"+NamaObat+"',"
                    + " `harga` = '"+Harga+"'"
                    + " where `id_obat` = '"+IDObat+"'";
            stmt.executeUpdate(query);
            stmt.close();
            connect.close();
        }catch(SQLException ex){
            System.out.println("Error : " + ex.getMessage());
        }
    }
    
    // delete
    public static void DeleteObat(String IDObat){
        Connection connect = Koneksi.koneksiDatabase();
        try{
            stmt = connect.createStatement();
            query = "DELETE FROM obat WHERE `id_obat` = '"+IDObat+"'";
            stmt.executeUpdate(query);
            stmt.close();
            connect.close();
        }catch(SQLException ex){
            System.err.println("Eror : " + ex.getMessage());
        }
    }
    
    // cari
    public static String [][] CariObat(String kataKunci){
        Connection connect = Koneksi.koneksiDatabase();
        String data[][] = null;
        try{
            stmt = connect.createStatement();
            query = "select o.id_obat, k.nama_kategori, s.nama_suplier, o.nama_obat, o.harga "
                    + " from obat o inner join kategori k on o.id_kategori=k.id_kategori " 
                    + " inner join suplier s on o.id_suplier=s.id_suplier "
                    + "  where o.nama_obat LIKE '%"+kataKunci+"%' "
                    + " order by o.id_obat, o.nama_obat";
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
    
    // combo box
    public static String [] getListObat(){
        String data[] = null;
        Connection connect = Koneksi.koneksiDatabase();
        try{
            stmt = connect.createStatement();
            query = "SELECT id_obat, nama_obat, harga "
                    + "  FROM obat order by id_obat";
            rs = stmt.executeQuery(query);
            ResultSetMetaData meta = rs.getMetaData();
            int jmlKolom = meta.getColumnCount();
            data = new String[1000];
            int r = 0;
            while(rs.next()){
                String id = rs.getString(1);
                String nama = rs.getString(2);
                String harga = rs.getString(3);
                String list = id+"-"+nama+"-"+harga;
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
    
//    public static void setKodeObat(int ID_Obat){
//        DataObat.IDObat = ID_Obat;
//    }
//    public static int getIDObat(){
//        return IDObat;
//    }
//    
//    //harga
//    public static String[][] getHarga(int ID_Obat) {
//       Connection connect = Koneksi.koneksiDatabase();
//       String data[][] = null;
//       try{
//           stmt = connect.createStatement();
//           //AMBIL DATA
//           query = "SELECT harga FROM obat WHERE id_obat = '"+ID_Obat+"'";
//           rs = stmt.executeQuery(query);
//           ResultSetMetaData meta = rs.getMetaData();
//           int jmlKolom = meta.getColumnCount();
//           data = new String[1000][jmlKolom];
//           int r = 0;
//           while(rs.next()){
//               for(int c=0; c<jmlKolom; c++){
//                   data[r][c] = rs.getString(c+1);
//               }
//               r++;
//           }
//           int jmlBaris = r;
//           String [][] tmparray = data;
//           data = new String[jmlBaris][jmlKolom];
//           for(r=0; r<jmlBaris; r++){
//               for(int c=0; c<jmlKolom; c++){
//                   data[r][c] = tmparray[r][c];
//               }
//           }
//           stmt.close();
//           connect.close();
//       }catch (SQLException ex){
//           System.out.println("Error : " + ex.getMessage());
//       }
//       return data;
//    }
}
