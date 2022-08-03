package array;

import java.util.Arrays;

public class no7ascdes {

	public static void main(String[] args)
	{
		int []a={12,34,67,58,38,89};
		for(int j:a)
		{
			System.out.print(" "+j);
		}
		System.out.println();
		Arrays.sort(a);
		for(int j=0;j<=a.length-1;j++)
		{
			System.out.print(" "+a[j]);
		}
		System.out.println();
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(" "+a[i]);
		}
	}

}
