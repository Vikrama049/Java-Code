/* Program: write a program for addition of two matrix
 * Name : Aditya Vikram
 * Date : 17-10-22
 */

package Matrix;

//importing Scanner
import java.util.Scanner;

public class Additionof_Two_Matrix {

	public static void main(String[] args) {
		
		int x, y, i, j;
		Scanner sc = new Scanner(System.in);
		
		//Taking input for first matrix row
		System.out.print("Enter first matrix row : ");
		x = sc.nextInt();
		
		//Taking input for first matrix column
		System.out.print("Enter first matrix column : ");
		y = sc.nextInt();
		
		int array1[][]=new int[x][y];
		
		System.out.println();
		//Taking input for first matrix from user
		System.out.println("Enter the number of first matrix : ");
		
		//using for loop
		for(i=0;i<x;i++)
		{
			for(j=0;j<y;j++)
			{
				array1[i][j]=sc.nextInt();
			}
		}
		
		//Printing element of first matrix
		System.out.println("Element of first matrix is : ");
		
		//Using for loop
		for(i=0;i<x;i++)
		{
			for(j=0;j<y;j++)
			{
				System.out.print(array1[i][j]+" ");
			} System.out.println();
			
			//System.out.println();
		}
	
		int array2[][]=new int[x][y];
		//Taking input for second matrix from user
		
		System.out.println();
		System.out.println("Enter the number of Second matrix : ");
		
		//using for loop
		for(i=0;i<x;i++)
		{
			for(j=0;j<y;j++)
			{
				array2[i][j]=sc.nextInt();
			}
		}
		
		//Printing element of second matrix
		System.out.println("Element of second matrix is : ");
		
		//using for loop
		for(i=0;i<x;i++)
		{
			for(j=0;j<y;j++)
			{
				System.out.print(array2[i][j]+" ");
			} System.out.println();
			
			//System.out.println();
		}
		//System.out.println();
		
		
		int array3[][]=new int[x][y];
		
			//Addition of two numbers
			System.out.println();
			System.out.println("Addition of two matrix is : ");
			
			//Using for loop
			for(i=0;i<x;i++)	
			{
				
				for(j=0;j<y;j++)	
				{
					array3[i][j]=array1[i][j]+array2[i][j];  
					System.out.print(array3[i][j]+" "); 
				}
				 System.out.println();
			}	

	}

}
