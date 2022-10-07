/*Program: The Ractangle class implments Length_Breadth. and Provides the Implementation of the getArea() method. 
 */

package Interface;

public class Main_LB {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter area of breadth: ");
		int a = sc.nextInt();
		
		System.out.println("Enter area of breadth: ");
		int b = sc.nextInt();
		
		Ractangle e = new Ractangle();
		e.getArea(a, b);

	}
}

