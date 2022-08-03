package array;

public class firstno {

	public static void main(String[] args) 
	{
		int []a=new int[5];
		a[0]=10;
		a[1]=30;
		a[2]=20;
		a[3]=40;
		a[4]=50;
				for(int i=0;i<=4;i++)
				{
					System.out.println(a[i]);
				}
				System.out.println();
				System.out.println("by using for each loop");
				for(int j:a)
				{
					System.out.println(j);
				}
	}

}
