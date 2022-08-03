package array;

public class composite {

	public static void main(String[] args) 
	{
	int n=4;
	int count=0;
	for(int i=1;i<=n;i++)
	{
		if(n%i==0 && n%(i+2)==0)//4%1=0,4%2=0,4%3!=0
		{
		count++;
		if(count>=3)
		{
		System.out.println("it is composite no="+n);	
		}
		}
		
	}
	}

}
