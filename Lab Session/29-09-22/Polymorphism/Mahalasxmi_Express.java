package lab;

public class Mahalasxmi_Express {
	
	int train_number;
	String timing;

	public Mahalasxmi_Express(int train_number,String timing) {
		super();
		this.train_number=train_number;
		this.timing=timing;
		
	}
	public String toString() {
		return "Mahalasxmi_Express Train number is : "+train_number+ " "+"Time is :"+timing;
	}

}

