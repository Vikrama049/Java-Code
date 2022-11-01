package Casting;

public class Down_Casting {

	public static void main(String[] args) {
		
		//Importing Scanner
				java.util.Scanner sc = new java.util.Scanner(System.in);
				
				System.out.print("Enter a number : ");
				int i = sc.nextInt();
				//no explicit type casting required
				long l = i;
				//no explicit type casting required
				float f = l;

				//Printing Values
				
				System.out.println();
				System.out.println("Int value is : " +i);
				System.out.println("Long value is : " +l);
				System.out.println("Float is : " +f);


	}

}
