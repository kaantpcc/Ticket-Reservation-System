package User;

import Trip.Trip;
import Vehicle.Vehicle;
import User.User;
import java.util.ArrayList;

public class Company extends User {

    private ArrayList<Vehicle> aracListesi;
    private ArrayList<Trip> seferSayısı;
    public static ArrayList<Company> şirketler = new ArrayList<Company>();
    private int kullananPersonelUcreti;
    private int hizmetPersonelUcreti;

    public Company(ArrayList<Vehicle> aracListesi, ArrayList<Trip> seferSayısı, int kullananPersonelUcreti, int hizmetPersonelUcreti, String username, String password) {
        super(username, password);
        this.aracListesi = aracListesi;
        this.seferSayısı = seferSayısı;
        this.kullananPersonelUcreti = kullananPersonelUcreti;
        this.hizmetPersonelUcreti = hizmetPersonelUcreti;
    }

    public Company(String username, String password, int kullananPersonelUcreti, int hizmetPersonelUcreti) {
        super(username, password);
        this.aracListesi = new ArrayList<>();
        this.seferSayısı = new ArrayList<>();
        this.kullananPersonelUcreti = kullananPersonelUcreti;
        this.hizmetPersonelUcreti = hizmetPersonelUcreti;
    }

    public Company(ArrayList<Vehicle> aracListesi, String username, String password) {
        super(username, password);
        this.aracListesi = aracListesi;
        this.seferSayısı = new ArrayList<>();
    }

    public Company(ArrayList<Vehicle> aracListesi, ArrayList<Trip> seferSayısı, String username, String password) {
        super(username, password);
        this.aracListesi = aracListesi;
        this.seferSayısı = seferSayısı;
    }

    public ArrayList<Vehicle> getAracListesi() {
        return aracListesi;
    }

    public void setAracListesi(ArrayList<Vehicle> aracListesi) {
        this.aracListesi = aracListesi;
    }

    public ArrayList<Trip> getSeferSayısı() {
        return seferSayısı;
    }

    public void setSeferSayısı(ArrayList<Trip> seferSayısı) {
        this.seferSayısı = seferSayısı;
    }

    public static void aracEkle(Vehicle eklenecekArac, Company currentCompany) {
        if (currentCompany.aracListesi != null) {
            currentCompany.aracListesi.add(eklenecekArac);
        }

    }

    public static void seferEkle(Trip eklenecekSefer, Company currentCompany) {
        if (currentCompany.seferSayısı != null) {
            currentCompany.seferSayısı.add(eklenecekSefer);
        }

    }

    public static void aracSil(int silinecekArac, Company currentCompany) {
        if (currentCompany.aracListesi != null) {
            currentCompany.aracListesi.remove(silinecekArac);
        }

    }

    public static void seferSil(int silinecekSefer, Company currentCompany) {
        if (currentCompany.aracListesi != null) {
            currentCompany.seferSayısı.remove(silinecekSefer);
        }

    }

    public static ArrayList<Company> guncelleşirketler() {
        return şirketler;

    }

    public static ArrayList<Company> getŞirketler() {
        return şirketler;
    }

    public static void setŞirketler(ArrayList<Company> şirketler) {
        Company.şirketler = şirketler;
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

    @Override
    public boolean login(String enteredUsername, String enteredPassword) {
        return true;
    }

}
