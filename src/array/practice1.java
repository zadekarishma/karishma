package array;

import java.util.Arrays;

public class practice1 {

	public static void main(String[] args) 
	{
		int [] arr={50,10,30,10};
		for(int i=0;i<arr.length;i++)
		{
			
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]== arr[j])
				{
					System.out.println(arr[i]);
				}
			}
			
		}
		
		
		}

}
