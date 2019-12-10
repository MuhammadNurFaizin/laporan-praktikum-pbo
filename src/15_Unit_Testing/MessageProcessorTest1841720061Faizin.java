package unittest;

import org.junit.Assert;
import org.junit.Test;

public class MessageProcessorTest1841720061Faizin {
    MessageProcessor1841720061Faizin mProcessor;
    
    public MessageProcessorTest1841720061Faizin(){
        mProcessor = new MessageProcessor1841720061Faizin();
        mProcessor.setSender("Ronaldo");
        mProcessor.setRecipient("Rafael");
        mProcessor.setMessage("whats up bro?");
        mProcessor.showMessage();
    }
    @Test
    public void testShowMessage(){
        String expectedResult = "Hai Rafael, you message from Ronaldo.\nThe message as follows : whats up bro?";
        Assert.assertEquals(expectedResult, mProcessor.messageFormat());
    }
}
