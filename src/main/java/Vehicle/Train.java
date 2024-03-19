package Vehicle;

public class Train extends Vehicle {

    public Train(String araçİsmi, String yakıtTürü, int kilometreUcreti, int yolcuKapasitesi, String guzargah) {
        super(araçİsmi, yakıtTürü, kilometreUcreti, yolcuKapasitesi, guzargah);
    }

    public Train(String araçİsmi, String yakıtTürü, int kilometreUcreti, int yolcuKapasitesi) {
        super(araçİsmi, yakıtTürü, kilometreUcreti, yolcuKapasitesi);
    }

    @Override
    public int calculateFuelCoast(int mesafe, int kilometreUcreti) {
        return mesafe * kilometreUcreti;
    }

}
