/* Program : Program to demonstrate on nested if. Take the input from user.
* Name : Aditya Vikram
* Date : 13/10/22
*/

package Lab_13102022;

public class Grades {

	public static void main(String[] args) {
		System.out.print("Enter your marks : ");
		
		//Using Scanner
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		int a = sc.nextInt();
		
		System.out.println();
		System.out.println("Result ");
		
		//Using Nested if
		if(a>=90)	{
			
			//printing Grade A
			System.out.println("You got Grade A ");
			}
		else if(a>=84)	{
			
			//printing Grade A1
			System.out.println("You got Grade A1 ");
			}

		else if(a>=74)	{
			
			//printing Grade B
			System.out.println("You got Grade B ");
			}

		else if(a>=64)	{
	
			//printing Grade C
			System.out.println("You got Grade C ");
			}

		else if(a>=42)	{
			
			//printing Grade D
			System.out.println("You got Grade D ");
			}

		else if(a>34)	{
		
			//printing Grade E
			System.out.println("You got Grade E ");
			}
		
		else if(a<34)	{
			
			System.out.println("Sorry !!! You are Fail ");
			}
		
	}

}
