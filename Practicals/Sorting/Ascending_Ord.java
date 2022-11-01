/* Program for Ascending Order
 * name : Aditya Vikram
 * Date : 19-10-22
 */

package Sorting;

//Importing Arrays
import java.util.Arrays;
//Importing Scanner
import java.util.Scanner;

public class Ascending_Ord {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Taking input from user for printing no of elements
		System.out.print("Enter the number of elements : ");
		int size = sc.nextInt();
		
		//Initialize Array
		int array[] = new int[size];
		
		System.out.println("Enter the " + size + " element of an array : ");
		
		//using for loop
		for(int i=0;i<size;i++)
		{
			array[i] = sc.nextInt();
		}
		
		Arrays.sort(array);
		System.out.println("\nResult :");
		
		for(int n:array)
		{
			System.out.print(n+" ");
		}
	}

}
