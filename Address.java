class Address
{
static void Address1(int a)
	{
System.out.println(a);
}

static void Address1(int a,String b)
	{
System.out.println(a+" "+b);
}

static void Address1(int a,String b,String c)
	{
System.out.println(a+" "+b+" "+c);
}

public static void main(String[] args)	{
int x = 222001;
String y = "Araa";
String z = "Jaunpur";
Address1(x);
Address1(x,y);
Address1(x,y,z);
}}