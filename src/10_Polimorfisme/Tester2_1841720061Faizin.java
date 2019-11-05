package percobaan_2;

import percobaan_1.Employee1841720061Faizin;
import percobaan_1.PermanenEmployee1841720061Faizin;

public class Tester2_1841720061Faizin {
    public static void main(String[] args) {
        PermanenEmployee1841720061Faizin pEmp = new PermanenEmployee1841720061Faizin("Dedik",500);
        Employee1841720061Faizin e;
        e = pEmp;
        System.out.println(""+e.getEmployeeInfoFaizin());
        System.out.println("------------------");
        System.out.println(""+pEmp.getEmployeeInfoFaizin());
    }
    
}
