package tokobangunan;
import java.util.Scanner;
import model.Barang;
import model.Transaksi;

public class Toko_bangunan {
    private static final Transaksi transaksi = new Transaksi();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Tampilkan Rincian Transaksi");
            System.out.println("3. Edit Barang");
            System.out.println("4. Hapus Barang");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    tambahBarang();
                    break;
                case 2:
                    tampilkanRincianTransaksi();
                    break;
                case 3:
                    editBarang();
                    break;
                case 4:
                    hapusBarang();
                    break;
            }
        } while (pilihan != 5);
    }

    private static void tambahBarang() {
        System.out.println("Tambah Barang");
        System.out.print("Nama: ");
        String nama = scanner.next();
        System.out.print("Harga: ");
        double harga = scanner.nextDouble();

        Barang barang = new Barang(nama, harga);
        transaksi.tambahBarang(barang);
        System.out.println("Barang ditambahkan.");
    }

    private static void tampilkanRincianTransaksi() {
        transaksi.tampilkanRincianTransaksi();
    }

    private static void editBarang() {
        System.out.print("Nama Barang yang akan diedit: ");
        String namaBarang = scanner.next();
        System.out.println("Edit Barang");
        System.out.print("Masukkan Nama Baru: ");
        String newNama = scanner.next();
        System.out.print("Masukkan Harga Baru: ");
        double newHarga = scanner.nextDouble();

        transaksi.editBarang(namaBarang, newNama, newHarga);
    }

    private static void hapusBarang() {
        System.out.print("Nama Barang yang akan dihapus: ");
        String namaBarang = scanner.next();
        transaksi.hapusBarang(namaBarang);
    }
}
