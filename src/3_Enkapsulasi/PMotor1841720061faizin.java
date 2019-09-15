package percobaan2;

public class PMotor1841720061faizin {
      private int kecepatan = 0;
    private boolean kontakOn = false;
    
    public void nyalakanMesin(){
        kontakOn = true;
    }
    public void matikanMesin(){
        kontakOn = false;
        kecepatan = 0;
    }
    public void tambahKecepatan(){
        kecepatan += 30;
        if (kecepatan <=100) {
                     
        }
        else {
            System.out.println("Kecepatan tidak bertambah karena Melebihi batas Maximal! \n");
        }
    }
    public void kurangKecepatan(){
        kecepatan -= 5;
        if (kecepatan >= 100) {
            
        }
        else{
            System.out.println("Kecepatan berkurang karena Melebihi Maximal! \n");
        }
    }
    
    public void printStatus(){
      if (kontakOn == true){
          System.out.println("Kontak On");
      }
      else{
          System.out.println("Kontak Off");
      }
      System.out.println("Kecepatan "+ kecepatan+"\n");
  }  
}