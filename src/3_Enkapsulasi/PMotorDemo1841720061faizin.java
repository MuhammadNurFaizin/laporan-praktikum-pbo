package percobaan2;

public class PMotorDemo1841720061faizin {
    public static void main(String[] args) {
        PMotor1841720061faizin motor = new PMotor1841720061faizin();
        motor.printStatus();
        motor.tambahKecepatan();
        
        motor.nyalakanMesin();
        motor.printStatus();
        
        motor.tambahKecepatan();
        motor.printStatus();
        
        motor.tambahKecepatan();
        motor.printStatus();
        
        motor.kurangKecepatan();
        motor.printStatus();
        
        motor.matikanMesin();
        motor.printStatus();
    }
}
