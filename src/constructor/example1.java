package constructor;

public class example1 
{
	int a;
example1()
{
	a=6;
}
public static void main(String args[])
{
	example1 obj=new example1 ();
	int b=obj.a;
	System.out.println(obj.a);
}
}
