class Object
	{
		int id;
		String name;
		static String section="BCom";
		String company;
		Object(int x, String y)
	{
	id=x;
name=y;
	}
void display()
	{
System.out.println(id+" "+name+" "+section+" "+company);
	}
public static void main(String[] args)
	{

Object a1=new Object(110,"Aditya");
Object a2=new Object(220,"Vishal G");
Object a3=new Object(330,"Shivam");
a1.company="Inforsys";
a2.company="HCL Tech";
a3.company="Bank of America";

a1.display();
a2.display();
a3.display();
}}