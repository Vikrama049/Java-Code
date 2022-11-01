/* Program to demonstrate do while and print  the reverse counting from the user input number
 * name : Aditya Vikram
 * date 12/10/22
 */

package Loop;

public class do_while {

	public static void main(String[] args) {
		
		//Using scanner
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		//Taking input from user
		System.out.print("Enter number of count : ");
		int c = sc.nextInt();
		
		System.out.print("Enter a number : ");
		int x = sc.nextInt();
		
		//Using do while loop
		System.out.println();
		do
		{
				System.out.println(x +" ");
				x--;
				c--;		
		}
		
		while(c>=1);

		
	}

	}
