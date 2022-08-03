package practice;

public class nstedif 
{

	public static void main(String[] args) 
	{
		int temp =28;
		if (temp>=43)
		{
			if(temp==43)
			{
				System.out.println("demand of cold water");
			}
			else 
			{
				System.out.println("weather is hot bt not more");
			}
			
		}
		else
		{
			if(temp<=25)
			{
				System.out.println("weather is noramal");
			}
			else
			{
				System.out.println("season is winter");
			}
		}
	}

}
