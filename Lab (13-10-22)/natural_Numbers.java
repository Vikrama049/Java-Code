/* Program to print  sum of 10 Natural Numbers using while loop.
* Name : Aditya Vikram
* Date : 13/10/22
*/

package Lab_13102022;

public class natural_Numbers {

	public static void main(String[] args) {
		
		//Importing Scanner
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int sum=0;
		int a ;
		int b=1;
		
		//Using while loop
		while(b <= 10) 	{
			
			//Printing Natutal Numbers
			System.out.print("Enter "+b+" Natural Numbers : ");
			a = sc.nextInt();
			if (a<=0) {
				
			}else {
			sum=sum+a;
			b++;
		}}
		
		System.out.println();
		System.out.println("Sum of 10 natural Numbers is");
		System.out.println(sum);

	}
}
