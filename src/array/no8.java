package array;

import java.util.Arrays;

public class no8 {

	public static void main(String[] args) 
	{
		int[]a= {12,45,56,89,56};
		int[]b= {56,89,70,56,35};
		int[]c= {12,45,56,89,56};
		System.out.println(Arrays.equals(a, b));
		System.out.println(Arrays.equals(b, c));
		System.out.println(Arrays.equals(c, a));
	}

}
