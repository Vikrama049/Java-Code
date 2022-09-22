package Inheritance;

public class Bank_Main {
	
	public static void main(String[] args)
	{
		Bank b1 = new Bank();
		
		b1.Banklocation();
		b1.Bank_client_name();
		
		Kotak_Bank k1= new Kotak_Bank();
		
		k1.Banklocation();
		k1.Bank_client_name();
	}

}

