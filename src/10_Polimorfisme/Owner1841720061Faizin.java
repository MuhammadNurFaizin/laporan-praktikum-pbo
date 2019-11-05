package percobaan_1;

public class Owner1841720061Faizin {

    public void pay(Payable1841720061Faizin p) {
        if (p instanceof ElectricityBill1841720061Faizin) {
            ElectricityBill1841720061Faizin eb = (ElectricityBill1841720061Faizin) p;
            System.out.println("" + eb.getBillInfoFaizin());
        } else if (p instanceof PermanenEmployee1841720061Faizin) {
            PermanenEmployee1841720061Faizin pe = (PermanenEmployee1841720061Faizin) p;
            pe.getEmployeeInfoFaizin();
            System.out.println("" + pe.getEmployeeInfoFaizin());
        }
    }

    public void showMyEmployee(Employee1841720061Faizin e) {
        System.out.println("" + e.getEmployeeInfoFaizin());
        if (e instanceof PermanenEmployee1841720061Faizin) {
            System.out.println("You have to pay her/ him monthly!!!");
        } else {
            System.out.println("No need to pay him/her");
        }
    }
}
