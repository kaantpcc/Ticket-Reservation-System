package Forms;

import Interfaces.IProfitable;
import Trip.Trip;
import Vehicle.Airplane;
import Vehicle.Bus;
import Vehicle.Train;
import Vehicle.Vehicle;
import User.Company;
import Trip.DistanceList;
import Trip.PriceList;
import Trip.Reservation;
import User.Admin;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class CompanyFunctions extends javax.swing.JFrame implements IProfitable {

    ArrayList<Company> şirketler = Company.şirketler;
    ArrayList<Reservation> rezarvasyonlar = Reservation.rezarvasyonlar;
    DefaultListModel model1 = new DefaultListModel();
    DefaultListModel model2 = new DefaultListModel();
    int seferSilmeIndex = -1;
    public static Company currentCompany = null;

    public void setCurrentCompany(Company newCompany) {
        currentCompany = newCompany;
    }

    public CompanyFunctions(Company newCompany) {
        setCurrentCompany(newCompany);
        initComponents();

        elemanEkle();
        firmaİsmiLabel.setText(currentCompany.getUsername());
        araçList.setModel(model1);
        DefaultListModel model1 = (DefaultListModel) araçList.getModel();

        seferList.setModel(model2);
        DefaultListModel model2 = (DefaultListModel) seferList.getModel();

    }

    private void elemanEkle() {
        if (currentCompany.getAracListesi() != null) {
            for (Vehicle arac : currentCompany.getAracListesi()) {
                model1.addElement(arac.getAraçİsmi());
            }
        }

        if (currentCompany.getSeferSayısı() != null) {
            for (Trip seferSayısı : currentCompany.getSeferSayısı()) {
                model2.addElement(seferSayısı.getGuzergah());
            }
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        firmaİsmiLabel = new javax.swing.JLabel();
        araçEkleButon = new javax.swing.JButton();
        araçSilButon = new javax.swing.JButton();
        karHesaplaButonu = new javax.swing.JButton();
        geriDonButon = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        araçList = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        seferList = new javax.swing.JList<>();
        mesaj_yazısı = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        karZararLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MishaTicket - Firma Paneli");

        jPanel1.setBackground(new java.awt.Color(216, 172, 156));
        jPanel1.setToolTipText("Company Functions");

        firmaİsmiLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        firmaİsmiLabel.setForeground(new java.awt.Color(255, 255, 255));

        araçEkleButon.setText("Araç ve Seferini Ekle");
        araçEkleButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                araçEkleButonActionPerformed(evt);
            }
        });

        araçSilButon.setText("Araç ve Seferini Sil");
        araçSilButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                araçSilButonActionPerformed(evt);
            }
        });

        karHesaplaButonu.setText("Kar Hesapla");
        karHesaplaButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                karHesaplaButonuActionPerformed(evt);
            }
        });

        geriDonButon.setText("Geri Dön");
        geriDonButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriDonButonActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(araçList);

        jScrollPane2.setViewportView(seferList);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Araçlar : ");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seferler :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(mesaj_yazısı, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(geriDonButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firmaİsmiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(araçEkleButon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(araçSilButon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(karHesaplaButonu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(152, 152, 152))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(karZararLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(firmaİsmiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(araçEkleButon, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(araçSilButon, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(karHesaplaButonu, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mesaj_yazısı, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(geriDonButon, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(karZararLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void geriDonButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriDonButonActionPerformed
        CompanyPage companyPage = new CompanyPage();
        this.setVisible(false);
        companyPage.setVisible(true);
    }//GEN-LAST:event_geriDonButonActionPerformed

    private void araçEkleButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_araçEkleButonActionPerformed

        mesaj_yazısı.setText("");
        String cevap = JOptionPane.showInputDialog("Araç türü giriniz (Otobus, Tren, Ucak) : ");

        if (cevap != null) {
            if (cevap.trim().equals("")) {
                mesaj_yazısı.setText("Boş bir kullanıcı adı girdiniz...");
            } else {
                switch (cevap) {
                    case "Otobus":
                        String otobusIsmi = JOptionPane.showInputDialog("Otobus aracinin ismi : ");
                        String otobusYakitTuru = JOptionPane.showInputDialog("Yakit turu : ");
                        String otobusKilometreUcreti = JOptionPane.showInputDialog("Girdiginiz yakitin kilometre basina ucreti : ");
                        String otobusYolcuKapasitesi = JOptionPane.showInputDialog("Otobusun yolcu kapasitesi : ");
                        String otobusSeferIsmi = JOptionPane.showInputDialog("Sefer numarasini(3-4.sefer) giriniz : ");
                        switch (otobusSeferIsmi) {

                            case "3.sefer":
                                String sefer3 = "Istanbul - Kocaeli - Ankara - Kocaeli - Istanbul";
                                Bus eklenecekOtobus1 = new Bus(otobusIsmi, otobusYakitTuru, Integer.parseInt(otobusKilometreUcreti), Integer.parseInt(otobusYolcuKapasitesi), sefer3);
                                Trip eklenecekSefer1 = new Trip(eklenecekOtobus1, sefer3);
                                Company.aracEkle(eklenecekOtobus1, currentCompany);
                                Company.seferEkle(eklenecekSefer1, currentCompany);
                                model2.addElement(sefer3);
                                model1.addElement(otobusIsmi);

                                break;

                            case "4.sefer":
                                String sefer4 = "Istanbul - Kocaeli - Eskisehir - Konya - Eskisehir - Kocaeli - Istanbul";
                                Bus eklenecekOtobus2 = new Bus(otobusIsmi, otobusYakitTuru, Integer.parseInt(otobusKilometreUcreti), Integer.parseInt(otobusYolcuKapasitesi), sefer4);
                                Trip eklenecekSefer2 = new Trip(eklenecekOtobus2, sefer4);
                                Company.seferEkle(eklenecekSefer2, currentCompany);
                                Company.aracEkle(eklenecekOtobus2, currentCompany);
                                model2.addElement(sefer4);
                                model1.addElement(otobusIsmi);

                                break;

                            default:
                                JOptionPane.showMessageDialog(this, "Geçersiz bir sefer girdiniz...");
                        }

                        break;

                    case "Tren":

                        String trenIsmi = JOptionPane.showInputDialog("Tren aracinin ismi : ");
                        String trenYakitTuru = "Elektrik";
                        String trenKilometreUcreti = JOptionPane.showInputDialog("Girdiginiz yakitin kilometre basina ucreti : ");
                        String trenYolcuKapasitesi = "25";
                        String trenSeferIsmi = JOptionPane.showInputDialog("Sefer numarasini(1-2.sefer) giriniz : ");
                        switch (trenSeferIsmi) {
                            case "1.sefer":
                                String sefer1 = "Istanbul - Kocaeli - Bilecik - Eskisehir - Ankara - Eskisehir - Bilecik - Kocaeli - Istanbul";
                                Train eklenecekTren1 = new Train(trenIsmi, trenYakitTuru, Integer.parseInt(trenKilometreUcreti), Integer.parseInt(trenYolcuKapasitesi), sefer1);
                                Trip eklenecekSefer1 = new Trip(eklenecekTren1, sefer1);
                                Company.seferEkle(eklenecekSefer1, currentCompany);
                                Company.aracEkle(eklenecekTren1, currentCompany);
                                model2.addElement(sefer1);
                                model1.addElement(trenIsmi);

                                break;

                            case "2.sefer":
                                String sefer2 = "Istanbul - Kocaeli - Bilecik - Eskisehir - Konya - Eskisehir - Bilecik - Kocaeli - Istanbul";
                                Train eklenecekTren2 = new Train(trenIsmi, trenYakitTuru, Integer.parseInt(trenKilometreUcreti), Integer.parseInt(trenYolcuKapasitesi), sefer2);
                                Trip eklenecekSefer2 = new Trip(eklenecekTren2, sefer2);
                                Company.seferEkle(eklenecekSefer2, currentCompany);
                                Company.aracEkle(eklenecekTren2, currentCompany);
                                model2.addElement(sefer2);
                                model1.addElement(trenIsmi);

                                break;

                            default:
                                JOptionPane.showMessageDialog(this, "Geçersiz bir sefer girdiniz...");
                        }

                        break;

                    case "Ucak":
                        String ucakIsmi = JOptionPane.showInputDialog("Ucak aracinin ismi : ");
                        String ucakYakitTuru = "Gaz";
                        String ucakKilometreUcreti = JOptionPane.showInputDialog("Girdiginiz yakitin kilometre basina ucreti : ");
                        String ucakYolcuKapasitesi = "30";
                        String ucakSeferIsmi = JOptionPane.showInputDialog("Sefer numarasini(5-6.sefer) giriniz : ");

                        switch (ucakSeferIsmi) {
                            case "5.sefer":
                                String sefer5 = "Istanbul - Konya - Istanbul";
                                Airplane eklenecekUcak1 = new Airplane(ucakIsmi, ucakYakitTuru, Integer.parseInt(ucakKilometreUcreti), Integer.parseInt(ucakYolcuKapasitesi), sefer5);
                                Trip eklenecekSefer1 = new Trip(eklenecekUcak1, sefer5);
                                Company.seferEkle(eklenecekSefer1, currentCompany);
                                Company.aracEkle(eklenecekUcak1, currentCompany);
                                model2.addElement(sefer5);
                                model1.addElement(ucakIsmi);

                                break;

                            case "6.sefer":
                                String sefer6 = "Istanbul - Ankara - Istanbul";
                                Airplane eklenecekUcak2 = new Airplane(ucakIsmi, ucakYakitTuru, Integer.parseInt(ucakKilometreUcreti), Integer.parseInt(ucakYolcuKapasitesi), sefer6);
                                Trip eklenecekSefer2 = new Trip(eklenecekUcak2, sefer6);
                                Company.seferEkle(eklenecekSefer2, currentCompany);
                                Company.aracEkle(eklenecekUcak2, currentCompany);
                                model2.addElement(sefer6);
                                model1.addElement(ucakIsmi);

                                break;

                            default:
                                JOptionPane.showMessageDialog(this, "Geçersiz bir sefer girdiniz...");
                        }
                        break;

                    default:
                        JOptionPane.showMessageDialog(this, "Geçersiz araç türü girdiniz...");
                        break;
                }

                mesaj_yazısı.setText("Araç başarılı bir şekilde eklendi.");

            }
        } else {
            mesaj_yazısı.setText("İşlem iptal edildi...");
        }


    }//GEN-LAST:event_araçEkleButonActionPerformed


    private void araçSilButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_araçSilButonActionPerformed

        mesaj_yazısı.setText("");
        int selectedİndex = araçList.getSelectedIndex();

        if (selectedİndex != -1) {
            model1.remove(selectedİndex);
            Company.aracSil(selectedİndex, currentCompany);
            mesaj_yazısı.setText("Araç silme işlemi başarıyla gerçekleşti.");
            if (seferSilmeIndex != -1) {
                selectedİndex = seferSilmeIndex;
            }
            if (selectedİndex != -1) {
                model2.remove(selectedİndex);
                Company.seferSil(selectedİndex, currentCompany);
                mesaj_yazısı.setText("Sefer silme işlemi başarıyla gerçekleşti...");

                seferSilmeIndex = -1;
            }

        } else {
            if (model1.getSize() == 0) {
                mesaj_yazısı.setText("Silinecek araç yok...");
            } else {
                mesaj_yazısı.setText("Lütfen araç seçiniz...");
            }

        }


    }//GEN-LAST:event_araçSilButonActionPerformed

    private void karHesaplaButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_karHesaplaButonuActionPerformed
        int yapilanRezervayondanKazanilanPara = 0;
        int randomYolculardanKazanilanPara = 0;
        int soforUcreti;
        int muavinUcreti;
        int harcananPara = 0;

        muavinUcreti = currentCompany.getHizmetPersonelUcreti();
        soforUcreti = currentCompany.getKullananPersonelUcreti();

        harcananPara = harcananPara + muavinUcreti * 4 + soforUcreti * 4 + Admin.hizmetBedel; //25000
        DistanceList distanceList = new DistanceList();
        PriceList priceList = new PriceList();
        for (Vehicle arac : currentCompany.getAracListesi()) {
            if (arac.getGuzargah().equals("Istanbul - Kocaeli - Ankara - Kocaeli - Istanbul") && (arac instanceof Bus)) {
                randomYolculardanKazanilanPara = randomYolculardanKazanilanPara + arac.getRezerveKoltukSayisi() * priceList.fiyatHesapla("Istanbul", "Ankara", arac);
                Bus bus = new Bus(arac.getAraçİsmi(), arac.getYakıtTürü(), arac.getKilometreUcreti(), arac.getYolcuKapasitesi());
                int km = 2 * distanceList.mesafeHesapla("Istanbul", "Ankara", arac);

                harcananPara = harcananPara + bus.calculateFuelCoast(km, arac.getKilometreUcreti());
            } else if (arac.getGuzargah().equals("Istanbul - Kocaeli - Eskisehir - Konya - Eskisehir - Kocaeli - Istanbul") && (arac instanceof Bus)) {
                randomYolculardanKazanilanPara = randomYolculardanKazanilanPara + arac.getRezerveKoltukSayisi() * priceList.fiyatHesapla("Istanbul", "Konya", arac);
                Bus bus = new Bus(arac.getAraçİsmi(), arac.getYakıtTürü(), arac.getKilometreUcreti(), arac.getYolcuKapasitesi());
                int km = 2 * distanceList.mesafeHesapla("Istanbul", "Konya", arac);
                harcananPara = harcananPara + bus.calculateFuelCoast(km, arac.getKilometreUcreti());
            } else if (arac.getGuzargah().equals("Istanbul - Konya - Istanbul") && (arac instanceof Airplane)) {
                randomYolculardanKazanilanPara = randomYolculardanKazanilanPara + arac.getRezerveKoltukSayisi() * priceList.fiyatHesapla("Istanbul", "Konya", arac);
                Airplane airplane = new Airplane(arac.getAraçİsmi(), arac.getYakıtTürü(), arac.getKilometreUcreti(), arac.getYolcuKapasitesi());
                int km = 2 * distanceList.mesafeHesapla("Istanbul", "Konya", arac);
                harcananPara = harcananPara + airplane.calculateFuelCoast(km, arac.getKilometreUcreti());
            } else if (arac.getGuzargah().equals("Istanbul - Kocaeli - Bilecik - Eskisehir - Ankara - Eskisehir - Bilecik - Kocaeli - Istanbul") && (arac instanceof Train)) {
                randomYolculardanKazanilanPara = randomYolculardanKazanilanPara + arac.getRezerveKoltukSayisi() * priceList.fiyatHesapla("Istanbul", "Ankara", arac);
                Train train = new Train(arac.getAraçİsmi(), arac.getYakıtTürü(), arac.getKilometreUcreti(), arac.getYolcuKapasitesi());
                int km = distanceList.mesafeHesapla("Istanbul", "Ankara", arac);
                harcananPara = harcananPara + train.calculateFuelCoast(km, arac.getKilometreUcreti());
            } else if (arac.getGuzargah().equals("Istanbul - Kocaeli - Bilecik - Eskisehir - Konya - Eskisehir - Bilecik - Kocaeli - Istanbul") && (arac instanceof Train)) {
                randomYolculardanKazanilanPara = randomYolculardanKazanilanPara + arac.getRezerveKoltukSayisi() * priceList.fiyatHesapla("Istanbul", "Konya", arac);
                Train train = new Train(arac.getAraçİsmi(), arac.getYakıtTürü(), arac.getKilometreUcreti(), arac.getYolcuKapasitesi());
                int km = 2 * distanceList.mesafeHesapla("Istanbul", "Konya", arac);
                harcananPara = harcananPara + train.calculateFuelCoast(km, arac.getKilometreUcreti());
            } else if (arac.getGuzargah().equals("Istanbul - Ankara - Istanbul") && (arac instanceof Airplane)) {
                randomYolculardanKazanilanPara = randomYolculardanKazanilanPara + arac.getRezerveKoltukSayisi() * priceList.fiyatHesapla("Istanbul", "Ankara", arac);
                Airplane airplane = new Airplane(arac.getAraçİsmi(), arac.getYakıtTürü(), arac.getKilometreUcreti(), arac.getYolcuKapasitesi());
                int km = 2 * distanceList.mesafeHesapla("Istanbul", "Ankara", arac);
                harcananPara = harcananPara + airplane.calculateFuelCoast(km, arac.getKilometreUcreti());
            }
        }

        for (Reservation simdikiRezervasyon : rezarvasyonlar) {
            if (currentCompany.getUsername().equals(simdikiRezervasyon.getSirketİsmi())) {
                for (Vehicle simdikiArac : currentCompany.getAracListesi()) {
                    yapilanRezervayondanKazanilanPara += priceList.fiyatHesapla(simdikiRezervasyon.getKalkisNoktasi(), simdikiRezervasyon.getVarisNoktasi(), simdikiArac);
                    break;
                }

            }

        }

        int kazanilanPara = randomYolculardanKazanilanPara * 2 + yapilanRezervayondanKazanilanPara;
        karZararDurumu(kazanilanPara, harcananPara);

    }//GEN-LAST:event_karHesaplaButonuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton araçEkleButon;
    private javax.swing.JList<String> araçList;
    private javax.swing.JButton araçSilButon;
    private javax.swing.JLabel firmaİsmiLabel;
    private javax.swing.JButton geriDonButon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton karHesaplaButonu;
    private javax.swing.JLabel karZararLabel;
    private javax.swing.JLabel mesaj_yazısı;
    private javax.swing.JList<String> seferList;
    // End of variables declaration//GEN-END:variables

    @Override
    public void karZararDurumu(int kazanılanPara, int harcananPara) {
        if (kazanılanPara > harcananPara) {
            karZararLabel.setText("Firma " + (kazanılanPara - harcananPara) + "₺ kadar kar elde etmiştir.");
        } else if (harcananPara > kazanılanPara) {
            karZararLabel.setText("Firma " + (harcananPara - kazanılanPara) + "₺ kadar zarardadır.");
        } else {
            karZararLabel.setText("Firma ne kar ne zarar yapmıştır.");
        }
    }

}
