package Method_Overloading;

public class method_main {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("Enter the first number : ");
		int a = sc.nextInt();
		
		System.out.println("Enter the second number : ");
		int b = sc.nextInt();
		
		System.out.println("Enter the third number : ");
		int c = sc.nextInt();
		
		System.out.println("Enter the fourth number : ");
		int d = sc.nextInt();
		sc.close();
		
		System.out.println();
		System.out.println("The output is : ");
		
		method m1 = new method();
		m1.add(a, b);
		
		method m2 = new method();
		m2.add(a, b, c);
		
		method m3 = new method();
		m3.add(a, b, c, d);
		
	}

}
