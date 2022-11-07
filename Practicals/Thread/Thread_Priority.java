package Thread;

public class Thread_Priority extends Thread {
		
		public void run()
		{
			System.out.println("Running thread priority is : " +Thread.currentThread().getPriority());
		}

		public static void main(String[] args) {
			Thread_Priority t1 = new Thread_Priority();
			Thread_Priority t2 = new Thread_Priority();
			
			t1.setPriority(Thread.MIN_PRIORITY);
			t2.setPriority(Thread.MAX_PRIORITY);
		
			t1.start();
			t2.start();
		}

}
