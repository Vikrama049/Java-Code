/*program to demonstrate (switch)and printing week days
 	Name :- Aditya Vikram
 	Date :- 11-10-22 
 */

package Aditya;

import java.util.Scanner;

public class Switch_Cases {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);//Taking user Input
		System.out.println("Enter the startig Alpha : ");
		String weaks = sc.nextLine();
		
		switch (weaks)//Switch Case
		{
		case "M":
			System.out.println("This day is Monday");
			break;
		case "T":
			System.out.println("This day is Tuesday");
			break;
		case "W":
			System.out.println("This day is Wednesday");
			break;
		case "TH":
			System.out.println("This day is Thusday");
			break;
		case "F":
			System.out.println("This day is Friday");
			break;
		case "SA":
			System.out.println("This day is Saturday");
			break;
		case "SU":
			System.out.println("This day is Sunday");
			break;
			default://When the user put default value
			
		}

	}

}
