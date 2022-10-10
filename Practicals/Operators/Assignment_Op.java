package Operators;

class Assignment_Op {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("Enter the first No. : ");
		int x = sc.nextInt();
		
		System.out.print("Enter second No : ");
		int y = sc.nextInt();
		
		//adding and assigning values
		x += y;
		System.out.println("x = : " + x);
		
		x -= y;
		System.out.println("x = : " + x);
		
		x *= y;
		System.out.println("x = : " + x);
		
		x /= y;
		System.out.println("x = : " + x);
		
		x %= y;
		System.out.println("x = : " + x);
	}

}
