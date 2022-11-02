package Exception_Handling;

public class Example_1 {

	public static void main(String[] args) {
		
		//try block
		  //code that generate exception
			try
			{
				int a=10 / 5;
				System.out.println("Code in try block : " +a );
			}
			catch(ArithmeticException ae)
			{
				System.out.println("ArithmeticException =>" + ae.getMessage());
			}
			finally
			{
				System.out.println("This is finally block");
			}
	}
}