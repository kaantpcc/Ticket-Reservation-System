package Vehicle;

import java.util.ArrayList;
import java.util.Random;

public abstract class Vehicle {

    private String araçİsmi;
    private String yakıtTürü;
    private int kilometreUcreti;
    private int yolcuKapasitesi;
    private String guzargah;
    private ArrayList<Boolean> rezerveKoltuklar;
    private int rezerveKoltukSayisi;

    public Vehicle(String araçİsmi, String yakıtTürü, int kilometreUcreti, int yolcuKapasitesi, String guzargah) {
        this.araçİsmi = araçİsmi;
        this.yakıtTürü = yakıtTürü;
        this.kilometreUcreti = kilometreUcreti;
        this.yolcuKapasitesi = yolcuKapasitesi;
        this.guzargah = guzargah;
        this.rezerveKoltuklar = new ArrayList<>();
        rezerveKoltukListele(yolcuKapasitesi);
    }

    public Vehicle() {

    }

    public Vehicle(String araçİsmi, String yakıtTürü, int kilometreUcreti, int yolcuKapasitesi) {
        this.araçİsmi = araçİsmi;
        this.yakıtTürü = yakıtTürü;
        this.kilometreUcreti = kilometreUcreti;
        this.yolcuKapasitesi = yolcuKapasitesi;
        this.rezerveKoltuklar = new ArrayList<>();
    }

    public Vehicle(String araçİsmi, String yakıtTürü, int kilometreUcreti, int yolcuKapasitesi, String guzargah, ArrayList<Boolean> rezerveKoltuklar) {
        this.araçİsmi = araçİsmi;
        this.yakıtTürü = yakıtTürü;
        this.kilometreUcreti = kilometreUcreti;
        this.yolcuKapasitesi = yolcuKapasitesi;
        this.guzargah = guzargah;
        this.rezerveKoltuklar = rezerveKoltuklar;
    }

    public String getAraçİsmi() {
        return araçİsmi;
    }

    public void setAraçİsmi(String araçİsmi) {
        this.araçİsmi = araçİsmi;
    }

    public String getYakıtTürü() {
        return yakıtTürü;
    }

    public void setYakıtTürü(String yakıtTürü) {
        this.yakıtTürü = yakıtTürü;
    }

    public int getKilometreUcreti() {
        return kilometreUcreti;
    }

    public void setKilometreUcreti(int kilometreUcreti) {
        this.kilometreUcreti = kilometreUcreti;
    }

    public int getYolcuKapasitesi() {
        return yolcuKapasitesi;
    }

    public void setYolcuKapasitesi(int yolcuKapasitesi) {
        this.yolcuKapasitesi = yolcuKapasitesi;
    }

    public String getGuzargah() {
        return guzargah;
    }

    public void setGuzargah(String guzargah) {
        this.guzargah = guzargah;
    }

    public ArrayList<Boolean> getRezerveKoltuklar() {
        return rezerveKoltuklar;
    }

    public void setRezerveKoltuklar(ArrayList<Boolean> rezerveKoltuklar) {
        this.rezerveKoltuklar = rezerveKoltuklar;
    }

    public int getRezerveKoltukSayisi() {
        return rezerveKoltukSayisi;
    }

    public void setRezerveKoltukSayisi(int rezerveKoltukSayisi) {
        this.rezerveKoltukSayisi = rezerveKoltukSayisi;
    }

    public void rezerveKoltukListele(int koltukSayisi) {
        Random random = new Random();
        int sayac = 0;

        for (int i = 0; i < koltukSayisi; i++) {
            rezerveKoltuklar.add(random.nextBoolean());
        }

        for (int i = 0; i < koltukSayisi; i++) {
            if (rezerveKoltuklar.get(i)) {
                sayac++;
            }
        }
        setRezerveKoltukSayisi(sayac);
    }

    public abstract int calculateFuelCoast(int mesafe, int kilometreUcreti);

}
