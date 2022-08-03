package string;

public class pl1 {

	public static void main(String[] args) 
	{
		
String a1="abc";
String a2=new String ("xyz");
String a3="xyz";
String a4="xyz";
String a5=new String("xyz");
a3=a1.concat("pqr");
System.out.println(a3);//for a3wil abcpqr refer objname a3=abcpqr
a3=a2.concat("veer");

System.out.println(a3);//[a3=if a2 concat to new value (a2+new value=xyzveer]
	}

}
