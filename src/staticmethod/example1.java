package staticmethod;

public class example1 
{
public static void m1()
{
	System.out.println("checking method how to excute");
}
public void karishma()
{
	System.out.println("calling non static method");
}
public static void main(String[] args) 
{
	m1();
	example1 obj1=new example1();
	obj1.karishma();
}
}
