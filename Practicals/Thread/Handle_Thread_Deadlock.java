package Thread;

public class Handle_Thread_Deadlock {
		
		private final String name;
		public Handle_Thread_Deadlock(String name) { 
			this.name=name;
		} 
		
		public String getName() 
		{ 
			return this.name;
		}
		
		public synchronized void call(Handle_Thread_Deadlock caller) 
			{
				System.out.println(this.getName()+" has asked to call me"  + caller.getName());
		
		try {
		Thread.sleep(100);
		} 
		catch (InterruptedException e) 
			{
		e.printStackTrace();
		} 
			caller.callMe(this);
			
			}
		public synchronized void callMe (Handle_Thread_Deadlock caller) 
		
		{ 
			System.out.println(this.getName() + "has called me " + caller.getName());
		}
			
		public static void main(String[] args) 
		
		{
			Handle_Thread_Deadlock caller1 = new Handle_Thread_Deadlock("caller-1");
			Handle_Thread_Deadlock caller2 = new Handle_Thread_Deadlock("caller-2");
				
		new Thread(new Runnable() 
		{
			public void run() { 
				caller1.call(caller2); 
				}
		}).start();
		
		new Thread(new Runnable() 
		{
		public void run() { 
			caller2.call(caller1); 
			} 
		}).start();

	}

}
