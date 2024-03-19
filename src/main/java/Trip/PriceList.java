package Trip;

import Vehicle.Airplane;
import Vehicle.Bus;
import Vehicle.Train;
import Vehicle.Vehicle;

public class PriceList {

    private String[] otobusunSehirleri = {"Istanbul", "Kocaeli", "Ankara", "Eskisehir", "Konya"};

    private int[][] otobusunFiyatlandirmasi = {
        {0, 50, 300, 150, 300},
        {50, 0, 400, 100, 250},
        {300, 400, 0, -1, -1},
        {150, 100, -1, 0, 150},
        {300, 250, -1, 150, 0}
    };

    private String[] treninSehirleri = {"Istanbul", "Kocaeli", "Bilecik", "Ankara", "Eskisehir", "Konya"};

    private int[][] treninFiyatlandirmasi = {
        {0, 50, 150, 250, 200, 300},
        {50, 0, 50, 200, 100, 250},
        {150, 50, 0, 150, 50, 200},
        {250, 200, 150, 0, 100, -1},
        {200, 100, 50, 100, 0, 150},
        {300, 250, 200, -1, 150, 0}
    };

    private String[] ucakSehirleri = {"Istanbul", "Ankara", "Konya"};

    private int[][] ucakFiyatlandirmasi = {
        {0, 1000, 1200},
        {1000, 0, -1},
        {1200, -1, 0},};

    public int fiyatHesapla(String baslangicNoktasi, String varisNoktasi, Vehicle arac) {
        if (arac instanceof Bus) {
            int baslangicNoktasiIndex = sehirinIndexi(baslangicNoktasi, arac);
            int varisNoktasiIndex = sehirinIndexi(varisNoktasi, arac);

            if (baslangicNoktasiIndex != -1 && varisNoktasiIndex != -1 && otobusunFiyatlandirmasi[baslangicNoktasiIndex][varisNoktasiIndex] != -1) {
                return otobusunFiyatlandirmasi[baslangicNoktasiIndex][varisNoktasiIndex];
            } else {
                return -1;
            }

        } else if (arac instanceof Train) {
            int baslangicNoktasiIndex = sehirinIndexi(baslangicNoktasi, arac);
            int varisNoktasiIndex = sehirinIndexi(varisNoktasi, arac);

            if (baslangicNoktasiIndex != -1 && varisNoktasiIndex != -1 && treninFiyatlandirmasi[baslangicNoktasiIndex][varisNoktasiIndex] != -1) {
                return treninFiyatlandirmasi[baslangicNoktasiIndex][varisNoktasiIndex];
            } else {
                return -1;
            }
        } else if (arac instanceof Airplane) {
            int baslangicNoktasiIndex = sehirinIndexi(baslangicNoktasi, arac);
            int varisNoktasiIndex = sehirinIndexi(varisNoktasi, arac);

            if (baslangicNoktasiIndex != -1 && varisNoktasiIndex != -1 && ucakFiyatlandirmasi[baslangicNoktasiIndex][varisNoktasiIndex] != -1) {
                return ucakFiyatlandirmasi[baslangicNoktasiIndex][varisNoktasiIndex];
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }

    private int sehirinIndexi(String sehirler, Vehicle arac) {
        if (arac instanceof Bus) {
            for (int i = 0; i < otobusunSehirleri.length; i++) {
                if (otobusunSehirleri[i].equals(sehirler)) {
                    return i;
                }
            }
            return -1;
        } else if (arac instanceof Train) {
            for (int i = 0; i < treninSehirleri.length; i++) {
                if (treninSehirleri[i].equals(sehirler)) {
                    return i;
                }
            }
            return -1;
        } else if (arac instanceof Airplane) {
            for (int i = 0; i < ucakSehirleri.length; i++) {
                if (ucakSehirleri[i].equals(sehirler)) {
                    return i;
                }
            }
            return -1;
        } else {
            return -1;
        }
    }

}
