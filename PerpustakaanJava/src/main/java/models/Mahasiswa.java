package models;

import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    public String nama;
    public ArrayList<Buku> bukuDipinjam;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        this.bukuDipinjam = new ArrayList<>();
    }
    
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
    
    public void pinjamBuku(Buku buku) {
        bukuDipinjam.add(buku);
        System.out.println(nama + " meminjam buku: " + buku.judul);
    }
    
    public void infoMahasiswa() {
        System.out.println("\n||=================================||");
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("NIM            : " + nim);
        System.out.println("Daftar Buku yang Dipinjam:");
        
        if (bukuDipinjam.isEmpty()) {
            System.out.println("Belum ada buku yang dipinjam.");
        } else {
            for (Buku b : bukuDipinjam) {
                b.infoBuku();
            }
        }
        System.out.println("||=================================||");
    }
}
