import java.util.Scanner;

public class B10828 {
    
    public static int[] stack;
    public static int size=0;

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        StringBuffer sb=new StringBuffer();
        //System.out.println의 줄바꿈보다 시간이 덜 걸림 
        int N=sc.nextInt(); //명령어의 개수 
        stack=new int[N];

        
        for(int i=0;i<N;i++){
            String inst=sc.next(); //명령어 입력 

            switch(inst){
                case "push": //push 인 경우 
                    push(sc.nextInt()); //따라오는 숫자 입력받음 
                    break;

                case "pop":
                    sb.append(pop()).append('\n'); //enter 추가 
                    break;
            
        
                case "size":
                    sb.append(size()).append('\n');
                    break;

                case "empty":
                    sb.append(empty()).append('\n');
                    break;

                case "top": //else if(inst=="top")
                    sb.append(top()).append('\n');
                    break;
            }

        }
    
        System.out.println(sb);
        sc.close();

    }
    public static void push(int item){
        stack[size]=item; //size-1이 마지막이므로
        size++; //size 증가 
    }
    public static int pop(){
        if(size==0){ //비었을 경우 불가 
            return -1;
        }
        else{
            int res=stack[size-1]; //마지막 값(뺄 값) 저장 
            size--;
            return res; 
        }
    }
    public static int size(){
        return size; //변수로 길이 변동하므로 
    }
    public static int empty(){
        if(size==0){
            return 1;
        }
        else{
            return 0; 
        }
    }
    public static int top(){
        if(size==0){ //비었으면 불가 
            return -1; 
        }
        else{
            return stack[size-1];
        }
    }



}
