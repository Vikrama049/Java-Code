/* Program : Program of multi dimensional array
 * Name : Aditya Vikram
  * Date : 17-10-22
 */

package Matrix;

//Importing Scanner
import java.util.Scanner;

public class Two_Dimensional_Array {

	public static void main(String[] args) {

		int i, j, x, y; 
		
		//importing scanner 
		Scanner sc = new Scanner(System.in);
		
		//Taking input for number of rows from user 
		System.out.print("Enter the no of rows :");
		x = sc.nextInt();
		
		//Taking input for number of column from user 
		System.out.print("Enter the no of column : ");
		y = sc.nextInt();
		
		int array[][] = new int[x][y];
		
		System.out.println("Enter the no of array :");
		
		//Using for loop
		for(i=0;i<x;i++)
		{
			for(j=0;j<y;j++)
			{
				array[i][j]=sc.nextInt();
			}
		}
		
		System.out.println();
		
		//Printing total elements of array
		System.out.println("Element of array is ");
		
		//using for loop
		for(i=0;i<x;i++)
		{
			for(j=0;j<y;j++)
			{
				//printing values of i j
				System.out.print(array[i][j]+" ");
			}
			
			System.out.println();
		}


	}

}
