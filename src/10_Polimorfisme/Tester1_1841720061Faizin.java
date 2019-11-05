package percobaan_1;

public class Tester1_1841720061Faizin {
    public static void main(String[] args) {
        PermanenEmployee1841720061Faizin  pEmp = new PermanenEmployee1841720061Faizin("Dedik", 500);
        InternshipEmployee1841720061Faizin iEmp = new InternshipEmployee1841720061Faizin("Sunarto", 5);
        ElectricityBill1841720061Faizin eBill = new ElectricityBill1841720061Faizin(5, "A-1");
        
        Employee1841720061Faizin e;
        Payable1841720061Faizin p;
        e = pEmp;
        e = iEmp;
        p = pEmp;
        p = eBill;
    }
    
}
