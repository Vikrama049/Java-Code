/*	Program: Create a program to find largest number of two numbers
	 * 	Name : Aditya Vikram
	 *	date : 6/10/22
	 */
package Practical_1;

public class Larger_Number {

		public static void main(String[] args) {
				// importing Scanner
			java.util.Scanner sc = new java.util.Scanner(System.in);
			
			System.out.println("Enter the 1st number : ");
			
			int a = sc.nextInt();
			
			System.out.println("Enter the 2nd number : ");
			
			int b = sc.nextInt();
			
			if(a>b)	{
				
				System.out.println(a+" is greater than "+b);
			}

			else	{
				
				System.out.println(b+" is greater than "+a);
			}

		}

	}

