import java.util.Scanner; //
public class B10871{
	public static void main(String[] args){ 	
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(); //공백으로 두 수 받기 
		int X=sc.nextInt(); 

		int arr[]=new int[N];



		for(int i=0;i<N;i++){
			arr[i]=sc.nextInt(); 
			if(arr[i]<X){ //X보다 작다면 
				System.out.printf("%d ",arr[i]); //띄어쓰기로 표시 
		
			}
		}
		sc.close();
	}
}