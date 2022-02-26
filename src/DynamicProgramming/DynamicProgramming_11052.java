package DynamicProgramming;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class DynamicProgramming_11052 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] array = new int[N+1];
		int[] dpArray = new int[N+1];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 1; i < N + 1 ; i++) {
			array[i] = Integer.parseInt(st.nextToken());
			dpArray[i] = array[i];
		}
		
		for(int i = 2; i <= N; i++) {
			for(int j = 1; j <= i / 2; j++) {
				dpArray[i] = Math.max(dpArray[i], dpArray[j] + dpArray[i - j]);
			}
		}
		
		System.out.println(dpArray[N]);
		br.close();
	}
}
