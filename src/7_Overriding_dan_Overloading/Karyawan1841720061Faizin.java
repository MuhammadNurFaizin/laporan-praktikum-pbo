package percobaan_1;

public class Karyawan1841720061Faizin {

    private String nama;
    private String nip;
    private String golongan;
    private double gaji;

    public void setNamaFaizin(String nama) {
        this.nama = nama;
    }

    public void setNipFaizin(String nip) {
        this.nip = nip;
    }

    public void setGolonganFaizin(String golongan) {
        this.golongan = golongan;

        switch (golongan.charAt(0)) {
            case '1':
                this.gaji = 5000000;
                break;
            case '2':
                this.gaji = 3000000;
                break;
            case '3':
                this.gaji = 2000000;
                break;
            case '4':
                this.gaji = 1000000;
                break;
            case '5':
                this.gaji = 750000;
        }
    }

    public void setGajiFaizin(double gaji) {
        this.gaji = gaji;
    }

    public String getNamaFaizin() {
        return nama;
    }

    public String getNipFaizin() {
        return nip;
    }

    public String getGolonganFaizin() {
        return golongan;
    }

    public double getGajiFaizin() {
        return gaji;
    }
}
