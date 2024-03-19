package Forms;

import Trip.Reservation;
import Vehicle.Vehicle;
import com.sun.source.tree.Tree;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class RezervasyonEkrani extends javax.swing.JFrame {

    ArrayList<Reservation> seçilenRezervasyon = Reservation.rezarvasyonlar;

    BiletSec biletSec = new BiletSec();
    private int yolcuKapasitesi;
    private ArrayList<Boolean> koltukRezerveKontrol;
    private String sirketIsmi;
    private int alınanYolcuSayisi = 0;
    private int toplamYolcuSayisi = BiletSec.getSecilenKisiSayisi();

    public RezervasyonEkrani(String sirketIsmi, String aracIsmi, int yolcuKapasitesi, int rezerveKoltukSayisi, int bosKoltukSayisi, int fiyat, Vehicle arac, String tarih, String kalkisNoktasi, String varisNoktasi) {

        this.yolcuKapasitesi = yolcuKapasitesi;
        this.koltukRezerveKontrol = arac.getRezerveKoltuklar();
        this.sirketIsmi = sirketIsmi;

        initComponents();
        firmaIsmiLabel.setText(sirketIsmi);
        tarihLabel.setText(tarih);
        aracIsmiLabel.setText(aracIsmi);
        kalkisNoktasiField.setText(kalkisNoktasi);
        varisNoktasiField.setText(varisNoktasi);
        butonOlustur(yolcuKapasitesi, sirketIsmi);
        pack();

    }

    public int getYolcuKapasitesi() {
        return yolcuKapasitesi;
    }

    public ArrayList<Boolean> getKoltukRezerveKontrol() {
        return koltukRezerveKontrol;
    }

    public void butonOlustur(int koltukSayisi, String firmaIsmi) {
        jPanel2.setLayout(new GridLayout(2, 5)); // Koltukları düzenlemek için bir GridLayout kullanaldık.

        for (int i = 1; i <= koltukSayisi; i++) {

            JButton btn = new JButton(Integer.toString(i));
            int koltukNo = i;
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    koltukTiklandi(firmaIsmi, koltukNo);
                }
            });
            btn.setPreferredSize(new Dimension(50, 50));

            if (koltukRezerveKontrol.get(koltukNo - 1)) {
                btn.setEnabled(false);
                btn.setBackground(Color.red);

            } else {
                btn.setBackground(Color.green);
            }

            jPanel2.add(btn);
        }

    }

    private void koltukTiklandi(String firmaAdi, int koltukNo) {

        if (koltukNo > 0 && koltukNo <= koltukRezerveKontrol.size()) {
            if (koltukRezerveKontrol.get(koltukNo - 1)) {
                JOptionPane.showMessageDialog(this, "Dolu koltuk seçtiniz.");
                alınanYolcuSayisi--;
            } else {
                String message = "Firma: " + firmaAdi + "\nKoltuk: " + koltukNo + "\n";
                if (JOptionPane.showConfirmDialog(this, message + "Bu koltuğu seçmek istiyor musunuz?", "Koltuk Seçimi", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    koltukRezerveKontrol.set(koltukNo - 1, true);
                    Reservation reservation = new Reservation(sirketIsmi, aracIsmiLabel.getText(), tarihLabel.getText(), kalkisNoktasiField.getText(), varisNoktasiField.getText(), koltukNo);
                    seçilenRezervasyon.add(reservation);
                    if (toplamYolcuSayisi == 1) {
                        this.setVisible(false);
                        MusteriBilgileri musteriBilgileri = new MusteriBilgileri();
                        musteriBilgileri.setVisible(true);
                    } else {
                        if (alınanYolcuSayisi != toplamYolcuSayisi) {
                            MusteriBilgileri musteriBilgileri = new MusteriBilgileri();
                            musteriBilgileri.setVisible(true);
                            alınanYolcuSayisi++;
                            this.butonOlustur(koltukNo, firmaAdi);
                        } else {
                            MusteriBilgileri musteriBilgileri = new MusteriBilgileri();
                            this.setVisible(false);
                            musteriBilgileri.setVisible(true);
                            this.butonOlustur(koltukNo, firmaAdi);
                        }
                    }

                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Geçersiz koltuk numarası.");
        }
        alınanYolcuSayisi++;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        firmaIsmiLabel = new javax.swing.JLabel();
        tarihLabel = new javax.swing.JLabel();
        aracIsmiLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kalkisNoktasiField = new javax.swing.JLabel();
        varisNoktasiField = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MishaTicket - Koltuk Seçim Paneli");

        jPanel1.setBackground(new java.awt.Color(103, 114, 157));

        firmaIsmiLabel.setFont(new java.awt.Font("Helvetica Neue", 3, 24)); // NOI18N
        firmaIsmiLabel.setForeground(new java.awt.Color(255, 255, 255));
        firmaIsmiLabel.setText("A firması");

        tarihLabel.setFont(new java.awt.Font("Helvetica Neue", 3, 24)); // NOI18N
        tarihLabel.setForeground(new java.awt.Color(255, 255, 255));
        tarihLabel.setText("4 Aralık 2023");

        aracIsmiLabel.setFont(new java.awt.Font("Helvetica Neue", 3, 14)); // NOI18N
        aracIsmiLabel.setForeground(new java.awt.Color(255, 255, 255));
        aracIsmiLabel.setText("Ucak1");

        jPanel3.setBackground(new java.awt.Color(103, 114, 157));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Kalkış Noktası");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Varış Noktası");

        kalkisNoktasiField.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        kalkisNoktasiField.setForeground(new java.awt.Color(255, 255, 255));
        kalkisNoktasiField.setText("İstanbul ");

        varisNoktasiField.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        varisNoktasiField.setForeground(new java.awt.Color(255, 255, 255));
        varisNoktasiField.setText("Eskişehir");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(41, Short.MAX_VALUE)
                        .addComponent(kalkisNoktasiField, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(varisNoktasiField, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kalkisNoktasiField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(varisNoktasiField))
                .addGap(20, 20, 20))
        );

        jButton1.setText("Geri");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(aracIsmiLabel))
                            .addComponent(jButton1))
                        .addGap(76, 76, 76)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(178, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(firmaIsmiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tarihLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(tarihLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(firmaIsmiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(aracIsmiLabel)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 668, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        BiletSec biletSec = new BiletSec();
        biletSec.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aracIsmiLabel;
    private javax.swing.JLabel firmaIsmiLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel kalkisNoktasiField;
    private javax.swing.JLabel tarihLabel;
    private javax.swing.JLabel varisNoktasiField;
    // End of variables declaration//GEN-END:variables

}
