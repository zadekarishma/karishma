package array;

import java.util.Arrays;

public class maxmin {

	public static void main(String[] args)
	{
		int [] arr = {1, 2100, 3, 455, 5, 34, 67};
		
		Arrays.sort(arr); 
				
				for(int m : arr)
				{
					System.out.print(m + " ");
				}
				System.out.println();
				System.out.print("the assending order is ");
				
				int highestno= arr[arr.length-1];
				System.out.println("the  highest no. is  " + highestno);
				
				int minino= arr[arr.length-7];
				System.out.println("the  min no. is  " + minino);
				
		//1 3 5 34 67 455 2100 
		//the assending order is the  highest no. is  2100
		//the  highest no. is  1
	}

}
