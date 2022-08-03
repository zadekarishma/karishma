package interviweprogram;

public class prime1to10
{

	public static void main(String[] args)
	{
		int i,j;
		for (i=1;i<=10;i++)//1,true,2
		{
			for(j=2;j<=i;j++)//true,2<=1=false,true
			{
				if(i%j==0)//1%2=false,
				{
					System.out.println(j);
					break;
				}
				if(i==j)
				{
					System.out.println("primeno"+i);
				}
			}
		}

	}

}
