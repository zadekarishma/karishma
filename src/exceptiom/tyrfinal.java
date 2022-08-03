package exceptiom;

public class tyrfinal {

	public static void main(String[] args) 
	{
		String str="abcd";
		try
		{
			System.out.println(str.charAt(5));
		}
		finally
		{
			System.out.println("index size wrong"); 
		}
		System.out.println(str.length());

	}

}
