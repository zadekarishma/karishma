package forloop;

public class primeno {

	public static void main(String[] args) 
	{
		int num=29;
		int temp=0;
		for(int i=2;i<=num/2;i++)
		{
			if (num%i==0)
			{
				temp=1;
			}
		}
		if (temp==0)
		{
			System.out.println(num+"is  prime no");
		}
		else
		{
			System.out.println(num+"is not prime no");
		}
	}

}
