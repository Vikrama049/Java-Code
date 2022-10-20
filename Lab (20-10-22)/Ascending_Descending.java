package Lab_201022;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ascending_Descending {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of element in array : ");
		int a = sc.nextInt();
		
		System.out.println();
		Integer array[] = new Integer[a];
				
		for(int i=0;i<a;i++)	
		{

		System.out.print("Enter elements : ");
		
			array[i] = sc.nextInt();
		}
			
		//sort the array in descending order
		System.out.println();
		Arrays.sort(array,Collections.reverseOrder());
		System.out.println("Descending array " +Arrays.toString(array));
		
		Arrays.sort(array);
		System.out.println("Ascending array " +Arrays.toString(array));
	}


	}

