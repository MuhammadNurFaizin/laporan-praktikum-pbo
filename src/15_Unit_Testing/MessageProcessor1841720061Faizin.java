package unittest;



public class MessageProcessor1841720061Faizin {

    private String sender, recipient, message;

    public String getMessage() {
        return message;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public String messageFormat(){
        String message = String.format("Hai %s, you message from %s.\nThe message as follows : %s",
        this.recipient, this.sender, this.message);
        return message;
    } 
    public void showMessage(){
        System.out.println(messageFormat());
    }
}
