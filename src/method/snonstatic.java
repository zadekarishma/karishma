package method;

public class snonstatic 
{
public static void hen(int x, int y)
{
	System.out.println("total hen"+(x+y));
}
public void chick()
{
	hen(45,76);
}
public static void main(String args[]) 
{
	snonstatic total= new snonstatic();
	total.chick();
	
}
}
