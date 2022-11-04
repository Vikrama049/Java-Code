/* This method is used to show the handling multiple exception.
 */

package Exception_Handling;

public class Arithmatic_Test {

	public void multipleCatchTest() {
		
		int array[]={10,20,30,40};
		int num1 = 50;
		int num2 = 10;
		
		try{
			   //java.lang.ArithmeticException here if num2 = 0.
			   System.out.println(num1/num2);
			   System.out.println("4th element of given array = " + array[3]);
		 
			   //ArrayIndexOutOfBoundsException here.
			   System.out.println("5th element of given array = " + array[4]);
		 
		           //catch ArrayIndexOutOfBoundsException here.
		           }catch(ArrayIndexOutOfBoundsException e){
			     //print exception.
			     System.out.println(e);
			   }catch(ArithmeticException e){//catch ArithmeticException here.
			     //print exception.
			     System.out.println(e);
			   }catch(Exception e){//catch exception here.
			     //print exception.
			     System.out.println(e);
			   }
		 
		           System.out.println("Remaining code after exception handling.");
			}

			public static void main(String args[]){
				//creating ArithmaticTest object
				Arithmatic_Test obj =  new Arithmatic_Test();
		 
				//method call
				obj.multipleCatchTest();

	}

}