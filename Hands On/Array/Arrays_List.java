/* Program to demonstrate Array list
 * name : Aditya Vikram
 * date : 21-10-22
 */
package List;

//Importing array list
import java.util.ArrayList;

//Importing Scanner classs
import java.util.Scanner;

public class Arrays_List {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		//Taking input from user
		System.out.println("Enter Number from 1 to 4 :");
		
		// Using List
		ArrayList<String> bike = new ArrayList<String>();  
	    int a = sc.nextInt();
	    System.out.println("{ Honda }");
	    int b = sc.nextInt();
	    System.out.println("{ Apache }");
	    int c = sc.nextInt();
	    System.out.println("{ Pulsur }");
	    int d = sc.nextInt();
	    System.out.println("{ Bullet }");

	}

}
