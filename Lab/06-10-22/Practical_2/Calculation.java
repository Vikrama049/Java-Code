/*	Program: Create a program for calculation read three values from the user for operation. First and second values 
 * 	are operands and Third value as operator.
 *	Name : Aditya Vikram
 *	date : 6/10/22
 */

package Practical_2;

public class Calculation {

	public static void main(String[] args) {
		
			java.util.Scanner sc = new java.util.Scanner(System.in);
				// getting input from the user
			System.out.println("Enter the 1st number : ");
				int a = sc.nextInt();
			System.out.println("Enter the 2nd number : ");
				int b = sc.nextInt();
	
			System.out.println("Enter 1 for addition addition ");
			System.out.println("Enter 2 for division ");
			System.out.println("Enter 3 for multiplication ");
			System.out.println("Enter 4 for Substraction ");
				int x = sc.nextInt();
			
				System.out.println();
			System.out.println("Answer is : ");
				switch(x)	{
		
				case(1):
						//Addition of two numbers
					System.out.println(a+b);
				break;
		
				case(2):
						//Division of two numbers
					System.out.println(a/b);
				break;
		
				case(3):
						//Multiplication of two numbers
					System.out.println(a*b);
				break;
		
				case(4):
						//Subtraction of two numbers
					System.out.println(a-b);
				break;
		
		}

}

	}
