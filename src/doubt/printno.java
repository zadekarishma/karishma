package doubt;

public class printno {

	static int a=10 ;
public   void  m1()
{
	a=30;
System.out.println("-----non static");
	System.out.println(a);
}
	public static void main(String[] args) 
	{
		//a=40;
		printno obj=new printno();
		obj.m1();
		int b=obj.a;
		System.out.println(b);
		//printno1();
	}

}
