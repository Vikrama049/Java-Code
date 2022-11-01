/* Program to Print sum of only Positive numbers using do-while Loop. And take the Input from User, Enters any negative number then that number should not added to sum.
* Name : Aditya Vikram
* Date : 13/10/22
*/

package Lab_13102022;


public class Positive_Numbers {

	public static void main(String[] args) {
		
		//Importing Scanner 
		java.util.Scanner sc = new java.util.Scanner(System.in);
	
		int a = 0;
	    int sum = 0;
		
	    // using do-while Loop
	    do {
	    System.out.print("Enter a number = ");
		a = sc.nextInt();
	    
	    if(a>=0) {
	    	sum = sum+ a;
	    }
	      
		    //Using while Loop
	    } while(a >= 0); 
		   
	    System.out.println();
	    System.out.println("Sum of positive number is : " + sum);

	}

}
