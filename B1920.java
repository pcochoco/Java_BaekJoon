import java.util.Scanner;
import java.util.Arrays;
import java.util.StringTokenizer;
public class B1920{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();

		int[] A=new int[N];
		
		for(int i=0;i<N;i++){
			A[i]=sc.nextInt();
		}

		Arrays.sort(A);
		StringBuilder sb=new StringBuilder();

		int M=sc.nextInt();
	
		for(int j=0;j<M;j++){
			if(binS(A,sc.nextInt())>=0){
				sb.append(1).append('\n');
			}
			else{
				sb.append(0).append('\n');
			}
			
		}
		System.out.println(sb);
	}

	public static int binS(int[] arr,int key){
		int low=0;
		int high=arr.length-1;
		while(low<=high){
			int mid=(low+high)/2;
			if(key<arr[mid]){
				high=mid-1;

			}
			else if(key>arr[mid]){
				low=mid+1;
			}
			else{
				return mid;
			}
		}
		return -1;
	}

}

