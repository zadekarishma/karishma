package inheritance;

import multiple.multiple;

public class subcisofmultiple extends multiple
{
public subcisofmultiple()
{
	System.out.println("sub cls 1st constructor calll");
}
public subcisofmultiple(int x)
{
	super(30);
	System.out.println("sub cls 2nd constructor call");
}
public subcisofmultiple(int x,int y)
{
	super(10,15);
	System.out.println("sub cls 3nd constructor call");
}
public static void main(String[] args)
{
	subcisofmultiple obj=new subcisofmultiple();
	subcisofmultiple obj1=new subcisofmultiple(10);	
	subcisofmultiple obj2=new subcisofmultiple(15,12);			
}
}
