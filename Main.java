/*
Berdasarkan 2 kelas tersebut, buatlah :
1. Array yang terdiri dari 20 kue
2. Isikan 20 objek kue dengan berbagai jenis kue (KuePesanan atau KueJadi)
3. Dari array tersebut :
a. Tampilkan semua kue dan harus ditampilkan jenis kuenya
b. Hitung total harga yang didapat dari semua jenis kue
c. Hitung total harga dan total berat dari KuePesanan
d. Hitung total harga dan total jumlah dari KueJadi
e. Tampilkan informasi kue dengan harga (harga akhir) terbesar
*/
public class Main {
    public static void main(String[] args) {
        Kue[] daftarKue = new Kue[20];

        // Isi data 20 kue
        daftarKue[0] = new KuePesanan("Apem", 20, 2);
        daftarKue[1] = new KuePesanan("Bika Ambon", 30, 1);
        daftarKue[2] = new KuePesanan("Bakpao", 25, 2);
        daftarKue[3] = new KuePesanan("Donat", 18, 1);
        daftarKue[4] = new KuePesanan("Molen", 22, 2);
        daftarKue[5] = new KuePesanan("Klepon", 28, 1);
        daftarKue[6] = new KuePesanan("Pai Susu", 26, 2);
        daftarKue[7] = new KuePesanan("Putu", 15, 1);
        daftarKue[8] = new KuePesanan("Kue Ulang Tahun", 20, 2);
        daftarKue[9] = new KuePesanan("Terang Bulan", 24, 7);
        daftarKue[10] = new KueJadi("Brownies", 5, 10);
        daftarKue[11] = new KueJadi("Bakpia", 3, 20);
        daftarKue[12] = new KueJadi("Bolu", 7, 8);
        daftarKue[13] = new KueJadi("Getuk", 4, 15);
        daftarKue[14] = new KueJadi("Jenang", 2, 50);
        daftarKue[15] = new KueJadi("Onde-onde", 6, 12);
        daftarKue[16] = new KueJadi("Pukis", 1, 40);
        daftarKue[17] = new KueJadi("Pancong", 5, 30);
        daftarKue[18] = new KueJadi("Serabi", 3, 18);
        daftarKue[19] = new KueJadi("Nastar", 2, 25);

        double totalHargaSemua = 0;
        double totalHargaPesanan = 0;
        double totalBeratPesanan = 0;
        double totalHargaJadi = 0;
        double totalJumlahJadi = 0;
        Kue kueTermahal = daftarKue[0];

        System.out.println("== Daftar Semua Kue ==");
        for (Kue kue : daftarKue) {
            System.out.println(kue.toString());

            double hargaKue = kue.hitungHarga();
            totalHargaSemua += hargaKue;

            if (kue instanceof KuePesanan) {
                totalHargaPesanan += hargaKue;
                totalBeratPesanan += ((KuePesanan) kue).getBerat();
            } else if (kue instanceof KueJadi) {
                totalHargaJadi += hargaKue;
                totalJumlahJadi += ((KueJadi) kue).getJumlah();
            }

            if (hargaKue > kueTermahal.hitungHarga()) {
                kueTermahal = kue;
            }
        }

        System.out.println("\n== Informasi ==");
        System.out.println("Total Harga Semua Kue: " + totalHargaSemua);
        System.out.println("Total Harga Kue Pesanan: " + totalHargaPesanan);
        System.out.println("Total Berat Kue Pesanan: " + totalBeratPesanan + " kg");
        System.out.println("Total Harga Kue Jadi: $" + totalHargaJadi);
        System.out.println("Total Jumlah Kue Jadi: " + totalJumlahJadi);
        System.out.println("\nKue dengan Harga Terbesar:");
        System.out.println(kueTermahal.toString());
    }
}