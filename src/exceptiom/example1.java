package exceptiom;

public class example1 {

	public static void main(String[] args) throws ArithmeticException
	{
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		try
		{
		System.out.println(5/0);
		}
		catch(Exception e)
		{
			System.out.println("not");
			
		}
		System.out.println(6);

	}

}
