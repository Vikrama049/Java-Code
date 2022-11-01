/* * Hashset class implements the set interface, it uses hash table to store the elements and contains only unique elements
 *  
 */

package Collections;

import java.util.*;

class Hashset_Example {

	public static void main(String[] args) {
		
		HashSet<String> obj1 = new HashSet<>();
		//using add() method
		
		obj1.add("Shivam");
		obj1.add("Vishal");
		obj1.add("Harshal");
		
		System.out.println("Hashset is : " +obj1);
		System.out.println();
		//calling iterator() method
		Iterator<String> obj2 = obj1.iterator();
		
		System.out.println("Hashset using iterator :");
		while(obj2.hasNext()) //hasnext is method to check next value in the array	
			{
			
			System.out.print(obj2.next());
			
			System.out.print(",");
		}
		
	}

}
