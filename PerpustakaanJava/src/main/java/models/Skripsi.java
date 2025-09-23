/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author User
 */
public class Skripsi extends ItemPerpustakaan {
    private String jurusan;

    public Skripsi(String jurusan, String judul, int tahunTerbit) {
        super(judul, tahunTerbit);
        this.jurusan = jurusan;
    }
    
    public void tampikanInfo() {
        System.out.println("Skripsi: " + getJudul() + " | Jurusan: " + jurusan );
    }
}
