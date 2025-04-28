/*
b. KueJadi
- jumlah : double
+ hitungHarga() : double
Hitung harga berdasarkan harga x jumlah x 2
*/
public class KueJadi extends Kue {
    private double jumlah; // jumlah dalam satuan pcs

    public KueJadi(String nama, double harga, double jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    public double getJumlah() {
        return jumlah;
    }

    @Override
    public double hitungHarga() {
        return jumlah * 2 * getHarga(); // jumlah x 2 x harga
    }

    @Override
    public String toString() {
        return "[Kue Jadi] " + super.toString() + ", Jumlah: " + jumlah + ", Total Harga: " + hitungHarga();
    }
}