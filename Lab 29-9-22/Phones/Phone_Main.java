package lab;

public class Phone_Main {

	public static void main(String[] args) {
		Phone p1 = new Phone(5.3, 6, "Black");
		Phone p2 = new Phone(8.5, 2, "Red");
		Phone p3 = new Phone(2.2, 4, "Yellow");
		Phone p4 = new Phone(10.6, 8, "Grey");
		
		Phone[] arr = new Phone[4];
		
		arr[0] = p4;
		arr[1] = p1;
		arr[2] = p2;
		arr[3] = p3;

	
	for(Phone p : arr)
	{
		System.out.println("Display is : " + p.display + " ram is : "+ p.ram + ", and color is : "+ p.color);
	}

}}
