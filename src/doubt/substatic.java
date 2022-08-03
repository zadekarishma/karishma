package doubt;

public class substatic extends printno
{

	public void m1(int c)
	{
		a=50;
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		substatic obj=new substatic();
		obj.m1();
		int b=obj.a;
		System.out.println(b);
		obj.m1(25);
	}

}
