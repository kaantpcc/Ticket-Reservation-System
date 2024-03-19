package Vehicle;

public class Bus extends Vehicle {

    public Bus(String araçİsmi, String yakıtTürü, int kilometreUcreti, int yolcuKapasitesi, String guzargah) {
        super(araçİsmi, yakıtTürü, kilometreUcreti, yolcuKapasitesi, guzargah);
    }

    public Bus(String araçİsmi, String yakıtTürü, int kilometreUcreti, int yolcuKapasitesi) {
        super(araçİsmi, yakıtTürü, kilometreUcreti, yolcuKapasitesi);
    }

    @Override
    public int calculateFuelCoast(int mesafe, int kilometreUcreti) {
        return mesafe * kilometreUcreti;
    }

}
