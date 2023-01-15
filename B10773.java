import java.util.Scanner;
import java.util.Stack;
public class B10773 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int K;
        int sum=0;
        int n;
        K=sc.nextInt(); //주어지는 정수의 개수 
        Stack<Integer> stack=new Stack<Integer>(); //integer 형태 stack 선언 
        //

        for(int i=0;i<K;i++){ 
            n=sc.nextInt(); //K번 동안 정수 입력받음 
            if(n==0){
                stack.pop(); //0인 경우 가장 최근 수 지움 
            
            }
            else{ //아닐 경우 해당 수 씀 
                
                stack.push(n);
                //sum을 여기서 하면 다음의 입력 (0)과 상관없는 모든 수의 합 계산 
            }
        }

        for(int f:stack){
            sum+=f; //추가한 모든 합 구함
        }
        System.out.println(sum);
        sc.close();
    }    
}
