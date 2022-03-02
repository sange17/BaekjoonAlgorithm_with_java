package DynamicProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class DynamicProgramming_01912 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] array = new int[n + 1];
		int[] dpArray = new int[n + 1];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 1; i <= n; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		dpArray[1] = array[1];
		for(int i = 2; i <= n; i++) {
			dpArray[i] = array[i];
			dpArray[i] = Math.max(dpArray[i-1] + array[i], dpArray[i] + array[i-1]);
			dpArray[i] = Math.max(dpArray[i], array[i]);
		}
		
		int max = Integer.MIN_VALUE;
		for(int i = 1; i <= n; i++) {
			if(max < dpArray[i]) {
				max = dpArray[i];
			}
		}
		
		System.out.println(max);
		br.close();
	}
}
