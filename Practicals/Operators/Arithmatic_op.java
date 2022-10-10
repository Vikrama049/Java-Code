package Operators;

class Arithmatic_op {

	public static void main(String[] args) {
		
			// creating scanner class object to take the input from the user
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("Enter the first No. : ");
		double x = sc.nextInt();
		
		System.out.print("Enter second No : ");
		double y = sc.nextInt();
		
		
		//Writing operation
	
		double add, sub, mod, mul, div;
		add = x + y;
		sub = x - y;
		div = x / y;
		mul = x * y;
		mod = x % y;
		
		//printing values 
		System.out.println("Addition is : " + add);
		System.out.println("Subtraction is : " + sub);
		System.out.println("division is : " + div);
		System.out.println("multiplication is : " + mul);
		System.out.println("modules is : " + mod);
	
	}

}
