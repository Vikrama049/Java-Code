package Sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Descending_Ord {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of element in array : ");
		int a = sc.nextInt();
		Integer array[] = new Integer[a];
		
		System.out.println();
				
		System.out.println("Enter elements : ");
		
		for(int i=0;i<a;i++)	
		{
			array[i] = sc.nextInt();
		}
		
		System.out.println();
		//Print original array
		System.out.println("Original array " +Arrays.toString(array));
		
		//sort the array in descending order
		Arrays.sort(array,Collections.reverseOrder());
		System.out.println("Soreted array is" +Arrays.toString(array));
			}

}
