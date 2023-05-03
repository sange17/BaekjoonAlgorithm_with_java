package Mathematics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Mathematics_16204 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int O = M;
		int X = N - M;
		
		int sum = 0;
		if(O >= K) {
			
			sum += K;
		}else {
			
			sum += O;
		}
		
		if(X >= N - K) {
			
			sum += N - K;
		}else {
			
			sum += X;
		}
		
		System.out.println(sum);
		br.close();
	}
}
