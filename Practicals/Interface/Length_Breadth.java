package Interface;

public interface Length_Breadth {
	
	//abstract method of interface
	void getArea(int length, int breadth);

	}

		//Implement the Length_Breadth interface
		class Ractangle implements Length_Breadth{
			
			//Implement the abstract method
			public void getArea(int length, int breadth)
			{
				System.out.println("The area of Ractangles are : " + (length*breadth));
			}
		}

