
import java.util.Scanner;
public class B2738{
	public static void main(String[] args){
		int N,M;
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		M=sc.nextInt();
		

		int A[][]=new int[N][M];
		int B[][]=new int[N][M];
		int NM[][]=new int[N][M];
		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
				A[i][j]=sc.nextInt();
			}
		}
		for(int k=0;k<N;k++){
			for(int l=0;l<M;l++){
				B[k][l]=sc.nextInt();
			}
		}
		for(int n=0;n<N;n++){
			for(int m=0;m<M;m++){
				NM[n][m]=A[n][m]+B[n][m];
				System.out.printf("%d ",NM[n][m]);		
				//System.out.print(A[i][j]+B[k][l]);
	
			}
			System.out.println(); //줄바꿈 

		}
		
		sc.close();
	}
		
		
}
