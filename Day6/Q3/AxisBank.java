public class Axis extends Bank{
    double rateOfInterst;

    @Override
    public void displayDetails() {
        // TODO Auto-generated method stub
        // super.displayDetails();
        System.out.println("---------------");
        System.out.println("Branch Nmae: Axis Bank");
        System.out.println("Ifsc Code: AXIS51754");
        System.out.println("Rate of Interst:"+rateOfInterst);
        getCreditCard();
    }

    public void getCreditCard(){
        System.out.println("get Credit Card from Axis bank");
    }

    
    

}