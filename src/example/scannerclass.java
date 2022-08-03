package example;
import java.util.Scanner;
public class scannerclass {

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		
System.out.println("enter 1st name");
String str=s1.nextLine();
System.out.println("enter lastname");
String b=s1.nextLine();
System.out.println(str+"\n"+b);
	}

}
