package percobaan_1;

public class ElectricityBill1841720061Faizin implements Payable1841720061Faizin{
    private int kwh;
    private String category;

    public ElectricityBill1841720061Faizin(int kwh, String category) {
        this.kwh = kwh;
        this.category = category;
    }

    public void setKwhFaizin(int kwh) {
        this.kwh = kwh;
    }

    public void setCategoryFaizin(String category) {
        this.category = category;
    }

    public int getKwFaizin() {
        return kwh;
    }

    public String getCategoryFaizin() {
        return category;
    }

    @Override
    public int getPaymenAmountFaizin() {
        return kwh+getBasePriceFaizin();
    }
    public int getBasePriceFaizin(){
        int bPrice = 0;
        switch(category){
            case "R-1" : bPrice = 100;
            break;
            case "R-2" : bPrice = 200;
            break;
        }
        return bPrice;
    }
    public String getBillInfoFaizin(){
        return "KWH = " +kwh+"\n"+"Category = " + category +"("+getBasePriceFaizin()+"per KWH)\n";
        
    }
}
