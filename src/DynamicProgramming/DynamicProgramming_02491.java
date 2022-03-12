package DynamicProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class DynamicProgramming_02491 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] array = new int[N];
		int[] dpLongArray = new int[N];
		int[] dpShortArray = new int[N];
		
		for(int i = 0; i < N; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		dpLongArray[0] = 1;
		dpShortArray[0] = 1;
		for(int i = 1; i < N; i++) {
			if(array[i-1] <= array[i]) {
				dpLongArray[i] = dpLongArray[i-1] + 1;
			}else {
				dpLongArray[i] = 1;
			}
			
			if(array[i-1] >= array[i]) {
				dpShortArray[i] = dpShortArray[i-1] + 1;
			}else {
				dpShortArray[i] = 1;
			}
		}
		
		int maxA = Integer.MIN_VALUE;
		int maxB = Integer.MIN_VALUE;
		for(int i = 0; i < N; i++) {
			if(maxA < dpLongArray[i]) {
				maxA = dpLongArray[i];
			}
			
			if(maxB < dpShortArray[i]) {
				maxB = dpShortArray[i];
			}
		}
		
		System.out.println(Math.max(maxA, maxB));
		br.close();
	}
}
