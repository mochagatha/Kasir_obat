package view;
import model.User;
import javax.swing.JOptionPane;
public class Beranda extends javax.swing.JFrame {

    /**
     * Creates new form User
     */
    int IDUser = User.getIDUser();
    public Beranda() {
        initComponents();
        String [][] data = User.getProfil(IDUser);
        LNama.setText(data[0][0]);
        LEmail.setText(data[0][1]);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LNama = new javax.swing.JLabel();
        LEmail = new javax.swing.JLabel();
        BKeluar = new javax.swing.JButton();
        BG = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Kategori = new javax.swing.JMenu();
        MenuItemKategori = new javax.swing.JMenuItem();
        MenuItemSuplier = new javax.swing.JMenuItem();
        MenuItemObat = new javax.swing.JMenuItem();
        MenuItemTransaksi = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setText("BERANDA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 46, -1, 37));

        jLabel3.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jLabel3.setText("Nama:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 123, -1, -1));

        jLabel4.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jLabel4.setText("Email:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 152, -1, -1));

        LNama.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        LNama.setText("Nama User");
        getContentPane().add(LNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        LEmail.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        LEmail.setText("Email User");
        getContentPane().add(LEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));

        BKeluar.setText("KELUAR");
        BKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(BKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 240, -1, -1));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pict/Holographic hi-ress backgrounds.png"))); // NOI18N
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 280));

        Kategori.setText("Menu");

        MenuItemKategori.setText("Kategori");
        MenuItemKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemKategoriActionPerformed(evt);
            }
        });
        Kategori.add(MenuItemKategori);

        MenuItemSuplier.setText("Suplier");
        MenuItemSuplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemSuplierActionPerformed(evt);
            }
        });
        Kategori.add(MenuItemSuplier);

        MenuItemObat.setText("Obat");
        MenuItemObat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemObatActionPerformed(evt);
            }
        });
        Kategori.add(MenuItemObat);

        MenuItemTransaksi.setText("Transaksi");
        MenuItemTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemTransaksiActionPerformed(evt);
            }
        });
        Kategori.add(MenuItemTransaksi);

        jMenuBar1.add(Kategori);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BKeluarActionPerformed
        int jawab = JOptionPane.showOptionDialog(this, 
                    "Ingin Keluar?", 
                    "Keluar", 
                    JOptionPane.YES_NO_OPTION, 
                    JOptionPane.QUESTION_MESSAGE, null, null, null);
    
    if(jawab == JOptionPane.YES_OPTION){
        JOptionPane.showMessageDialog(this, "Program Akan Keluar");
        System.exit(0);
    }
    }//GEN-LAST:event_BKeluarActionPerformed

    private void MenuItemKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemKategoriActionPerformed
        Kategori OS = new Kategori();
        OS.setLocationRelativeTo(this);
        OS.setVisible(true);
    }//GEN-LAST:event_MenuItemKategoriActionPerformed

    private void MenuItemSuplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemSuplierActionPerformed
        Suplier OS = new Suplier();
        OS.setLocationRelativeTo(this);
        OS.setVisible(true);
    }//GEN-LAST:event_MenuItemSuplierActionPerformed

    private void MenuItemObatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemObatActionPerformed
        Obat OS = new Obat();
        OS.setLocationRelativeTo(this);
        OS.setVisible(true);
    }//GEN-LAST:event_MenuItemObatActionPerformed

    private void MenuItemTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemTransaksiActionPerformed
        Transaksi OS = new Transaksi();
        OS.setLocationRelativeTo(this);
        OS.setVisible(true);
    }//GEN-LAST:event_MenuItemTransaksiActionPerformed

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
            java.util.logging.Logger.getLogger(Beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Beranda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Beranda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JButton BKeluar;
    private javax.swing.JMenu Kategori;
    private javax.swing.JLabel LEmail;
    private javax.swing.JLabel LNama;
    private javax.swing.JMenuItem MenuItemKategori;
    private javax.swing.JMenuItem MenuItemObat;
    private javax.swing.JMenuItem MenuItemSuplier;
    private javax.swing.JMenuItem MenuItemTransaksi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    // End of variables declaration//GEN-END:variables
}