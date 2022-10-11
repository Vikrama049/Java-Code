/*.demonstrate if-else statement of 5 subjects.the person who gets above 60% will be passed otherwise failed.output should be like: Enter your name,
	Enter marks for the 5 subjects.
 * Name : Aditya Vikram
 * Date : 11/10/22
 */

package Loop;

public class Result {

	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.print("Enter your name : ");
		String name = sc.next();
		
		System.out.print("Enter your english marks: ");
		int a=sc.nextInt();
		System.out.print("Enter your hindi marks: ");
		int b=sc.nextInt();
		System.out.print("Enter your mathematics marks: ");
		int c=sc.nextInt();
		System.out.print("Enter your science marks: ");
		int d=sc.nextInt();
		System.out.print("Enter your SST marks: ");
		int e=sc.nextInt();
		
			int per = ((a+b+c+d+e)/5);
			System.out.println(per);
			if(per>=60)	{
				
				System.out.println("Your are pass ");
				
			}
			else	{
				System.out.println("You are failed ");
			}
				
		
	}

}
