/*Print any multiplication table using for loop.
 * Name : Aditya Vikram
 * Date :11/10/22
 */

package Loop;

public class Multiplication {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("Enter the number : ");
		
			int x = sc.nextInt();
			
		for(int i=1;i<=10;i++)	
		{
			
			System.out.println(x + " * " + i + " = " + x*i);
			
		}
		
	}

}
