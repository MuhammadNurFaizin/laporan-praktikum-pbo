/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author asus
 */
public class Buku1841720061Faizin {
private int idBuku;
private String Nama;
private String Judul;
private String Penulis;
private String Penerbit;
private String Kategori;

public Buku1841720061Faizin(){
    
}

    public Buku1841720061Faizin(int idBuku, String Nama, String Judul, String Penulis, String Penerbit, String Kategori) {
        this.idBuku = idBuku;
        this.Nama = Nama;
        this.Judul = Judul;
        this.Penulis = Penulis;
        this.Penerbit = Penerbit;
        this.Kategori = Kategori;
    }

    public void setIdBuku(int idBuku) {
        this.idBuku = idBuku;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setJudul(String Judul) {
        this.Judul = Judul;
    }

    public void setPenulis(String Penulis) {
        this.Penulis = Penulis;
    }

    public void setPenerbit(String Penerbit) {
        this.Penerbit = Penerbit;
    }
    public void setKategori(String Kategori){
    this.Kategori = Kategori;
    }

    public int getIdBuku() {
        return idBuku;
    }

    public String getNama() {
        return Nama;
    }

    public String getJudul() {
        return Judul;
    }

    public String getPenulis() {
        return Penulis;
    }

    public String getPenerbit() {
        return Penerbit;
    }
    public String getKategori(){
        return Kategori;
    }
    
public Buku1841720061Faizin getById(int id){
    Buku1841720061Faizin buku = new Buku1841720061Faizin();
    ResultSet rs = DBHelper1841720061Faizin.selectQuery("SELECT * FROM bukuegori" + "WHERE idBuku = '" + id + "'");
    
    try{
        while(rs.next()){
            buku = new Buku1841720061Faizin();
            buku.setIdBuku(rs.getInt("idBuku"));
            buku.setNama(rs.getString("nama"));
            buku.setKategori(rs.getString("Kategori"));
            buku.setJudul(rs.getString("Judul"));
            buku.setPenerbit(rs.getString("Penerbit"));
            buku.setPenulis(rs.getString("Penulis"));           
        }
    }
    catch (Exception e){
        e.printStackTrace();
    }
    return buku;
}
public ArrayList<Buku1841720061Faizin> getAll(){
    ArrayList<Buku1841720061Faizin> ListBuku = new ArrayList();
    
    ResultSet rs = DBHelper1841720061Faizin.selectQuery("SELECT * FROM  bukuegori");
    
    try{
        while(rs.next()){
            Buku1841720061Faizin buku = new Buku1841720061Faizin();
            buku.setIdBuku(rs.getInt("idBuku"));
            buku.setNama(rs.getString("nama"));
            buku.setKategori(rs.getString("Kategori"));
            buku.setJudul(rs.getString("Judul"));
            buku.setPenerbit(rs.getString("Penerbit"));
            buku.setPenulis(rs.getString("Penulis"));  
            
            ListBuku.add(buku);
        }
    }
    catch (Exception e){
        e.printStackTrace();
    }
    return ListBuku;
}

public ArrayList<Buku1841720061Faizin> search(String keyword){
    
    ArrayList<Buku1841720061Faizin> ListBuku = new ArrayList();
    
    String sql = "SELECT * FROM bukuegori WHERE" + "       nama LIKE '%" + keyword + "%' " + "     OR keterangan LIKE '%" + keyword + "%'";

    ResultSet rs = DBHelper1841720061Faizin.selectQuery(sql);
    
    try {
        while(rs.next()){
            Buku1841720061Faizin buku = new Buku1841720061Faizin();
            buku = new Buku1841720061Faizin();
            buku.setIdBuku(rs.getInt("idBuku"));
            buku.setNama(rs.getString("nama"));
            buku.setKategori(rs.getString("Kategori"));
            buku.setJudul(rs.getString("Judul"));
            buku.setPenerbit(rs.getString("Penerbit"));
            buku.setPenulis(rs.getString("Penulis"));  
            
            ListBuku.add(buku);
        }
    }
    catch (Exception e){
        e.printStackTrace();
    }
    return ListBuku;
}

public void save(){
    if(getById(idBuku).getIdBuku()== 0){
        String SQL = "INSERT INTO bukuegori (nama, keterangan) VALUES(" 
                + "          '" + this.Nama + "',"  
                + "     '" + this.Kategori + "' "
                + "     '" + this.Judul + "' "
                + "          '" + this.Penerbit + "',"
                + "          '" + this.Penulis + "',"
                + "          '" + this.idBuku + "',"
                +"  )";
        this.idBuku = DBHelper1841720061Faizin.insertQueryGetId(SQL);
        
}
    else{
        String SQL = "UPDATE bukuegori SET"
                + "          '" + this.Nama + "',"  
                + "     '" + this.Kategori + "' "
                + "     '" + this.Judul + "' "
                + "          '" + this.Penerbit + "',"
                + "          '" + this.Penulis + "',"
                + "          '" + this.idBuku + "',";
        DBHelper1841720061Faizin.executeQuery(SQL);
    }
}
public void delete(){
    String SQL = "DELETE FROM bukuegori WHERE idBuku = '" + this.idBuku + "'";
    DBHelper1841720061Faizin.executeQuery(SQL);
}
}

