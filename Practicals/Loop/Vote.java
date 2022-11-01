/*
 * Test whether the person is eligible to give vote using (if-else)
 * Name : Aditya Vikram
 * Date : 11/10/22
 */

package Loop;

public class Vote {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		//Printing your age
		System.out.println("Enter your age : ");
		
		int x = sc.nextInt();
		
		if(x>=18) {
			
			//Check if condition
			System.out.println("You are Eligible to vote ");
			
		}
		else
		{
			System.out.println("Your are not Eligible to vote ");
		}

	}

}
