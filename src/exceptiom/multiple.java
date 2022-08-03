package exceptiom;

public class multiple {

	public static void main(String[] args) throws Exception
	{
		System.out.println("lets learn about multiple catch");
		 int[]arr= {23,78,90,45,};
		 String s1="asvb";
		 int l=s1.length();
		 try
		 {
			 arr[5]=45;
			 System.out.println(s1.charAt(l));
			 
		 }
		 catch(ArrayIndexOutOfBoundsException e)
		 {
			System.out.println(e.getMessage()); 
			Thread.sleep(3000);
			e.printStackTrace();
			System.out.println(e);
			
		 }
		 catch(StringIndexOutOfBoundsException a)
		 {
			 a.printStackTrace();
		 }
		 finally
		 {
		System.out.println("check multiple catch");	 
		 }
		 
	}

}
