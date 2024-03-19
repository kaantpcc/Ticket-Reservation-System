package Forms;

import Trip.PriceList;
import Trip.Transport;
import Trip.Trip;
import User.Company;
import Vehicle.Airplane;
import Vehicle.Bus;
import Vehicle.Train;
import Vehicle.Vehicle;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BiletSorgula extends javax.swing.JFrame {

    ArrayList<Company> sirketler = Company.şirketler;
    private String sirketIsmi;
    private String aracIsmi;
    private int yolcuKapasitesi;
    private int rezerveKoltukSayisi;
    private int bosKoltukSayisi;
    private int fiyat;
    private String guzergah;
    private String kalkisNoktasi;
    private String varisNoktasi;
    private String tarih;
    PriceList priceList = new PriceList();

    public BiletSorgula(String kalkisNoktasi, String varisNoktasi, String tarih) {
        initComponents();
        Transport transport = new Transport();
        this.tarih = tarih;
        DefaultTableModel model = (DefaultTableModel) butunSeferler.getModel();
        setKalkisNoktasi(kalkisNoktasi);
        setVarisNoktasi(varisNoktasi);

        for (Company sirketler : sirketler) {
            int sayac = sirketler.getAracListesi().size();
            int cont = 0;
            for (Trip seferler : sirketler.getSeferSayısı()) {
                guzergah = seferler.getGuzergah();
                if (guzergah.trim().contains(kalkisNoktasi) && guzergah.trim().contains(varisNoktasi)) {
                    for (Vehicle araclar : sirketler.getAracListesi()) {
                        if (guzergah.equals(araclar.getGuzargah())) {
                            aracIsmi = araclar.getAraçİsmi();
                            yolcuKapasitesi = araclar.getYolcuKapasitesi();
                            araclar.rezerveKoltukListele(yolcuKapasitesi);
                            int rezerveKoltukSayisi = araclar.getRezerveKoltukSayisi();
                            int bosKoltukSayisi = yolcuKapasitesi - rezerveKoltukSayisi;
                            if (priceList.fiyatHesapla(kalkisNoktasi, varisNoktasi, araclar) != -1) {
                                if (sayac != cont) {
                                    Object[] eklenecekBilgiler = {sirketler.getUsername(), aracIsmi, yolcuKapasitesi, rezerveKoltukSayisi, bosKoltukSayisi, priceList.fiyatHesapla(kalkisNoktasi, varisNoktasi, araclar)};
                                    model.addRow(eklenecekBilgiler);
                                    cont++;
                                } else {
                                    break;
                                }

                            }
                        }
                    }
                } else {
                    sayac--;
                }

            }

        }
        if (model.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Sisteme önce admin giriş yapmalıdır.");
        }
        tarihLabel.setText(tarih + " için seferler listelendi...");
    }

    public String getSirketIsmi() {
        return sirketIsmi;
    }

    public void setSirketIsmi(String sirketIsmi) {
        this.sirketIsmi = sirketIsmi;
    }

    public String getAracIsmi() {
        return aracIsmi;
    }

    public void setAracIsmi(String aracIsmi) {
        this.aracIsmi = aracIsmi;
    }

    public int getYolcuKapasitesi() {
        return yolcuKapasitesi;
    }

    public void setYolcuKapasitesi(int yolcuKapasitesi) {
        this.yolcuKapasitesi = yolcuKapasitesi;
    }

    public int getRezerveKoltukSayisi() {
        return rezerveKoltukSayisi;
    }

    public void setRezerveKoltukSayisi(int rezerveKoltukSayisi) {
        this.rezerveKoltukSayisi = rezerveKoltukSayisi;
    }

    public int getBosKoltukSayisi() {
        return bosKoltukSayisi;
    }

    public void setBosKoltukSayisi(int bosKoltukSayisi) {
        this.bosKoltukSayisi = bosKoltukSayisi;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public String getKalkisNoktasi() {
        return kalkisNoktasi;
    }

    public void setKalkisNoktasi(String kalkisNoktasi) {
        this.kalkisNoktasi = kalkisNoktasi;
    }

    public String getVarisNoktasi() {
        return varisNoktasi;
    }

    public void setVarisNoktasi(String varisNoktasi) {
        this.varisNoktasi = varisNoktasi;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        yolculukTercihi = new javax.swing.JComboBox<>();
        sorgulaButonu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        butunSeferler = new javax.swing.JTable();
        rezerveEtButonu = new javax.swing.JButton();
        geriDonButonu = new javax.swing.JButton();
        tarihLabel = new javax.swing.JLabel();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MishaTicket - Bilet Sorgula Paneli");

        jPanel1.setBackground(new java.awt.Color(169, 179, 136));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ulaşım Tipi Seciniz : ");

        yolculukTercihi.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        yolculukTercihi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hepsi", "Kara Yolu", "Demir Yolu", "Hava Yolu" }));

        sorgulaButonu.setText("Sorgula");
        sorgulaButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sorgulaButonuActionPerformed(evt);
            }
        });

        butunSeferler.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        butunSeferler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Firma Ismi", "Arac ID", "Toplam Koltuk", "Rezerve Koltuk", "Boş Koltuk", "Fiyat"
            }
        ));
        jScrollPane1.setViewportView(butunSeferler);

        rezerveEtButonu.setText("Rezerve Et");
        rezerveEtButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rezerveEtButonuActionPerformed(evt);
            }
        });

        geriDonButonu.setText("Geri Don");
        geriDonButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriDonButonuActionPerformed(evt);
            }
        });

        tarihLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tarihLabel.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(yolculukTercihi, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sorgulaButonu)
                .addGap(18, 18, 18)
                .addComponent(tarihLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(189, Short.MAX_VALUE)
                .addComponent(geriDonButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128)
                .addComponent(rezerveEtButonu)
                .addGap(184, 184, 184))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tarihLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yolculukTercihi, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sorgulaButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(geriDonButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rezerveEtButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rezerveEtButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rezerveEtButonuActionPerformed

        int selectedRow = butunSeferler.getSelectedRow();
        if (selectedRow != -1) {
            String sirketinIsmi = (String) butunSeferler.getValueAt(selectedRow, 0);
            setSirketIsmi(sirketinIsmi);
            String aracinIsmi = (String) butunSeferler.getValueAt(selectedRow, 1);
            setAracIsmi(aracinIsmi);
            int aracinKoltukSayisi = (int) butunSeferler.getValueAt(selectedRow, 2);
            setYolcuKapasitesi(aracinKoltukSayisi);
            int doluKoltukSayisi = (int) butunSeferler.getValueAt(selectedRow, 3);
            setRezerveKoltukSayisi(doluKoltukSayisi);
            int doluOlmayanKoltukSayisi = (int) butunSeferler.getValueAt(selectedRow, 4);
            setBosKoltukSayisi(doluOlmayanKoltukSayisi);
            int yolculukUcreti = (int) butunSeferler.getValueAt(selectedRow, 5);
            setFiyat(yolculukUcreti);

            outerloop:
            for (Company sirketler : sirketler) {
                for (Vehicle araclar : sirketler.getAracListesi()) {
                    if (araclar.getAraçİsmi() == aracinIsmi && sirketler.getUsername() == sirketinIsmi) {
                        RezervasyonEkrani rezervasyonEkrani = new RezervasyonEkrani(getSirketIsmi(), getAracIsmi(), getYolcuKapasitesi(), getRezerveKoltukSayisi(), getBosKoltukSayisi(), getFiyat(), araclar, getTarih(), getKalkisNoktasi(), getVarisNoktasi());
                        this.setVisible(false);
                        rezervasyonEkrani.setVisible(true);
                        break outerloop;
                    }
                }
            }

        }

    }//GEN-LAST:event_rezerveEtButonuActionPerformed

    private void geriDonButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriDonButonuActionPerformed
        BiletSec biletSec = new BiletSec();
        this.setVisible(false);
        biletSec.setVisible(true);
    }//GEN-LAST:event_geriDonButonuActionPerformed

    private void sorgulaButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sorgulaButonuActionPerformed
        DefaultTableModel model = (DefaultTableModel) butunSeferler.getModel();
        if (yolculukTercihi.getSelectedItem() == "Kara Yolu") {
            model.setRowCount(0);
            for (Company sirketler : sirketler) {
                for (Vehicle araclar : sirketler.getAracListesi()) {
                    if (araclar instanceof Bus) {
                        for (Trip seferler : sirketler.getSeferSayısı()) {
                            guzergah = seferler.getGuzergah();
                            if (guzergah.trim().contains(getKalkisNoktasi()) && guzergah.trim().contains(getVarisNoktasi()) && guzergah.trim().equals(araclar.getGuzargah())) {
                                aracIsmi = araclar.getAraçİsmi();
                                yolcuKapasitesi = araclar.getYolcuKapasitesi();
                                araclar.rezerveKoltukListele(yolcuKapasitesi);
                                int rezerveKoltukSayisi = araclar.getRezerveKoltukSayisi();
                                int bosKoltukSayisi = yolcuKapasitesi - rezerveKoltukSayisi;
                                if (priceList.fiyatHesapla(kalkisNoktasi, varisNoktasi, araclar) != -1) {
                                    Object[] eklenecekBilgiler = {sirketler.getUsername(), aracIsmi, yolcuKapasitesi, rezerveKoltukSayisi, bosKoltukSayisi, priceList.fiyatHesapla(kalkisNoktasi, varisNoktasi, araclar)};
                                    model.addRow(eklenecekBilgiler);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        } else if (yolculukTercihi.getSelectedItem() == "Demir Yolu") {
            model.setRowCount(0);
            for (Company sirketler : sirketler) {
                for (Vehicle araclar : sirketler.getAracListesi()) {
                    if (araclar instanceof Train) {
                        for (Trip seferler : sirketler.getSeferSayısı()) {
                            guzergah = seferler.getGuzergah();
                            if (guzergah.trim().contains(getKalkisNoktasi()) && guzergah.trim().contains(getVarisNoktasi()) && guzergah.trim().equals(araclar.getGuzargah())) {
                                aracIsmi = araclar.getAraçİsmi();
                                yolcuKapasitesi = araclar.getYolcuKapasitesi();
                                araclar.rezerveKoltukListele(yolcuKapasitesi);
                                int rezerveKoltukSayisi = araclar.getRezerveKoltukSayisi();
                                int bosKoltukSayisi = yolcuKapasitesi - rezerveKoltukSayisi;
                                if (priceList.fiyatHesapla(kalkisNoktasi, varisNoktasi, araclar) != -1) {
                                    Object[] eklenecekBilgiler = {sirketler.getUsername(), aracIsmi, yolcuKapasitesi, rezerveKoltukSayisi, bosKoltukSayisi, priceList.fiyatHesapla(kalkisNoktasi, varisNoktasi, araclar)};
                                    model.addRow(eklenecekBilgiler);
                                    break;

                                }
                            }
                        }
                    }
                }
            }
        } else if (yolculukTercihi.getSelectedItem() == "Hava Yolu") {
            model.setRowCount(0);
            for (Company sirketler : sirketler) {
                for (Vehicle araclar : sirketler.getAracListesi()) {
                    if (araclar instanceof Airplane) {
                        for (Trip seferler : sirketler.getSeferSayısı()) {
                            guzergah = seferler.getGuzergah();
                            if (guzergah.trim().contains(getKalkisNoktasi()) && guzergah.trim().contains(getVarisNoktasi()) && guzergah.trim().equals(araclar.getGuzargah())) {
                                aracIsmi = araclar.getAraçİsmi();
                                yolcuKapasitesi = araclar.getYolcuKapasitesi();
                                araclar.rezerveKoltukListele(yolcuKapasitesi);
                                int rezerveKoltukSayisi = araclar.getRezerveKoltukSayisi();
                                int bosKoltukSayisi = yolcuKapasitesi - rezerveKoltukSayisi;
                                if (priceList.fiyatHesapla(kalkisNoktasi, varisNoktasi, araclar) != -1) {
                                    Object[] eklenecekBilgiler = {sirketler.getUsername(), aracIsmi, yolcuKapasitesi, rezerveKoltukSayisi, bosKoltukSayisi, priceList.fiyatHesapla(kalkisNoktasi, varisNoktasi, araclar)};
                                    model.addRow(eklenecekBilgiler);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            model.setRowCount(0);
            for (Company sirketler : sirketler) {
                int sayac = sirketler.getAracListesi().size();
                int cont = 0;
                for (Trip seferler : sirketler.getSeferSayısı()) {
                    guzergah = seferler.getGuzergah();
                    if (guzergah.trim().contains(kalkisNoktasi) && guzergah.trim().contains(varisNoktasi)) {
                        for (Vehicle araclar : sirketler.getAracListesi()) {
                            if (guzergah.equals(araclar.getGuzargah())) {
                                aracIsmi = araclar.getAraçİsmi();
                                yolcuKapasitesi = araclar.getYolcuKapasitesi();
                                araclar.rezerveKoltukListele(yolcuKapasitesi);
                                int rezerveKoltukSayisi = araclar.getRezerveKoltukSayisi();
                                int bosKoltukSayisi = yolcuKapasitesi - rezerveKoltukSayisi;
                                if (priceList.fiyatHesapla(kalkisNoktasi, varisNoktasi, araclar) != -1) {
                                    if (sayac != cont) {
                                        Object[] eklenecekBilgiler = {sirketler.getUsername(), aracIsmi, yolcuKapasitesi, rezerveKoltukSayisi, bosKoltukSayisi, priceList.fiyatHesapla(kalkisNoktasi, varisNoktasi, araclar)};
                                        model.addRow(eklenecekBilgiler);
                                        cont++;
                                    } else {
                                        break;
                                    }
                                }
                            }
                        }
                    } else {
                        sayac--;
                    }
                }
            }
    }//GEN-LAST:event_sorgulaButonuActionPerformed
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable butunSeferler;
    private javax.swing.JButton geriDonButonu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton rezerveEtButonu;
    private javax.swing.JButton sorgulaButonu;
    private javax.swing.JLabel tarihLabel;
    private javax.swing.JComboBox<String> yolculukTercihi;
    // End of variables declaration//GEN-END:variables
}
