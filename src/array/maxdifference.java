package array;

import java.util.Arrays;

public class maxdifference {

	public static void main(String[] args) 
	{
		int max;
		int[]arr= {23,56,89,34,12,5};
		Arrays.sort(arr);
		System.out.println(arr);
			 max=arr[arr.length-1]-arr[0];
			 System.out.println(max);
		
		
	}

}
