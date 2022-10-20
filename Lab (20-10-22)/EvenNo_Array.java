/* Program to find Even number from Array 
 * name : Aditya Vikram
 * Date : 20-10-22
 */

package Lab_201022;

//Importing Arrays
import java.util.Arrays;

//Importing Scanner
import java.util.Scanner;

public class EvenNo_Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//taking input from user for enter the total elements
		System.out.print("Enter the number of element in array : ");
		int a = sc.nextInt();
		
		//Initializing array
		int array[] = new int[a];
				
		System.out.println();
		//Printing Elements
		System.out.println("Enter the Elements : ");
		
		//Using for Loop
		for(int i=0;i<a;i++)	
		{
	
			int n=sc.nextInt();
			if(n%2==0) {
			array[i] = n;
			}else {
				array[i]=1;
			}
		}
		Arrays.sort(array);

		System.out.println();
		//Printing Even numbers from an array
		System.out.print("Even Number in array is : [");
		
		//Using for Loop
		for(int i=0;i<a;i++)	
		{	
			if(array[i]%2==0) {	
				System.out.print(array[i]+" ");
			}			
	}	
		System.out.print("]");
		}
	}