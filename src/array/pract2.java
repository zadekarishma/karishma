package array;

import java.util.Arrays;

public class pract2 
{
	public static void main(String[] args)
	{
		int[]a1= {12,0,0,0,34,56,67};
 Arrays.sort(a1);
 for(int i:a1)
 {
	 System.out.print(i+" ");
 }
 System.out.println();
for(int j=a1.length-1;j>=0;j--)
{
	System.out.print(a1[j]+" ");
}

	}


}
