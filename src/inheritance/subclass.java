package inheritance;

public class subclass extends single_inheritance
{
	public void m1(int a)
	{
	
		System.out.println("bullet");
	}
	public static void main(String[] args) 
	{
		subclass obj=new subclass();
		obj.m1(1);
		
	}

}
