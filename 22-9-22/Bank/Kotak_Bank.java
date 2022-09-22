package Inheritance;

public class Kotak_Bank extends Bank {

	
	void Banklocation()			//override
	{
		System.out.println("The Bank Location is America");
	}
	void Bank_client_name()
	{
		super.Bank_client_name();
		System.out.println("Harshal,Vikra,Aditya,Sonawane");
	}
	

}
