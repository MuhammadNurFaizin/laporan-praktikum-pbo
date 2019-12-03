package backend;

import backend.*;

public class TestBackend1841720061Faizin {
    public static void main(String[] args) {
        Kategori1841720061Faizin kat1 = new Kategori1841720061Faizin("Novel", "Koleksi buku novel");
        Kategori1841720061Faizin kat2 = new Kategori1841720061Faizin("REfrensi", "Buku refrensi ilmiah");
        Kategori1841720061Faizin kat3 = new Kategori1841720061Faizin ("Komik", "Komik anak-anak");
        
        //test insert
        kat1.save();
        kat2.save();
        kat3.save();
        
        // test update
        kat2.setKeterangan("Koleksi buku refrensi ilmiah");
        kat2.save();
        
        // test delete
        kat3.delete();
        
        // test select all
        for(Kategori1841720061Faizin k : new Kategori1841720061Faizin().getAll()){
            System.out.println("Nama: "+ k.getNama() + ", Ket: " + k.getKeterangan());
            
        }
        
        //test search
        for(Kategori1841720061Faizin k : new Kategori1841720061Faizin().search("ilmiah")){
            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
        }
    }
}
