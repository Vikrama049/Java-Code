/* Program for sorting in Descending array
 * Name : Aditya Vikram
 * Date: 20-10-22
 */

package Sorting;

//Importing Arrays
import java.util.Arrays;

//Importing Collections
import java.util.Collections;

//Importing Scanner
import java.util.Scanner;

public class Descending_Ord {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//taking input from user for enter the total elements
		System.out.print("Enter the number of element in array : ");
		int a = sc.nextInt();
		Integer array[] = new Integer[a];
		
		System.out.println();
			//Printing Elements	
		System.out.println("Enter elements : ");
		
		//Using for Loop
		for(int i=0;i<a;i++)	
		{
			array[i] = sc.nextInt();
		}
		
		System.out.println();
		//Print original array
		System.out.println("Original array " +Arrays.toString(array));
		
		//sorting the array in descending order
		Arrays.sort(array,Collections.reverseOrder());
		System.out.println("Soreted array is" +Arrays.toString(array));
			}

}
