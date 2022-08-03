package array;
import java.util.Arrays;
public class no6asending {

	public static void main(String[] args)
	{
	String []a= {"pria","ranu","shamir","radha"};
	System.out.println("original value");
	for(String j:a)
	{
		System.out.print(" "+j);
	}
	System.out.println();
	System.out.println("-------------");
	Arrays.sort(a);
	for(String j:a)
	{
		System.out.print(" "+j);
	}
	System.out.println();
	for(int i=a.length-1;i>=0;i--)
	{
		System.out.print(" "+a[i]);
	}

	}

}
