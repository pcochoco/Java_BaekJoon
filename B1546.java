import java.util.Scanner;

public class B1546 {
    public static void main(String[] args){
        int N;
        double M=0.0; //점수는 0 이상이므로 먼저 지정 가능
        double avg=0.0;
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        double[] arr=new double[N];
    
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>M){
                M=arr[i];
            }
        }
        sc.close();
        

        for(int j=0;j<N;j++){
            avg+=(arr[j]/M*100)/N;
        }
        System.out.printf("%.1f",avg);
        
    }   
}