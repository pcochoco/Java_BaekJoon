import java.util.Scanner;
public class B3052{

	public static void main(String[] args){
		int[] arr=new int[10]; 
	
		int num;
		int count=0;
		boolean b1=false;
		Scanner sc=new Scanner(System.in);

		for(int i=0;i<10;i++){ //10개 수 입력받음 
			num=sc.nextInt();
			arr[i]=num%42;
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					b1=true;
					break;
				}
			
			}
			if(b1==false){
				count++;
			}
		}
		
		System.out.println(count);

		sc.close();
	}
} 
    

