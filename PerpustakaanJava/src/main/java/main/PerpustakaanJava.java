
package main;

import java.util.ArrayList;
import models.Buku;
import models.Mahasiswa;
import models.Novel;

public class PerpustakaanJava {

    public static void main(String[] args) {
        // membuat objek buku
        Buku bukuSejarah = new Buku("Sejarah Perjuangan", "Munir", 126);
        Novel novelFantasi = new Novel ("Harry Potter", "J.K. Rowling", 545, "Fantasy");
        
        // menampilkan info buku
        bukuSejarah.infoBuku();
        novelFantasi.infoBuku();
        
        // membuat arraylist untuk daftar buku
        ArrayList<Buku> daftarBuku = new ArrayList<>();
        
        // menambahkan objek buku ke array list daftarBuku
        daftarBuku.add(bukuSejarah);
        daftarBuku.add(new Buku("Ayat-Ayat Kiri", "Karl Marx", 119));
        daftarBuku.add(new Buku("Aksi Massa", "Tan Malaka", 123));
        
        daftarBuku.add(novelFantasi);
        
        // menampilkan daftar buku
        System.out.println("=== Daftar Buku di Perpustakaan ===");
        for (Buku b : daftarBuku) {
            b.infoBuku();
        }   
        
        // membuat objek mahasiswa
        Mahasiswa m1 = new Mahasiswa("2409116000", "Budi");
        
        // objek mahasiswa meminjam buku
        m1.pinjamBuku(daftarBuku.get(0));
        
        // menampilkan buku yang dipinjam oleh objek mahasiswa
        m1.infoMahasiswa();
    }
}
