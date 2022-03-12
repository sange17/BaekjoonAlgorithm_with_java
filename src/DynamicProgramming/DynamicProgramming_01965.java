package DynamicProgramming;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class DynamicProgramming_01965 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] array = new int[n];
		int[] dpArray = new int[n];
		
		for(int i = 0; i < n; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		dpArray[0] = 1;
		int max = 0;
		for(int i = 1; i < n; i++) {
			if(array[i-1] < array[i]) {
				dpArray[i] = dpArray[i-1] + 1;
			}else {
				dpArray[i] = dpArray[i-1];
			}
			
			max = Math.max(max, dpArray[i]);
		}
		
		System.out.println(max);
		br.close();
	}
}
