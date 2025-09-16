package models;

public class Novel extends Buku {
    public String genre;
    
    public Novel(String judul, String penulis, int halaman, String genre) {
        super(judul, penulis, halaman);
        this.genre = genre;
    }
    
    public void infoBuku() {
        super.infoBuku();
        System.out.println("Genre: " + genre);
    }
}