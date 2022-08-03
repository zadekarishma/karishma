package abstractmethod;

public class IDEA extends simcard
{
void massage()
{
	System.out.println("massage=300");
}
void call()
{
	System.out.println("callunlimited");
}
void internate()
{
	System.out.println("1.5gb data");
}
	public static void main(String[] args) 
	{
		IDEA obj=new IDEA();
		obj.call();
		obj.internate();
		obj.massage();
	}

}
