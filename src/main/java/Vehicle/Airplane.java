package Vehicle;

public class Airplane extends Vehicle {

    public Airplane(String araçİsmi, String yakıtTürü, int kilometreUcreti, int yolcuKapasitesi, String guzargah) {
        super(araçİsmi, yakıtTürü, kilometreUcreti, yolcuKapasitesi, guzargah);
    }

    public Airplane(String araçİsmi, String yakıtTürü, int kilometreUcreti, int yolcuKapasitesi) {
        super(araçİsmi, yakıtTürü, kilometreUcreti, yolcuKapasitesi);
    }

    @Override
    public int calculateFuelCoast(int mesafe, int kilometreUcreti) {
        return mesafe * kilometreUcreti;
    }

}
