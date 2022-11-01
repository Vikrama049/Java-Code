/* Write a program to sort ArrayList in Descending order.
 * Name : Aditya Vikram
 * Date : 01-11-22
 */

package Hands_On;

import java.util.*;

public class Descending_arrayList {

	public static void main(String[] args) {
		ArrayList<String> obj1 = new ArrayList<>();
		//using add method
		
		obj1.add("Farari");
		obj1.add("Mercedes");
		obj1.add("Audi");
		obj1.add("BMW");
		obj1.add("Toyota");
		
		System.out.println("ArrayList is : " +obj1);
		System.out.println();
		
		Collections.sort(obj1,Collections.reverseOrder());
		
		System.out.println("ArrayList After Sorting is : " +obj1);
	}

}
