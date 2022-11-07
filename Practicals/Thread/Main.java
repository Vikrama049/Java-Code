/* If a class extends the Thread class,
 * the thread can be run by creating an instance of the class
 * and call its start() method.
 */

package Thread;

public class Main extends Thread {

	public static void main(String[] args) {
		
		Main Thread = new Main();
		Thread.start();
		
		System.out.println("This code is outside of the thread");

	}
	public void run()
	{
		System.out.println("This code is running in the thread");

	}

}