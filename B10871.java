import java.util.Scanner; //
public class B10871{
	public static void main(String[] args){ 	
		Scanner word=new Scanner(System.in);
		int N=word.nextInt();
		int X=word.nextInt();

		int arr[]=new int[N];



		for(int i=0;i<N;i++){
			arr[i]=word.nextInt(); 
			if(arr[i]<X){
				System.out.printf("%d ",arr[i]); //띄어쓰기로 표시 
		
			}
		}
		word.close();
	}
}