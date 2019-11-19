/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan_4;

import java.util.ArrayList;

public class ListMahasiswa1841720061Faizin {
    ArrayList<Mahasiswa1841720061Faizin> ListMahasiswa;

   

    public ListMahasiswa1841720061Faizin() {
        ListMahasiswa = new ArrayList();
    }

    public void isiDataBagus(String Nim, String Nama,String Alamat){
        Mahasiswa1841720061Faizin mhs = new Mahasiswa1841720061Faizin(Nim, Nama, Alamat);
        ListMahasiswa.add(mhs);
    }
    
    public ArrayList<Mahasiswa1841720061Faizin> getData(){
        return ListMahasiswa;
    }
}
   
