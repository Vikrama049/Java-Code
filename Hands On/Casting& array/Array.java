package Casting;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Taking input for the length of the array
		System.out.print("Enter The length of Array : ");
		int s = sc.nextInt();
		
		int x[] = new int[s];
		for(int i=0;i<x.length;i++)	{
			
			//Loop for Taking Inputs from User
			System.out.print("Enter "+i+" Number of the Array : ");
			int a = sc.nextInt();
			x[i]=a;
			
		}
			
			System.out.println();
		//Loop for printing output
			System.out.print("Array is [ ");
			for(int j=0;j<x.length;j++)	{
				
			if(j==(s-1)){
			System.out.print(x[j]+" ");
			}else {
				System.out.print(x[j]+", ");
			}
		}
			System.out.print("]");



	}

}
