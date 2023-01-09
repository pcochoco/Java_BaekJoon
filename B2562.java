import java.util.Scanner;
public class B2562 {
    public static void main(String[] args){
        int[] arr=new int[9];
        int max;
        int num=0;
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<9;i++){
            arr[i]=sc.nextInt();
            
        }
    
        sc.close();
        max=arr[0];
        for(int i=0;i<9;i++){
  
            if(max<arr[i]){
                max=arr[i];
                num=i+1;
            }
        }
        System.out.print(max+"\n"+num);
        
    }
    
}
