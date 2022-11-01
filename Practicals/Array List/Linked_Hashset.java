/* Linked Hasset is an ordered and sorted collection  
 * and it maintains the insertion order of the elements 
 */

package Collections;

import java.util.*;

public class Linked_Hashset {

	public static void main(String[] args) {

		LinkedHashSet<String> obj1 = new LinkedHashSet<>();
		//using add method
		
		obj1.add("Aditya");
		obj1.add("Vikram");
		obj1.add("D");
		obj1.add("Kumar");
		
		System.out.println("LinkedHashSet is : " +obj1);
		System.out.println();
		
		//calling iterator() method
		Iterator<String> obj2 = obj1.iterator();
		
		System.out.println("Hashset using Iterator");
		while(obj2.hasNext())
		{
			
			System.out.print(obj2.next());
			System.out.print(",");
		}
		
		
	
	}

}
