package view;
import model.User;
/**
 *
 * 
 */
public class ProfilKelompok extends javax.swing.JFrame {

    /**
     * Creates new form ProfilKelompok
     */
    
    public ProfilKelompok() {
        initComponents();
        String [][] data = User.NamaKelompok();
        Nama1.setText(data[0][0]);
        Nama2.setText(data[1][0]);
        Nama3.setText(data[2][0]);
        Nama4.setText(data[3][0]);
        Nama5.setText(data[4][0]);
   
        Nim1.setText(data[0][1]);
        Nim2.setText(data[1][1]);
        Nim3.setText(data[2][1]);
        Nim4.setText(data[3][1]);
        Nim5.setText(data[4][1]);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Nama2 = new javax.swing.JLabel();
        Nama3 = new javax.swing.JLabel();
        Nama4 = new javax.swing.JLabel();
        Nama1 = new javax.swing.JLabel();
        Nim3 = new javax.swing.JLabel();
        Nim4 = new javax.swing.JLabel();
        Nim1 = new javax.swing.JLabel();
        Nim2 = new javax.swing.JLabel();
        Nama5 = new javax.swing.JLabel();
        Nim5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        frameLogin = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setText("NAMA KELOMPOK");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        Nama2.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        Nama2.setText("Nama");
        getContentPane().add(Nama2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        Nama3.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        Nama3.setText("Nama");
        getContentPane().add(Nama3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        Nama4.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        Nama4.setText("Nama");
        getContentPane().add(Nama4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        Nama1.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        Nama1.setText("Nama");
        getContentPane().add(Nama1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        Nim3.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        Nim3.setText("NIM");
        getContentPane().add(Nim3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));

        Nim4.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        Nim4.setText("NIM");
        getContentPane().add(Nim4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, -1));

        Nim1.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        Nim1.setText("NIM");
        getContentPane().add(Nim1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, -1));

        Nim2.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        Nim2.setText("NIM");
        getContentPane().add(Nim2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, -1));

        Nama5.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        Nama5.setText("Nama");
        getContentPane().add(Nama5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        Nim5.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        Nim5.setText("NIM");
        getContentPane().add(Nim5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pict/blue aura color.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 290));

        jMenu1.setText("Menu");

        frameLogin.setText("Login");
        frameLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frameLoginActionPerformed(evt);
            }
        });
        jMenu1.add(frameLogin);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void frameLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frameLoginActionPerformed
        // TODO add your handling code here:
        Login L = new Login();
        L.setLocationRelativeTo(this);
        L.setVisible(true);
    }//GEN-LAST:event_frameLoginActionPerformed

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
            java.util.logging.Logger.getLogger(ProfilKelompok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfilKelompok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfilKelompok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfilKelompok.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfilKelompok().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Nama1;
    private javax.swing.JLabel Nama2;
    private javax.swing.JLabel Nama3;
    private javax.swing.JLabel Nama4;
    private javax.swing.JLabel Nama5;
    private javax.swing.JLabel Nim1;
    private javax.swing.JLabel Nim2;
    private javax.swing.JLabel Nim3;
    private javax.swing.JLabel Nim4;
    private javax.swing.JLabel Nim5;
    private javax.swing.JMenuItem frameLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
