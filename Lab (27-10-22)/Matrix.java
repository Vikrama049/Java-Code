/* Pogram to Print 4/4 Matrix
 * Name : Aditya Vikram
 * Date : 27-10-22
 */

package Practicals_27_Oct_22;
import java.util.*;
public class Matrix {

	public static void main(String[] args) {
		
		//Declaring variables
		int a, b, x, y; 
		
		//importing scanner 
		Scanner sc = new Scanner(System.in);
		
		//Taking input for number of rows from user 
		System.out.print("Enter the number of rows : ");
		x = sc.nextInt();
		
		//Taking input for number of column from user 
		System.out.print("Enter the number of column : ");
		y = sc.nextInt();
		
		int array[][] = new int[x][y];
		
		System.out.println();
		System.out.println("Enter the numbers :");
		
		//Using for loop
		for(a=0;a<x;a++)
		{
			for(b=0;b<y;b++)
			{
				array[a][b]=sc.nextInt();
			}
		}
		
		System.out.println();
		
		//Printing total elements of array
		System.out.println("Elements of " +x+ "/" +x+ " Matrix is :");
		System.out.println();
		
		//using for loop
		for(a=0;a<x;a++)
		{
			for(b=0;b<y;b++)
			{
				//printing values of i j
				System.out.print(array[a][b]+" ");
			}
			
			System.out.println();
		}

	}

}
