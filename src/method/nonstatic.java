package method;

public class nonstatic
{
public void rename(int x,int y)
{
	System.out.println("value ="+x+"\n"+y);
}
public void name()
{
	rename(45,23);	
}
public static void main(String args[])
{
	nonstatic obj= new nonstatic();
	obj.name();	
}
}
