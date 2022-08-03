package array;

public class pattern2 {

	public static void main(String[] args) 
	{
		int a1=65;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)a1);
				a1++;
			}
			System.out.println();
		}
	}

}
