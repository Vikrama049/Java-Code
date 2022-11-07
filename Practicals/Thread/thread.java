package Thread;

public class thread extends Thread{

	public static int amount=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		thread te = new thread();
		te.start();
		System.out.println(amount); //0
		amount++; //0 + 1 = 1
		System.out.println(amount); //1
	}
	public void run()
	{
		amount++; //1 + 1 = 2
	}

}
