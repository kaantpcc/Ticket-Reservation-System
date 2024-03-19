package Trip;

import Vehicle.Vehicle;

public class Trip {

    private Vehicle aracIsmi;
    private String guzergah;
    private String tarih;

    public Trip() {

    }

    public Trip(Vehicle aracIsmi, String guzergah) {
        this.aracIsmi = aracIsmi;
        this.guzergah = guzergah;

    }

    public Vehicle getAracIsmi() {
        return aracIsmi;
    }

    public void setAracIsmi(Vehicle aracIsmi) {
        this.aracIsmi = aracIsmi;
    }

    public String getGuzergah() {
        return guzergah;
    }

    public void setGuzergah(String guzergah) {
        this.guzergah = guzergah;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

}
