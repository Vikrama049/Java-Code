package Operators;

class Relational_Op {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("Enter the first No : ");
		int x = sc.nextInt();
		
		System.out.print("Enter second No : ");
		int y = sc.nextInt();

		//Performing equal to operation
		System.out.println("x==y : " +(x==y));
		
		//Performing is not equal to operation
		System.out.println("x!=y : " +(x!=y));
		
			//Performing greater then operation
				System.out.println("x>y : " +(x>y));
				
				//Performing less than operation
				System.out.println("x<y : " +(x<y));
				
				
				//Performing Greater than equal to operation
				System.out.println("x>=y : " +(x>=y));
				
				//Performing less than equal to operation
				System.out.println("x<=y : " +(x<=y));
				
		
	}

}
