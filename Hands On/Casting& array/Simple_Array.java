/* Program for Simple Array
 * Name : Aditya Vikram
 * Date : 19-10-22
 */

package Arrays;

//Importing Scanner
import java.util.Scanner;

public class Simple_Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//taking input from user for elements
		System.out.print("Enter the total number of array : ");  
		  
		int n = sc.nextInt();  
		  
		//Inititializing array
		int[] array = new int[n];  
					System.out.println();
		
		//Printing elements of array
		System.out.println("Enter the elements of array: ");  
		for(int i=0; i<n; i++)  
		{  
		   
			array[i]=sc.nextInt();  
		}  
			//printing elements
					System.out.println();
			System.out.println("elements of array is: ");  
		  
			//Using for loop
		for (int i=0; i<n; i++)   
		{  
			System.out.println(array[i]);  
			
		}  
	}  
}

