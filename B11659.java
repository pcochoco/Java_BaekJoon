import java.io.IOException;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B11659{
	public static void main(String[] args) throws IOException{
        int i;
        int j;
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer=new StringTokenizer(bufferedReader.readLine());
		int N=Integer.parseInt(stringTokenizer.nextToken());
		int M=Integer.parseInt(stringTokenizer.nextToken());
		long[] S=new long[N+1];
		stringTokenizer=new StringTokenizer(bufferedReader.readLine());
		for(int k=1;k<=N;k++){ //배열 S[k-1]을 표현하기 위해 k=1부터 반복 -> k=0인 경우 -1 인덱스
			S[k]=S[k-1]+Integer.parseInt(stringTokenizer.nextToken());
		}
		for(int q=0;q<M;q++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			i=Integer.parseInt(stringTokenizer.nextToken());
			j=Integer.parseInt(stringTokenizer.nextToken());
			System.out.println(S[j]-S[i-1]);
		}
	}
}