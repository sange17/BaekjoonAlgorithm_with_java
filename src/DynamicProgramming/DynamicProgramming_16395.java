package DynamicProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class DynamicProgramming_16395 {
	static int[][] dpArray = new int[31][31];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		
		n--;
		r--;
		
		System.out.println(combination(n, r));
		br.close();
	}
	
	static int combination(int N, int R) {
		if(dpArray[N][R] > 0) {
			return dpArray[N][R];
		}
		
		if(N == R || R == 0) {
			return dpArray[N][R] = 1;
		}
		
		return dpArray[N][R] = combination(N-1, R-1) + combination(N-1, R);
	}
}
