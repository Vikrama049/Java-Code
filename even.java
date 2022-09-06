import java.util.Scanner;
class Even
{
  public static void main(String args[])
  {
    int num;
    System.out.println("Enter number:");
Scanner input = new Scanner(System.in);
    num = input.nextInt();
    if ( num % 2 == 0 )
        System.out.println("number is even");
     else
        System.out.println("number is odd");
  }
}
