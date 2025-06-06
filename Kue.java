/*
Buatlah sebuah klas abstract Kue yang memiliki attribut dan method sebagai berikut
- nama : String
- harga : double
+ hitungHarga()** : double
+ toString : String (menampilkan nama kue dan harga)
** abstract
*/
public abstract class Kue {
    private String nama;
    private double harga;

    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
    public String getNama() {
        return nama;
    }
    public double getHarga() {
        return harga;
    }
    public abstract double hitungHarga();
    @Override
    public String toString() {
        return "Nama Kue: " + nama + ", Harga Satuan: " + harga;
    }
}