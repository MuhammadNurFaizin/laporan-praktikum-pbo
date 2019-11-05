package percobaan_4;
import percobaan_1.ElectricityBill1841720061Faizin;
import percobaan_1.InternshipEmployee1841720061Faizin;
import percobaan_1.Owner1841720061Faizin;
import percobaan_1.PermanenEmployee1841720061Faizin;
public class Tester41841720061Faizin {
    public static void main(String[] args) {
        Owner1841720061Faizin ow = new Owner1841720061Faizin();
        ElectricityBill1841720061Faizin eBill = new ElectricityBill1841720061Faizin(5, "R-1");
        ow.pay(eBill);
        System.out.println("-------------------------------");
        
        PermanenEmployee1841720061Faizin pEmp = new PermanenEmployee1841720061Faizin("Dedik", 500);
        ow.pay(pEmp);
        System.out.println("-------------------------------");
        
        InternshipEmployee1841720061Faizin iEmp = new InternshipEmployee1841720061Faizin("Sunato", 5);
        ow.showMyEmployee(pEmp);
        System.out.println("-------------------------------");
        ow.showMyEmployee(iEmp);
    }
    
}
