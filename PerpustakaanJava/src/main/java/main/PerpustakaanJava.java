package main;

import java.util.ArrayList;
import models.Buku;
import models.Mahasiswa;
import models.Majalah;
import models.Skripsi;

public class PerpustakaanJava {
    public static void main(String[] args) {
      
        // membuat objek Buku
        Buku bukuSejarah = new Buku("Sejarah Perjuangan", "Munir", 126);
        
        // menampilkan informasi bukuSejarah
        bukuSejarah.infoBuku();        
        
        // membuat ArrayList untuk daftarBuku 
        ArrayList<Buku> daftarBuku = new ArrayList<>();
        
        // menambahkan beberapa objek Buku ke ArrayList daftarBuku
        daftarBuku.add(bukuSejarah);
        daftarBuku.add(new Buku("Ayat-Ayat Kiri", "Karl Marx", 119));
        daftarBuku.add(new Buku("Aksi Massa", "Tan Malaka", 123));
        
        // menampilkan isi ArrayList daftarBuku
        System.out.println("\n=== Daftar Buku di Perpustakaan ===");
        for (Buku b : daftarBuku) {
            b.infoBuku();
        }

        // membuat objek Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa("2409116000", "Budi");
        
        // mengakses NIM m1
        System.out.println("\nAkses NIM menggunakan getter: " + mahasiswa1.getNim());
        
        // menambahkan objek Buku ke dalam ArrayList bukuDipinjam sesuai indeks
        mahasiswa1.pinjamBuku(daftarBuku.get(0));
        mahasiswa1.pinjamBuku(daftarBuku.get(2));
        
        // menampilkan informasi peminjaman buku yang dilakukan m1
        mahasiswa1.infoMahasiswa();
        
        // membuat objek Majalah
        Majalah majalah1 = new Majalah(12,"National Geographic", 2023);
        
        // menampilkan data majalah1
        System.out.println("\n===Data Majalah===");
        majalah1.tampilkanInfo();
        
        majalah1.pinjam();
        majalah1.tampilkanInfo();
        
        // membuat objek Skripsi
        Skripsi skripsi1 = new Skripsi("Sistem informasi", "Adopsi teknologi informasi terhadap....", 2025);
        
        // menampilkan info skripsi1
        skripsi1.tampikanInfo();
    }
}
