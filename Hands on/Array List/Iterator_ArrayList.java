/* Write a program to iterate ArrayList.
 * Name : Aditya Vikram
 * Date : 01-11-22
 */

package Hands_On;

import java.util.*;
public class Iterator_ArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> obj1 = new ArrayList<>();
		
		//using add method
		obj1.add("Samsung");
		obj1.add("Nokia");
		obj1.add("Assus");
		obj1.add("Vivo");
		obj1.add("OnePlus+");
		
		System.out.println("ArrayList is : " +obj1);
		System.out.println();
		//calling iterator() method
		Iterator<String> obj2 = obj1.iterator();
		System.out.println("ArrayList using Iterator");
		
		//Using while loop
		while(obj2.hasNext())
		{	
			System.out.print(obj2.next()+"  ");
		}
	}
}