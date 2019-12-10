package unittest.database;

import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author Faizin R
 */
public class Anggota1841720061Faizin {

    private int mIdanggota;
    private String mNama;
    private String mAlamat;
    private String mTelepon;

    public Anggota1841720061Faizin() {
    }

    public Anggota1841720061Faizin(String mNama, String mAlamat, String mTelepon) {
        this.mNama = mNama;
        this.mAlamat = mAlamat;
        this.mTelepon = mTelepon;
    }

    public int getIdanggotaFaizin() {
        return mIdanggota;
    }

    public void setIdanggotaFaizin(int mIdanggota) {
        this.mIdanggota = mIdanggota;
    }

    public String getNamaFaizin() {
        return mNama;
    }

    public void setNamaFaizin(String mNama) {
        this.mNama = mNama;
    }

    public String getAlamatFaizin() {
        return mAlamat;
    }

    public void setAlamatFaizin(String mAlamat) {
        this.mAlamat = mAlamat;
    }

    public String getTeleponFaizin() {
        return mTelepon;
    }

    public void setTeleponFaizin(String mTelepon) {
        this.mTelepon = mTelepon;
    }

    public Anggota1841720061Faizin getByIdFaizin(int id) {
        Anggota1841720061Faizin agt = new Anggota1841720061Faizin();
        ResultSet rs = DBHelper1841720061Faizin.selectQueryFaizin("SELECT * FROM anggota " + " WHERE idanggota = '" + id + "'");

        try {
            while (rs.next()) {
                agt = new Anggota1841720061Faizin();
                agt.setIdanggotaFaizin(rs.getInt("idanggota"));
                agt.setNamaFaizin(rs.getString("nama"));
                agt.setAlamatFaizin(rs.getString("alamat"));
                agt.setTeleponFaizin(rs.getString("telepon"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return agt;
    }

    public ArrayList<Anggota1841720061Faizin> getAllFaizin() {
        ArrayList<Anggota1841720061Faizin> ListAnggota = new ArrayList();

        ResultSet rs = DBHelper1841720061Faizin.selectQueryFaizin("SELECT * FROM anggota");

        try {
            while (rs.next()) {
                Anggota1841720061Faizin agt = new Anggota1841720061Faizin();
                agt.setIdanggotaFaizin(rs.getInt("idanggota"));
                agt.setNamaFaizin(rs.getString("nama"));
                agt.setAlamatFaizin(rs.getString("alamat"));
                agt.setTeleponFaizin(rs.getString("telepon"));

                ListAnggota.add(agt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }

    public ArrayList<Anggota1841720061Faizin> searchFaizin(String keyword) {
        ArrayList<Anggota1841720061Faizin> ListAnggota = new ArrayList();

        String sql = "SELECT * FROM anggota WHERE " + " nama LIKE '%" + keyword + "%' " + " OR alamat LIKE '%" + keyword + "%' " + " OR telepon LIKE '%" + keyword + "%' ";

        ResultSet rs = DBHelper1841720061Faizin.selectQueryFaizin(sql);

        try {
            while (rs.next()) {
                Anggota1841720061Faizin agt = new Anggota1841720061Faizin();
                agt.setIdanggotaFaizin(rs.getInt("idanggota"));
                agt.setNamaFaizin(rs.getString("nama"));
                agt.setAlamatFaizin(rs.getString("alamat"));
                agt.setTeleponFaizin(rs.getString("telepon"));

                ListAnggota.add(agt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }

    public ArrayList<Anggota1841720061Faizin> getByNamaAndAlamatAndTeleponFaizin(String nama, String alamat, String telepon) {
        ArrayList<Anggota1841720061Faizin> ListAnggota = new ArrayList();
        ResultSet rs;
        if ((nama.trim().length() > 0) && (alamat.trim().length() > 0) && (telepon.trim().length() > 0)) {
            rs = DBHelper1841720061Faizin.selectQueryFaizin("SELECT * FROM anggota WHERE nama = '" + nama + "'  AND alamat = '" + alamat + "'  AND telepon = '" + telepon + "'");

        } else if ((nama.trim().length() > 0) && (alamat.trim().length() > 0) && (telepon.trim().length() == 0)) {
            rs = DBHelper1841720061Faizin.selectQueryFaizin("SELECT * FROM anggota WHERE nama = '" + nama + "'  AND alamat = '" + alamat + "'");
        } else if ((nama.trim().length() > 0) && (alamat.trim().length() == 0)) {
            rs = DBHelper1841720061Faizin.selectQueryFaizin("SELECT * FROM anggota WHERE nama = '" + nama + "'");

        } else {
            rs = DBHelper1841720061Faizin.selectQueryFaizin(
                    "SELECT * FROM anggota "
                    + "WHERE alamat = '" + alamat + "'  ");
        }
        try {
            while (rs.next()) {
                Anggota1841720061Faizin ang = new Anggota1841720061Faizin();
                ang.setIdanggotaFaizin(rs.getInt("idanggota"));
                ang.setNamaFaizin(rs.getString("nama"));
                ang.setAlamatFaizin(rs.getString("alamat"));
                ang.setTeleponFaizin(rs.getString("telepon"));
                ListAnggota.add(ang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListAnggota;
    }

    public void saveFaizin() {
        if (getByIdFaizin(mIdanggota).getIdanggotaFaizin() == 0) {
            String SQL = "INSERT INTO anggota (nama, alamat, telepon) VALUES(" + " '" + this.mNama + "', " + " '" + this.mAlamat + "', " + " '" + this.mTelepon + "' " + " )";
            this.mIdanggota = DBHelper1841720061Faizin.insertQueryGetIdFaizin(SQL);
        } else {
            String SQL = "UPDATE anggota SET " + " nama = '" + this.mNama + "', " + " alamat = '" + this.mAlamat + "', " + " telepon = '" + this.mTelepon + "' " + " WHERE idanggota = '" + this.mIdanggota + "'";
            DBHelper1841720061Faizin.executeQueryFaizin(SQL);
        }
    }

    public void deleteFaizin() {
        String SQL = "DELETE FROM anggota WHERE idanggota = '" + this.mIdanggota + "'";
        DBHelper1841720061Faizin.executeQueryFaizin(SQL);
    }
}
