package Operators;

public class Bitwise_op {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("Enter the first No. : ");
		int x = sc.nextInt();
		
		System.out.print("Enter second No : ");
		int y = sc.nextInt();
		
		//Bitwise AND Operator
		System.out.println("x & y : " +(x & y));
				//0101 
				//0110 ------ 0100 = 4
		
		//Bitwise OR Operator
		System.out.println("x | y : " +(x | y));
				//0101 
				//0110 ------ 0111 = 7
		
		//Bitwise XOR Operator
		System.out.println("x ^ y : " +(x ^ y));
				//0101 
				//0110 ------ 0011 = 3

	}

}
