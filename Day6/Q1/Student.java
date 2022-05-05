class Student{
	int studId;
	String studName;
	double examFee;
	
	public void displayDetails() {
		
	}
	
	double payFee(double fee) {
		examFee-=fee;
		
		return examFee;
	}

	public Student() {
		super();
	}

	public Student(int studId, String studName, double examFee) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.examFee = examFee;
	}
}
	