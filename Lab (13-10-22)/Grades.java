package Lab_13102022;

public class Grades {

	public static void main(String[] args) {
		System.out.print("Enter your marks : ");
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		int a = sc.nextInt();
		
		System.out.println();
		System.out.println("Result ");
		
		if(a>=90)	{
			
			System.out.println("You got Grade A ");
			}
		else if(a>=84)	{
			
			System.out.println("You got Grade A1 ");
			}

		else if(a>=74)	{
	
			System.out.println("You got Grade B ");
			}

		else if(a>=64)	{
	
			System.out.println("You got Grade C ");
			}

		else if(a>=42)	{
	
			System.out.println("You got Grade D ");
			}

		else if(a>34)	{
	
			System.out.println("You got Grade E ");
			}
		
		else if(a<34)	{
			
			System.out.println("Sorry !!! You are Fail ");
			}
		
	}

}
