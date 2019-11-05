package percobaan_3;

import percobaan_1.PermanenEmployee1841720061Faizin;
import percobaan_1.InternshipEmployee1841720061Faizin;
import percobaan_1.ElectricityBill1841720061Faizin;
import percobaan_1.Employee1841720061Faizin;
import percobaan_1.Payable1841720061Faizin;

public class Tester3_1841720061Faizin {
    public static void main(String[] args) {
        PermanenEmployee1841720061Faizin pEmp = new PermanenEmployee1841720061Faizin("Dedik", 500);
        InternshipEmployee1841720061Faizin iEmp = new InternshipEmployee1841720061Faizin("Sunarto", 5);
        ElectricityBill1841720061Faizin eBill = new ElectricityBill1841720061Faizin(5,"A-1");
        Employee1841720061Faizin e[] = {pEmp, iEmp};
        Payable1841720061Faizin p[] = {pEmp, eBill};
        //Employee e2[] = {pEmp, iEmp, eBill};
    }
    
}
