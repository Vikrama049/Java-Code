package Encapsulation;

class BIke_Main {

	public static void main(String[] args) {
		
		Bike b = new Bike();
		
		//Calling setter method using object of class.
		b.setCompany_Name("Honda");
		b.setBike_No(4403);
		
		//Calling getter method using object of class.
		System.out.println("Company name is: " + b.getCompany_Name());
		System.out.println("Bike number is: " + b.getBike_No());

	}

}
