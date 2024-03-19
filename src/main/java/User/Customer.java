package User;

public class Customer {

    private static String yolcuSayisi;

    public Customer() {
    }

    public Customer(String yolcuSayisi) {
        this.yolcuSayisi = yolcuSayisi;
    }

    public String getYolcuSayisi() {
        return yolcuSayisi;
    }

    public void setYolcuSayisi(String yolcuSayisi) {
        this.yolcuSayisi = yolcuSayisi;
    }

}
