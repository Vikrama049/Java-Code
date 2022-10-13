package Lab_13102022;


public class Positive_Numbers {

	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);
	
		int a = 0;
	    int sum = 0;
	    do {
	    System.out.print("Enter a number = ");
		a = sc.nextInt();
	    
	    if(a>=0) {
	    	sum = sum+ a;
	    }
	      
	    } while(a >= 0); 
		   
	    System.out.println();
	    System.out.println("Sum of positive number is : " + sum);

	}

}
