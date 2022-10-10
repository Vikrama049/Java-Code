package Operators;

class Unary_Op {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("Enter the first No. : ");
		int x = sc.nextInt();
		System.out.println();
		
		// performing pre-increment operation
		++x;
		System.out.println("pre increment value is : " +x);
		
		// performing post-increment operation
		x++;
		System.out.println("post increment value is : " +x);

		System.out.println();
		// performing pre-decrement operation
		--x;
		System.out.println("pre decrement value is : " +x);

		// performing post-decrement operation
		x--;
		System.out.println("post decrement value is : " +x);

	}

}
