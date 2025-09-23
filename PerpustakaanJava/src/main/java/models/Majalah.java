/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author User
 */
public class Majalah extends ItemPerpustakaan {
    private int edisi;

    public Majalah(int edisi, String judul, int tahunTerbit) {
        super(judul, tahunTerbit);
        this.edisi = edisi;
    }

    public int getEdisi() {
        return edisi;
    }

    public void setEdisi(int edisi) {
        this.edisi = edisi;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Edisi " + edisi);
    }
}
