package Exception_Handling;

public class Example_2 {
	
	//creating static dividebyzero() method
	public static void dividebyzero() {
		
		//throw an exception
		throw new ArithmeticException("Trying to divide by 0");
	}
		public static void main(String[] args)
		{
			dividebyzero();
	}
}