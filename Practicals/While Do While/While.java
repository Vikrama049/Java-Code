/*	to demonstrate while loop continues until entered number is positive and take input from user.
 * 	name : Aditya Vikram
 * 	Date 12/10/22
 */

package Loop;

public class While {

	public static void main(String[] args) {
		
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		//using while loop
		while(true)
		{
			//Taking input from users
			System.out.print("Enter any number : ");
			int x = sc.nextInt();
				
			//using if condition
			if(x<0) {
				System.out.println("Thank You !!!!");
				break;
			}
		}
		
	}

}
