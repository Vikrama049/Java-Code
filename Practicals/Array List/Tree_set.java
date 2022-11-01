/*	tree set class implements set interface that uses a tree for storage
 * It inherits abstract sets class an implements navigable set interface
 * the objects of the tree set class are sorted in ascending order
 * It contains unique elements and does not allows null values
 */

package Collections;

import java.util.*;

class Tree_set {

	public static void main(String[] args) {
		
		SortedSet<String> fruits = new TreeSet<>();
		
		fruits.add("Mango");
		fruits.add("Papaya");
		fruits.add("Apple");
		fruits.add("Pineapple");
		
		System.out.println("Fruits are : " +fruits);
		
		//duplicate elements are ignored
		fruits.add("pineapple");
		System.out.println();
		System.out.println("After adding duplicate elements : " +fruits);

	}

}
