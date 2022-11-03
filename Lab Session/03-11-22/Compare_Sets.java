/* write a java program to compare two sets and retain elements which are same on both sets.(Using retainAll method)

 * Name : Aditya VIkram
 * Date : 03-11-22
 */

package Lab_311;

import java.util.*;

public class Compare_Sets {

	public static void main(String[] args) {
		
		// Creating an object of HashSet class
		 HashSet<String> fruits1 = new HashSet<String>();
	     // use add() method to add values in the hash set
		 fruits1.add("Apple");
		 fruits1.add("Orange");
		 fruits1.add("Grapes");
		 fruits1.add("Mango");
		 
		 		//Printing first fruit set elements
	          System.out.println("Frist Fruit Set content: "+fruits1);
	          
	          HashSet<String>fruits2 = new HashSet<String>();
	          fruits2.add("Guava");
	          fruits2.add("Mango");
	          fruits2.add("Pineapple");
	          fruits2.add("Orange");
	          
	          //Printing Second fruit set element
	          System.out.println("Second Fruit Set content: "+fruits2);
	          fruits1.retainAll(fruits2);
	          System.out.print("Common Elements are : ");
	          System.out.println(fruits1);

	}

}