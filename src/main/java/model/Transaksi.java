package model;

import java.util.ArrayList;
import java.util.List;

public class Transaksi {
    private List<Barang> daftarBarang = new ArrayList<>();

    public void tambahBarang(Barang barang) {
        daftarBarang.add(barang);
    }

    public void tampilkanRincianTransaksi() {
        System.out.println("Rincian Transaksi");
        double totalHarga = 0;
        for (Barang barang : daftarBarang) {
            System.out.println("Nama: " + barang.getNama());
            System.out.println("Harga: " + barang.getHarga());
            totalHarga += barang.getHarga();
            System.out.println("---------------------------");
        }
        System.out.println("Total Harga: " + totalHarga);
    }

    public void hapusBarang(String namaBarang) {
        for (Barang barang : daftarBarang) {
            if (barang.getNama().equals(namaBarang)) {
                daftarBarang.remove(barang);
                System.out.println("Barang dihapus.");
                return;
            }
        }
        System.out.println("Barang dengan nama tersebut tidak ditemukan.");
    }

    public void editBarang(String namaBarang, String newNama, double newHarga) {
        for (Barang barang : daftarBarang) {
            if (barang.getNama().equals(namaBarang)) {
                barang.setNama(newNama);
                barang.setHarga(newHarga);
                System.out.println("Barang diubah.");
                return;
            }
        }
        System.out.println("Barang dengan nama tersebut tidak ditemukan.");
    }
}
