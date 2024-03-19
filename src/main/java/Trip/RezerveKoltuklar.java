package Trip;

import java.util.ArrayList;

public class RezerveKoltuklar implements Interfaces.IReservable {

    private ArrayList<Boolean> rezerveKoltuklar;

    public RezerveKoltuklar(int koltukSayisi) {
        rezerveKoltuklar = new ArrayList<>(koltukSayisi);
        for (int i = 0; i < koltukSayisi; i++) {
            rezerveKoltuklar.add(false);
        }
    }

    @Override
    public boolean reserveMi(int koltukNo) {
        if (koltukNo > 0 && koltukNo <= rezerveKoltuklar.size()) {
            return rezerveKoltuklar.get(koltukNo - 1);
        }
        return false;
    }

    public void reserveKoltuk(int koltukNo) {
        if (koltukNo > 0 && koltukNo <= rezerveKoltuklar.size() && !rezerveKoltuklar.get(koltukNo - 1)) {
            rezerveKoltuklar.set(koltukNo - 1, true);
        }
    }

    public ArrayList<Boolean> getRezerveKoltuklar() {
        return rezerveKoltuklar;
    }

}
