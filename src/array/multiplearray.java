package array;

public class multiplearray {

	public static void main(String[] args) 
	{
		 int[][] A1= {
				{1,1,1},{2,2,2},{3,3,3}};
		 int[][] B2= {
					{1,1,1},{2,2,2},{3,3,3}};
		
		 int c1,c2;
		
		//row i
		for(int i=0;i<3;i++)//o true//1true//2true
		{
			//column j
			for(int j=0;j<3;j++)//0true//1true//2true//3false//(2)0true//1true//2true//[3]0true
			{
			int c=A1[i][j];
				System.out.print(c+" ");//1,1//1//[2]2//2//2//[3]//3//3//3
				
				System.out.print(B2[i][j]+" ");
			
			}
			
			System.out.println();
			
	
	}
		
	}}
