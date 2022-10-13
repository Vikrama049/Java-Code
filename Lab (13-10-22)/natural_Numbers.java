package Lab_13102022;

public class natural_Numbers {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int sum=0;
		int a ;
		int b=1;
		while(b <= 10) 	{
			
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
		
		// 

	}
}
