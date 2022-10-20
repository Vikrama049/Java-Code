/* Program to Print Reverse of Array
 * Name : Aditya Vikram
 * Date : 20-10-22
 */

package Arrays;
//Importing Scanner
import java.util.Scanner;

public class Reverse_of_Array {

	public static void main(String[] args) {
		int i, j=0;
		Scanner sc = new Scanner(System.in);
		
		//Taking input from user for enter element of array
		System.out.print("Enter the number of element in array :");
		int a = sc.nextInt();
		
		//Initializing array
		int array[] = new int[a];
		int rev[] = new int[a];
		
		System.out.println();
		//Printing ELements
		System.out.println("Enter elements : ");
		
		//Using For Loop
		for(i=0;i<a;i++)	
		{
			
			array[i] = sc.nextInt();
		}
			
		System.out.println();
		//Printing Reverse of Array
		System.out.println("Reverse of array is : ");
		
		//Using for Loop
		for(i=a;i>0;i--,j++)	
		{
			rev[j] = array[i-1];
			
			System.out.println(rev[j]);	
		}
		
	}

}
