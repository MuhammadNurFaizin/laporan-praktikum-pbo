package percobaan_1;

public class InternshipEmployee1841720061Faizin extends Employee1841720061Faizin {

    private int lenght;

    public InternshipEmployee1841720061Faizin(String nama, int lenght) {
        this.nama = nama;
        this.lenght = lenght;
    }

    public int getLenghtFaizin() {
        return lenght;
    }

    public void setLenghtFaizin(int lenght) {
        this.lenght = lenght;
    }
        @Override
        public String getEmployeeInfoFaizin(){
            String info = super.getEmployeeInfoFaizin()+"\n";
            info += "Registered as internship employee for " + lenght +"month/s\n";
            return info;
        }
}
