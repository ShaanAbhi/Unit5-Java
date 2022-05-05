class DayScholar extends Student{
	double transportFee;

	public DayScholar(int studId, String studName, double examFee, double transportFee) {
		super(studId, studName, examFee);
		this.transportFee = transportFee;
	}

	public DayScholar(double transportFee) {
		super();
		this.transportFee = transportFee;
	}

	public DayScholar() {
		super();
	}

	@Override
	double payFee(double fee) {
		if(transportFee<fee) {
			fee-=transportFee;
			transportFee=0;
			return super.payFee(fee);
		}
		transportFee-=fee;
		return transportFee+examFee;
	}
}


class Hosteller extends Student{
	double hostelFee;

	
	
	
	public Hosteller(double hostelFee) {
		super();
		this.hostelFee = hostelFee;
	}

	


	public Hosteller(int studId, String studName, double examFee, double hostelFee) {
		super(studId, studName, examFee);
		this.hostelFee = hostelFee;
	}
	
	@Override
	double payFee(double fee) {
		if(hostelFee<fee) {
			fee-=hostelFee;
			hostelFee=0;
			return super.payFee(fee);
		}
		hostelFee-=fee;
		return hostelFee+examFee;
	}
}






