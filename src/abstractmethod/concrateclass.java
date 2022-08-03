package abstractmethod;

public class concrateclass extends abstractmethod1
{
	 void m1()
	{
		System.out.println("abstract method call");
	}
	public static void main(String[] args) 
	{
		concrateclass obj= new concrateclass();
		obj.m2();
		obj.m1();

	}

}
