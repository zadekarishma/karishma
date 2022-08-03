package control;

public class nestedif 
{
public static void main(String[]s)
{
	System.out.println("welcome to donation camp");
	int age =18;
	int weight=50;
	
	if (age>17 )
	{
		if (weight<50)
		{
			System.out.println("candidate eligible for donating boold");
		}
		else
		{
			System.out.println("you are not eligible for blood donation");
		}
	 	
}
	else 
	{
		System.out.println("not eligible");
	}
	
}
}
