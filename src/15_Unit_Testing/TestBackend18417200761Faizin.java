/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest.database;

/**
 *
 * @author riza
 */

public class TestBackend18417200761Faizin {

    public static void main(String[] args) {
        Kategori1841720061Faizin kat1 = new Kategori1841720061Faizin("Novel", "Koleksi buku novel");
        Kategori1841720061Faizin kat2 = new Kategori1841720061Faizin("Referensi", "Buku referensi ilmiah");
        Kategori1841720061Faizin kat3 = new Kategori1841720061Faizin("Komik", "Komik anak-anak");

        // test insert
        kat1.save();
        kat2.save();
        kat3.save();

        // test update
        kat2.setKeterangan("Koleksi buku referensi ilmiah");
        kat2.save();

        // test delete
        kat3.delete();

        // test select all
        for (Kategori1841720061Faizin k : new Kategori1841720061Faizin().getAll()) {
            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
        }

        // test search
        for (Kategori1841720061Faizin k : new Kategori1841720061Faizin().search("ilmiah")) {
            System.out.println("Nama: " + k.getNama() + ", Ket: " + k.getKeterangan());
        }
    }
}