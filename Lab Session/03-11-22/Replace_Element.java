/* Write a java program to replace the second element of a ArrayList with the specified element 
 * Name : Aditya Vikram
 * Date : 03-11-22
 */

package Lab_311;

import java.util.*;

public class Replace_Element {

	public static void main(String[] args) {
		
		// Creating an object of ArrayList class
		ArrayList<String>  obj = new ArrayList<String>();

		  obj.add("a");
		  obj.add("b");
		  obj.add("c");
		  obj.add("d");

		  //Printing elements of Original Array List
		  System.out.println("Original array list: " + obj);
		  String obj1 = "x";
		  obj.set(3,obj1);
		  
		  System.out.println("Added element is : " +obj1);
		  //Printing new Array list
		  System.out.println("New array list: " + obj);
		  
	}

}