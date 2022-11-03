/* Write a java program to check if a particular element exist in a Linked List 
 * Name : Aditya Vikram
 * Date : 03-11-22
 */

package Lab_311;

import java.util.*;

public class Exist_LinkedList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Creating an object of LinkedListList class
		LinkedList <String> object = new LinkedList <String> ();
		object.add("MERCEDES");
		object.add("HYUNDAI");
		object.add("TATA");
		object.add("BMW");
		object.add("AUDI");
		
        System.out.println("Enter car name :");
        String car = sc.nextLine();
      		// Checks whether the color "Green" exists or not.
      	if (object.contains(car.toUpperCase()))
      	{
    	  System.out.println(car.toUpperCase()+" is present in the linked list.");
      } else {
    	  System.out.println(car.toUpperCase()+" is not present in the linked list.");
      }

	}

}