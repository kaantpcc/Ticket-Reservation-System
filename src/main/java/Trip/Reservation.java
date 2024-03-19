package Trip;

import java.util.ArrayList;

public class Reservation {

    private String sirketİsmi;
    private String aracİsmi;

    private String tarih;
    private String kalkisNoktasi;
    private String varisNoktasi;
    private int koltukNo;
    public static ArrayList<Reservation> rezarvasyonlar = new ArrayList<Reservation>();

    public Reservation(String sirketİsmi, String aracİsmi, String tarih, String kalkisNoktasi, String varisNoktasi, int koltukNo) {
        this.sirketİsmi = sirketİsmi;
        this.aracİsmi = aracİsmi;

        this.tarih = tarih;
        this.kalkisNoktasi = kalkisNoktasi;
        this.varisNoktasi = varisNoktasi;
        this.koltukNo = koltukNo;
    }

    public String getSirketİsmi() {
        return sirketİsmi;
    }

    public void setSirketİsmi(String sirketİsmi) {
        this.sirketİsmi = sirketİsmi;
    }

    public String getAracİsmi() {
        return aracİsmi;
    }

    public void setAracİsmi(String aracİsmi) {
        this.aracİsmi = aracİsmi;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
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

    public int getKoltukNo() {
        return koltukNo;
    }

    public void setKoltukNo(int koltukNo) {
        this.koltukNo = koltukNo;
    }

    public static ArrayList<Reservation> getRezarvasyonlar() {
        return rezarvasyonlar;
    }

    public static void setRezarvasyonlar(ArrayList<Reservation> rezarvasyonlar) {
        Reservation.rezarvasyonlar = rezarvasyonlar;
    }

}
