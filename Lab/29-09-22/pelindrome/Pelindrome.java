package Lab;

public class Pelindrome {
	

	public static void main(String[] args) {
		String r="";	
		char n ;
		String s = null;
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Write a words");		
		String a = sc.nextLine();		
		char [] x = a.toCharArray();
			for(int i=x.length-1;i>=0;i--) 
			{
				n = x[i];
				s= Character.toString(n);
				r = r+s;
			}
			System.out.println(r);
			if(a.equalsIgnoreCase(r)) {
				System.out.print("IT IS PELINDROME");
			}
			else {
				System.out.print("IT IS NOT PELINDROME");
			}
	}

}