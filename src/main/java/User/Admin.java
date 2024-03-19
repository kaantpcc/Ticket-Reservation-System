package User;

import java.util.ArrayList;

public class Admin extends User {

    public final String adminKullaniciAdi = "admin";
    public final String adminSifre = "admin";
    public static int hizmetBedel;

    public static ArrayList<String> firmalar = new ArrayList<>();

    static {
        firmalar.add("A firması");
        firmalar.add("B firması");
        firmalar.add("C firması");
        firmalar.add("D firması");
        firmalar.add("F firması");
    }

    public Admin(String username, String password) {
        super(username, password);
    }

    @Override
    public boolean login(String enteredUsername, String enteredPassword) {
        return enteredUsername.equals(this.adminKullaniciAdi) && enteredPassword.equals(this.adminSifre);
    }

    public static void firmaEkle(String firmaAdı) {
        firmalar.add(firmaAdı);
    }

    public static void firmaSil(int index) {
        firmalar.remove(index);
    }

    public static int hizmetBedeliBelirle(int belirlenenBedel) {
        Admin.hizmetBedel = belirlenenBedel;
        return belirlenenBedel;
    }

    public static ArrayList<String> getFirmalar() {
        return firmalar;
    }

}
