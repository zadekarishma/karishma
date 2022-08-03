package doubt;

public class chidhidding extends statichidding
{
	public static void m1()
	{
		System.out.println("m1 of child class");
	}
	public static void m2()
	{
		System.out.println("m2 of child class");
	}

	public static void main(String[] args) 
	{
		statichidding d1=new chidhidding();//method hidding
		d1.m1();
		d1.m2();
		System.out.println("---------");
		chidhidding d2=new chidhidding();//method
		d2.m1();
		d2.m2();
	}

}
