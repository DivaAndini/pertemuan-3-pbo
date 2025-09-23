/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author User
 */
public class ItemPerpustakaan {
    private String judul;
    private int tahunTerbit;
    private boolean dipinjam;

    public ItemPerpustakaan(String judul, int tahunTerbit) {
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.dipinjam = false;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }
    
    public boolean isDipinjam() {
        return dipinjam;
    }
    
    public void pinjam() {
        if (!dipinjam) {
            dipinjam = true;
            System.out.println(judul + " berhasil dipinjam");
        } else {
            System.out.println(judul + " sedang dipinjam orang lain");
        }
    }
    
    public void kembalikan() {
        if (dipinjam) {
            dipinjam = false;
            System.out.println(judul + " berhasil dikembalikan");
        } else {
            System.out.println(judul + " tidak sedang dipinjam");
        }
    }
    
    public void tampilkanInfo() {
        System.out.println("\nJudul: " + judul);
        System.out.println("Tahun Terbit " + tahunTerbit);
        System.out.println("Status: " + (dipinjam ? "Dipinjam" : "Tersedia"));
    }  
}
