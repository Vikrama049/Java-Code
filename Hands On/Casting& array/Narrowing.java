package Casting;

public class Narrowing {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("Enter a number : ");
		
		double d = sc.nextDouble();
		//explicit type casting required
		
		long l = (long)d;
		//explicit type casting required
		
		int i = (int)l;
		
		System.out.println();
		System.out.println("long value is " +d);
		System.out.println("int value " +l);
		System.out.println("Double is " +i);


	}

}
