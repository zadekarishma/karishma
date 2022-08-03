package method;

public class swapping
{
public static void parameter(int x,int y)
{
	System.out.println("before swapping="+x+"\n"+y);
	x+=y;// x=45,y=34 newx=89
	y-=x;//newy=89-34=55
	System.out.println("after swapping"+x+"\n"+y);
}
	
}


