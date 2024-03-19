package Trip;

import User.Company;
import Vehicle.Vehicle;
import java.util.ArrayList;

public class Transport {

    private ArrayList<Company> sirketler = Company.şirketler;
    private ArrayList<Vehicle> araclar;

    public ArrayList<Company> getSirketler() {
        return sirketler;
    }

    public void setSirketler(ArrayList<Company> sirketler) {
        this.sirketler = sirketler;
    }

    public ArrayList<Vehicle> getAraclar() {
        return araclar;
    }

    public void setAraclar(ArrayList<Vehicle> araclar) {
        this.araclar = araclar;
    }

}
