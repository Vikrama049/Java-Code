package Thread;

public class Multithreading implements Runnable{

	public static void main(String[] args) {
		
				Thread Multithreading = new Thread("Threading 1");
				Thread Multithreading2 = new Thread("Threading 2");
				
		Multithreading.start();
		Multithreading2.start();
		
				System.out.println("Thread names are following: ");
				System.out.println(Multithreading.getName());
				System.out.println(Multithreading2.getName());

	}

	@Override
	public void run() {
		
	}

}