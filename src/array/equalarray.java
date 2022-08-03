package array;

import java.util.Arrays;

public class equalarray {

	public static void main(String[] args) 
	{
		int []a1= {12,34,78,89,45};
		int []a2= {12,34,78,89,45};
		int []a3= {12,54,78,89,45};
		System.out.println(Arrays.equals(a1,a2));
		System.out.println(Arrays.equals(a1,a3));
		System.out.println(Arrays.equals(a3,a2));
		for(int i:a1)
		{
			System.out.print(i+" ");
		}
		System.out.println("---");
		Arrays.sort(a1);
		for(int j:a1)
		{
			System.out.print(j+" ");
		}
		System.out.println();
		int secondlargestno=a1[a1.length-2];
				System.out.println(secondlargestno);
	}

}
