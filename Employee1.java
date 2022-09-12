class Employee1
{
	String name;
	String email;
	
	static String company_name;
	static int salary;

	void displayData()
	{
	 System.out.println(name +" "+email);
	}

	static String completedTargets()
	{ 
	return "completed targets quickly" ;
 	}

	void AttendingMeetings(String s)
	{
		System.out.println(s);
	}

      public static void main(String[] args)
	{
	
		Employee1 e1=new Employee1();
		Employee1 e2=new Employee1();
		Employee1 e3=new Employee1();

		e1.name="Aditya";
		e1.email="Aditya16@gmail.com";

		e2.name="Bhakti";
		e2.email="Bhakti2333@gmail.com";

		e3.name="Shivam";
		e3.email="shivam112@gmail.com";

		e1.displayData();
		e2.displayData();
		e3.displayData();
		
		e1.AttendingMeetings("Excellent");
		e2.AttendingMeetings("Very Good");
		e3.AttendingMeetings("Good");

		System.out.println(Employee1.completedTargets());
	}
}