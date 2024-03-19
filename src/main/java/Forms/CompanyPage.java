package Forms;

import com.mycompany.mainpage.MainPage;
import User.Company;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CompanyPage extends javax.swing.JFrame {

    ArrayList<Company> şirketler = Company.şirketler;

    public CompanyPage() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        şirketGirişLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kullanıcı_adı_tf = new javax.swing.JTextField();
        parola_tf = new javax.swing.JPasswordField();
        geriButon = new javax.swing.JButton();
        GirişYapButon = new javax.swing.JButton();
        sifreyiGosterButonu = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MishaTicket - Firma Giriş Paneli");

        jPanel1.setBackground(new java.awt.Color(223, 130, 108));

        şirketGirişLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        şirketGirişLabel.setForeground(new java.awt.Color(255, 255, 255));
        şirketGirişLabel.setText("Firma Girişi");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(şirketGirişLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(şirketGirişLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(250, 238, 209));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Kullanıcı Adı:");

        jLabel2.setText("Parola:");

        geriButon.setText("Geri");
        geriButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriButonActionPerformed(evt);
            }
        });

        GirişYapButon.setText("Giriş Yap");
        GirişYapButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GirişYapButonActionPerformed(evt);
            }
        });

        sifreyiGosterButonu.setText("Şifreyi Göster");
        sifreyiGosterButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifreyiGosterButonuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(parola_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sifreyiGosterButonu))
                            .addComponent(kullanıcı_adı_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(geriButon, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(GirişYapButon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kullanıcı_adı_tf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(parola_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sifreyiGosterButonu))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(geriButon, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GirişYapButon, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void geriButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriButonActionPerformed
        MainPage mainPage = new MainPage();
        this.setVisible(false);
        mainPage.setVisible(true);
    }//GEN-LAST:event_geriButonActionPerformed

    private void GirişYapButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GirişYapButonActionPerformed

        String girilenSirketKullaniciAdi = kullanıcı_adı_tf.getText();
        String girilenSirketSifre = new String(parola_tf.getPassword());

        for (Company company : şirketler) {
            if (company.getUsername().equals(girilenSirketKullaniciAdi) && company.getPassword().equals(girilenSirketSifre)) {
                JOptionPane.showMessageDialog(this, "Hoşgeldiniz, " + girilenSirketKullaniciAdi);
                CompanyFunctions companyFunctions = new CompanyFunctions(company);

                this.setVisible(false);
                companyFunctions.setCurrentCompany(company);
                companyFunctions.setVisible(true);

                return;
            }

        }
        JOptionPane.showMessageDialog(this, "Böyle bir kullanıcı bulunmamaktadır.");


    }//GEN-LAST:event_GirişYapButonActionPerformed

    private void sifreyiGosterButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifreyiGosterButonuActionPerformed
        if (sifreyiGosterButonu.isSelected()) {
            parola_tf.setEchoChar((char) 0);
        } else {
            parola_tf.setEchoChar('*');
        }
    }//GEN-LAST:event_sifreyiGosterButonuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GirişYapButon;
    private javax.swing.JButton geriButon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField kullanıcı_adı_tf;
    private javax.swing.JPasswordField parola_tf;
    private javax.swing.JCheckBox sifreyiGosterButonu;
    private javax.swing.JLabel şirketGirişLabel;
    // End of variables declaration//GEN-END:variables
}
