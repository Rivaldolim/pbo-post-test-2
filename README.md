Nama: Rivaldo 

NIM:2209116072

1. Penjelasan Codingan
   
Bagian 1: Package dan Kelas Utama (Toko_bangunan.java):
Dalam package tokobangunan, terdapat kelas utama yang disebut Toko_bangunan. Kelas ini memiliki dua atribut statis, yaitu transaksi yang merepresentasikan objek Transaksi dan scanner untuk menerima input dari pengguna. Method main merupakan titik masuk program, dan program akan terus berjalan selama pengguna tidak memilih keluar. Disini user diminta untuk menginputkan pilihan menu.

Bagian 2: Kelas Barang (Barang.java):
Dalam package model, terdapat kelas Barang yang merepresentasikan entitas barang. Kelas ini memiliki dua properti, nama dan harga, serta method setter dan getter untuk keduanya.

Bagian 3: Kelas Transaksi (Transaksi.java):
Dalam package model, terdapat kelas Transaksi yang merepresentasikan transaksi di toko bangunan. Kelas ini memiliki list barang dan beberapa method untuk menambahkan, menampilkan rincian, menghapus, dan mengedit barang dalam transaksi.

Bagian 4: Sub Menu Tambah Barang
Dalam metode tambahBarang(), program meminta input nama dan harga barang dari pengguna. Selanjutnya, objek Barang dibuat dengan data yang dimasukkan, dan objek ini ditambahkan ke dalam transaksi. Pengguna diberi informasi bahwa barang berhasil ditambahkan.

Bagian 5: Sub Menu Tampilkan Rincian Transaksi:
Dalam metode tampilkanRincianTransaksi(), program memanggil metode yang ada di objek transaksi untuk menampilkan rincian transaksi, termasuk daftar barang yang ada dan total harga transaksi.

Bagian 6: Sub Menu Edit Barang:
Metode editBarang() meminta input nama barang yang akan diubah dan data baru (nama dan harga). Program memanggil metode editBarang dari objek transaksi untuk mengubah data barang.

Bagian 7: Sub Menu Hapus Barang:
Metode hapusBarang() meminta input nama barang yang akan dihapus. Program memanggil metode hapusBarang dari objek transaksi untuk menghapus barang dengan nama tersebut.

2. Output
   
1. Menu
   
   ![image](https://github.com/Rivaldolim/pbo-post-test-2/assets/126888076/e4e8d0ef-c606-4046-8a51-fa2f52d5a2f4)

 
2. Tambah Barang

![image](https://github.com/Rivaldolim/pbo-post-test-2/assets/126888076/87eb4ccf-83c5-4a1b-bedb-6ec2afcbd9c2)

3. Tampilkan Transaksi

   ![image](https://github.com/Rivaldolim/pbo-post-test-2/assets/126888076/89df5076-d736-4630-ae47-14f25c384a33)

4. Edit Barang
   
   ![image](https://github.com/Rivaldolim/pbo-post-test-2/assets/126888076/986a225b-d52d-4769-af96-3813b7e382f9)
   
5. Hapus Barang

   ![image](https://github.com/Rivaldolim/pbo-post-test-2/assets/126888076/379bec61-1ae7-4755-a724-1f8cf3cd9950)
 
6.  Keluar

![image](https://github.com/Rivaldolim/pbo-post-test-2/assets/126888076/a754807a-87e3-47d0-a386-48229029d156)
