package DynamicProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class DynamicProgramming_11722 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] array = new int[n+1];
		int[] dpArray = new int[n+1];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 1; i <= n; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		dpArray[1] = 1;
		for(int i = 2; i <= n; i++) {
			dpArray[i] = 1;
			for(int j = 1; j < i; j++) {
				if(array[i] < array[j]) {
					dpArray[i] = Math.max(dpArray[j] + 1, dpArray[i]);
					System.out.println(dpArray[i]);
				}
			}
		}
		
		int max = 0;
		for(int i = 1; i <= n; i++) {
			if(max < dpArray[i]) {
				max = dpArray[i];
			}
		}
		System.out.println(max);
		br.close();
	}
}
