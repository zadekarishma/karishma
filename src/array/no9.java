package array;

import java.util.Arrays;

public class no9 {

	public static void main(String[] args) 
	{
		int []a= {23,45,67,12,69};
		Arrays.sort(a);
		for(int i:a)
		{
			System.out.print(" "+i);
		}
		int secondlarge=a[a.length-2];
		System.out.println();
		System.out.println("second largest no"+secondlarge);
	}

}
