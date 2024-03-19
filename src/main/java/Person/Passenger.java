package Person;

import java.util.ArrayList;

public class Passenger extends Person {

    private static int yolcuSayisi = 0;
    private String kimlikNo;
    private String dogumTarihi;
    public static ArrayList<Passenger> yolcular = new ArrayList<Passenger>();

    public Passenger(String ad, String soyad, String kimlikNo, String dogumTarihi) {
        super(ad, soyad);
        this.dogumTarihi = dogumTarihi;
        this.kimlikNo = kimlikNo;
        yolcuSayisi++;

    }

    public static int getYolcuSayisi() {
        return yolcuSayisi;
    }

    public static void setYolcuSayisi(int yolcuSayisi) {
        Passenger.yolcuSayisi = yolcuSayisi;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public ArrayList<Passenger> getYolcular() {
        return yolcular;
    }

    public void setYolcular(ArrayList<Passenger> yolcular) {
        this.yolcular = yolcular;
    }

}
