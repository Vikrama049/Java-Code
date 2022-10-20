/* Program to find Ascending Or Descending order from array
 * Name :Aditya Vkram
 * Date :22-10-2022
 * 
 */

package Lab_201022;

//importing Arrays
import java.util.Arrays;

//Import COllections
import java.util.Collections;

//Import Scanner
import java.util.Scanner;

public class Ascending_Descending {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//taking input from user for enter the total elements
		System.out.print("Enter the number of element in array : ");
		int a = sc.nextInt();
		
		System.out.println();
		Integer array[] = new Integer[a];
				
		//Using for Loop
		for(int i=0;i<a;i++)	
		{

		//Printing Elements
		System.out.print("Enter elements : ");
		
			array[i] = sc.nextInt();
		}
			
		//sorting the array in descending order
		System.out.println();
		Arrays.sort(array,Collections.reverseOrder());
		System.out.println("Descending array " +Arrays.toString(array));
		
		//sorting the array in Ascending order
		Arrays.sort(array);
		System.out.println("Ascending array " +Arrays.toString(array));
	}


	}

