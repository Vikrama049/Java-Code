package lab;

public class Train {
	String Station;
	int Platform_no;
	Mahalasxmi_Express Mahalaxmi_Express;
	Nanded_Express Nanded_Express;
	
	
	public Train(Mahalasxmi_Express Mahalaxmi_Express,Nanded_Express Nanded_Express,String Station,int Platform_no) {
		super();
		this.Mahalaxmi_Express=Mahalaxmi_Express;
		this.Nanded_Express=Nanded_Express ;
		this.Platform_no=Platform_no;
		this.Station=Station;
	}
	
	void display()
	{
		System.out.println(Mahalaxmi_Express);
		System.out.println(Nanded_Express);
		System.out.println("Platform number is "+Platform_no);
		System.out.println("The Station name is "+Station);
	}
	

}
