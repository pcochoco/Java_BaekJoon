import java.util.Scanner;
public class B10818 {
    public static void main(String[] args){
        int min;
        int max;
        
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];
        arr[0]=sc.nextInt();
        min=arr[0];
        max=arr[0];
        for(int i=1;i<N;i++){
            arr[i]=sc.nextInt();
            
            if(min>arr[i]){
                min=arr[i];
            }
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.printf("%d %d",min,max);
        sc.close();
    }
}
