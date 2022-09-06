class StarPattern 
{
	public static void main(String[] args) 
	{	
		for(int row=1;row<=8;row++)
		{
			for(int col=1;col<=8;col++)
			{
				if((row==1 || row==8 || row==8/2) && col%2==1 || col==1)
				System.out.print("*");
			else
				System.out.print(" ");

		}
		System.out.println();
			}
	}
}





