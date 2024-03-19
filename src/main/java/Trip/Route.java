package Trip;

public class Route {

    private String kalkisNoktasi;
    private String varisNoktasi;

    public Route() {
    }

    public Route(String kalkisNoktasi, String varisNoktasi) {
        this.kalkisNoktasi = kalkisNoktasi;
        this.varisNoktasi = varisNoktasi;
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

}
