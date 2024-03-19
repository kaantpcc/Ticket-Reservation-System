package Forms;

import Person.Passenger;
import User.Customer;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MusteriBilgileri extends javax.swing.JFrame {

    private int rezerveEdilenYolcuSayısı = Passenger.getYolcuSayisi();
    private int toplamYolcuSayisi;
    ArrayList<Passenger> yolcular = Passenger.yolcular;

    public MusteriBilgileri() {
        initComponents();

        yolcuSayisiLabel.setText((rezerveEdilenYolcuSayısı + 1) + ".yolcu bilgilerini girin.");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        baslikLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        isim_tf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        soyisim_tf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        kimlikNo_tf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        dogumTarihi_tf = new javax.swing.JTextField();
        yolcuSayisiLabel = new javax.swing.JLabel();
        odemeYapButon = new javax.swing.JButton();
        geriButon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MishaTicket - Müşteri Bilgileri Paneli");

        jPanel1.setBackground(new java.awt.Color(67, 85, 133));

        baslikLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        baslikLabel.setForeground(new java.awt.Color(255, 255, 255));
        baslikLabel.setText("Yolcu Bilgileri");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(baslikLabel)
                .addContainerGap(176, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(baslikLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(246, 244, 235));

        jLabel1.setText("Adı");

        jLabel3.setText("Soyadı");

        jLabel4.setText("TC Kimlik No");

        jLabel6.setText("Doğum Tarihi");

        dogumTarihi_tf.setForeground(new java.awt.Color(204, 204, 204));
        dogumTarihi_tf.setText("gun/ay/yıl");
        dogumTarihi_tf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dogumTarihi_tfMouseClicked(evt);
            }
        });

        yolcuSayisiLabel.setText("1.yolcu bilgilerini girin.");

        odemeYapButon.setText("Ödeme Yap");
        odemeYapButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odemeYapButonActionPerformed(evt);
            }
        });

        geriButon.setText("Geri");
        geriButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriButonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(isim_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(soyisim_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(124, 124, 124))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(yolcuSayisiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(geriButon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(odemeYapButon, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(kimlikNo_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(dogumTarihi_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(83, 83, 83))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(yolcuSayisiLabel)
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isim_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soyisim_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kimlikNo_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dogumTarihi_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(odemeYapButon)
                    .addComponent(geriButon))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void dogumTarihi_tfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dogumTarihi_tfMouseClicked
        dogumTarihi_tf.setText("");
        dogumTarihi_tf.setForeground(Color.BLACK);
    }//GEN-LAST:event_dogumTarihi_tfMouseClicked

    private void geriButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriButonActionPerformed
        BiletSec biletSec = new BiletSec();
        biletSec.setVisible(true);
    }//GEN-LAST:event_geriButonActionPerformed

    private void odemeYapButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odemeYapButonActionPerformed
        String isim = isim_tf.getText();
        String soyisim = soyisim_tf.getText();
        String kimlikNo = kimlikNo_tf.getText();
        String dogumTarih = dogumTarihi_tf.getText();
        if (isim.equals("") || soyisim.equals("") || dogumTarih.equals("") || kimlikNo.equals("")) {
            JOptionPane.showMessageDialog(this, "Yolcu bilgileri boş bırakılamaz.");
        } else {

            Passenger passenger = new Passenger(isim, soyisim, kimlikNo, dogumTarih);
            yolcular.add(passenger);

            rezerveEdilenYolcuSayısı = Passenger.getYolcuSayisi();

            Customer customer = new Customer();

            toplamYolcuSayisi = Integer.parseInt(customer.getYolcuSayisi());

            if (rezerveEdilenYolcuSayısı != toplamYolcuSayisi) {
                this.setVisible(false);

            } else {
                this.setVisible(false);
                YapilanRezervasyonBilgileri yapılanRezervasyonBilgileri = new YapilanRezervasyonBilgileri();
                yapılanRezervasyonBilgileri.setVisible(true);

            }

        }


    }//GEN-LAST:event_odemeYapButonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel baslikLabel;
    private javax.swing.JTextField dogumTarihi_tf;
    private javax.swing.JButton geriButon;
    private javax.swing.JTextField isim_tf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField kimlikNo_tf;
    private javax.swing.JButton odemeYapButon;
    private javax.swing.JTextField soyisim_tf;
    private javax.swing.JLabel yolcuSayisiLabel;
    // End of variables declaration//GEN-END:variables
}
