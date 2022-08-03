package constructor;

public class reverse 
{

	public static void main(String[] args) 
	{
		int num=12345;
		int rev=0;
		while(num>0)
		{
			int reminder=num%10;//5,4,3,2,1
					rev=rev*10+reminder;//5,5*10+4=54,54*10+3=543,543*10+2=5432,5432*10+1=54321
					num=num/10;//1234,123,12,1
					
					
		}
		
		System.out.println(rev);
	}

}
