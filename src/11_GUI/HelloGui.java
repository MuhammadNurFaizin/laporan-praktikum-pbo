package percobaan_1;

import javax.swing.*;

public class HelloGui {
    public static void main(String[] args) {
        JFrame frame;
        frame = new JFrame("Ini adalah percobaan HelloGui Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //program akan berhenti jika ditutup
        frame.setSize(600, 300); //Lebar, Tinggi windows
        frame.setLocation(200, 200); // x,y tampilan pada windows
        //frame.setLocationRelativeTo(null);// menampilkan frame ditengah - tengah layer
        frame.setVisible(true); // untuk menampilkan frame
    }   
}
