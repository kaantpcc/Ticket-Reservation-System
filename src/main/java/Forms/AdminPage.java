package Forms;

import com.mycompany.mainpage.MainPage;
import User.Admin;
import javax.swing.JOptionPane;

public class AdminPage extends javax.swing.JFrame {

    public AdminPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        adminKullaniciAdiField = new javax.swing.JTextField();
        adminSifreField = new javax.swing.JPasswordField();
        girisYapButonu = new javax.swing.JButton();
        geriDonButonu = new javax.swing.JButton();
        sifreyiGoster = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MishaTicket - Admin Giriş Paneli");

        jPanel1.setBackground(new java.awt.Color(146, 169, 189));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 250, 224));
        jLabel1.setText("Kullanıcı Adı : ");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 250, 224));
        jLabel2.setText("Şifre : ");

        adminKullaniciAdiField.setText("admin");

        adminSifreField.setText("admin");

        girisYapButonu.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        girisYapButonu.setText("Giriş Yap");
        girisYapButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girisYapButonuActionPerformed(evt);
            }
        });

        geriDonButonu.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        geriDonButonu.setText("Geri Dön");
        geriDonButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriDonButonuActionPerformed(evt);
            }
        });

        sifreyiGoster.setBackground(new java.awt.Color(255, 255, 255));
        sifreyiGoster.setFont(new java.awt.Font("SansSerif", 0, 10)); // NOI18N
        sifreyiGoster.setText("Şifreyi göster");
        sifreyiGoster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifreyiGosterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminKullaniciAdiField, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(adminSifreField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(geriDonButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(girisYapButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sifreyiGoster)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminKullaniciAdiField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminSifreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sifreyiGoster))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(geriDonButonu)
                    .addComponent(girisYapButonu))
                .addContainerGap(83, Short.MAX_VALUE))
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

    private void geriDonButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriDonButonuActionPerformed
        MainPage mainPage = new MainPage();
        setVisible(false); //adminpage gorunmez yaptı.
        mainPage.setVisible(true); //ana sayfayı gorunur yaptı.
    }//GEN-LAST:event_geriDonButonuActionPerformed

    private void girisYapButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girisYapButonuActionPerformed

        String girilenAdminKullaniciAdi = adminKullaniciAdiField.getText();
        String girilenAdminSifre = new String(adminSifreField.getPassword());

        Admin admin = new Admin(girilenAdminKullaniciAdi, girilenAdminSifre);

        if (admin.login(girilenAdminKullaniciAdi, girilenAdminSifre)) {
            JOptionPane.showMessageDialog(this, "Giriş başarılı, hoş geldiniz ");
            setVisible(false);
            AdminFunctions adminFunctions = new AdminFunctions();
            adminFunctions.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Kullanıcı adı veya şifre yanlış...");
        }
    }//GEN-LAST:event_girisYapButonuActionPerformed


    private void sifreyiGosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifreyiGosterActionPerformed
        if (sifreyiGoster.isSelected()) {
            adminSifreField.setEchoChar((char) 0);
        } else {
            adminSifreField.setEchoChar('*');
        }
    }//GEN-LAST:event_sifreyiGosterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adminKullaniciAdiField;
    private javax.swing.JPasswordField adminSifreField;
    private javax.swing.JButton geriDonButonu;
    private javax.swing.JButton girisYapButonu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox sifreyiGoster;
    // End of variables declaration//GEN-END:variables
}
