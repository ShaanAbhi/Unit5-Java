import java.util.Scanner;
public class Demo {

    public static Bank getBank(String bank){
        if(bank.equals("axis")){
            Axis ax = new Axis();
            ax.rateOfInterst = 10;
            return ax;
        }
        else if(bank.equals("icici")){
            ICICI ic = new ICICI();
            ic.rateOfInterst= 8;
            return ic;
        }
else return null;
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Bank Name:");
        String bankname = sc.nextLine();
        Bank b1 = Demo.getBank(bankname);
        if(b1==null){
            System.out.println("Invalid Bank name");
        }
        else
        b1.displayDetails();
        sc.close();
    }
}