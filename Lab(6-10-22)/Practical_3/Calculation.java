/*	Program: Create a program for calculation read three values from the user for operation. First and second values are operands.
 * 	Third value as operator.
 *	Name : Aditya Vikram
 *	date : 6/10/22
 */
package Program_3;

	public class Calculation {

	public static void main(String args[]) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		// getting input from the user
	System.out.println("Enter the 1st number : ");
		double a = sc.nextInt();
	System.out.println("Enter the 2nd number : ");
		double b = sc.nextInt();
	System.out.println("Enter 1 to addition ");
	System.out.println("Enter 2 to dision");
	System.out.println("Enter 3 to multiplication");
	System.out.println("Enter 4 to Substraction");
		int x = sc.nextInt();
		switch(x)	{
		
		case(1):
			
			System.out.println(a+b);
		break;
		
		case(2):
			
			System.out.println(a/b);
		break;
		
		case(3):

			System.out.println(a*b);
		break;
		
		case(4):

			System.out.println(a-b);
		break;

		
		}

}
	
	}


