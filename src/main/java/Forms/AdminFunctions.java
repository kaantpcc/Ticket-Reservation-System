package Forms;

import Person.Personel;
import Trip.Trip;
import Vehicle.Airplane;
import Vehicle.Bus;
import Vehicle.Train;
import Vehicle.Vehicle;
import User.Company;
import User.Admin;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class AdminFunctions extends javax.swing.JFrame {

    DefaultListModel model = new DefaultListModel();

    ArrayList<Company> şirketler = Company.şirketler;

    ArrayList<Personel> personeller = Personel.personeller;

    public AdminFunctions() {
        initComponents();

        ArrayList<Vehicle> aracA = new ArrayList<Vehicle>();
        Bus otobus1A = new Bus("Otobus1", "Benzin", 10, 20, "Istanbul - Kocaeli - Ankara - Kocaeli - Istanbul");
        Bus otobus2A = new Bus("Otobus2", "Benzin", 10, 15, "Istanbul - Kocaeli - Ankara - Kocaeli - Istanbul");
        aracA.add(otobus1A);
        aracA.add(otobus2A);
        ArrayList<Trip> seferA = new ArrayList<Trip>();
        seferA.add(new Trip(otobus1A, "Istanbul - Kocaeli - Ankara - Kocaeli - Istanbul"));
        seferA.add(new Trip(otobus2A, "Istanbul - Kocaeli - Ankara - Kocaeli - Istanbul"));
        Company companyA = new Company(aracA, seferA, 5000, 2000, "A firması", "123");
        Personel personelA = new Personel(5000, 2000, "", "");
        personeller.add(personelA);
        şirketler.add(companyA);

        ArrayList<Vehicle> aracB = new ArrayList<Vehicle>();
        Bus otobus1B = new Bus("Otobus1", "Motorin", 5, 15, "Istanbul - Kocaeli - Ankara - Kocaeli - Istanbul");
        Bus otobus2B = new Bus("Otobus2", "Motorin", 5, 20, "Istanbul - Kocaeli - Eskisehir - Konya - Eskisehir - Kocaeli - Istanbul");
        aracB.add(otobus1B);
        aracB.add(otobus2B);
        ArrayList<Trip> seferB = new ArrayList<Trip>();
        seferB.add(new Trip(otobus1B, "Istanbul - Kocaeli - Ankara - Kocaeli - Istanbul"));
        seferB.add(new Trip(otobus2B, "Istanbul - Kocaeli - Eskisehir - Konya - Eskisehir - Kocaeli - Istanbul"));
        Company companyB = new Company(aracB, seferB, 3000, 1500, "B firması", "123");
        Personel personelB = new Personel(3000, 1500, "", "");
        personeller.add(personelB);
        şirketler.add(companyB);

        ArrayList<Vehicle> aracC = new ArrayList<Vehicle>();
        Bus otobus1C = new Bus("Otobus1", "Motorin", 6, 20, "Istanbul - Kocaeli - Eskisehir - Konya - Eskisehir - Kocaeli - Istanbul");
        Airplane ucak1C = new Airplane("Uçak1", "Gaz", 20, 30, "Istanbul - Konya - Istanbul");
        Airplane ucak2C = new Airplane("Uçak2", "Gaz", 20, 30, "Istanbul - Konya - Istanbul");
        aracC.add(otobus1C);
        aracC.add(ucak1C);
        aracC.add(ucak2C);
        ArrayList<Trip> seferC = new ArrayList<Trip>();
        seferC.add(new Trip(otobus1C, "Istanbul - Kocaeli - Eskisehir - Konya - Eskisehir - Kocaeli - Istanbul"));
        seferC.add(new Trip(ucak1C, "Istanbul - Konya - Istanbul"));
        seferC.add(new Trip(ucak2C, "Istanbul - Konya - Istanbul"));
        Company companyC = new Company(aracC, seferC, 4000, 2000, "C firması", "123");
        Personel personelC = new Personel(4000, 2000, "", "");
        personeller.add(personelC);
        şirketler.add(companyC);

        ArrayList<Vehicle> aracD = new ArrayList<Vehicle>();
        Train tren1D = new Train("Tren1", "Elektrik", 3, 25, "Istanbul - Kocaeli - Bilecik - Eskisehir - Ankara - Eskisehir - Bilecik - Kocaeli - Istanbul");
        Train tren2D = new Train("Tren2", "Elektrik", 3, 25, "Istanbul - Kocaeli - Bilecik - Eskisehir - Konya - Eskisehir - Bilecik - Kocaeli - Istanbul");
        Train tren3D = new Train("Tren3", "Elektrik", 3, 25, "Istanbul - Kocaeli - Bilecik - Eskisehir - Konya - Eskisehir - Bilecik - Kocaeli - Istanbul");
        aracD.add(tren1D);
        aracD.add(tren2D);
        aracD.add(tren3D);
        ArrayList<Trip> seferD = new ArrayList<Trip>();
        seferD.add(new Trip(tren1D, "Istanbul - Kocaeli - Bilecik - Eskisehir - Ankara - Eskisehir - Bilecik - Kocaeli - Istanbul"));
        seferD.add(new Trip(tren2D, "Istanbul - Kocaeli - Bilecik - Eskisehir - Konya - Eskisehir - Bilecik - Kocaeli - Istanbul"));
        seferD.add(new Trip(tren3D, "Istanbul - Kocaeli - Bilecik - Eskisehir - Konya - Eskisehir - Bilecik - Kocaeli - Istanbul"));
        Company companyD = new Company(aracD, seferD, 2000, 1000, "D firması", "123");
        Personel personelD = new Personel(2000, 1000, "", "");
        personeller.add(personelD);
        şirketler.add(companyD);

        ArrayList<Vehicle> aracF = new ArrayList<Vehicle>();
        Airplane ucak1F = new Airplane("Uçak1", "Gaz", 25, 30, "Istanbul - Ankara - Istanbul");
        Airplane ucak2F = new Airplane("Uçak2", "Gaz", 25, 30, "Istanbul - Ankara - Istanbul");
        aracF.add(ucak1F);
        aracF.add(ucak2F);
        ArrayList<Trip> seferF = new ArrayList<Trip>();
        seferF.add(new Trip(ucak1F, "Istanbul - Ankara - Istanbul"));
        seferF.add(new Trip(ucak2F, "Istanbul - Ankara - Istanbul"));
        Company companyF = new Company(aracF, seferF, 7500, 4000, "F firması", "123");
        Personel personelF = new Personel(7500, 4000, "", "");
        personeller.add(personelF);
        şirketler.add(companyF);

        elemanEkle();
        firmaListesi.setModel(model);

    }

    private void elemanEkle() {
        for (String firma : Admin.firmalar) {
            model.addElement(firma);
            Company.guncelleşirketler();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        yeniFirmaEkle = new javax.swing.JButton();
        firmaSil = new javax.swing.JButton();
        hizmetBedeliBelirle = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        firmaListesi = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        geriDonButonu = new javax.swing.JButton();
        mesajLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        firma_ismi_tf = new javax.swing.JTextField();
        firma_parola_tf = new javax.swing.JPasswordField();
        sifreyiGosterButonu = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        kullananUcretField = new javax.swing.JTextField();
        hizmetUcretField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MishaTicket - Admin Panel");

        jPanel1.setBackground(new java.awt.Color(189, 205, 214));

        yeniFirmaEkle.setText("Yeni Firma Ekle");
        yeniFirmaEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yeniFirmaEkleActionPerformed(evt);
            }
        });

        firmaSil.setText("Firma Sil");
        firmaSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firmaSilActionPerformed(evt);
            }
        });

        hizmetBedeliBelirle.setText("Hizmet Bedeli Belirle");
        hizmetBedeliBelirle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hizmetBedeliBelirleActionPerformed(evt);
            }
        });

        firmaListesi.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        firmaListesi.setForeground(new java.awt.Color(51, 51, 51));
        firmaListesi.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "A firması", "B firması", "C firması", "D firması", "F firması" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(firmaListesi);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(238, 238, 238));
        jLabel1.setText("Firmalar :");

        geriDonButonu.setText("Geri Dön");
        geriDonButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                geriDonButonuActionPerformed(evt);
            }
        });

        mesajLabel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        mesajLabel.setForeground(new java.awt.Color(238, 238, 238));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel3.setText("Firma İsmi:");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel4.setText("Firma Şifresi:");

        firma_ismi_tf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        firma_parola_tf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        firma_parola_tf.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        sifreyiGosterButonu.setBackground(new java.awt.Color(255, 255, 255));
        sifreyiGosterButonu.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        sifreyiGosterButonu.setText("Şifreyi Göster");
        sifreyiGosterButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifreyiGosterButonuActionPerformed(evt);
            }
        });

        jLabel5.setText("Şoför Ücreti:");

        jLabel6.setText("Muavin Ücreti:");

        kullananUcretField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        hizmetUcretField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firma_ismi_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kullananUcretField, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(firma_parola_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sifreyiGosterButonu))
                    .addComponent(hizmetUcretField, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firma_ismi_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firma_parola_tf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(sifreyiGosterButonu)))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(kullananUcretField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(hizmetUcretField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Eklenecek firma bilgileri:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mesajLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(yeniFirmaEkle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(firmaSil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(hizmetBedeliBelirle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(geriDonButonu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(yeniFirmaEkle)
                        .addGap(18, 18, 18)
                        .addComponent(firmaSil)
                        .addGap(18, 18, 18)
                        .addComponent(hizmetBedeliBelirle)
                        .addGap(18, 18, 18)
                        .addComponent(geriDonButonu))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mesajLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void geriDonButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_geriDonButonuActionPerformed
        AdminPage adminPage = new AdminPage();
        setVisible(false);
        adminPage.setVisible(true);
    }//GEN-LAST:event_geriDonButonuActionPerformed

    private void yeniFirmaEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yeniFirmaEkleActionPerformed

        if (firma_ismi_tf.getText().equals("") || firma_parola_tf.getText().equals("") || kullananUcretField.getText().equals("") || hizmetUcretField.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Boş bir bilgi girdiniz.");
            mesajLabel.setText("Boş bir bilgi girdiniz....");
        } else {
            mesajLabel.setText("");
            DefaultListModel model = (DefaultListModel) firmaListesi.getModel();
            String firmaİsmi = firma_ismi_tf.getText();
            String firmaParola = firma_parola_tf.getText();
            int kullananUcreti = Integer.parseInt(kullananUcretField.getText());
            int hizmetUcreti = Integer.parseInt(hizmetUcretField.getText());

            Company eklenecekŞirket = new Company(firmaİsmi, firmaParola, kullananUcreti, hizmetUcreti);
            Personel personelEklenecekSirket = new Personel(kullananUcreti, hizmetUcreti, "", "");

            if (eklenecekŞirket != null) {
                if (eklenecekŞirket.getUsername().trim().equals("") || eklenecekŞirket.getPassword().trim().equals("")) {
                    mesajLabel.setText("Boş bir bilgi girdiniz....");

                } else {
                    model.addElement(eklenecekŞirket.getUsername());
                    mesajLabel.setText("Firma başarıyla eklendi.");
                    Admin.firmaEkle(eklenecekŞirket.getUsername());
                    şirketler.add(eklenecekŞirket);
                    firma_ismi_tf.setText("");
                    firma_parola_tf.setText("");
                    kullananUcretField.setText("");
                    hizmetUcretField.setText("");

                }
            } else {
                mesajLabel.setText("İşlem iptal edildi...");
            }
        }
    }//GEN-LAST:event_yeniFirmaEkleActionPerformed

    private void firmaSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firmaSilActionPerformed
        mesajLabel.setText("");

        DefaultListModel model = (DefaultListModel) firmaListesi.getModel();

        int silinecekFirmaIndexi = firmaListesi.getSelectedIndex();

        if (silinecekFirmaIndexi != -1) {
            model.remove(silinecekFirmaIndexi);
            mesajLabel.setText("Firma silme işlemi başarıyla gerçekleşti.");
            Admin.firmaSil(silinecekFirmaIndexi);
            şirketler.remove(silinecekFirmaIndexi);
            System.out.println(Admin.getFirmalar());

        } else {
            if (model.getSize() == 0) {
                mesajLabel.setText("Silinecek firma yok...");
            } else {
                mesajLabel.setText("Lütfen firma seçiniz...");
            }
        }
    }//GEN-LAST:event_firmaSilActionPerformed

    private void hizmetBedeliBelirleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hizmetBedeliBelirleActionPerformed
        mesajLabel.setText("");

        int hizmetBedeli = Integer.parseInt(JOptionPane.showInputDialog("Hizmet bedelini giriniz(standart - 1000₺) :"));

        mesajLabel.setText("Hizmet bedeli " + hizmetBedeli + "₺ olarak belirlendi.");

        Admin admin = new Admin("", "");
        admin.hizmetBedeliBelirle(hizmetBedeli);

    }//GEN-LAST:event_hizmetBedeliBelirleActionPerformed

    private void sifreyiGosterButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifreyiGosterButonuActionPerformed
        if (sifreyiGosterButonu.isSelected()) {
            firma_parola_tf.setEchoChar((char) 0);
        } else {
            firma_parola_tf.setEchoChar('*');
        }
    }//GEN-LAST:event_sifreyiGosterButonuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> firmaListesi;
    private javax.swing.JButton firmaSil;
    private javax.swing.JTextField firma_ismi_tf;
    private javax.swing.JPasswordField firma_parola_tf;
    private javax.swing.JButton geriDonButonu;
    private javax.swing.JButton hizmetBedeliBelirle;
    private javax.swing.JTextField hizmetUcretField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kullananUcretField;
    private javax.swing.JLabel mesajLabel;
    private javax.swing.JCheckBox sifreyiGosterButonu;
    private javax.swing.JButton yeniFirmaEkle;
    // End of variables declaration//GEN-END:variables
}
