/* Write a java program to get the element in a tree set which is strictly greater than or equal to the given element
 * Name : Aditya Vikram
 * Date : 03-11-22
 */

package Lab_311;

import java.util.*;
 class Question4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Creating an object of TreeSets class
		TreeSet<Integer> obj = new TreeSet<>();
	      
		   // Add numbers in the Queue
		   obj.add(10);
		   obj.add(20);
		   obj.add(30);
		   obj.add(40);
		   obj.add(50);
		   obj.add(60);
		   obj.add(70);
		   obj.add(80);
		   obj.add(90);
		   System.out.println("Original TreeSet: "+obj);
		   System.out.print("Enter a number: ");
		   int num = sc.nextInt();
		   sc.close();
		   if(num<=90) {
		System.out.print("Value of TreeSet: " + obj.ceiling(num));
		   }
		   else
		   {
			   System.out.println("There is no number greater than: " + num);
		   }
	}

	}