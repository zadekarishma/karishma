import java.util.Arrays;

public class highest {

	public static void main(String[] args)
	{
		//50,25,23,20,10,100,85
		int []a= {50,25,23,20,10,100,85};
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		Arrays.sort(a);
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=5;i>=5;i--)
		{
			System.out.print(a[5]+" ");
		}
		
		
			
		
		
	}

}
