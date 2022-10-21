/* Program to print Reverse of String
 * Name : Aditya Vikram
 * Date : 21-10-22
 */

package Array;

//Importing Scanner
import java.util.Scanner;

//import java.util.*;
public class Reverse_of_String {
	
	public static void main(String ... args )

	{
		Scanner sc = new Scanner(System.in);
		//Taking input from user
		System.out.print("Enter array : ");
		String a = sc.nextLine();
		char[] b= a.toCharArray();
		
		System.out.println();
		
		//Printing values of String in reverse
		System.out.print("Reverse String is : (");
		
		//Using for loop
		for(int i=b.length-1;i>=0;i--)
		{
			System.out.print(b[i]+"");
		}
		System.out.println(")");
	}
}
