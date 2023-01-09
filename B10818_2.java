import java.util.Arrays;
import java.util.Scanner;
public class B10818_2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();

        }
        


        sc.close();
        Arrays.sort(arr); //import java.util.Arrays;
        System.out.print(arr[0]+" "+arr[N-1]); //마지막, 첫째 -> 각자 최대 최소임
        
    }
    
}
