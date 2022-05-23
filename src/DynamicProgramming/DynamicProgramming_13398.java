package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DynamicProgramming_13398 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] array = new int[N];
		int[][] dpArray = new int[N][2];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		dpArray[0][0] = 0;
		dpArray[0][1] = array[0];
		int max = dpArray[0][1];
		
		for(int i = 1; i < N; i++) {
			dpArray[i][0] = Math.max(dpArray[i - 1][0] + array[i], dpArray[i - 1][1]);
			dpArray[i][1] = Math.max(dpArray[i - 1][1] + array[i], array[i]);
			max = Math.max(max, Math.max(dpArray[i][0], dpArray[i][1]));
		}
		
		System.out.println(max);
		br.close();
	}
}
