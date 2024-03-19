package Trip;

import Vehicle.Airplane;
import Vehicle.Bus;
import Vehicle.Train;
import Vehicle.Vehicle;

public class DistanceList {

    private String[] otobusunSehirleri = {"Istanbul", "Kocaeli", "Ankara", "Eskisehir", "Konya"};

    private int[][] otobusunMesafeleri = {
        {0, 100, 500, 300, 600},
        {100, 0, 400, 200, 500},
        {500, 400, 0, -1, -1},
        {300, 200, -1, 0, 300},
        {600, 500, -1, 300, 0}
    };

    private String[] treninSehirleri = {"Istanbul", "Kocaeli", "Bilecik", "Ankara", "Eskisehir", "Konya"};

    private int[][] treninMesafeleri = {
        {0, 75, 225, 375, 300, 450},
        {75, 0, 75, 300, 150, 350},
        {225, 75, 0, 225, 75, 300},
        {375, 300, 225, 0, 150, -1},
        {300, 150, 75, 150, 0, 225},
        {450, 350, 300, -1, 225, 0}
    };

    private String[] ucakSehirleri = {"Istanbul", "Ankara", "Konya"};

    private int[][] ucakMesafeleri = {
        {0, 250, 300},
        {250, 0, -1},
        {300, -1, 0},};

    public int mesafeHesapla(String baslangicNoktasi, String varisNoktasi, Vehicle arac) {
        if (arac instanceof Bus) {
            int baslangicNoktasiIndex = sehirinIndexi(baslangicNoktasi, arac);
            int varisNoktasiIndex = sehirinIndexi(varisNoktasi, arac);

            if (baslangicNoktasiIndex != -1 && varisNoktasiIndex != -1 && otobusunMesafeleri[baslangicNoktasiIndex][varisNoktasiIndex] != -1) {
                return otobusunMesafeleri[baslangicNoktasiIndex][varisNoktasiIndex];
            } else {
                return -1;
            }

        } else if (arac instanceof Train) {
            int baslangicNoktasiIndex = sehirinIndexi(baslangicNoktasi, arac);
            int varisNoktasiIndex = sehirinIndexi(varisNoktasi, arac);

            if (baslangicNoktasiIndex != -1 && varisNoktasiIndex != -1 && treninMesafeleri[baslangicNoktasiIndex][varisNoktasiIndex] != -1) {
                return treninMesafeleri[baslangicNoktasiIndex][varisNoktasiIndex];
            } else {
                return -1;
            }
        } else if (arac instanceof Airplane) {
            int baslangicNoktasiIndex = sehirinIndexi(baslangicNoktasi, arac);
            int varisNoktasiIndex = sehirinIndexi(varisNoktasi, arac);

            if (baslangicNoktasiIndex != -1 && varisNoktasiIndex != -1 && ucakMesafeleri[baslangicNoktasiIndex][varisNoktasiIndex] != -1) {
                return ucakMesafeleri[baslangicNoktasiIndex][varisNoktasiIndex];
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
