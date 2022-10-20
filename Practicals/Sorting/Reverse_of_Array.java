package Arrays;

import java.util.Scanner;

public class Reverse_of_Array {

	public static void main(String[] args) {
		int i, j=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of element in array :");
		int a = sc.nextInt();
		int array[] = new int[a];
		int rev[] = new int[a];
		
		System.out.println();
		System.out.println("Enter elements : ");
		
		for(i=0;i<a;i++)	
		{
			
			array[i] = sc.nextInt();
		}
			
		System.out.println();
		System.out.println("Reverse of array is : ");

		for(i=a;i>0;i--,j++)	
		{
			rev[j] = array[i-1];
			
			System.out.println(rev[j]);	
		}
		
	}

}
