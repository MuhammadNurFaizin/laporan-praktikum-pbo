package backend;

import java.util.ArrayList;
import java.sql.*;

public class Kategori1841720061Faizin {
private int idkategori;
private String nama;
private String keterangan;

public Kategori1841720061Faizin(){
    
}

    public Kategori1841720061Faizin(String nama, String keterangan) {
        this.nama = nama;
        this.keterangan = keterangan;
    }

    public void setIdkategori(int idkategori) {
        this.idkategori = idkategori;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public int getIdkategori() {
        return idkategori;
    }

    public String getNama() {
        return nama;
    }

    public String getKeterangan() {
        return keterangan;
    }
    
public Kategori1841720061Faizin getById(int id){
    Kategori1841720061Faizin kat = new Kategori1841720061Faizin();
    ResultSet rs = DBHelper1841720061Faizin.selectQuery("SELECT * FROM kategori" + "WHERE idkategori = '" + id + "'");
    
    try{
        while(rs.next()){
            kat = new Kategori1841720061Faizin();
            kat.setIdkategori(rs.getInt("idkategori"));
            kat.setNama(rs.getString("nama"));
            kat.setKeterangan("keterangan");
        }
    }
    catch (Exception e){
        e.printStackTrace();
    }
    return kat;
}
public ArrayList<Kategori1841720061Faizin> getAll(){
    ArrayList<Kategori1841720061Faizin> ListKategori = new ArrayList();
    
    ResultSet rs = DBHelper1841720061Faizin.selectQuery("SELECT * FROM  kategori");
    
    try{
        while(rs.next()){
            Kategori1841720061Faizin kat = new Kategori1841720061Faizin();
            kat.setIdkategori(rs.getInt("idkategori"));
            kat.setNama(rs.getString("nama"));
            kat.setKeterangan(rs.getString("keterangan"));
            
            ListKategori.add(kat);
        }
    }
    catch (Exception e){
        e.printStackTrace();
    }
    return ListKategori;
}

public ArrayList<Kategori1841720061Faizin> search(String keyword){
    
    ArrayList<Kategori1841720061Faizin> ListKategori = new ArrayList();
    
    String sql = "SELECT * FROM kategori WHERE" + "       nama LIKE '%" + keyword + "%' " + "     OR keterangan LIKE '%" + keyword + "%' ";

    ResultSet rs = DBHelper1841720061Faizin.selectQuery(sql);
    
    try {
        while(rs.next()){
            Kategori1841720061Faizin kat = new Kategori1841720061Faizin();
            kat.setIdkategori(rs.getInt("idkategori"));
            kat.setNama("nama");
            kat.setKeterangan("keterangan");
            
            ListKategori.add(kat);
        }
    }
    catch (Exception e){
        e.printStackTrace();
    }
    return ListKategori;
}

public void save(){
    if(getById(idkategori).getIdkategori()== 0){
        String SQL = "INSERT INTO kategori (nama, keterangan) VALUES(" + "          '" + this.nama + "',"  + "     '" + this.keterangan + "' "+ "      )";
        this.idkategori = DBHelper1841720061Faizin.insertQueryGetId(SQL);
        
}
    else{
        String SQL = "UPDATE kategori SET"
                + "    nama = '" + this.nama + "', "
                + "    keterangan = '" + this.keterangan + "'"
                + "    WHERE idkategori = '" + this.idkategori + "'";
        DBHelper1841720061Faizin.executeQuery(SQL);
    }
}
public void delete(){
    String SQL = "DELETE FROM kategori WHERE idkategori = '" + this.idkategori + "'";
    DBHelper1841720061Faizin.executeQuery(SQL);
}
}