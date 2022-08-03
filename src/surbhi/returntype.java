package surbhi;

public class returntype
{
	public static int m1(int x,int y)
	{
		int sum=x+y;
		System.out.println(sum);
		return sum;
		}
	public static int m2(int x,int y)
	{
		int sub=x-y;
		System.out.println(sub);
		return sub;
	}
		public int m3(int x,int y)
		{
		int m3=x*y;
		System.out.println(m3);
			return m3;
		}
	public static void main(String[] args) 
	{
		m1(12,23);
	m2(20,12);
		returntype obj=new returntype();
		obj.m3(12, 15);
	
}
}