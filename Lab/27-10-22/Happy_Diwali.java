/* Program to Print Happy Diwali using For Loop
 * Name : Aditya Vikram
 * Date : 29-10-22
 */

package Lab;

public class Happy_Diwali {

	public static void main(String[] args) {
		
		String a = "HAPPY DIWALI";
		char[] b = new char[a.length()];
		//Using for Loop
		for (int x=0; x<a.length(); x++)	{
			b[x]=a.charAt(x);
		}
		for(char c : b) {
			System.out.print(c);
		}
	}

}