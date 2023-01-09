import java.util.Scanner;
public class B4344 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int C=sc.nextInt();
        int N;
        double avg=0.0;
        double[] avgl=new double[C];
        
        for(int i=0;i<C;i++){
            N=sc.nextInt();
            int[] arr=new int[N];
            for(int j=0;j<N;j++){
                //arr[i][j]를 매번 새롭게 생성 
                arr[j]=sc.nextInt();
                avg+=arr[j];
                
            }
            avgl[i]=avg/N;
            System.out.printf("%.3f",avgl[i]);
        }
        sc.close();
    }
    
}
