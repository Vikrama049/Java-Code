package Loop;

public class Vote {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("Enter your age : ");
		
		int x = sc.nextInt();
		
		if(x>=18) {
			
			System.out.println("You are Eligible to vote ");
			
		}
		else
		{
			System.out.println("Your are not Eligible to vote ");
		}

	}

}
