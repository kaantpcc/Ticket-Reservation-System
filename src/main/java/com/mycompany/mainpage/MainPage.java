package com.mycompany.mainpage;

import Forms.AdminPage;
import Forms.BiletSec;
import Forms.CompanyPage;
import Forms.YapilanRezervasyonBilgileri;

public class MainPage extends javax.swing.JFrame {

    public MainPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        adminGirisiButonu = new javax.swing.JButton();
        firmaGirisiButonu = new javax.swing.JToggleButton();
        biletAraButonu = new javax.swing.JButton();
        biletlerimiSorgulaButonu = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MishaTicket - Ana Sayfa");

        jPanel1.setBackground(new java.awt.Color(129, 143, 180));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 250, 224));
        jLabel1.setText("MishaTicket");

        adminGirisiButonu.setText("Admin Girişi");
        adminGirisiButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminGirisiButonuActionPerformed(evt);
            }
        });

        firmaGirisiButonu.setText("Firma Girişi");
        firmaGirisiButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firmaGirisiButonuActionPerformed(evt);
            }
        });

        biletAraButonu.setText("Bilet Ara");
        biletAraButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biletAraButonuActionPerformed(evt);
            }
        });

        biletlerimiSorgulaButonu.setText("Biletlerimi Sorgula");
        biletlerimiSorgulaButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biletlerimiSorgulaButonuActionPerformed(evt);
            }
        });

        exitButton.setText("Çıkış");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(exitButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(firmaGirisiButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(adminGirisiButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(biletAraButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(biletlerimiSorgulaButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(adminGirisiButonu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(firmaGirisiButonu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(biletAraButonu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(biletlerimiSorgulaButonu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitButton)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminGirisiButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminGirisiButonuActionPerformed
        AdminPage adminPage = new AdminPage();
        setVisible(false); //ana sayfayı görünmez yaptı.
        adminPage.setVisible(true); // admin sayfasını görünür yaptı.
    }//GEN-LAST:event_adminGirisiButonuActionPerformed

    private void firmaGirisiButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firmaGirisiButonuActionPerformed
        CompanyPage companyPage = new CompanyPage();
        this.setVisible(false);
        companyPage.setVisible(true);
    }//GEN-LAST:event_firmaGirisiButonuActionPerformed

    private void biletAraButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biletAraButonuActionPerformed
        BiletSec biletSec = new BiletSec();
        this.setVisible(false);
        biletSec.setVisible(true);
    }//GEN-LAST:event_biletAraButonuActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void biletlerimiSorgulaButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biletlerimiSorgulaButonuActionPerformed
        this.setVisible(false);
        YapilanRezervasyonBilgileri yapilanRezervasyonBilgileri = new YapilanRezervasyonBilgileri();
        yapilanRezervasyonBilgileri.setVisible(true);
    }//GEN-LAST:event_biletlerimiSorgulaButonuActionPerformed

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
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminGirisiButonu;
    private javax.swing.JButton biletAraButonu;
    private javax.swing.JButton biletlerimiSorgulaButonu;
    private javax.swing.JButton exitButton;
    private javax.swing.JToggleButton firmaGirisiButonu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
