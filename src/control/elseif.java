package control;

public class elseif 
{
public static void main (String []args)
{
	int ram= 24;
	int sham =22;
	int shita =19;
	if(ram<sham)
	{
		System.out.println("ram is elder brother of sham");
		
	}
	else if (shita >sham)  
	{
		System.out.println("shita is little sister of sham");
		
	}
	else if (ram<shita)
	{
		System.out.println("ram is elder brother of shita");
	}
	else if (ram<sham)
	{
	System.out.println("sham is little brother of ram");	
	}
	else 
	{
		System.out.println("ram is big brother of shamand shita");
	}
}

}
