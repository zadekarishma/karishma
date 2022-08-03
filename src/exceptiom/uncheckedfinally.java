package exceptiom;

public class uncheckedfinally {

	public static void main(String[] args) 
	{
		int []arr= {12,34,68,55,45};
		try
		{
			arr[7]= 45;
		}
		catch(Exception e)
				{
					System.out.println("can not assign value after intializing");
				}
		
		finally
		{
			System.out.println("only madatory statment will print");
		}
		System.out.println(arr.length);
	}

}
