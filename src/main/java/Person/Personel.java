package Person;

import User.Company;
import java.util.ArrayList;

public class Personel extends Person {

    private ArrayList<Company> sirketler = Company.şirketler;
    public static ArrayList<Personel> personeller = new ArrayList<Personel>();
    private int kullananPersonelUcreti;
    private int hizmetPersonelUcreti;

    public Personel(int kullananPersonelUcreti, int hizmetPersonelUcreti, String ad, String soyad) {
        super(ad, soyad);
        this.kullananPersonelUcreti = kullananPersonelUcreti;
        this.hizmetPersonelUcreti = hizmetPersonelUcreti;
    }

    public static ArrayList<Personel> getPersoneller() {
        return personeller;
    }

    public static void setPersoneller(ArrayList<Personel> personeller) {
        Personel.personeller = personeller;
    }

    public int getKullananPersonelUcreti() {
        return kullananPersonelUcreti;
    }

    public void setKullananPersonelUcreti(int kullananPersonelUcreti) {
        this.kullananPersonelUcreti = kullananPersonelUcreti;
    }

    public int getHizmetPersonelUcreti() {
        return hizmetPersonelUcreti;
    }

    public void setHizmetPersonelUcreti(int hizmetPersonelUcreti) {
        this.hizmetPersonelUcreti = hizmetPersonelUcreti;
    }

}
