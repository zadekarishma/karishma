package array;

public class multiplication
{

	public static void main(String[] args) 
	{
		int[][] A1= {
				{1,1,1},{2,2,2},{3,3,3}};
		 int[][] B2= {
					{1,1,1},{2,2,2},{3,3,3}};
		 int [][]c3=new int[3][3];
		 for(int i=0;i<3;i++)//otrue//1true
		 {
			 for(int j=0;j<3;j++)//0 true//ifk false then comin j=1true//kfalse then come in j=2true
			//if i=1then j=0true	 
			 {
				// c3[i][j]=0;//[0][0]=0//[0]=0\\[1][0]=0
				 for(int k=0;k<3;k++)//0 true,1true,2true,3false//0true=1true=2true//0true=1true=2true
				 {
					c3[i][j]+=A1[i][k]*B2[k][j];
					//[1]*[1]+[1]*[2]+[1]*[3]=6=i&j0
					//[1]*[1]+[1]*[2]+[1]*[3]=6=i0&j1
					//[1]*[1]+[1]*[2]+[1]*[3]=6= i0&j2
					//if i=1 andj true this process contineu
				 }//END LOOP OF K
				 System.out.print(c3[i][j]+" ");
				  }//end loop of j
			 System.out.println();
		 }
		 	

	}

}
