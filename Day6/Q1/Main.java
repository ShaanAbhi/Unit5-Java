public class Main {
	
	
	public static void main(String[] args) {
		DayScholar ds1=new DayScholar(125,"rupa",545,454);
		Hosteller ds=new Hosteller(134,"roji",545,454);
		
		int fee=1500;
		System.out.println("Remaining fee is rs"+ds1.payFee(fee));
	}
	
}

