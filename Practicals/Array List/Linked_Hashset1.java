package Collections;

import java.util.*;

public class Linked_Hashset1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> obj1 = new ArrayList<>();
		
		obj1.add(10);
		obj1.add(20);
		obj1.add(30);
		obj1.add(40);
		
		System.out.println("Array list is : " +obj1);
		System.out.println();
		//creating list Hashset from and ArrayList
		LinkedHashSet<Integer> obj2 = new LinkedHashSet<>(obj1);
		
		System.out.println("Linked Hashet is : " +obj2);
	}

}
