package method;

public class anotherstatic 
{
public void keyboard(int x, int y)
{
	
	System.out.println("value="+x+"\n"+y);
}
public static void cpu()
{
anotherstatic obc= new anotherstatic();
obc.keyboard(34,67 );	
}
public static void main(String args[])
{
	cpu();
}
}
