import java.util.Scanner;
class PrimeRange
{
static boolean checkPrime(int num)
{
for(int i=2;i<=num/i;++i)
{
	if(num%i==0)
	{
	return false;
	}
}
return true;
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the start range : ");
int start = sc.nextInt();
System.out.print("Enter the end range : ");
int end = sc.nextInt();
System.out.println("Prime numbers of given number is: ");
System.out.println();
for(int n=start;n<=end;n++)
{
if(checkPrime(n))
{
System.out.println(n);
} } } } 

