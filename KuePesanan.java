/*
Buatlah 2 subklas dari klas Kue yaitu
a. KuePesanan
- berat : double
+ hitungHarga() : double
Hitung harga berdasarkan harga x berat
*/
public class KuePesanan extends Kue {
    private double berat; // berat dalam kg

    public KuePesanan(String nama, double harga, double berat) {
        super(nama, harga);
        this.berat = berat;
    }
    public double getBerat() {
        return berat;
    }

    @Override
    public double hitungHarga() {
        return berat * getHarga();
    }

    @Override
    public String toString() {
        return "[Kue Pesanan] " + super.toString() + ", Berat: " + berat + ", Total Harga: " + hitungHarga();
    }
}