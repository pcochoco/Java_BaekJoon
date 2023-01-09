import java.util.Scanner;
public class B5597 {
    public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[31];
		for(int i=1;i<29;i++){ //28명 함 
			i=sc.nextInt(); 
			arr[i]=1;  //과제 받은 사람 1로 표시 
        }
        sc.close();
		for(int j=1;j<31;j++){ //1부터 30명이니까 31 전까지 
			//j<arr.length 가능 
			if(arr[j]!=1){ //과제 안받은 사람 
				System.out.println(j);				
    		}
        }
    }
}


