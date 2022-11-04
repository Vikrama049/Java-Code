package Exception_Handling;

public class Throws_Exception {
	
	//Defining a method
	public static int divideNum(int m, int n) throws ArithmeticException {
		
		 int div = m / n;  
	     return div;  
	 }  
	 //main method  
	 public static void main(String[] args) {  
		 Throws_Exception obj = new Throws_Exception();  
	     try 
	     {  
	         System.out.println(obj.divideNum(45, 0));  
	     }  
	     catch (ArithmeticException e)
	     {  
	         System.out.println("\nNumber cannot be divided by 0");  
	     }  
	       
	     System.out.println("Rest of the code..");  

	}

}
