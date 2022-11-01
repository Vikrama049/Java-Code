package lab;

public class Train_Main {

	public static void main(String[] args) {
		
		
		Mahalasxmi_Express r1 = new Mahalasxmi_Express(11110, "05:20");
		Nanded_Express n1 = new Nanded_Express(12125,"10:35");
		Train p1 = new Train(r1,n1,"Lucknow",6);
		p1.display();

	}

}
