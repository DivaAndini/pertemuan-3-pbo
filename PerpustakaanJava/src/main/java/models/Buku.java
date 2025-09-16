package models;

public class Buku {
    public String judul;
    public String penulis;
    public int halaman;

    public Buku(String judul, String penulis, int halaman) {
        this.judul = judul;
        this.penulis = penulis;
        this.halaman = halaman;
    }
 
    public void infoBuku(){
        System.out.println("==============================");
        System.out.println("Judul Buku: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Jmlh. Hal.: " + halaman);
    }
}
