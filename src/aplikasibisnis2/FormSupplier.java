/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasibisnis2;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sigit
 */
public class FormSupplier extends javax.swing.JDialog {

    private ArrayList<ClassSupplier> listSupplier = new ArrayList<ClassSupplier>();
    private DefaultTableModel tModel;/**
     * Creates new form FormSupplier
     */
    public FormSupplier(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(this);
        tampilan();
    }
    private void isiData()
    {
        ClassSupplier sup = new ClassSupplier();
        sup.setKode(textkode.getText());
        sup.setNama(textnama.getText());
        sup.setAlamat(textalamat.getText());
        sup.setTelepon(texttelepon.getText());
        sup.setNamaKontak(textnomer.getText());
        listSupplier.add(sup);
    }
    
    private void resetForm()
    {
        textkode.setText("");
        textnama.setText("");
        textalamat.setText("");
        texttelepon.setText("");
        textnomer.setText("");
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textkode = new javax.swing.JTextField();
        textnama = new javax.swing.JTextField();
        texttelepon = new javax.swing.JTextField();
        textalamat = new javax.swing.JTextField();
        textnomer = new javax.swing.JTextField();
        BtnSIMPAN = new javax.swing.JButton();
        BtnBATAL = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelSup = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Leelawadee", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FORM SUPPLIER");

        jLabel2.setText("Kode :");

        jLabel3.setText("Nama :");

        jLabel4.setText("Alamat :");

        jLabel5.setText("Telepon :");

        jLabel6.setText("Nomer Kontak :");

        textkode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textkodeActionPerformed(evt);
            }
        });

        textnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textnamaActionPerformed(evt);
            }
        });

        texttelepon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textteleponActionPerformed(evt);
            }
        });

        textalamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textalamatActionPerformed(evt);
            }
        });

        BtnSIMPAN.setText("Simpan");

        BtnBATAL.setText("Batal");
        BtnBATAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBATALActionPerformed(evt);
            }
        });

        TabelSup.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TabelSup);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textnama)
                            .addComponent(textkode)
                            .addComponent(textalamat)
                            .addComponent(texttelepon)
                            .addComponent(textnomer)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnSIMPAN)
                        .addGap(18, 18, 18)
                        .addComponent(BtnBATAL))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textkode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(textnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(textalamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(texttelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textnomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSIMPAN)
                    .addComponent(BtnBATAL))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textnamaActionPerformed

    private void textalamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textalamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textalamatActionPerformed

    private void textteleponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textteleponActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textteleponActionPerformed

    private void BtnBATALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBATALActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnBATALActionPerformed

    private void textkodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textkodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textkodeActionPerformed

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
            java.util.logging.Logger.getLogger(FormSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormSupplier dialog = new FormSupplier(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBATAL;
    private javax.swing.JButton BtnSIMPAN;
    private javax.swing.JTable TabelSup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField textalamat;
    private javax.swing.JTextField textkode;
    private javax.swing.JTextField textnama;
    private javax.swing.JTextField textnomer;
    private javax.swing.JTextField texttelepon;
    // End of variables declaration//GEN-END:variables

    private void tampilan() {
    String[] kolom = {"Kode","Nama","Alamat","Telepon","Nama Kontak"};
        Object[][] o = new Object[listSupplier.size()][5];
        int i = 0;
        for(ClassSupplier n : listSupplier)
        {
            String[] arr = {n.getKode(),n.getNama(),n.getAlamat(),n.getTelepon(),n.getNamaKontak()};
            o[i] = arr;
            i++;
        }
        tModel = new DefaultTableModel(o,kolom);
        TabelSup.setModel(tModel);
    }
}
