import java.util.Scanner;
public class B3052{

	public static void main(String[] args){
		boolean[] arr=new boolean[42]; 
		//나머지가 나올 수 있는 범위 0~41=> 42개
		//boolean 42개 인덱스 배열 생성  
		int num;
		int count=0;
		Scanner sc=new Scanner(System.in);

		for(int i=0;i<10;i++){ //10개 수 입력받음 
			num=sc.nextInt();
			arr[num%42]=true;
			//서로 다른 값 몇개 있는지 출력 
		}
		for(boolean v: arr){
			if(v) count++; //arr[인덱스]가 true이면 개수 셈  
		}
		System.out.println(count);

		sc.close();
	}
} 
    

