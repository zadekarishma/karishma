package swap2;

public class two_variable 
{
public static void main(String []args)
{
	int num1=20;
	int num2=30;
	System.out.println("before swapping ="+num1+"\n"+num2);
	num1=num1+num2;//num1=50
	num2=num1-num2;//num2=20
	num1=num1-num2;//num1=30
	System.out.println("after swapping="+num1+"\n"+num2);
}
}
