package Operators;

class Logical_Op {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("Enter the first No. : ");
		int x = sc.nextInt();
		
		System.out.print("Enter second No : ");
		int y = sc.nextInt();

		System.out.print("Enter the third No. : ");
		int z = sc.nextInt();
		
		System.out.println();
		System.out.println("Performing AND operations");
		//using logical AND to verify Constraint
			
		if((x<y)&&(y==z))
			
		{
			int sum = x+y+z;
			System.out.println("Sum is : " + sum);
		}
			else {
			System.out.println("false condition");
		}
		System.out.println();
		System.out.println("Performing OR operations");
		//using logical OR to verify String
		
		if((x<y)||(y==z))
			
		{
			int sum = x+y+z;
			System.out.println("Sum is : " + sum);
		}
			else {
			System.out.println("false condition");
		}
		System.out.println();
		System.out.println("Perform NOT operation");
		
		System.out.println("!(x<y)" + !(x<y));
		
		System.out.println("!(y==z)" + !(y==z));
	}

}
