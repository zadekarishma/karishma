package constructor;

public class prime
{
	public static void main(String[] args) 
	{
		
		int reminder=0;
		for(int i=2;i<=10;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0) 
				{
					reminder=1;
				}
				if(reminder==0)
				{
					System.out.println(i+"is  prime no");	
				}
				else
				{
				
			reminder=0;
				}
		}

}
	}}
