package array;
//reverse no in array
public class no5 {

	public static void main(String[] args) 
	{
		int []a= {10,45,78,45,90,67};
		for(int i=0;i<=a.length-1;i++)
		{
		System.out.println(a[i]);	
		}
		System.out.println("-----------------");
		for(int i=a.length-1;i<=0;i--)
		{
			System.out.println(a[i]);
		}
	}

}
