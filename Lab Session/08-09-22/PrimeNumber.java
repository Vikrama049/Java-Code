import java.util.Scanner;
class PrimeNumber
{
public static void main(String[] args)
{
	Scanner scan = new Scanner(System.in);
	System.out.println("enter any number : ");
	
	int num=scan.nextInt();
	prime(num);
}

	public static void prime(int num)
	{
		int i=2;
		while(i<=num)
		{
			if(num%i==0)
			{
				break;
			}
			i++;
		}
		
	if(i==num)
		{
		System.out.println("Prime Number");
		}
	else
		System.out.println("Not prime Number");

}}