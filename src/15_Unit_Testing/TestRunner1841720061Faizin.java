package unittest;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import unittest.database.Kategori1841720061Faizin;
import unittest.database.Anggota1841720061Faizin;

public class TestRunner1841720061Faizin {
    public static void main(String[] args) {
        Result mResult = new JUnitCore().runClasses(MessageProcessorTest1841720061Faizin.class);
        showMessageResult(mResult, MessageProcessorTest1841720061Faizin.class.getSimpleName());
        
         mResult = new JUnitCore().runClasses(Kategori1841720061Faizin.class);
        showMessageResult(mResult, Kategori1841720061Faizin.class.getSimpleName());

        mResult = new JUnitCore().runClasses(Anggota1841720061Faizin.class);
        showMessageResult(mResult, Anggota1841720061Faizin.class.getSimpleName());
    
    }
    private static void showMessageResult(Result mResult, String className){
        if (mResult.wasSuccessful()){
            System.out.format("The Result Test from %s : %s\n", className, mResult.wasSuccessful());
        }else{
            for(Failure failure : mResult.getFailures()){
                System.out.println(failure);
            }
        }
    }
}
