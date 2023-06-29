package view;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.*;

/**
 *
 * 
 */
public class Transaksi extends javax.swing.JFrame {

    public static int IdObat;
    DefaultComboBoxModel mdl = new DefaultComboBoxModel();
    /**
     * Creates new form DataTransaksi
     */
    int baris = 0;
    static Object kolom[] = {"No","ID Transaksi","Nama Obat", "Harga Obat", "Jumlah Beli", "Total Harga"};
    DefaultTableModel tbl = new DefaultTableModel(kolom, baris);
    
    public Transaksi() {
        initComponents();
        
        String [][] data1 = DataTransaksi.setTotalBiayaTransaksi();
        TotalPenjualan.setText(data1[0][0]);
        
        String [][] data2 = DataTransaksi.setRataBiayaTransaksi();
        Ratajual.setText(data2[0][0]);
        
        TTotalHarga.setEditable(false);
        TKembali.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CNamaBarang = new javax.swing.JComboBox<>();
        BReset = new javax.swing.JButton();
        BHapus = new javax.swing.JButton();
        BHitungKembalian = new javax.swing.JButton();
        BTotal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TJumlahObat = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelTransaksi = new javax.swing.JTable();
        TTotalHarga = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        BEdit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        TKembali = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TIDTansaksi = new javax.swing.JTextField();
        TCari = new javax.swing.JTextField();
        BCari = new javax.swing.JButton();
        TotalPenjualan = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        BSimpan = new javax.swing.JButton();
        BTambah = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        Ratajual = new javax.swing.JLabel();
        TBayar = new javax.swing.JTextField();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 30)); // NOI18N
        jLabel4.setText("TRANSAKSI OBAT");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, 54));

        jLabel2.setText("PILIH OBAT");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        CNamaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNamaBarangActionPerformed(evt);
            }
        });
        getContentPane().add(CNamaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 250, -1));

        BReset.setText("RESET");
        BReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BResetActionPerformed(evt);
            }
        });
        getContentPane().add(BReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 90, -1));

        BHapus.setText("HAPUS");
        BHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHapusActionPerformed(evt);
            }
        });
        getContentPane().add(BHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, 80, -1));

        BHitungKembalian.setText("HITUNG KEMBALIAN");
        BHitungKembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHitungKembalianActionPerformed(evt);
            }
        });
        getContentPane().add(BHitungKembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 150, -1));

        BTotal.setText("TOTAL");
        BTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTotalActionPerformed(evt);
            }
        });
        getContentPane().add(BTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        jLabel1.setText("JUMLAH OBAT");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        TJumlahObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TJumlahObatActionPerformed(evt);
            }
        });
        getContentPane().add(TJumlahObat, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 250, -1));

        TabelTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TabelTransaksi);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 520, 150));

        TTotalHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TTotalHargaActionPerformed(evt);
            }
        });
        getContentPane().add(TTotalHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 250, -1));

        jLabel5.setText("TOTAL HARGA");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        BEdit.setText("EDIT");
        BEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEditActionPerformed(evt);
            }
        });
        getContentPane().add(BEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 80, -1));

        jLabel6.setText("BAYAR");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        TKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TKembaliActionPerformed(evt);
            }
        });
        getContentPane().add(TKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 250, -1));

        jLabel7.setText("ID TRANSAKSI");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        TIDTansaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TIDTansaksiActionPerformed(evt);
            }
        });
        getContentPane().add(TIDTansaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 250, -1));

        TCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TCariActionPerformed(evt);
            }
        });
        getContentPane().add(TCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 194, -1));

        BCari.setText("CARI");
        BCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCariActionPerformed(evt);
            }
        });
        getContentPane().add(BCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, -1, -1));

        TotalPenjualan.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        TotalPenjualan.setText("xyz");
        getContentPane().add(TotalPenjualan, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 360, 163, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel9.setText("Total Penjualan");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, -1, -1));

        BSimpan.setText("SIMPAN");
        BSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(BSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 80, -1));

        BTambah.setText("TAMBAH");
        BTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTambahActionPerformed(evt);
            }
        });
        getContentPane().add(BTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 90, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel10.setText("Rata-Rata Penjualan");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 400, -1, -1));

        Ratajual.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        Ratajual.setText("xyz");
        getContentPane().add(Ratajual, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 400, 163, -1));

        TBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBayarActionPerformed(evt);
            }
        });
        getContentPane().add(TBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 250, -1));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pict/GRAINY Gradient.jpg"))); // NOI18N
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CNamaBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNamaBarangActionPerformed

    }//GEN-LAST:event_CNamaBarangActionPerformed

    private void BResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BResetActionPerformed
        TJumlahObat.setText("");
        TTotalHarga.setText("");
        TBayar.setText("");
        TKembali.setText("");
        TIDTansaksi.setEditable(true);
        TIDTansaksi.setText("");
    }//GEN-LAST:event_BResetActionPerformed

    private void BHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHapusActionPerformed
        int Pilihbaris = TabelTransaksi.getSelectedRow();
        String IDTransaksi = tbl.getValueAt(Pilihbaris, 1).toString();
        
        DataTransaksi.DeleteTransaksi(IDTransaksi);
        tbl.removeRow(Pilihbaris);
        JOptionPane.showMessageDialog(this, "Data berhasil dihapus",
                "Pesan Konfirmasi", JOptionPane.INFORMATION_MESSAGE);
        
        String [][] data1 = DataTransaksi.setTotalBiayaTransaksi();
        TotalPenjualan.setText(data1[0][0]);
        
        String [][] data2 = DataTransaksi.setRataBiayaTransaksi();
        Ratajual.setText(data2[0][0]);
    }//GEN-LAST:event_BHapusActionPerformed

    private void BHitungKembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHitungKembalianActionPerformed
        String Bayar = TBayar.getText();
        
        if(Bayar.isEmpty()){
            JOptionPane.showMessageDialog(this, "Silakan lakukan pembayaran",
                "Pesan Kesalahan", JOptionPane.INFORMATION_MESSAGE); 
        }else{
        int  DJumlah, Kembalian, IBayar, DTotal;

        DJumlah = Integer.parseInt(TJumlahObat.getText());
        DTotal = Integer.parseInt(TTotalHarga.getText());
        IBayar = Integer.parseInt(TBayar.getText());
        
        Kembalian = IBayar - DTotal;
        TKembali.setText(String.valueOf(Kembalian));   
        }
    }//GEN-LAST:event_BHitungKembalianActionPerformed
    
    private void BTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTotalActionPerformed
        String Obat = CNamaBarang.getSelectedItem().toString();
        String[] pisahObat = Obat.split("-");
        String IDObat = pisahObat[0];
        String NamaObat = pisahObat[1];
        String Harga = pisahObat[2];
       
        String IDTransaksi = TIDTansaksi.getText();
        String JumlahObat = TJumlahObat.getText(); 
        
        if(IDTransaksi.isEmpty()){
            JOptionPane.showMessageDialog(this, "ID Transaksi harus diisi",
                "Pesan Kesalahan", JOptionPane.INFORMATION_MESSAGE);
        }else if(JumlahObat.isEmpty()){
            JOptionPane.showMessageDialog(this, "Jumlah Obat harus diisi",
                "Pesan Kesalahan", JOptionPane.INFORMATION_MESSAGE);
        }else{
        int Jumlah,TotalHarga;
        
        int IHarga=Integer.parseInt(Harga);
        Jumlah=Integer.parseInt(TJumlahObat.getText());
        TotalHarga=IHarga*Jumlah;
        TTotalHarga.setText(String.valueOf(TotalHarga));
        }
        
    }//GEN-LAST:event_BTotalActionPerformed

    private void TJumlahObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TJumlahObatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TJumlahObatActionPerformed

    private void TTotalHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TTotalHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TTotalHargaActionPerformed

    private void BEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEditActionPerformed
        int Pilihbaris = TabelTransaksi.getSelectedRow();
        String IDTransaksi = tbl.getValueAt(Pilihbaris, 1).toString();
        
        String [][] data = DataTransaksi.getDataTransaksi(IDTransaksi);
        String IDObat = data[0][0];
        String NamaObat = data[0][1];
        String HargaObat = data[0][2];
        String Jumlah = data[0][3];
        String Total = data[0][4];
        
        TKembali.setText("");
        CNamaBarang.setSelectedItem(IDObat+"-"+NamaObat+"-"+HargaObat);
        TIDTansaksi.setText(IDTransaksi);
        TIDTansaksi.setEditable(false);
        TJumlahObat.setText(Jumlah);
        TTotalHarga.setText(Total);
    }//GEN-LAST:event_BEditActionPerformed

    private void TKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TKembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TKembaliActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        String [] NamaObat = DataObat.getListObat();
        for(int i=0; i<NamaObat.length; i++){
           mdl.addElement(NamaObat[i]);
        }
        CNamaBarang.setModel(mdl);
        
        //tabel
        String [][] data = DataTransaksi.getTransaksi();
        for(int i=0; i<data.length; i++){
            int no = i+1;
            tbl.addRow(new Object []{no, data[i][0], data[i][1], data[i][2], data[i][3], data[i][4]});
        }
        TabelTransaksi.setModel(tbl);                
    }//GEN-LAST:event_formComponentShown

    private void TIDTansaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TIDTansaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TIDTansaksiActionPerformed

    private void TCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TCariActionPerformed

    private void BCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCariActionPerformed
        String kataKunci = TCari.getText();
        tbl.getDataVector().removeAllElements();

        String [][] data = DataTransaksi.Search(kataKunci);
        for (int i=0; i<data.length; i++){
            int no = i + 1;
            tbl.addRow(new Object[] {no, data[i][0], data[i][1], data[i][2], data[i][3], data[i][4]});
        }
        TabelTransaksi.setModel(tbl);
        TCari.setText("");
    }//GEN-LAST:event_BCariActionPerformed

    private void BSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSimpanActionPerformed
        String IDTransaksi = TIDTansaksi.getText();
        String Obat = CNamaBarang.getSelectedItem().toString();
        String Total = TTotalHarga.getText();
        
         
        String[] pisahObat = Obat.split("-");
        String IDObat = pisahObat[0];
        String NamaObat = pisahObat[1];
        String Harga = pisahObat[2];
        
        String Jumlah = TJumlahObat.getText();
       
        DataTransaksi.editTransaksi(IDTransaksi, Obat, IDObat, Jumlah, Total);
        tbl.getDataVector().removeAllElements();
        
        //GET DATA TABLE
        String [][] data = DataTransaksi.getTransaksi();
        for(int i=0; i<data.length; i++){
            int no = i+1;
            tbl.addRow(new Object []{no, data[i][0], data[i][1], data[i][2], data[i][3], data[i][4]});
        }
        TabelTransaksi.setModel(tbl);

        
        String [][] data1 = DataTransaksi.setTotalBiayaTransaksi();
        TotalPenjualan.setText(data1[0][0]);
        
        String [][] data2 = DataTransaksi.setRataBiayaTransaksi();
        Ratajual.setText(data2[0][0]);
        
        
        JOptionPane.showMessageDialog(this, "Data berhasil diedit",
                "Pesan Konfirmasi", JOptionPane.INFORMATION_MESSAGE);
               
        
        TIDTansaksi.setEditable(true);
        TIDTansaksi.setText("");
        TJumlahObat.setText("");
        TTotalHarga.setText("");
        TBayar.setText("");
        TKembali.setText("");
    }//GEN-LAST:event_BSimpanActionPerformed

    private void BTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTambahActionPerformed
        String Obat = CNamaBarang.getSelectedItem().toString();
        String[] pisahObat = Obat.split("-");
        String IDObat = pisahObat[0];
        String NamaObat = pisahObat[1];
        String Harga = pisahObat[2];
        
        String IDTransaksi = TIDTansaksi.getText();
        
        String Jumlah = TJumlahObat.getText();
        
        String Total = TTotalHarga.getText();
        
        String Bayar = TBayar.getText();
        
        String Kembali = TKembali.getText();
         
        if(IDTransaksi.isEmpty()){
            JOptionPane.showMessageDialog(this, "ID Transaksi harus diisi",
                "Pesan Kesalahan", JOptionPane.INFORMATION_MESSAGE);
        }else if(Jumlah.isEmpty()){
            JOptionPane.showMessageDialog(this, "Jumlah Obat harus diisi",
                "Pesan Kesalahan", JOptionPane.INFORMATION_MESSAGE);
        }else if(Total.isEmpty()){
            JOptionPane.showMessageDialog(this, "Tekan Button 'TOTAL' Agar Mendapat Total Harga",
                "Pesan Kesalahan", JOptionPane.INFORMATION_MESSAGE);
        }else if(Bayar.isEmpty()){
            JOptionPane.showMessageDialog(this, "Masukkan nominal bayar",
                "Pesan Kesalahan", JOptionPane.INFORMATION_MESSAGE);
        }else if(Kembali.isEmpty()){
            JOptionPane.showMessageDialog(this, "Hitung kembalian dahulu",
                "Pesan Kesalahan", JOptionPane.INFORMATION_MESSAGE); 
        }else{
        int No = DataTransaksi.InsertTransaksi(IDTransaksi, IDObat, Jumlah, Total);
        
        tbl.addRow(new Object[] {No, IDTransaksi, NamaObat, Harga, Jumlah, Total});
        TabelTransaksi.setModel(tbl);

        String [][] data1 = DataTransaksi.setTotalBiayaTransaksi();
        TotalPenjualan.setText(data1[0][0]);
        
        String [][] data2 = DataTransaksi.setRataBiayaTransaksi();
        Ratajual.setText(data2[0][0]);

        
        JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan",
                "Pesan Konfirmasi", JOptionPane.INFORMATION_MESSAGE);

        
        CNamaBarang.setSelectedItem(" ");
        TIDTansaksi.setEditable(true);
        TIDTansaksi.setText("");
        TJumlahObat.setText("");
        TTotalHarga.setText("");
        TBayar.setText("");
        TKembali.setText("");
        }
    }//GEN-LAST:event_BTambahActionPerformed

    private void TBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TBayarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DataTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCari;
    private javax.swing.JButton BEdit;
    private javax.swing.JLabel BG;
    private javax.swing.JButton BHapus;
    private javax.swing.JButton BHitungKembalian;
    private javax.swing.JButton BReset;
    private javax.swing.JButton BSimpan;
    private javax.swing.JButton BTambah;
    private javax.swing.JButton BTotal;
    private javax.swing.JComboBox<String> CNamaBarang;
    private javax.swing.JLabel Ratajual;
    private javax.swing.JTextField TBayar;
    private javax.swing.JTextField TCari;
    private javax.swing.JTextField TIDTansaksi;
    private javax.swing.JTextField TJumlahObat;
    private javax.swing.JTextField TKembali;
    private javax.swing.JTextField TTotalHarga;
    private javax.swing.JTable TabelTransaksi;
    private javax.swing.JLabel TotalPenjualan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
