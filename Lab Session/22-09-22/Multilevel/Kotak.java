package Inheritance;

	public class Kotak extends Banks {

		
		void Banklocation()			//override
		{
			System.out.println("The Bank Location is Azamgarh");
		}
		void Bank_client_name()
		{
			super.Bank_client_name();
			System.out.println("Aditya, sonu, monu, pawan");
		}
		

	}
