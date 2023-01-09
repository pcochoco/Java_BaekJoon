import java.util.Scanner;
public class B2562_2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr={sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()};
        sc.close();
        
        int count=0;
        int max=0;
        int index=0;

        for(int val:arr){
            count++;
            if(val>max){
                max=val;
                index=count+1; //문제 양식에 맞춤 
            }
        }
        System.out.print(max+"\n"+index);
        //print, println은 개행문자 유무의 차이 
    }

}
