import java.util.Scanner;
public class B5597 {
    public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[30];
		for(int i=0;i<28;i++){
			i=sc.nextInt();
			arr[i]=1;
        }
        sc.close();
		for(int j=0;j<30;j++){
			if(arr[j]!=1){
				System.out.println(j);				
    		}
        }
    }
}


