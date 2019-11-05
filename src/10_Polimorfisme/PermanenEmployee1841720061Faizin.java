package percobaan_1;

public class PermanenEmployee1841720061Faizin extends Employee1841720061Faizin implements Payable1841720061Faizin{
    private int salary;
    
    public PermanenEmployee1841720061Faizin(String nama, int salary){
        this.nama = nama;
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    
    @Override
    public int getPaymenAmountFaizin() {
        return (int) (salary+0.05+salary);
    }
    @Override
    public String getEmployeeInfoFaizin(){
        String info = super.getEmployeeInfoFaizin()+"\n";
        info += "Registered as permanent employee with salary "+ salary +"\n";
        return info;
    }
}
